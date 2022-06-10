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
/**
 * GenerateTlvFromTemplateForInitializedCableModemRequest_ctype.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gip.www.juno.Gui.WS.Messages;

public class GenerateTlvFromTemplateForInitializedCableModemRequest_ctype  implements java.io.Serializable {
    private com.gip.www.juno.Gui.WS.Messages.InputHeaderContent_ctype inputHeader;

    private com.gip.www.juno.Gui.WS.Messages.GenerateTlvFromTemplateForInitializedCableModemInput_ctype generateTlvFromTemplateForInitializedCableModemInput;

    public GenerateTlvFromTemplateForInitializedCableModemRequest_ctype() {
    }

    public GenerateTlvFromTemplateForInitializedCableModemRequest_ctype(
           com.gip.www.juno.Gui.WS.Messages.InputHeaderContent_ctype inputHeader,
           com.gip.www.juno.Gui.WS.Messages.GenerateTlvFromTemplateForInitializedCableModemInput_ctype generateTlvFromTemplateForInitializedCableModemInput) {
           this.inputHeader = inputHeader;
           this.generateTlvFromTemplateForInitializedCableModemInput = generateTlvFromTemplateForInitializedCableModemInput;
    }


    /**
     * Gets the inputHeader value for this GenerateTlvFromTemplateForInitializedCableModemRequest_ctype.
     * 
     * @return inputHeader
     */
    public com.gip.www.juno.Gui.WS.Messages.InputHeaderContent_ctype getInputHeader() {
        return inputHeader;
    }


    /**
     * Sets the inputHeader value for this GenerateTlvFromTemplateForInitializedCableModemRequest_ctype.
     * 
     * @param inputHeader
     */
    public void setInputHeader(com.gip.www.juno.Gui.WS.Messages.InputHeaderContent_ctype inputHeader) {
        this.inputHeader = inputHeader;
    }


    /**
     * Gets the generateTlvFromTemplateForInitializedCableModemInput value for this GenerateTlvFromTemplateForInitializedCableModemRequest_ctype.
     * 
     * @return generateTlvFromTemplateForInitializedCableModemInput
     */
    public com.gip.www.juno.Gui.WS.Messages.GenerateTlvFromTemplateForInitializedCableModemInput_ctype getGenerateTlvFromTemplateForInitializedCableModemInput() {
        return generateTlvFromTemplateForInitializedCableModemInput;
    }


    /**
     * Sets the generateTlvFromTemplateForInitializedCableModemInput value for this GenerateTlvFromTemplateForInitializedCableModemRequest_ctype.
     * 
     * @param generateTlvFromTemplateForInitializedCableModemInput
     */
    public void setGenerateTlvFromTemplateForInitializedCableModemInput(com.gip.www.juno.Gui.WS.Messages.GenerateTlvFromTemplateForInitializedCableModemInput_ctype generateTlvFromTemplateForInitializedCableModemInput) {
        this.generateTlvFromTemplateForInitializedCableModemInput = generateTlvFromTemplateForInitializedCableModemInput;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateTlvFromTemplateForInitializedCableModemRequest_ctype)) return false;
        GenerateTlvFromTemplateForInitializedCableModemRequest_ctype other = (GenerateTlvFromTemplateForInitializedCableModemRequest_ctype) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inputHeader==null && other.getInputHeader()==null) || 
             (this.inputHeader!=null &&
              this.inputHeader.equals(other.getInputHeader()))) &&
            ((this.generateTlvFromTemplateForInitializedCableModemInput==null && other.getGenerateTlvFromTemplateForInitializedCableModemInput()==null) || 
             (this.generateTlvFromTemplateForInitializedCableModemInput!=null &&
              this.generateTlvFromTemplateForInitializedCableModemInput.equals(other.getGenerateTlvFromTemplateForInitializedCableModemInput())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInputHeader() != null) {
            _hashCode += getInputHeader().hashCode();
        }
        if (getGenerateTlvFromTemplateForInitializedCableModemInput() != null) {
            _hashCode += getGenerateTlvFromTemplateForInitializedCableModemInput().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenerateTlvFromTemplateForInitializedCableModemRequest_ctype.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gip.com/juno/Gui/WS/Messages", "GenerateTlvFromTemplateForInitializedCableModemRequest_ctype"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gip.com/juno/Gui/WS/Messages", "InputHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gip.com/juno/Gui/WS/Messages", "InputHeaderContent_ctype"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generateTlvFromTemplateForInitializedCableModemInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gip.com/juno/Gui/WS/Messages", "GenerateTlvFromTemplateForInitializedCableModemInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gip.com/juno/Gui/WS/Messages", "GenerateTlvFromTemplateForInitializedCableModemInput_ctype"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
