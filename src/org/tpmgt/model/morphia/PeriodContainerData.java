package org.tpmgt.model.morphia;

import org.mongodb.morphia.annotations.Property;

/**
 * used as a container to keep service periods
 * 
 * @author Anuruddha
 *
 */
public class PeriodContainerData {
	
	@Property(value = "oldYears") private int oldYears;
	@Property(value = "oldMonths") private int oldMonths;
	@Property(value = "oldDays") private int oldDays;
	@Property(value = "newYears") private int newYears;
	@Property(value = "newMonths") private int newMonths;
	@Property(value = "newDays") private int newDays;
	
	public PeriodContainerData() {
		// TODO Auto-generated constructor stub
	}
	
	public PeriodContainerData(int oldYears, int oldMonths, int oldDays, int newYears, int newMonths, int newDays) {
		super();
		this.oldYears = oldYears;
		this.oldMonths = oldMonths;
		this.oldDays = oldDays;
		this.newYears = newYears;
		this.newMonths = newMonths;
		this.newDays = newDays;
	}

	public int getOldYears() {
		return oldYears;
	}

	public void setOldYears(int oldYears) {
		this.oldYears = oldYears;
	}

	public int getOldMonths() {
		return oldMonths;
	}

	public void setOldMonths(int oldMonths) {
		this.oldMonths = oldMonths;
	}

	public int getOldDays() {
		return oldDays;
	}

	public void setOldDays(int oldDays) {
		this.oldDays = oldDays;
	}

	public int getNewYears() {
		return newYears;
	}

	public void setNewYears(int newYears) {
		this.newYears = newYears;
	}

	public int getNewMonths() {
		return newMonths;
	}

	public void setNewMonths(int newMonths) {
		this.newMonths = newMonths;
	}

	public int getNewDays() {
		return newDays;
	}

	public void setNewDays(int newDays) {
		this.newDays = newDays;
	}
	
}
