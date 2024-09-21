
package id.gilangprambudi.web.foundation.web.controller;

import service.UserService;
import id.gilangprambudi.web.foundation.service.core.dataobject.WebUserDO;
import id.gilangprambudi.web.foundation.service.core.interceptor.annotations.InitTrace;
import id.gilangprambudi.web.foundation.service.core.interceptor.annotations.Validate;
import id.gilangprambudi.web.foundation.service.core.model.WebUser;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: UserController.java, v 0.1 2024‐09‐15 22.48 gilang.prambudi Exp $$
 */

@Path("/user")
@Named
@ApplicationScoped
@InitTrace
@Validate
public class UserController {

    @Inject
    UserService userService;

    @GET
    @Path("/one")
    @Produces(MediaType.APPLICATION_JSON)
    public WebUser getUserData(){
        return userService.getUser();
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<WebUser> getUserDataAll(){
        return userService.getAllUser();
    }

    @GET
    @Path("/my-batis")
    @Produces(MediaType.APPLICATION_JSON)
    public List<WebUserDO> getUserDataAllMyBatis(){
        return userService.getAllUserDO();
    }
}
