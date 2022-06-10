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
 * UpdateRowPkWithNullConditionsInput_ctype.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gip.www.juno.SnmpTrap.WS.PoolUsageThreshold.Messages;

public class UpdateRowPkWithNullConditionsInput_ctype  implements java.io.Serializable {
    private com.gip.www.juno.SnmpTrap.WS.PoolUsageThreshold.Messages.Row_ctype conditions;

    private com.gip.www.juno.SnmpTrap.WS.PoolUsageThreshold.Messages.Row_ctype newValues;

    public UpdateRowPkWithNullConditionsInput_ctype() {
    }

    public UpdateRowPkWithNullConditionsInput_ctype(
           com.gip.www.juno.SnmpTrap.WS.PoolUsageThreshold.Messages.Row_ctype conditions,
           com.gip.www.juno.SnmpTrap.WS.PoolUsageThreshold.Messages.Row_ctype newValues) {
           this.conditions = conditions;
           this.newValues = newValues;
    }


    /**
     * Gets the conditions value for this UpdateRowPkWithNullConditionsInput_ctype.
     * 
     * @return conditions
     */
    public com.gip.www.juno.SnmpTrap.WS.PoolUsageThreshold.Messages.Row_ctype getConditions() {
        return conditions;
    }


    /**
     * Sets the conditions value for this UpdateRowPkWithNullConditionsInput_ctype.
     * 
     * @param conditions
     */
    public void setConditions(com.gip.www.juno.SnmpTrap.WS.PoolUsageThreshold.Messages.Row_ctype conditions) {
        this.conditions = conditions;
    }


    /**
     * Gets the newValues value for this UpdateRowPkWithNullConditionsInput_ctype.
     * 
     * @return newValues
     */
    public com.gip.www.juno.SnmpTrap.WS.PoolUsageThreshold.Messages.Row_ctype getNewValues() {
        return newValues;
    }


    /**
     * Sets the newValues value for this UpdateRowPkWithNullConditionsInput_ctype.
     * 
     * @param newValues
     */
    public void setNewValues(com.gip.www.juno.SnmpTrap.WS.PoolUsageThreshold.Messages.Row_ctype newValues) {
        this.newValues = newValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateRowPkWithNullConditionsInput_ctype)) return false;
        UpdateRowPkWithNullConditionsInput_ctype other = (UpdateRowPkWithNullConditionsInput_ctype) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conditions==null && other.getConditions()==null) || 
             (this.conditions!=null &&
              this.conditions.equals(other.getConditions()))) &&
            ((this.newValues==null && other.getNewValues()==null) || 
             (this.newValues!=null &&
              this.newValues.equals(other.getNewValues())));
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
        if (getConditions() != null) {
            _hashCode += getConditions().hashCode();
        }
        if (getNewValues() != null) {
            _hashCode += getNewValues().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateRowPkWithNullConditionsInput_ctype.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gip.com/juno/SnmpTrap/WS/PoolUsageThreshold/Messages", "UpdateRowPkWithNullConditionsInput_ctype"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gip.com/juno/SnmpTrap/WS/PoolUsageThreshold/Messages", "Conditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gip.com/juno/SnmpTrap/WS/PoolUsageThreshold/Messages", "Row_ctype"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gip.com/juno/SnmpTrap/WS/PoolUsageThreshold/Messages", "NewValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gip.com/juno/SnmpTrap/WS/PoolUsageThreshold/Messages", "Row_ctype"));
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
