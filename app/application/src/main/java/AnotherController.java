/**
 * DANA.id
 * Copyright (c) 2017‐2024 All Rights Reserved.
 */

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * @author gilang.prambudi (gilang.prambudi@dana.id)
 * @version $Id: AnotherController.java, v 0.1 2024‐09‐15 22.10 gilang.prambudi Exp $$
 */

@Path("/another")
public class AnotherController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String testApi() {
        return "Another Controller!";
    }

}
