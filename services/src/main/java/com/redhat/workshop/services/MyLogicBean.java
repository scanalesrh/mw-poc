package com.redhat.workshop.services;



import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

import com.redhat.workshop.services.reference.BPMSRestRemoteService;

@Service(MyLogic.class)
public class MyLogicBean implements MyLogic {

	@Inject @Reference
	BPMSRestRemoteService remoteService;
	@Override
	public String processService(MyForm form) {
//		out.setOut("Form recibido");
		System.out.println("Form tipo:["+form.getTipo()+"]");
		String out = "DEFAULT";
		try {
			out=remoteService.callHelloWorldProcess();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return out;
	}

}
