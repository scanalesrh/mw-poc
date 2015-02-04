/**
 * 
 */
package com.redhat.workshop.web;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.redhat.workshop.util.MyFormVO;
import com.redhat.workshop.util.RestClientCallUtil;
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

	private MyFormVO form;
	private String result;
	@Inject
	ServiceLocal service;
	@Inject
	RestClientCallUtil restService;
	/**
	 * 
	 */
	public FormBean() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	private void init(){
		this.form = new MyFormVO();
		this.setResult("");
	}
	
	public String procesaForm() throws Exception{
//		this.result = ((OutMessage)service.callFormService(form)).getOut();
		this.result = restService.callJsonRemoteRest("http://localhost:8280/rest/process/form", this.form);
		return "result.xhtml";
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public MyFormVO getForm() {
		return form;
	}

	public void setForm(MyFormVO form) {
		this.form = form;
	}

}
