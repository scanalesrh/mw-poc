package com.redhat.workshop.services;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

import com.redhat.workshop.services.reference.BPMSRestRemoteService;

@Service(CompTres.class)
public class CompTresBean implements CompTres {

	@Inject
	@Reference
	BPMSRestRemoteService service;
	
	@Override
	public String compCall(MyForm form) {
		// TODO Auto-generated method stub
		String out = "SIN RESPUESTA DEL SERVICIO";
		try {
			out = service.callHelloWorldProcess();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return out;
	}

}
