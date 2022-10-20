package com.ojas;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {
	@GET
	@Produces("text/html")
	public Response hello() {
		String output = "Welcome to Restful demo";
		return Response.status(200).entity(output).build();
	}
}
