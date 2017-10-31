package org.tpmgt.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tpmgt.consts.UserRoles;
import org.tpmgt.controllers.StatusManager;
import org.tpmgt.data.interfaces.DashboardDao;
import org.tpmgt.data.interfaces.RevisionDao;
import org.tpmgt.data.mdao.DaoManager;
import org.tpmgt.data.mdao.DashboardDaoImpl;
import org.tpmgt.exceptions.DataNotFoundException;
import org.tpmgt.filters.params.AuthMeta;
import org.tpmgt.helpers.ModalToDtoMapper;
import org.tpmgt.model.dto.DashboardDTO;
import org.tpmgt.model.dto.DashboardDetails;
import org.tpmgt.model.dto.DashboardModel;
import org.tpmgt.model.dto.EmployeeDTO;
import org.tpmgt.model.dto.Hetoes;
import org.tpmgt.model.dto.VillageOfficeList;
import org.tpmgt.model.morphia.Revision;

/**
 * get dash board details by status and user role
 * 
 * @author Isuru Jayathilaka
 *
 */
public class DashboardService {

	private Logger logger = LoggerFactory.getLogger(DashboardService.class);

	/**
	 * get revision dashboard details
	 * 
	 * @param auth
	 * @param listType
	 * @return
	 */
	public DashboardDTO getDashboardDetails(AuthMeta auth, String listType) {

		logger.info("get revision list dashboard details service");

		String user = auth.getUsername();
		System.out.println(user);
		DashboardDao dashboardDao = DaoManager.getDashboardDao();
		EmployeeDTO empModal = dashboardDao.getDsbyUsername(user);

		List<Revision> list = null;

		if (UserRoles.isDsUSerRole(auth.getRole())) {

			logger.info("ds user role");
			VillageOfficeList voList = dashboardDao.getVillageOfficeList(empModal.getDs());
			RevisionDao dao = DaoManager.getRevisionDao();
			logger.info("role:" + auth.getRole() + " list type:" + listType);

			list = dao.getDsRevisionList(StatusManager.getListingStatus(auth.getRole(), listType), voList);

			if (voList == null)
				throw new DataNotFoundException("No village offices found");

		} else {

			logger.info("none ds user role");
			int pensionPointId = auth.getPensionPoint();
			RevisionDao dao = DaoManager.getRevisionDao();
			logger.info("role:" + auth.getRole() + " list type:" + listType + " pension point:" + pensionPointId);

			list = dao.getRevisionList(StatusManager.getListingStatus(auth.getRole(), listType), pensionPointId);

		}

		if (list == null || list.isEmpty())
			throw new DataNotFoundException("no revisions found");

		logger.info("revision list found");

		Iterator<Revision> iterator = list.iterator();
		List<DashboardModel> dlist = new ArrayList<>();
		

		while (iterator.hasNext()) {
			dlist.add(ModalToDtoMapper.map(iterator.next()));
		}
		System.out.println(dlist);
		return new DashboardDTO(dlist);

	}

	/**
	 * get current dash board details of the current pension point
	 * 
	 * @param auth
	 * @return
	 */
	public DashboardDetails getDashboardCount(AuthMeta auth) {

		logger.info("get dash board details of the current pension point");
		DashboardDaoImpl dashboardDAO = new DashboardDaoImpl();
		List<Hetoes> list = new ArrayList<>();
		int pensionPointId = auth.getPensionPoint();
		String role = auth.getRole();

		long pendingCount = dashboardDAO.getRevisionCount(StatusManager.getListingStatus(role, "pending"),
				pensionPointId);
		long rejectedCount = dashboardDAO.getRevisionCount(StatusManager.getListingStatus(role, "rejected"),
				pensionPointId);
		long approvedCount = dashboardDAO.getRevisionCount(StatusManager.getListingStatus(role, "approved"),
				pensionPointId);
		long correctedCount = dashboardDAO.getRevisionCount(StatusManager.getListingStatus(role, "corrected"),
				pensionPointId);
		long awardpCount = dashboardDAO.getRevisionCount(StatusManager.getListingStatus(role, "awardp"),
				pensionPointId);

		list.add(new Hetoes("pending revisions", String.valueOf(pendingCount)));
		list.add(new Hetoes("rejected revisions", String.valueOf(rejectedCount)));
		list.add(new Hetoes("approved revisions", String.valueOf(approvedCount)));
		list.add(new Hetoes("corrected revisions", String.valueOf(correctedCount)));
		list.add(new Hetoes("awardp revisions", String.valueOf(awardpCount)));

		DashboardDetails dto = new DashboardDetails();
		dto.setDetails(list);

		return dto;
	}
}
