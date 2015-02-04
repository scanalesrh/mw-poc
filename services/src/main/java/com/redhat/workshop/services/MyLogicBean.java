package com.redhat.workshop.services;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

import com.redhat.workshop.services.reference.HelloWorld;

@Service(MyLogic.class)
public class MyLogicBean implements MyLogic {

	@Inject @Reference
	HelloWorld remoteService;
	@Override
	public OutMessage processService(MyForm form) {
		OutMessage out = new OutMessage();
//		out.setOut("Form recibido");
		System.out.println("Form tipo:["+form.getTipo()+"]");
		out.setOut(remoteService.sayHello());
		return out;
	}

}
