package com.redhat.workshop.services;

import org.switchyard.component.bean.Service;

@Service(MyLogic.class)
public class MyLogicBean implements MyLogic {

	@Override
	public OutMessage processService(MyForm form) {
		OutMessage out = new OutMessage();
		out.setOut("Form recibido");
		System.out.println("Form tipo:["+form.getTipo()+"]");
		return out;
	}

}
