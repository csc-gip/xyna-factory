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
 * PoolUsage_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gip.www.juno.SnmpTrap.WS.PoolUsage;

public class PoolUsage_ServiceLocator extends org.apache.axis.client.Service implements com.gip.www.juno.SnmpTrap.WS.PoolUsage.PoolUsage_Service {

    public PoolUsage_ServiceLocator() {
    }


    public PoolUsage_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PoolUsage_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PoolUsagePort
    private java.lang.String PoolUsagePort_address = "http://local.de";

    public java.lang.String getPoolUsagePortAddress() {
        return PoolUsagePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PoolUsagePortWSDDServiceName = "PoolUsagePort";

    public java.lang.String getPoolUsagePortWSDDServiceName() {
        return PoolUsagePortWSDDServiceName;
    }

    public void setPoolUsagePortWSDDServiceName(java.lang.String name) {
        PoolUsagePortWSDDServiceName = name;
    }

    public com.gip.www.juno.SnmpTrap.WS.PoolUsage.PoolUsage_PortType getPoolUsagePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PoolUsagePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPoolUsagePort(endpoint);
    }

    public com.gip.www.juno.SnmpTrap.WS.PoolUsage.PoolUsage_PortType getPoolUsagePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gip.www.juno.SnmpTrap.WS.PoolUsage.PoolUsageBindingStub _stub = new com.gip.www.juno.SnmpTrap.WS.PoolUsage.PoolUsageBindingStub(portAddress, this);
            _stub.setPortName(getPoolUsagePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPoolUsagePortEndpointAddress(java.lang.String address) {
        PoolUsagePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gip.www.juno.SnmpTrap.WS.PoolUsage.PoolUsage_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gip.www.juno.SnmpTrap.WS.PoolUsage.PoolUsageBindingStub _stub = new com.gip.www.juno.SnmpTrap.WS.PoolUsage.PoolUsageBindingStub(new java.net.URL(PoolUsagePort_address), this);
                _stub.setPortName(getPoolUsagePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PoolUsagePort".equals(inputPortName)) {
            return getPoolUsagePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.gip.com/juno/SnmpTrap/WS/PoolUsage", "PoolUsage");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.gip.com/juno/SnmpTrap/WS/PoolUsage", "PoolUsagePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PoolUsagePort".equals(portName)) {
            setPoolUsagePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
