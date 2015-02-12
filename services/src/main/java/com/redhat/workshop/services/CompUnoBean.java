package com.redhat.workshop.services;

import org.switchyard.component.bean.Service;

@Service(CompUno.class)
public class CompUnoBean implements CompUno {

	@Override
	public String callCompUno(MyForm form) {
		// TODO Auto-generated method stub
		return "RESPUESTA SERVICE";
	}

}
