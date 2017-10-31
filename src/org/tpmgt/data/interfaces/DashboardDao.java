package org.tpmgt.data.interfaces;

import java.util.List;

import org.tpmgt.model.dto.EmployeeDTO;
import org.tpmgt.model.dto.VillageOfficeList;

public interface DashboardDao {

	/**
	 * get employee ds
	 * 
	 * @param user
	 * @return
	 */
	EmployeeDTO getDsbyUsername(String user);

	/**
	 * get village offices for ds id
	 * 
	 * @param dsId
	 * @return
	 */
	VillageOfficeList getVillageOfficeList(int dsId);

	/**
	 * get revision count for dashboard
	 * 
	 * @param state
	 * @param pensionPointId
	 * @return
	 */
	public long getRevisionCount(List<Integer> status, int pensionPointId);
}
