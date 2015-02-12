package com.redhat.workshop.util;


import javax.enterprise.inject.Model;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.json.JSONConfiguration;

@Model
public class RestClientCallUtil {

	/**
	 * Metodo que permite realizar llamada a servicio de tipo Rest mediante una
	 * petición HTTP de tipo GET. Los parametros son definidos en la URL de la
	 * peticion HTTP dado a que esta es de tipo GET.
	 * 
	 * @param endpointURL
	 * @return String (JSON)
	 * @throws Exception
	 */
	public String callJsonRemoteRest(String endpointURL) throws Exception {
		String strJson = "ERROR";
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,
				Boolean.TRUE);
		Client client = Client.create(clientConfig);
		WebResource webResource = client.resource(endpointURL);
		ClientResponse response = webResource.accept("application/json")
				.type("application/json").get(ClientResponse.class);
		if (response.getStatus() == 200) {
			strJson = response.getEntity(String.class);
		}
		return strJson;
	}

	/**
	 * Metodo que permite realizar llamada a servicio de tipo Rest mediante una
	 * petición HTTP de tipo POST. Toma el parametro de tipo Object y lo
	 * serializa, dandole una estructura JSON.
	 * 
	 * @param endpointURL
	 * @param pojo
	 * @return String (JSON)
	 * @throws Exception
	 */
	public String callJsonRemoteRest(String endpointURL, Object pojo)
			throws Exception {
		String strJson = null;
		try {
			ClientConfig config = new DefaultClientConfig();
			config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.TRUE);
			Client client = Client.create(config);
			WebResource webResource = client.resource(endpointURL);
			ClientResponse response = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, pojo);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}
			strJson = response.getEntity(String.class);
			System.out.println(strJson);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strJson;
	}

	  public static void main(String[] args) {
		  
			try {
		 
				Client client = Client.create();
				client.addFilter(new HTTPBasicAuthFilter("bpmsAdmin", "welcome1!"));
				WebResource webResource = client
				   .resource("http://localhost:8380/business-central/rest/runtime/com.redhat.workshop:bpms-project:1.0/process/MyBPMSProject.helloworld/start");
		 
//				String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
				ClientResponse response = webResource.post(ClientResponse.class/*, input*/);
		 
				if (response.getStatus() != 200) {
					System.out.println("Output from Server .... \n");
					String output = response.getEntity(String.class);
					System.out.println(output);					
					throw new RuntimeException("Failed : HTTP error code : "
					     + response.getStatus());
				}
		 
				System.out.println("Output from Server .... \n");
				String output = response.getEntity(String.class);
				System.out.println(output);
		 
			  } catch (Exception e) {
		 
				e.printStackTrace();
		 
			  }
		 
			}	
}
