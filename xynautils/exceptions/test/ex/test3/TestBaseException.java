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
package ex.test3;

import com.gip.xyna.utils.exceptions.XynaException;
import java.util.List;

//DO NOT CHANGE
//GENERATED BY com.gip.xyna.utils.exceptions.utils.codegen.JavaClass 2010-08-20T11:33:37Z;
public abstract class TestBaseException extends XynaException {



  public TestBaseException() {
    super(new String[]{});
  }

  public TestBaseException(Throwable cause) {
    super(new String[]{}, cause);
  }

  protected TestBaseException(String[] args) {
    super(args);
  }

  protected TestBaseException(String[] args, Throwable cause) {
    super(args, cause);
  }

  public TestBaseException initCause(Throwable t) {
    return (TestBaseException) super.initCause(t);
  }


}
