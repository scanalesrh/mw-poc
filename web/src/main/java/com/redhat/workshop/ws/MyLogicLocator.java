/**
 * MyLogicLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.redhat.workshop.ws;

public class MyLogicLocator extends org.apache.axis.client.Service implements com.redhat.workshop.ws.MyLogic {

    public MyLogicLocator() {
    }


    public MyLogicLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MyLogicLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MyLogicPort
    private java.lang.String MyLogicPort_address = "http://localhost:8280/MyLogic/MyLogic";

    public java.lang.String getMyLogicPortAddress() {
        return MyLogicPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MyLogicPortWSDDServiceName = "MyLogicPort";

    public java.lang.String getMyLogicPortWSDDServiceName() {
        return MyLogicPortWSDDServiceName;
    }

    public void setMyLogicPortWSDDServiceName(java.lang.String name) {
        MyLogicPortWSDDServiceName = name;
    }

    public com.redhat.workshop.ws.MyLogicPortType getMyLogicPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MyLogicPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMyLogicPort(endpoint);
    }

    public com.redhat.workshop.ws.MyLogicPortType getMyLogicPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.redhat.workshop.ws.MyLogicSoapBindingStub _stub = new com.redhat.workshop.ws.MyLogicSoapBindingStub(portAddress, this);
            _stub.setPortName(getMyLogicPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMyLogicPortEndpointAddress(java.lang.String address) {
        MyLogicPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.redhat.workshop.ws.MyLogicPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.redhat.workshop.ws.MyLogicSoapBindingStub _stub = new com.redhat.workshop.ws.MyLogicSoapBindingStub(new java.net.URL(MyLogicPort_address), this);
                _stub.setPortName(getMyLogicPortWSDDServiceName());
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
        if ("MyLogicPort".equals(inputPortName)) {
            return getMyLogicPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:com.redhat.workshop:services:1.0", "MyLogic");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:com.redhat.workshop:services:1.0", "MyLogicPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MyLogicPort".equals(portName)) {
            setMyLogicPortEndpointAddress(address);
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
