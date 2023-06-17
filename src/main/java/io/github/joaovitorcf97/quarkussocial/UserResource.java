package io.github.joaovitorcf97.quarkussocial;

import io.github.joaovitorcf97.quarkussocial.dto.CreateUserRequest;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @POST
    public Response createUser(CreateUserRequest userRequest) {
        System.out.println(userRequest.getName());
        return Response.ok().build();
    }

    @GET
    public Response listAllUsers() {
        return Response.ok().build();
    }
}
