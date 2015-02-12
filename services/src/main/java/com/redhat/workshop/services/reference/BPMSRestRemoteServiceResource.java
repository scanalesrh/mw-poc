package com.redhat.workshop.services.reference;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.redhat.workshop.services.JaxbProcessInstanceResponse;

@Path("/bpms")
public interface BPMSRestRemoteServiceResource {

	@POST
	@Path("/helloworld")
	@Produces("text/plain")
	String callHelloWorldProcess();
}
