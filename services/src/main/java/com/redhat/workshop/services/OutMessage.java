package com.redhat.workshop.services;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OutMessage {

	private String out = null;

	public String getOut() {
		return out;
	}

	public void setOut(String out) {
		this.out = out;
	}
}
