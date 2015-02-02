package com.redhat.workshop.web.proxy.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.redhat.workshop.model.MyForm;

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
	public String callFormService(MyForm form) {
		
		return null;
	}

}
