package org.tpmgt.model.morphia;

import org.mongodb.morphia.annotations.Property;

/**
 * used as the base data model for double data items
 * 
 * @author Anuruddha
 *
 */
public class DoubleData {

	@Property(value = "old") private double oldValue;
	@Property(value = "new") private double newValue;
	
	public DoubleData() {
		// TODO Auto-generated constructor stub
	}
	
	public DoubleData(double oldValue, double newValue) {
		super();
		this.oldValue = oldValue;
		this.newValue = newValue;
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
