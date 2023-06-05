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
package com.gip.xyna.utils.exceptions.xmlstorage;

import com.gip.xyna.utils.exceptions.utils.InvalidXMLException;

//DO NOT CHANGE
//GENERATED BY com.gip.xyna.utils.exceptions.utils.codegen.JavaClass 2010-06-02T10:09:58Z;
public class RootElementNotFoundException extends InvalidXMLException {


  private String xmlTagName;
  private String namespace;

  public RootElementNotFoundException(String fileName, String xmlTagName, String namespace) {
    super(new String[]{"XYNA-00021", fileName + "", xmlTagName + "", namespace + ""});
    setFileName(fileName);
    setXmlTagName(xmlTagName);
    setNamespace(namespace);
  }

  public RootElementNotFoundException(String fileName, String xmlTagName, String namespace, Throwable cause) {
    super(new String[]{"XYNA-00021", fileName + "", xmlTagName + "", namespace + ""}, cause);
    setFileName(fileName);
    setXmlTagName(xmlTagName);
    setNamespace(namespace);
  }

  protected RootElementNotFoundException(String[] args) {
    super(args);
  }

  protected RootElementNotFoundException(String[] args, Throwable cause) {
    super(args, cause);
  }

  public void setXmlTagName(String xmlTagName) {
    this.xmlTagName = xmlTagName;
  }

  public String getXmlTagName() {
    return xmlTagName;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public String getNamespace() {
    return namespace;
  }

  public RootElementNotFoundException initCause(Throwable t) {
    return (RootElementNotFoundException) super.initCause(t);
  }


}
