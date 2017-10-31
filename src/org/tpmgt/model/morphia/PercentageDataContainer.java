package org.tpmgt.model.morphia;

import org.mongodb.morphia.annotations.Property;

/**
 * used as a container to keep percentages
 * 
 * @author Anuruddha
 *
 */
public class PercentageDataContainer {

	@Property(value = "oldReduced") private double oldReduced;
	@Property(value = "oldUnreduced") private double oldUnreduced;
	@Property(value = "newReduced") private double newReduced;
	@Property(value = "newUnreduced") private double newUnreduced;
	
	public PercentageDataContainer() {
		// TODO Auto-generated constructor stub
	}

	public PercentageDataContainer(double oldReduced, double oldUnreduced, double newReduced, double newUnreduced) {
		super();
		this.oldReduced = oldReduced;
		this.oldUnreduced = oldUnreduced;
		this.newReduced = newReduced;
		this.newUnreduced = newUnreduced;
	}

	public double getOldReduced() {
		return oldReduced;
	}

	public void setOldReduced(double oldReduced) {
		this.oldReduced = oldReduced;
	}

	public double getOldUnreduced() {
		return oldUnreduced;
	}

	public void setOldUnreduced(double oldUnreduced) {
		this.oldUnreduced = oldUnreduced;
	}

	public double getNewReduced() {
		return newReduced;
	}

	public void setNewReduced(double newReduced) {
		this.newReduced = newReduced;
	}

	public double getNewUnreduced() {
		return newUnreduced;
	}

	public void setNewUnreduced(double newUnreduced) {
		this.newUnreduced = newUnreduced;
	}
	
	
}
