package org.tpmgt.model.morphia;

import org.mongodb.morphia.annotations.Property;

/**
 * used as the base data modal for data items
 * @author Dinesh
 *
 */
public class StringData {

	@Property(value = "old") private String oldValue;
	@Property(value = "new") private String newValue;
	
	public StringData() {}
	
	public StringData(String oldValue, String newValue) {
		super();
		this.oldValue = oldValue;
		this.newValue = newValue;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}
	
	public static StringData get(String oldValue, String newValue){
		return new StringData(oldValue, newValue);
	}

}
