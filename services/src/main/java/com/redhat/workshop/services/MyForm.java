package com.redhat.workshop.services;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyForm {
	
	private String tipo = "";

	public String getTipo() {
		return tipo;
	}
	@XmlElement
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
