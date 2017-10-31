package org.tpmgt.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.tpmgt.model.dto.AuthParams;
import org.tpmgt.model.dto.AuthReply;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Api(
		tags = {"Users"},
		consumes = MediaType.APPLICATION_JSON,
		produces = MediaType.APPLICATION_JSON)

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("users")
public class UserResource {

	@ApiOperation(value = "Authenticate a user",
			notes = "Authenticate a user to access the other resources",
			response = AuthReply.class,
			code = 200
			)
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "user is not authenticated")
	})
	@POST
	@Path("/authenticate")
	public Response authenticate(AuthParams params) {
		// TODO not implemented
		return Response.ok().build();
	}

}
