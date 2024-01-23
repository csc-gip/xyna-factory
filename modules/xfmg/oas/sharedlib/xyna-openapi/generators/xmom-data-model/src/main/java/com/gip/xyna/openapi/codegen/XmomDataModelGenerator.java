/*
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * Copyright 2024 Xyna GmbH, Germany
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
package com.gip.xyna.openapi.codegen;

import org.openapitools.codegen.*;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

import java.util.*;
import java.io.File;

public class XmomDataModelGenerator extends DefaultCodegen {

  // source folder where to write the files
  protected String sourceFolder = "XMOM";
  protected String apiVersion = "1.0.0";
  protected String xynaFactoryVersion = "CURRENT_VERSION";
  
  public static final String XYNA_FACTORY_VERSION = "xynaFactoryVersion";

  /**
   * Configures the type of generator.
   *
   * @return  the CodegenType for this generator
   * @see     org.openapitools.codegen.CodegenType
   */
  public CodegenType getTag() {
    return CodegenType.SCHEMA;
  }

  /**
   * Configures a friendly name for the generator.  This will be used by the generator
   * to select the library with the -g flag.
   *
   * @return the friendly name for the generator
   */
  public String getName() {
    return "xmom-data-model";
  }

  /**
   * any special handling of the entire OpenAPI spec document 
   */
  @Override
  public void preprocessOpenAPI(OpenAPI openAPI) {
    super.preprocessOpenAPI(openAPI);

    Info info = openAPI.getInfo();
    Map<String, Object> vendorExtentions = info.getExtensions();
    
    // replace spaces, "-", "." with underscores in info.title
    info.setTitle(sanitizeName(info.getTitle()));

    // change the path of the generated XMOMs
    String xModelPath = (String)vendorExtentions.get("x-model-path");
    if (xModelPath != null && !xModelPath.trim().isEmpty()) {
      modelPackage = xModelPath.replace('-', '_').replace(' ', '_').toLowerCase();
    }
  }

  /**
   * Returns human-friendly help for the generator.  Provide the consumer with help
   * tips, parameters here
   *
   * @return A string value for the help message
   */
  public String getHelp() {
    return "Generates a xmom-data-model client library.";
  }

  public XmomDataModelGenerator() {
    super();

    // set the output folder here
    outputFolder = "generated-code/xmom-data-model";

    /**
     * Models.  You can write model files using the modelTemplateFiles map.
     * if you want to create one template for file, you can do so here.
     * for multiple files for model, just put another entry in the `modelTemplateFiles` with
     * a different extension
     */
    modelTemplateFiles.put(
      "model.mustache", // the template to use
      ".xml");       // the extension for each file to write


    /**
     * Template Location.  This is the location which templates will be read from.  The generator
     * will use the resource stream to attempt to read the templates.
     */
    templateDir = "xmom-data-model";

    /**
     * path of the XMOM objects, 
     * can be changed via "x-model-path" in the info section of the spec file
     */
    modelPackage = "model.generated";

    /**
     * Reserved words.  Override this with reserved words specific to your language
     */
    /* reservedWords = new HashSet<String> (
      Arrays.asList(
        "sample1",  // replace with static values
        "sample2")
    ); */
    reservedWords = new HashSet<String>();

    /**
     * Additional Properties.  These values can be passed to the templates and
     * are available in models, apis, and supporting files
     */
    additionalProperties.put("apiVersion", apiVersion);
    additionalProperties.put(XYNA_FACTORY_VERSION, xynaFactoryVersion);


    /**
     * Supporting Files.  You can write single files for the generator with the
     * entire object tree available.  If the input file has a suffix of `.mustache
     * it will be processed by the template engine.  Otherwise, it will be copied
     */
    supportingFiles.add(new SupportingFile("application.mustache",   // the input template or file
      "",                                                       // the destination folder, relative `outputFolder`
      "application.xml")                                          // the output file
    );

    /**
     * Language Specific Primitives.  These types will not trigger imports by
     * the client generator
     */
    languageSpecificPrimitives = new HashSet<String>(
      Arrays.asList("boolean", "integer", "long", "double", "float", "number", "string", "DateTime", "date", "password", "byte", "binary", "URI")
    );

    typeMapping.clear();
    typeMapping.put("boolean", "Boolean");
    typeMapping.put("integer", "Integer");
    typeMapping.put("long", "Long");
    typeMapping.put("double", "Double");
    typeMapping.put("float", "Double");
    typeMapping.put("number", "Double");
    typeMapping.put("string", "String");
    typeMapping.put("DateTime", "String");
    typeMapping.put("date", "String");
    typeMapping.put("password", "String");
    typeMapping.put("byte", "String");
    typeMapping.put("binary", "String");
    typeMapping.put("URI", "String");
  }

  /**
   * Escapes a reserved word as defined in the `reservedWords` array. Handle escaping
   * those terms here.  This logic is only called if a variable matches the reserved words
   *
   * @return the escaped term
   */
  @Override
  public String escapeReservedWord(String name) {
    return "_" + name;  // add an underscore to the name
  }

  /**
   * Location to write model files.  You can use the modelPackage() as defined when the class is
   * instantiated
   */
  public String modelFileFolder() {
    return outputFolder + "/" + sourceFolder + "/" + modelPackage().replace('.', File.separatorChar);
  }

  @Override
  @SuppressWarnings("static-method")
  public void postProcess() {
      System.out.println("generation of data-model finished");
  }
}
