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
package com.gip.xyna.utils.exceptions.utils;

import com.gip.xyna.utils.exceptions.XynaException;

//DO NOT CHANGE
//GENERATED BY com.gip.xyna.utils.exceptions.utils.codegen.JavaClass 2010-06-02T10:09:58Z;
public class InvalidXMLException extends XynaException {


  private String fileName;

  public InvalidXMLException(String fileName) {
    super(new String[]{"XYNA-00022", fileName + ""});
    setFileName(fileName);
  }

  public InvalidXMLException(String fileName, Throwable cause) {
    super(new String[]{"XYNA-00022", fileName + ""}, cause);
    setFileName(fileName);
  }

  protected InvalidXMLException(String[] args) {
    super(args);
  }

  protected InvalidXMLException(String[] args, Throwable cause) {
    super(args, cause);
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getFileName() {
    return fileName;
  }

  public InvalidXMLException initCause(Throwable t) {
    return (InvalidXMLException) super.initCause(t);
  }


}
