/**
 * 
 */
package com.tariq.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.stereotype.Component;
import com.tariq.model.User;
import com.tariq.service.UserService;

/**
 * @author tariqul
 *
 */

@Component
@Path("/users")
public class UserController {
	
    private UserService userService;

    public UserController(UserService userService) {

        this.userService = userService;

    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getEventVersion1(@PathParam("id") String id) {
      return userService.findById(id);
    }

}
