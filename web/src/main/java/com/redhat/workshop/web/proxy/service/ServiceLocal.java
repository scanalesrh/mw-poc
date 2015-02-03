package com.redhat.workshop.web.proxy.service;

import javax.ejb.Local;

import com.redhat.workshop.ws.MyForm;
import com.redhat.workshop.ws.OutMessage;

@Local
public interface ServiceLocal {

	OutMessage callFormService(MyForm form); 
}
