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

package com.gip.xyna.xact;



import com.gip.xyna.utils.exceptions.XynaException;
import com.gip.xyna.xact.trigger.XynaActivationTrigger;
import com.gip.xyna.xnwh.persistence.ODS;
import com.gip.xyna.xnwh.persistence.ODSImpl;



public class XynaActivation extends XynaActivationBase {

  public static final String DEFAULT_NAME = "Xyna Activation";

  private ODS ods;


  public XynaActivation() throws XynaException {
    super();
  }


  public void init() throws XynaException {

    ods = ODSImpl.getInstance();

    deploySection(new XynaActivationTrigger());

  }


  public String getDefaultName() {
    return DEFAULT_NAME;
  }


  public XynaActivationTrigger getActivationTrigger() {
    return (XynaActivationTrigger) getSection(XynaActivationTrigger.DEFAULT_NAME);
  }


  @Override
  public ODS getXynaActivationODS() {
    return ods;
  }


}
