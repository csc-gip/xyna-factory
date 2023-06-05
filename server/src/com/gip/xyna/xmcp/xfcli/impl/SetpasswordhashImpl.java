/*
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * Copyright 2022 Xyna GmbH, Germany
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

import com.gip.xyna.utils.exceptions.XynaException;
import com.gip.xyna.xmcp.xfcli.XynaCommandImplementation;
import com.gip.xyna.xmcp.xfcli.generated.Setpasswordhash;



public class SetpasswordhashImpl extends XynaCommandImplementation<Setpasswordhash> {

  public void execute(OutputStream statusOutputStream, Setpasswordhash payload) throws XynaException {
    if (factory.getFactoryManagementPortal().setPasswordHash(payload.getUserName(), payload.getNewPasswordHash())) {
      writeToCommandLine(statusOutputStream, "Password of user '" + payload.getUserName() + "' was succesfully set\n");
    } else {
      writeToCommandLine(statusOutputStream, "Password of user '" + payload.getUserName() + "' could not be set\n");
    }
  }

}
