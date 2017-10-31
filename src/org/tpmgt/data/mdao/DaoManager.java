package org.tpmgt.data.mdao;

import org.tpmgt.data.interfaces.DashboardDao;
import org.tpmgt.data.interfaces.RevisionDao;

/**
 * manager for DAO object creation
 * abstracts the DAO object creation from the service layer
 * @author Dinesh
 *
 */
public class DaoManager {
	
	/**
	 * get revision DAO
	 * @return mongo db implementation
	 */
	public static RevisionDao getRevisionDao() {
		return new RevisionDaoImpl();
	}
	
	public static DashboardDao getDashboardDao(){
		return new DashboardDaoImpl();
	}
	
}
