package com.dtl.demo.service;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("properties")
public class Resource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getSystemInfo() {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        System.getProperties().entrySet().forEach(entry -> {
            builder.add((String) entry.getKey(), ((String) entry.getValue()).strip());
        });
        return builder.build();
    }
}
