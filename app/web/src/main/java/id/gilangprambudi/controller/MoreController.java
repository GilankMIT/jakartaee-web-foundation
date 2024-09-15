/**
 * DANA.id
 * Copyright (c) 2017‐2024 All Rights Reserved.
 */
package id.gilangprambudi.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

/**
 * @author gilang.prambudi (gilang.prambudi@dana.id)
 * @version $Id: MoreController.java, v 0.1 2024‐09‐15 22.25 gilang.prambudi Exp $$
 */

@Path("/more")
public class MoreController {
    @GET
    public String testApi() {
        return "More Controller!";
    }
}
