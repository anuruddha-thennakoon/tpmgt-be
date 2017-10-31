package org.tpmgt.model.morphia;

import org.mongodb.morphia.annotations.Property;

/**
 * used as a container to keep Details of Monthly Pension Entitlement
 * 
 * @author Anuruddha
 *
 */
public class PensionEntitlementDataContainer {

	@Property(value = "oldReduced") private double oldReducedValue;
	@Property(value = "oldUnreduced") private double oldUnreducedValue;
	@Property(value = "oldReduced2020") private double oldReduced2020Value;
	@Property(value = "oldUnreduced2020") private double oldUnreduced2020Value;
	@Property(value = "newReduced") private double newReducedValue;
	@Property(value = "newUnreduced") private double newUnreducedValue;
	@Property(value = "newReduced2020") private double newReduced2020Value;
	@Property(value = "newUnreduced2020") private double newUnreduced2020Value;
	
	public PensionEntitlementDataContainer() {
		// TODO Auto-generated constructor stub
	}

	public PensionEntitlementDataContainer(double oldReducedValue, double oldUnreducedValue, double oldReduced2020Value,
			double oldUnreduced2020Value, double newReducedValue, double newUnreducedValue, double newReduced2020Value,
			double newUnreduced2020Value) {
		super();
		this.oldReducedValue = oldReducedValue;
		this.oldUnreducedValue = oldUnreducedValue;
		this.oldReduced2020Value = oldReduced2020Value;
		this.oldUnreduced2020Value = oldUnreduced2020Value;
		this.newReducedValue = newReducedValue;
		this.newUnreducedValue = newUnreducedValue;
		this.newReduced2020Value = newReduced2020Value;
		this.newUnreduced2020Value = newUnreduced2020Value;
	}

	public double getOldReducedValue() {
		return oldReducedValue;
	}

	public void setOldReducedValue(double oldReducedValue) {
		this.oldReducedValue = oldReducedValue;
	}

	public double getOldUnreducedValue() {
		return oldUnreducedValue;
	}

	public void setOldUnreducedValue(double oldUnreducedValue) {
		this.oldUnreducedValue = oldUnreducedValue;
	}

	public double getOldReduced2020Value() {
		return oldReduced2020Value;
	}

	public void setOldReduced2020Value(double oldReduced2020Value) {
		this.oldReduced2020Value = oldReduced2020Value;
	}

	public double getOldUnreduced2020Value() {
		return oldUnreduced2020Value;
	}

	public void setOldUnreduced2020Value(double oldUnreduced2020Value) {
		this.oldUnreduced2020Value = oldUnreduced2020Value;
	}

	public double getNewReducedValue() {
		return newReducedValue;
	}

	public void setNewReducedValue(double newReducedValue) {
		this.newReducedValue = newReducedValue;
	}

	public double getNewUnreducedValue() {
		return newUnreducedValue;
	}

	public void setNewUnreducedValue(double newUnreducedValue) {
		this.newUnreducedValue = newUnreducedValue;
	}

	public double getNewReduced2020Value() {
		return newReduced2020Value;
	}

	public void setNewReduced2020Value(double newReduced2020Value) {
		this.newReduced2020Value = newReduced2020Value;
	}

	public double getNewUnreduced2020Value() {
		return newUnreduced2020Value;
	}

	public void setNewUnreduced2020Value(double newUnreduced2020Value) {
		this.newUnreduced2020Value = newUnreduced2020Value;
	}
	
}
