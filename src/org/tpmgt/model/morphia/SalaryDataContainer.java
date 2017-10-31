package org.tpmgt.model.morphia;

import org.mongodb.morphia.annotations.Property;

/**
 * used as a container to keep salary
 * 
 * @author Anuruddha
 *
 */
public class SalaryDataContainer {
	
	@Property(value = "old") public double oldValue;
	@Property(value = "new") public double newValue;
	@Property(value = "at2020") public double at2020Value;

	public SalaryDataContainer() {
		// TODO Auto-generated constructor stub
	}
	
	public SalaryDataContainer(double oldValue, double newValue, double at2020Value) {
		super();
		this.oldValue = oldValue;
		this.newValue = newValue;
		this.at2020Value = at2020Value;
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

	public double getAt2020Value() {
		return at2020Value;
	}

	public void setAt2020Value(double at2020Value) {
		this.at2020Value = at2020Value;
	}

}
