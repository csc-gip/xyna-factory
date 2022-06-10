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
 * CMBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gip.www.juno.Service.WS.CM;

public class CMBindingSkeleton implements com.gip.www.juno.Service.WS.CM.CM_PortType, org.apache.axis.wsdl.Skeleton {
    private com.gip.www.juno.Service.WS.CM.CM_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Gui/WS/Messages", "GetMetaInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Gui/WS/Messages", "GetMetaInfoRequest_ctype"), com.gip.www.juno.Gui.WS.Messages.GetMetaInfoRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getMetaInfo", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "MetaInfoOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "GetMetaInfo"));
        _oper.setSoapAction("GetMetaInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getMetaInfo") == null) {
            _myOperations.put("getMetaInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getMetaInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "GetAllRowsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Gui/WS/Messages", "GetAllRowsRequest_ctype"), com.gip.www.juno.Gui.WS.Messages.GetAllRowsRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAllRows", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "GetAllRowsOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "GetAllRows"));
        _oper.setSoapAction("GetAllRows");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAllRows") == null) {
            _myOperations.put("getAllRows", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAllRows")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "SearchRowsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "SearchRowsRequest_ctype"), com.gip.www.juno.Service.WS.CM.Messages.SearchRowsRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("searchRows", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "SearchRowsOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "SearchRows"));
        _oper.setSoapAction("SearchRows");
        _myOperationsList.add(_oper);
        if (_myOperations.get("searchRows") == null) {
            _myOperations.put("searchRows", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("searchRows")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "UpdateRowRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "UpdateRowRequest_ctype"), com.gip.www.juno.Service.WS.CM.Messages.UpdateRowRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateRow", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "UpdateRowOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "UpdateRow"));
        _oper.setSoapAction("UpdateRow");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateRow") == null) {
            _myOperations.put("updateRow", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateRow")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "InsertRowRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "InsertRowRequest_ctype"), com.gip.www.juno.Service.WS.CM.Messages.InsertRowRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("insertRow", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "InsertRowOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "InsertRow"));
        _oper.setSoapAction("InsertRow");
        _myOperationsList.add(_oper);
        if (_myOperations.get("insertRow") == null) {
            _myOperations.put("insertRow", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("insertRow")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "InsertRowWithSessionAuthentificationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "InsertRowRequest_ctype"), com.gip.www.juno.Service.WS.CM.Messages.InsertRowRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("insertRowWithSessionAuthentification", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "InsertRowOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "InsertRowWithSessionAuthentification"));
        _oper.setSoapAction("InsertRowWithSessionAuthentification");
        _myOperationsList.add(_oper);
        if (_myOperations.get("insertRowWithSessionAuthentification") == null) {
            _myOperations.put("insertRowWithSessionAuthentification", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("insertRowWithSessionAuthentification")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "DeleteRowsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "DeleteRowsRequest_ctype"), com.gip.www.juno.Service.WS.CM.Messages.DeleteRowsRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteRows", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "DeleteRowsOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "DeleteRows"));
        _oper.setSoapAction("DeleteRows");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteRows") == null) {
            _myOperations.put("deleteRows", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteRows")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "DeleteRowsWithSessionAuthentificationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "DeleteRowsRequest_ctype"), com.gip.www.juno.Service.WS.CM.Messages.DeleteRowsRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteRowsWithSessionAuthentification", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "DeleteRowsOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "DeleteRowsWithSessionAuthentification"));
        _oper.setSoapAction("DeleteRowsWithSessionAuthentification");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteRowsWithSessionAuthentification") == null) {
            _myOperations.put("deleteRowsWithSessionAuthentification", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteRowsWithSessionAuthentification")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Gui/WS/Messages", "GetLocationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Gui/WS/Messages", "GetLocationsRequest_ctype"), com.gip.www.juno.Gui.WS.Messages.GetLocationsRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getLocations", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "LocationsListOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "GetLocations"));
        _oper.setSoapAction("GetLocations");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getLocations") == null) {
            _myOperations.put("getLocations", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getLocations")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Gui/WS/Messages", "GetColValuesDistinctRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Gui/WS/Messages", "GetColValuesDistinctRequest_ctype"), com.gip.www.juno.Gui.WS.Messages.GetColValuesDistinctRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getColValuesDistinct", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "ColValuesDistinctOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "GetColValuesDistinct"));
        _oper.setSoapAction("GetColValuesDistinct");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getColValuesDistinct") == null) {
            _myOperations.put("getColValuesDistinct", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getColValuesDistinct")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "UpdateRowPkRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "UpdateRowPkRequest_ctype"), com.gip.www.juno.Service.WS.CM.Messages.UpdateRowPkRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateRowPk", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "UpdateRowPkOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "UpdateRowPk"));
        _oper.setSoapAction("UpdateRowPk");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateRowPk") == null) {
            _myOperations.put("updateRowPk", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateRowPk")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "MoveRowsChangeLocationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "MoveRowsChangeLocationRequest_ctype"), com.gip.www.juno.Service.WS.CM.Messages.MoveRowsChangeLocationRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("moveRowsChangeLocation", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "MoveRowsChangeLocationOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "MoveRowsChangeLocation"));
        _oper.setSoapAction("MoveRowsChangeLocation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("moveRowsChangeLocation") == null) {
            _myOperations.put("moveRowsChangeLocation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("moveRowsChangeLocation")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "CountRowsWithConditionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "CountRowsWithConditionRequest_ctype"), com.gip.www.juno.Service.WS.CM.Messages.CountRowsWithConditionRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("countRowsWithCondition", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "CountRowsWithConditionOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "CountRowsWithCondition"));
        _oper.setSoapAction("CountRowsWithCondition");
        _myOperationsList.add(_oper);
        if (_myOperations.get("countRowsWithCondition") == null) {
            _myOperations.put("countRowsWithCondition", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("countRowsWithCondition")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "CountAllRowsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "CountAllRowsRequest_ctype"), com.gip.www.juno.Service.WS.CM.Messages.CountAllRowsRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("countAllRows", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "CountAllRowsOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "CountAllRows"));
        _oper.setSoapAction("CountAllRows");
        _myOperationsList.add(_oper);
        if (_myOperations.get("countAllRows") == null) {
            _myOperations.put("countAllRows", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("countAllRows")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "SyncCpeIPsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "SyncCpeIPsRequest_ctype"), com.gip.www.juno.Service.WS.CM.Messages.SyncCpeIPsRequest_ctype.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("syncCpeIPs", _params, new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "SyncCpeIPsOutput"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.gip.com/juno/Service/WS/CM/Messages", "Response_ctype"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "SyncCpeIPs"));
        _oper.setSoapAction("SyncCpeIPs");
        _myOperationsList.add(_oper);
        if (_myOperations.get("syncCpeIPs") == null) {
            _myOperations.put("syncCpeIPs", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("syncCpeIPs")).add(_oper);
    }

    public CMBindingSkeleton() {
        this.impl = new com.gip.www.juno.Service.WS.CM.CMBindingImpl();
    }

    public CMBindingSkeleton(com.gip.www.juno.Service.WS.CM.CM_PortType impl) {
        this.impl = impl;
    }
    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype getMetaInfo(com.gip.www.juno.Gui.WS.Messages.GetMetaInfoRequest_ctype getMetaInfoRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.getMetaInfo(getMetaInfoRequest);
        return ret;
    }

    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype getAllRows(com.gip.www.juno.Gui.WS.Messages.GetAllRowsRequest_ctype getAllRowsRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.getAllRows(getAllRowsRequest);
        return ret;
    }

    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype searchRows(com.gip.www.juno.Service.WS.CM.Messages.SearchRowsRequest_ctype searchRowsRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.searchRows(searchRowsRequest);
        return ret;
    }

    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype updateRow(com.gip.www.juno.Service.WS.CM.Messages.UpdateRowRequest_ctype updateRowRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.updateRow(updateRowRequest);
        return ret;
    }

    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype insertRow(com.gip.www.juno.Service.WS.CM.Messages.InsertRowRequest_ctype insertRowRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.insertRow(insertRowRequest);
        return ret;
    }

    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype insertRowWithSessionAuthentification(com.gip.www.juno.Service.WS.CM.Messages.InsertRowRequest_ctype insertRowWithSessionAuthentificationRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.insertRowWithSessionAuthentification(insertRowWithSessionAuthentificationRequest);
        return ret;
    }

    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype deleteRows(com.gip.www.juno.Service.WS.CM.Messages.DeleteRowsRequest_ctype deleteRowsRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.deleteRows(deleteRowsRequest);
        return ret;
    }

    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype deleteRowsWithSessionAuthentification(com.gip.www.juno.Service.WS.CM.Messages.DeleteRowsRequest_ctype deleteRowsWithSessionAuthentificationRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.deleteRowsWithSessionAuthentification(deleteRowsWithSessionAuthentificationRequest);
        return ret;
    }

    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype getLocations(com.gip.www.juno.Gui.WS.Messages.GetLocationsRequest_ctype getLocationsRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.getLocations(getLocationsRequest);
        return ret;
    }

    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype getColValuesDistinct(com.gip.www.juno.Gui.WS.Messages.GetColValuesDistinctRequest_ctype getColValuesDistinctRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.getColValuesDistinct(getColValuesDistinctRequest);
        return ret;
    }

    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype updateRowPk(com.gip.www.juno.Service.WS.CM.Messages.UpdateRowPkRequest_ctype updateRowPkRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.updateRowPk(updateRowPkRequest);
        return ret;
    }

    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype moveRowsChangeLocation(com.gip.www.juno.Service.WS.CM.Messages.MoveRowsChangeLocationRequest_ctype moveRowsChangeLocationRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.moveRowsChangeLocation(moveRowsChangeLocationRequest);
        return ret;
    }

    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype countRowsWithCondition(com.gip.www.juno.Service.WS.CM.Messages.CountRowsWithConditionRequest_ctype countRowsWithConditionRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.countRowsWithCondition(countRowsWithConditionRequest);
        return ret;
    }

    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype countAllRows(com.gip.www.juno.Service.WS.CM.Messages.CountAllRowsRequest_ctype countAllRowsRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.countAllRows(countAllRowsRequest);
        return ret;
    }

    public com.gip.www.juno.Service.WS.CM.Messages.Response_ctype syncCpeIPs(com.gip.www.juno.Service.WS.CM.Messages.SyncCpeIPsRequest_ctype syncCpeIPsRequest) throws java.rmi.RemoteException
    {
        com.gip.www.juno.Service.WS.CM.Messages.Response_ctype ret = impl.syncCpeIPs(syncCpeIPsRequest);
        return ret;
    }

}
