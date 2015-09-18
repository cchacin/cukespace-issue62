package com.cchacin.cukespace.issue62;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("sample")
public class App {

    @GET
    @Path("ping")
    public Response ping() {
        return Response.ok("pong").build();
    }
}
