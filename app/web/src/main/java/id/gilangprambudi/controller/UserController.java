/**
 * DANA.id
 * Copyright (c) 2017‐2024 All Rights Reserved.
 */
package id.gilangprambudi.controller;

import id.gilangprambudi.UserService;
import id.gilangprambudi.model.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * @author gilang.prambudi (gilang.prambudi@dana.id)
 * @version $Id: UserController.java, v 0.1 2024‐09‐15 22.48 gilang.prambudi Exp $$
 */

@Path("/user")
@Named
@ApplicationScoped
public class UserController {

    @Inject
    UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserData(){
        return userService.getUser();
    }
}
