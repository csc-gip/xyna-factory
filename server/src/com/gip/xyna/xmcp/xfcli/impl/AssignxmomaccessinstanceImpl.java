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

import com.gip.xyna.XynaFactory;
import com.gip.xyna.xdev.xlibdev.xmomaccess.parameters.AssignXMOMAccessInstanceParameters;
import com.gip.xyna.xfmg.xfctrl.revisionmgmt.RevisionManagement;
import com.gip.xyna.xmcp.xfcli.XynaCommandImplementation;
import com.gip.xyna.utils.exceptions.XynaException;
import java.io.OutputStream;
import com.gip.xyna.xmcp.xfcli.generated.Assignxmomaccessinstance;



public class AssignxmomaccessinstanceImpl extends XynaCommandImplementation<Assignxmomaccessinstance> {

  public void execute(OutputStream statusOutputStream, Assignxmomaccessinstance payload) throws XynaException {
    RevisionManagement revisionManagement = XynaFactory.getInstance().getFactoryManagement().getXynaFactoryControl().getRevisionManagement();
    Long revision = revisionManagement.getRevision(null, null, payload.getWorkspaceName());

    AssignXMOMAccessInstanceParameters params = new AssignXMOMAccessInstanceParameters();
    params.setXmomAccessName(payload.getXmomAccessName());
    params.setRepositoryAccessInstanceName(payload.getRepositoryAccessInstance());
    params.setIncludeCapacities(payload.getIncludeCapacities());
    params.setIncludeXynaProperties(payload.getIncludeXynaProperties());
    params.setDeploy(payload.getDeploy());
    
    XynaFactory.getInstance()
               .getXynaDevelopment()
               .getXynaLibraryDevelopment()
               .getXMOMAccessManagement()
               .assignXMOMAccessInstance(params, revision);
  }

}
