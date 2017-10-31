package org.tpmgt.model.morphia;

import org.mongodb.morphia.annotations.Property;

/**
 * used as the base data model for boolean data items
 * 
 * @author Anuruddha
 *
 */
public class BooleanData {

	@Property(value = "old") private boolean oldValue;
	@Property(value = "new") private boolean newValue;

	public BooleanData() {}

	public BooleanData(boolean oldValue, boolean newValue) {
		super();
		this.oldValue = oldValue;
		this.newValue = newValue;
	}

	public boolean isOldValue() {
		return oldValue;
	}

	public void setOldValue(boolean oldValue) {
		this.oldValue = oldValue;
	}

	public boolean isNewValue() {
		return newValue;
	}

	public void setNewValue(boolean newValue) {
		this.newValue = newValue;
	}

}
