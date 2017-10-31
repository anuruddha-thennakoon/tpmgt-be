package org.tpmgt.mappers;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.tpmgt.exceptions.InsertNotSuccessfulException;
import org.tpmgt.model.dto.Message;

@Provider
public class InsertNotSuccessfulExceptionMapper implements ExceptionMapper<InsertNotSuccessfulException>{
	
	@Override
	public Response toResponse(InsertNotSuccessfulException exception) {
		return Response
				.status(Status.INTERNAL_SERVER_ERROR)
				.entity(new Message(Status.INTERNAL_SERVER_ERROR.getStatusCode(), exception.getMessage()))
				.type(MediaType.APPLICATION_JSON)
				.build();
	}
	
}
