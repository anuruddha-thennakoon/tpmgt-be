package org.tpmgt.model.morphia;

import org.mongodb.morphia.annotations.Property;

public class AllowanceDataContainer {

	@Property(value = "description") private String description;
	@Property(value = "old") private double oldValue;
	@Property(value = "new") private double newValue;
	
	public AllowanceDataContainer() {}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getOldValue() {
		return oldValue;
	}

	public void setOldValue(double oldValue) {
		this.oldValue = oldValue;
	}

	public double getNewValue() {
		return newValue;
	}

	public void setNewValue(double newValue) {
		this.newValue = newValue;
	}

	
	
}
