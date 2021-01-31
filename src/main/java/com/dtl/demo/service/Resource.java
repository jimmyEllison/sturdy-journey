package com.dtl.demo.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("properties")
public class Resource {

    private StringBuilder builder;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getSystemInfo() {
        if (builder == null) {
            builder = new StringBuilder();
        } else { builder = builder.delete(0, builder.length()); }
        builder.append("{");
        builder.append(String.format("\"%s\": \"%s\",", "arch", System.getProperty("os.arch")));
        builder.append(String.format("\"%s\": \"%s\",", "name", System.getProperty("os.name")));
        builder.append(String.format("\"%s\": \"%s\"", "version", System.getProperty("os.version")));
        builder.append("}");

        return builder.toString();
    }
}
