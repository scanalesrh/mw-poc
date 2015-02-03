package com.redhat.workshop.ws;

public class MyLogicPortTypeProxy implements com.redhat.workshop.ws.MyLogicPortType {
  private String _endpoint = null;
  private com.redhat.workshop.ws.MyLogicPortType myLogicPortType = null;
  
  public MyLogicPortTypeProxy() {
    _initMyLogicPortTypeProxy();
  }
  
  public MyLogicPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initMyLogicPortTypeProxy();
  }
  
  private void _initMyLogicPortTypeProxy() {
    try {
      myLogicPortType = (new com.redhat.workshop.ws.MyLogicLocator()).getMyLogicPort();
      if (myLogicPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)myLogicPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)myLogicPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (myLogicPortType != null)
      ((javax.xml.rpc.Stub)myLogicPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.redhat.workshop.ws.MyLogicPortType getMyLogicPortType() {
    if (myLogicPortType == null)
      _initMyLogicPortTypeProxy();
    return myLogicPortType;
  }
  
  public com.redhat.workshop.ws.OutMessage processService(com.redhat.workshop.ws.MyForm myForm) throws java.rmi.RemoteException{
    if (myLogicPortType == null)
      _initMyLogicPortTypeProxy();
    return myLogicPortType.processService(myForm);
  }
  
  
}