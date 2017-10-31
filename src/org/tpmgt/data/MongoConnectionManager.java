package org.tpmgt.data;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.ValidationExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.MongoClient;

public enum MongoConnectionManager {
	
	GET_MANAGER;
	
	private Logger logger = LoggerFactory.getLogger(MongoConnectionManager.class);
	
	private Datastore store = null;
	
	private MongoConnectionManager() {
		final Morphia morphia = new Morphia();
		new ValidationExtension(morphia);
		
		morphia.mapPackage("org.tpmgt.model.morphia");

		//192.168.100.199
		store = morphia.createDatastore(new MongoClient("192.168.100.199" , 27017), "tpmgt_docs");
		store.ensureIndexes();
		logger.info("connected to mongo db");
		
	}
	
	public Datastore getStore() {
		return this.store;
	}
	
}
