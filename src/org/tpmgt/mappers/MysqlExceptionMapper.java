package org.tpmgt.mappers;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.tpmgt.exceptions.MysqlException;
import org.tpmgt.model.dto.Message;

@Provider
public class MysqlExceptionMapper implements ExceptionMapper<MysqlException>{

	@Override
	public Response toResponse(MysqlException exception) {
		return Response
				.status(Status.INTERNAL_SERVER_ERROR)
				.entity(new Message(Status.INTERNAL_SERVER_ERROR.getStatusCode(),
						"An error occured in the database. please contact the administrator"
						))
				.build();
	}
		
}
