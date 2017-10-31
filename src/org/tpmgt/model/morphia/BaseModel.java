package org.tpmgt.model.morphia;

import java.util.Date;

import org.mongodb.morphia.annotations.PrePersist;

public class BaseModel {
	
	private Date createdDate;
	private Date lastChange;
	
	public BaseModel() {
		// TODO Auto-generated constructor stub
	}
	
	public final Date getCreatedDate() {
		return createdDate;
	}

	public final void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public final Date getLastChange() {
		return lastChange;
	}

	public final void setLastChange(Date lastChange) {
		this.lastChange = lastChange;
	}

	@PrePersist
	public void prePersist() {
	    createdDate = (createdDate == null) ? new Date() : createdDate;
	    lastChange = new Date();
	}
}
