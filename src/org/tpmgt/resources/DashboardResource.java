package org.tpmgt.resources;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tpmgt.filters.params.AuthMeta;
import org.tpmgt.model.dto.DashboardDTO;
import org.tpmgt.model.dto.DashboardDetails;
import org.tpmgt.model.dto.Message;
import org.tpmgt.services.DashboardService;

import io.swagger.annotations.Api;

@Api(tags = { "Dashboard" }, consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
@Path("/dashboard")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DashboardResource {

	private Logger logger = LoggerFactory.getLogger(DashboardResource.class);

	/**
	 * get revision dashboard list count
	 * 
	 * @param auth
	 * @return
	 */
	@GET
	public Response getDashboardDetails(@BeanParam AuthMeta auth) {

		logger.info("dashboard resource, dashboard details");
		DashboardDetails dto = new DashboardService().getDashboardCount(auth);
		ResponseBuilder builder;

		if (dto == null) {
			builder = Response.status(Status.BAD_REQUEST).entity(new Message(Status.BAD_REQUEST.getStatusCode(),
					"Error occured while tring to get the dashboard details. please try again"));
		} else {
			builder = Response.ok(dto);
		}

		return builder.build();
	}

	/**
	 * get pending revisions list
	 * 
	 * @return
	 */
	@GET
	@Path("/pending")
	public Response getPendingList(@BeanParam AuthMeta auth) {

		logger.info("get pending revision list");

		DashboardService service = new DashboardService();
		DashboardDTO dto = service.getDashboardDetails(auth, "pending");

		ResponseBuilder builder;

		if (dto == null) {
			builder = Response.status(Status.BAD_REQUEST).entity(new Message(Status.BAD_REQUEST.getStatusCode(),
					"Error occured while trying to get the dashboard details."));
		} else {
			builder = Response.ok(dto);
		}

		logger.info("pending dashboard details returned");
		return builder.build();
	}

	/**
	 * get rejected revisions list
	 * 
	 * @return
	 */
	@GET
	@Path("/rejected")
	public Response getRejectedList(@BeanParam AuthMeta auth) {

		logger.info("get rejected revision list");

		DashboardService service = new DashboardService();
		DashboardDTO dto = service.getDashboardDetails(auth, "rejected");

		ResponseBuilder builder;

		if (dto == null) {
			builder = Response.status(Status.BAD_REQUEST).entity(new Message(Status.BAD_REQUEST.getStatusCode(),
					"Error occured while trying to get the dashboard details."));
		} else {
			builder = Response.ok(dto);
		}

		logger.info("rejected dashboard details returned");
		return builder.build();
	}

	/**
	 * get approved revision list
	 * 
	 * @return
	 */
	@GET
	@Path("/approved")
	public Response getApprovedList(@BeanParam AuthMeta auth) {

		logger.info("get approved revision list");

		DashboardService service = new DashboardService();
		DashboardDTO dto = service.getDashboardDetails(auth, "approved");

		ResponseBuilder builder;

		if (dto == null) {
			builder = Response.status(Status.BAD_REQUEST).entity(new Message(Status.BAD_REQUEST.getStatusCode(),
					"Error occured while trying to get the dashboard details."));
		} else {
			builder = Response.ok(dto);
		}

		logger.info("approved dashboard details returned");
		return builder.build();
	}

	/**
	 * get corrected revision list
	 * 
	 * @return
	 */
	@GET
	@Path("/corrected")
	public Response getCorrectedList(@BeanParam AuthMeta auth) {

		logger.info("get corrected revision list");

		DashboardService service = new DashboardService();
		DashboardDTO dto = service.getDashboardDetails(auth, "corrected");

		ResponseBuilder builder;

		if (dto == null) {
			builder = Response.status(Status.BAD_REQUEST).entity(new Message(Status.BAD_REQUEST.getStatusCode(),
					"Error occured while trying to get the dashboard details."));
		} else {
			builder = Response.ok(dto);
		}

		logger.info("corrected dashboard details returned");
		return builder.build();
	}

	/**
	 * get award printing list
	 * 
	 * @return
	 */
	@GET
	@Path("/awardp")
	public Response getAwardpList(@BeanParam AuthMeta auth) {

		logger.info("get award printed revision list");

		DashboardService service = new DashboardService();
		DashboardDTO dto = service.getDashboardDetails(auth, "awardp");

		ResponseBuilder builder;

		if (dto == null) {
			builder = Response.status(Status.BAD_REQUEST).entity(new Message(Status.BAD_REQUEST.getStatusCode(),
					"Error occured while trying to get the dashboard details."));
		} else {
			builder = Response.ok(dto);
		}

		logger.info("award printed dashboard details returned");
		return builder.build();
	}
}
