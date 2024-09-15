/**
 * DANA.id
 * Copyright (c) 2017‐2024 All Rights Reserved.
 */
package id.gilangprambudi.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * @author gilang.prambudi (gilang.prambudi@dana.id)
 * @version $Id: net.java, v 0.1 2024‐09‐15 21.22 gilang.prambudi Exp $$
 */

@Path("/hello")
public class HelloController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String testApi() {
        return "Hello Controller!";
    }
}
