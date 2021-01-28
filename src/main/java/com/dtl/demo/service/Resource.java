package com.dtl.demo.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("properties")
public class Resource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response message() {
	StringBuilder builder = new StringBuilder();
	builder.append("{");
	builder.append(String.format("\"%s\": \"%s\",", "OS Arch", System.getProperty("os.arch")));
	builder.append(String.format("\"%s\": \"%s\",", "OS Name", System.getProperty("os.name")));
	builder.append(String.format("\"%s\": \"%s\"", "OS Version", System.getProperty("os.version")));
	builder.append("}");
        return Response.ok(builder.toString()).build();
    }
}
