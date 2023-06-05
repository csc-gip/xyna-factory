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

package com.gip.xyna.xprc.xpce.execution;

import com.gip.xyna.FunctionGroup;
import com.gip.xyna.utils.exceptions.XynaException;
import com.gip.xyna.xprc.XynaOrderServerExtension;
import com.gip.xyna.xprc.exceptions.XPRC_DESTINATION_NOT_FOUND;
import com.gip.xyna.xprc.xpce.dispatcher.DestinationKey;
import com.gip.xyna.xprc.xpce.dispatcher.DestinationValue;



public class XynaExecution extends FunctionGroup {

  public static final String DEFAULT_NAME = "Xyna Execution";

  private ExecutionDispatcher executionEngineDispatcher;


  public XynaExecution() throws XynaException {
    super();
  }


  public String getDefaultName() {
    return DEFAULT_NAME;
  }


  public void init() throws XynaException {
    executionEngineDispatcher = new ExecutionDispatcher();
  }


  public void shutdown() throws XynaException {

  }


  public void dispatch(XynaOrderServerExtension xo) throws XynaException {
    executionEngineDispatcher.dispatch(xo);
  }


  public ExecutionDispatcher getExecutionEngineDispatcher() {
    return executionEngineDispatcher;
  }


  public DestinationValue getExecutionDestination(DestinationKey dk) throws XPRC_DESTINATION_NOT_FOUND  {
    return executionEngineDispatcher.getDestination(dk);
  }

}
