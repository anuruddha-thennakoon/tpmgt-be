package org.tpmgt.data.mdao;

import java.util.List;

import javax.json.spi.JsonProvider;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.mongodb.morphia.query.Criteria;
import org.mongodb.morphia.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tpmgt.data.CallManagerEmployee;
import org.tpmgt.data.CallManagerMD;
import org.tpmgt.data.interfaces.DashboardDao;
import org.tpmgt.exceptions.DataNotFoundException;
import org.tpmgt.model.dto.EmployeeDTO;
import org.tpmgt.model.dto.VillageOfficeList;
import org.tpmgt.model.morphia.Revision;

public class DashboardDaoImpl extends BaseDao implements DashboardDao {

	private Logger logger = LoggerFactory.getLogger(DashboardDaoImpl.class);

	/**
	 * get employee ds
	 */
	@Override
	public EmployeeDTO getDsbyUsername(String user) {

		logger.info("get ds by user");
		WebTarget target = CallManagerEmployee.getRootTarget().queryParam("username", user);
		Response response = target.request(MediaType.APPLICATION_JSON).get();
		logger.info("response:" + response);

		if (response.getStatus() != Response.Status.OK.getStatusCode()) {
			logger.info("ds not found");
			return null;
		}

		return (EmployeeDTO) response.readEntity(EmployeeDTO.class);
	}

	/**
	 * get village offices in a specific ds
	 */
	@Override
	public VillageOfficeList getVillageOfficeList(int dsId) {

		logger.info("get village office list");
		WebTarget target = CallManagerMD.getRootTarget().queryParam("data", "voFromDs");

		String json = JsonProvider.provider().createObjectBuilder().add("dsID", dsId).build().toString();
		Response response = target.request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(json, MediaType.APPLICATION_JSON));

		logger.info("response:" + response);

		if (response.getStatus() != Response.Status.OK.getStatusCode()) {
			logger.info("ds not found");
			throw new DataNotFoundException("No village offices found");
		}

		return (VillageOfficeList) response.readEntity(VillageOfficeList.class);
	}

	/**
	 * get revision count for dashboard
	 */
	@Override
	public long getRevisionCount(List<Integer> status, int pensionPointId) {

		logger.info("get revision count by state and pension point");
		Query<Revision> query = getDs().createQuery(Revision.class);

		Criteria[] crList = new Criteria[status.size()];

		for (int i = 0; i < status.size(); i++) {
			crList[i] = (query.criteria("status").equal(status.get(i)));
		}

		query.and(query.or(crList), query.criteria("pensionPoint").equal(pensionPointId));

		return query.asList().size();
	}

}
