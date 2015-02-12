package org.jboss.samples.rs.webservices;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

@Path("/bpms")
public class BPMSProxy {

	@POST
	@Path("/helloworld")
	@Produces("text/plain")
	public String callBPMSProcess() {
		String output = null;
		try {
			 
			Client client = Client.create();
			client.addFilter(new HTTPBasicAuthFilter("bpmsAdmin", "welcome1!"));
			WebResource webResource = client
			   .resource("http://localhost:8380/business-central/rest/runtime/com.redhat.workshop:bpms-project:1.0/process/MyBPMSProject.helloworld/start");
	 
			ClientResponse response = webResource.post(ClientResponse.class/*, input*/);
	 
			if (response.getStatus() != 200) {
				System.out.println("Output from Server .... \n");
				output = response.getEntity(String.class);
				System.out.println(output);					
				throw new RuntimeException("Failed : HTTP error code : "
				     + response.getStatus());
			}
	 
			System.out.println("Output from Server .... \n");
			output = response.getEntity(String.class);
			System.out.println(output);
	 
		  } catch (Exception e) {
	 
			e.printStackTrace();
	 
		  }

		return output;
	}
}
