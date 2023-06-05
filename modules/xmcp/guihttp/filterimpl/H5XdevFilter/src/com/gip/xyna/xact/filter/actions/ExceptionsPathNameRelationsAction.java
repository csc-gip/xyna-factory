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
package com.gip.xyna.xact.filter.actions;

import com.gip.xyna.xact.filter.HTMLBuilder.HTMLPart;
import com.gip.xyna.xact.filter.URLPath;
import com.gip.xyna.xact.filter.XmomGuiAction;
import com.gip.xyna.xact.filter.json.ObjectIdentifierJson.Type;
import com.gip.xyna.xact.filter.session.XMOMGui;
import com.gip.xyna.xact.filter.session.XMOMGuiRequest.Operation;
import com.gip.xyna.xact.trigger.HTTPTriggerConnection.Method;

public class ExceptionsPathNameRelationsAction extends XmomGuiAction {

  private static final String BASE_PATH = "/" + PathElements.XMOM + "/" + PathElements.EXCEPTION_TYPES;
  
  public ExceptionsPathNameRelationsAction(XMOMGui xmomGui) {
    super(xmomGui, 2, 3, Operation.Relations, Type.exceptionType, true);
  }

  @Override
  protected boolean matchRuntimeContextIndependent( URLPath url, Method method) {
    return url.getPath().startsWith(BASE_PATH) 
        && url.getPathLength() == 5 
        && url.getPathElement(4).equals(PathElements.RELATIONS)
        && method == Method.GET;
  }

  @Override
  public String getTitle() {
    return "XMOM-Exceptiontypes-TypePath-TypeName-Relations";
  }

  @Override
  public void appendIndexPage(HTMLPart body) {
    HTMLPart paragraphDef = body.paragraph();
    paragraphDef.link(BASE_PATH+"/lw/TestJsonWFCall/relations", "lw.testJsonWFCall"); //FIXME
  }

  @Override
  public boolean hasIndexPageChanged() {
    return false;
  }

}

