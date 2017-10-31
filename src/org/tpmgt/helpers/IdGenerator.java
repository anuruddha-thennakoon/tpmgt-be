package org.tpmgt.helpers;

import org.tpmgt.data.interfaces.RevisionDao;
import org.tpmgt.data.mdao.DaoManager;

public class IdGenerator {
	
	/**
	 * auto generate revision id
	 * @return
	 */
	public static long generateRevisionId() {
		
		RevisionDao dao = DaoManager.getRevisionDao();
		long last = 0;
		
		try {
			
		last = dao.getLastId();	
		
		} catch (Exception e) {
			
		return (long) 1000;
		
		}
		    long number = last;
		    number++;

		    return number;
		}

}
