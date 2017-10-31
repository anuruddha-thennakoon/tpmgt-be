package org.tpmgt.resources;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.tpmgt.filters.params.AuthMeta;
import org.tpmgt.model.dto.Arrears;
import org.tpmgt.model.dto.Message;
import org.tpmgt.model.dto.Model;
import org.tpmgt.model.dto.RevisionDto;
import org.tpmgt.model.dto.RevisionOverviewDto;
import org.tpmgt.model.morphia.Revision;
import org.tpmgt.services.RevisionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(
		tags = {"Revisions"},
		consumes = MediaType.APPLICATION_JSON,
		produces = MediaType.APPLICATION_JSON)

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

@Path("revisions")
public class RevisionResource {

	@ApiOperation(value = "Get all revisions",
			notes = "Get all the revisions which are belong the the pension point",
			response = RevisionOverviewDto.class,
			responseContainer = "List",
			code = 200
			)
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "no revisions found")
	})
	@GET
	public Response list(
			@ApiParam("filter by") @QueryParam("state") String state
			) {
		RevisionService service = new RevisionService();
		
		return Response.ok(service.getMinimalList()).build();
	}

	/**
	 * get revision by revision number
	 * @param revisionNumber
	 * @return
	 */
	@ApiOperation(value = "Get a revision",
			notes = "Get a revision by revision number",
			response = RevisionDto.class,
			code = 200
			)
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "no revisions found")
	})
	@GET
	@Path("/{revisionNumber}")
	public Response get(@PathParam("revisionNumber") long revisionNumber) {
		
		RevisionService service = new RevisionService();
		Revision modal = service.getRevision(revisionNumber);
		return Response.ok(modal).build();
	}
	
	/**
	 * get revision for edit
	 * @param revisionNumber
	 * @return
	 */
	@ApiOperation(value = "Update a revision",
			notes = "Update a specific revision by using revision number",
			response = Message.class,
			code = 200
			)
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "no revisions available for the requested number")
	})
	
	@GET
	@Path("/edit/{revisionNumber}")
	public Response getForEdit(@PathParam("revisionNumber") long revisionNumber) {
		RevisionService service = new RevisionService();
		
		return Response.ok(service.getRevisionForEdit(revisionNumber)).build();
	}
	
	/**
	 * update revision
	 * @param revisionNumber
	 * @param model
	 * @param meta
	 * @return
	 */
	@ApiOperation(value = "Update a revision",
			notes = "Update a specific revision by using revision number",
			response = Message.class,
			code = 200
			)
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "no revisions available for the requested number")
	})
	@PUT
	@Path("/{revisionNumber}")
	public Response update(
			@PathParam("revisionNumber") long revisionNumber,
			@ApiParam("model") Model model,
			@BeanParam AuthMeta meta) {
		
		RevisionService service = new RevisionService();
		boolean isUpdated = service.updateRevision(revisionNumber, model, meta);
		
		if(isUpdated) {
			return Response.ok(new Message(Status.OK.getStatusCode(), "revision updated")).build();
		} else {
			return Response.status(Status.BAD_REQUEST).entity(new Message(Status.BAD_REQUEST.getStatusCode(), "revision update failed")).build();
		}
		
	}
	
	/**
	 * update revision state
	 * @param revisionNumber
	 * @param isVerified
	 * @param meta
	 * @return
	 */
	@ApiOperation(value = "Update revision state",
			notes = "Update state of a  specific revision by using revision number",
			response = Message.class,
			code = 200
			)
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "no revisions available for the requested number")
	})
	@PUT
	@Path("/{revisionNumber}/state")
	public Response update(
			@PathParam("revisionNumber") long revisionNumber, 
			@ApiParam("is accecpted") @QueryParam("accecpt") boolean isVerified,
			@BeanParam AuthMeta meta
			) {
		RevisionService service = new RevisionService();
		boolean isUpdated = service.updateRevisionState(revisionNumber, isVerified, meta);
		
		if(isUpdated) {
			return Response.ok(new Message(Status.OK.getStatusCode(), "revision state updated")).build();
		} else {
			return Response.status(Status.BAD_REQUEST).entity(new Message(Status.BAD_REQUEST.getStatusCode(), "revision update failed")).build();
		}
		
	}
	
	
	/**
	 * create revision
	 * @param model
	 * @return
	 */
	@ApiOperation(value = "Create a revision",
			notes = "Create a revision document",
			response = Message.class,
			code = 201
			)
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "no revisions available for the requested number")
	})
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Model modal, @BeanParam AuthMeta meta) {
	
		RevisionService service = new RevisionService();
		boolean isCreated = service.createRevision(modal, meta);
		
		if(isCreated) return Response.status(Status.CREATED)
				.entity(new Message(Status.CREATED.getStatusCode(), "Revision document created successfully")).build();
		
		return Response.status(Status.BAD_REQUEST)
				.entity(new Message(Status.BAD_REQUEST.getStatusCode(), "Error occured while tring to save the revision document")).build();
	
	
	/*	Model test = new Model();
		RevisionModelDto model = new RevisionModelDto();
		RevisionData data = new RevisionData();
		
		PensionerProfileModel profile = new PensionerProfileModel();
		profile.setAddress("11");
		
		PensionInfoModel info = new PensionInfoModel();
		info.setConsolidatedSalary(12000);
		//info.setBranch();
		
		PensionerServiceModel ser = new PensionerServiceModel();
		List<Allowance> list = new ArrayList<Allowance>();
		Allowance container = new Allowance();
			container.setAllowanceDesc("ss");
			container.setPastAllowance(12);
			container.setPresentAllowance(25);
			
			list.add(container);
			
			Allowance container2 = new Allowance();
			container2.setAllowanceDesc("ss2");
			container2.setPastAllowance(122);
			container2.setPresentAllowance(252);
			
			list.add(container2);
		
		ser.setCircular("2016");
		ser.setAllowances(list);
		
	
		
		data.set_pensionerProfile(profile);
		data.set_pensionInfo(info);
		data.set_pensionerService(ser);
		
		model.setNewRevisionData(data);
		
		test.setModel(model);

		return Response.ok(test).build();*/
	}
	
	/**
	 * get arrears details by revision number
	 * @param revisionNumber
	 * @return
	 */
	@GET
	@Path("/arrears/{revisionNumber}")
	public Response getArrears(@PathParam("revisionNumber") long revisionNumber) {
		RevisionService service = new RevisionService();
		
		return Response.ok(service.getArrears(revisionNumber)).build();
	}
	
	/**
	 * add arrears
	 * @param revisionNumber
	 * @param model
	 * @param meta
	 * @return
	 */
	@ApiOperation(value = "Update a revision",
			notes = "Update a specific revision by using revision number",
			response = Message.class,
			code = 200
			)
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "no revisions available for the requested number")
	})
	@PUT
	@Path("/arrears/{revisionNumber}")
	public Response arrears(
			@PathParam("revisionNumber") long revisionNumber,
			@ApiParam("arrears") Arrears model,
			@BeanParam AuthMeta meta) {
		
		RevisionService service = new RevisionService();
		boolean isUpdated = service.addArrears(revisionNumber, model);
		
		if(isUpdated) {
			return Response.ok(new Message(Status.OK.getStatusCode(), "arrears successfully saved.")).build();
		} else {
			return Response.status(Status.BAD_REQUEST).entity(new Message(Status.BAD_REQUEST.getStatusCode(), "revision update failed")).build();
		}
		
	}

	

}
