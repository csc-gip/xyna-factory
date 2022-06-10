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

package com.gip.xyna.xact.filter;

import com.gip.xyna.xfmg.xods.configuration.XynaPropertyUtils.XynaPropertyString;


public class XynaPropertySwitcher {

  private final XynaPropertyString property_1;
  private final XynaPropertyString property_2;
  
  public XynaPropertySwitcher(XynaPropertyString prop1, XynaPropertyString prop2) {
    this.property_1 = prop1;
    this.property_2 = prop2;
  }
  
  public String get() {
    return this.getXynaProperty().get();  
  }
  
  
  public XynaPropertyString getXynaProperty() {
    if (this.property_1.get() == null) {
      return this.property_2;
    }
    return this.property_1;
  }
  
}
