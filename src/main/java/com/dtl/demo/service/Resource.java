package com.dtl.demo.service;

import javax.json.JsonArray;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("persons")
public class Resource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonArray message() {
        return Reader.getPersons();
    }

}
