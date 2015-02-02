/**
 * 
 */
package com.redhat.workshop.web;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.redhat.workshop.model.MyForm;
import com.redhat.workshop.web.proxy.service.ServiceLocal;

@Named("formBean")
@SessionScoped
/**
 * @author RH-MW_LAB01
 *
 */
public class FormBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2806226528576159606L;

	private MyForm form;
	private String result;
	@Inject
	ServiceLocal service;
	/**
	 * 
	 */
	public FormBean() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	private void init(){
		this.form = new MyForm();
		this.setResult("");
	}
	
	public String procesaForm(){
		this.result = service.callFormService(form);
		return "result.xhtml";
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
