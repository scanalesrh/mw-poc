package com.redhat.workshop.web.proxy.service;

import java.rmi.RemoteException;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.axis.AxisFault;

import com.redhat.workshop.ws.MyForm;
import com.redhat.workshop.ws.MyLogicLocator;
import com.redhat.workshop.ws.MyLogicPortType;
import com.redhat.workshop.ws.MyLogicPortTypeProxy;
import com.redhat.workshop.ws.OutMessage;

/**
 * Session Bean implementation class Service
 */
@Stateless
@LocalBean
public class Service implements ServiceLocal {

    /**
     * Default constructor. 
     */
    public Service() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public OutMessage callFormService(MyForm form) {
		OutMessage out = null;
		try {
			 MyLogicPortType _port = new MyLogicPortTypeProxy(new MyLogicLocator().getMyLogicPortAddress()).getMyLogicPortType();
			 out = _port.processService(form);
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out;
	}

}
