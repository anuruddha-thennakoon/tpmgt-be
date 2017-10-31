package org.tpmgt.model.morphia;

import org.mongodb.morphia.annotations.Property;

public class LongData {

	@Property(value = "old") private long oldValue;
	@Property(value = "new") private long newValue;
	
	public LongData() {
		// TODO Auto-generated constructor stub
	}
	
	public LongData(long oldValue, long newValue) {
		super();
		this.oldValue = oldValue;
		this.newValue = newValue;
	}

	public long getOldValue() {
		return oldValue;
	}
	
	public void setOldValue(long oldValue) {
		this.oldValue = oldValue;
	}
	
	public long getNewValue() {
		return newValue;
	}
	
	public void setNewValue(long newValue) {
		this.newValue = newValue;
	}
	
	
}
