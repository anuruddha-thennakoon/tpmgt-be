package org.tpmgt.data.mdao;

import java.util.List;

import org.mongodb.morphia.query.Criteria;
import org.mongodb.morphia.query.FindOptions;
import org.mongodb.morphia.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tpmgt.data.interfaces.RevisionDao;
import org.tpmgt.model.dto.VillageOfficeList;
import org.tpmgt.model.morphia.Revision;

public class RevisionDaoImpl extends BaseDao implements RevisionDao {

	private Logger logger = LoggerFactory.getLogger(RevisionDaoImpl.class);

	@Override
	public Revision get(long revisionNumber) {
		Query<Revision> query = getDs().createQuery(Revision.class);
		return query.field("_id").equal(revisionNumber).get();
	}

	@Override
	public void create(Revision model) {
		getDs().save(model);
	}

	@Override
	public List<Revision> minimalList() {
		List<Revision> list = getDs().createQuery(Revision.class).project("revisionNumber", true)
				.project("pensionNumber", true).asList();

		return list;
	}

	/**
	 * get revision list for non ds officer
	 */
	@Override
	public List<Revision> getRevisionList(List<Integer> status, int pensionPoint) {

		logger.info("dashboard list, status: " + status + " pension point: " + pensionPoint);
		Query<Revision> query = getDs().createQuery(Revision.class);

		Criteria[] crList = new Criteria[status.size()];

		for (int i = 0; i < status.size(); i++) {
			crList[i] = (query.criteria("status").equal(status.get(i)));
		}

		query.and(query.or(crList), query.criteria("pensionPoint").equal(pensionPoint));
		return query.asList();
	}

	@Override
	public Long getLastId() {
		List<Revision> list = getDs().find(Revision.class).order("-_id").asList(new FindOptions().limit(1));
		return list.get(0).getRevisionNumber();
	}

	/**
	 * get revision list for ds officer
	 */
	@Override
	public List<Revision> getDsRevisionList(List<Integer> status, VillageOfficeList VillageOffice) {

		logger.info("get dashboard list for ds office");
		Query<Revision> query = getDs().createQuery(Revision.class);

		Criteria[] crList = new Criteria[status.size()];

		for (int i = 0; i < status.size(); i++) {
			crList[i] = (query.criteria("status").equal(status.get(i)));
		}

		Criteria[] crList2 = new Criteria[status.size()];

		for (int j = 0; j < VillageOffice.getList().size(); j++) {
			crList2[j] = (query.criteria("villageId").equal(VillageOffice.getList().get(j)));
		}

		query.and(query.or(crList), query.or(crList2));

		return query.asList();
	}

}
