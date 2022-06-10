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

package com.gip.juno.ws.db.tables.dhcpv6;

import com.gip.juno.ws.tools.ColInfo;
import com.gip.juno.ws.tools.DBTableInfo;
import com.gip.juno.ws.enums.ColType;
import com.gip.juno.ws.handler.TableHandler;
import com.gip.juno.ws.handler.TableHandlerBasic;

public class GuiAttributeHandler extends TableHandlerBasic implements TableHandler {
  
  public GuiAttributeHandler() {
    super("GuiAttribute", true);
  }
  
  public DBTableInfo initDBTableInfo() {
    DBTableInfo table = new DBTableInfo("guiattribute", "dhcpv6");

    table.addColumn(new ColInfo("GuiAttributeID").setType(ColType.integer).setVisible(false).setPk()
        .setAutoIncrement());
    table.addColumn(new ColInfo("Name").setType(ColType.string).setVisible(true).setUpdates(true));
    table.addColumn(new ColInfo("DhcpConf").setType(ColType.string).setVisible(true).setUpdates(true));
    table.addColumn(new ColInfo("Wertebereich").setType(ColType.string).setVisible(true).setUpdates(true));
    return table;
  }

}
