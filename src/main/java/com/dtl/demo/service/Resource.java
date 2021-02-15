package com.dtl.demo.service;

import java.util.stream.Collectors;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("properties")
public class Resource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getSystemInfo() {
        String str = System.getProperties()
                .entrySet()
                .stream()
                .map(entry -> 
		String.format("\"%s\": \"%s\"", 
			(String) entry.getKey(), 
			((String) entry.getValue()).strip()))
                .collect(Collectors.joining(",\n"));

        return String.format("{%s}", str);
    }
}
