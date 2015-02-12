package com.redhat.workshop.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;

@XmlRootElement(name="process-instance")
@XmlAccessorType(XmlAccessType.FIELD)
public class JaxbProcessInstanceResponse {

    @XmlElement(name="status")
    @XmlSchemaType(name="string")
    private String status;

    @XmlElement(name="status")
    @XmlSchemaType(name="string")
    private String url;

    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@XmlElement(name="process-id")
    @XmlSchemaType(name="string")
    private Integer processId; 

    @XmlElement(name="id")
    @XmlSchemaType(name="string")
    private Integer id; 
    
    @XmlElement(name="state")
    @XmlSchemaType(name="string")
    private String state;    
    
}
