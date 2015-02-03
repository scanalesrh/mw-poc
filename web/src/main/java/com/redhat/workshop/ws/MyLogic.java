/**
 * MyLogic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.redhat.workshop.ws;

public interface MyLogic extends javax.xml.rpc.Service {
    public java.lang.String getMyLogicPortAddress();

    public com.redhat.workshop.ws.MyLogicPortType getMyLogicPort() throws javax.xml.rpc.ServiceException;

    public com.redhat.workshop.ws.MyLogicPortType getMyLogicPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
