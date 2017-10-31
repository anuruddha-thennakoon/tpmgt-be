package org.tpmgt.data.mdao;

import org.mongodb.morphia.Datastore;
import org.tpmgt.data.MongoConnectionManager;

public class BaseDao {
	
	private Datastore store = null;

	public BaseDao() {
		this.store = MongoConnectionManager.GET_MANAGER.getStore();
	}

	public Datastore getDs() {
		return this.store;
	}

}
