package com.redhat.workshop.web.proxy.service;

import javax.ejb.Local;

import com.redhat.workshop.model.MyForm;

@Local
public interface ServiceLocal {

		String callFormService(MyForm form); 
}
