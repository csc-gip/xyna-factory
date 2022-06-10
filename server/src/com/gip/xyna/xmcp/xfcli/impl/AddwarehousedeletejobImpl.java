/*
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * Copyright 2022 GIP SmartMercial GmbH, Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 */
package com.gip.xyna.xmcp.xfcli.impl;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.gip.xyna.XynaFactory;
import com.gip.xyna.utils.exceptions.XynaException;
import com.gip.xyna.xmcp.xfcli.XynaCommandImplementation;
import com.gip.xyna.xmcp.xfcli.generated.Addwarehousedeletejob;
import com.gip.xyna.xnwh.persistence.ODSImpl;
import com.gip.xyna.xnwh.persistence.Storable;
import com.gip.xyna.xnwh.xwarehousejobs.WarehouseJob;
import com.gip.xyna.xnwh.xwarehousejobs.WarehouseJobActionType;
import com.gip.xyna.xnwh.xwarehousejobs.WarehouseJobFactory;
import com.gip.xyna.xnwh.xwarehousejobs.XynaWarehouseJobManagement;


public class AddwarehousedeletejobImpl extends XynaCommandImplementation<Addwarehousedeletejob> {

  public void execute(OutputStream statusOutputStream, Addwarehousedeletejob payload) throws XynaException{

    Class<? extends Storable> clazz = ODSImpl.getInstance().getStorableByTableName(payload.getTableName());
    if (clazz == null) {
      writeLineToCommandLine(statusOutputStream, "Tablename '" + payload.getTableName() + "' unknown.");
      return;
    }

    Long interval;
    if (payload.getInterval().equals("0") || payload.getInterval().equals("-1")) {
      interval = null;
    } else {
      try {
        interval = Long.valueOf(payload.getInterval()) * 1000;
      } catch (NumberFormatException e) {
        writeLineToCommandLine(statusOutputStream, "Could not parse interval '" + payload.getInterval() + "'");
        return;
      }
    }
    
    List<String> parameter = new ArrayList<String>();
    parameter.add(payload.getTableName());
    for (String conTypeString : payload.getConnectionType()) {
      parameter.add(conTypeString);  
    }
    
    if (payload.getConstraints() != null) {
      parameter.add(payload.getConstraints());
      if (payload.getConcurrencyProtection()) {
        parameter.add("true");
      }
    }
    
    WarehouseJob job =
        WarehouseJobFactory.getCronWarehouseJob("XynaProperty Job", WarehouseJobActionType.Delete, interval,
                                                System.currentTimeMillis(), parameter.toArray(new String[parameter.size()]));

    XynaWarehouseJobManagement jobMgmt =
        XynaFactory.getInstance().getXynaNetworkWarehouse().getXynaWarehouseJobManagement();
    jobMgmt.addJob(job, true);

  }

}
