package com.redhat.workshop.services.reference;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public interface HelloWorldResource {

	@GET()
	@Produces("text/plain")
	public String sayHello();
}
