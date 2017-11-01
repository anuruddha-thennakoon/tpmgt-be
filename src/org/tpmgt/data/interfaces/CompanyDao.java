
package org.tpmgt.data.interfaces;

import java.util.List;

import org.tpmgt.model.dto.VillageOfficeList;
import org.tpmgt.model.morphia.Revision;

public interface RevisionDao {

	Revision get(long revisionNumber);

	void create(Revision model);

	List<Revision> minimalList();

	/**
	 * get revision list for non ds officer
	 * 
	 * @param status
	 * @param pensionPoint
	 * @return
	 */
	List<Revision> getRevisionList(List<Integer> status, int pensionPoint);

	/**
	 * get revision list for ds officer
	 * 
	 * @param status
	 * @param villageOffice
	 * @return
	 */
	List<Revision> getDsRevisionList(List<Integer> status, VillageOfficeList villageOffice);

	Long getLastId();
}
