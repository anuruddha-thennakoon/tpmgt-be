package org.tpmgt.model.morphia;

public class IntData {

	private int oldValue;
	private int newValue;
	
	public IntData() {
		// TODO Auto-generated constructor stub
	}

	public IntData(int oldValue, int newValue) {
		super();
		this.newValue = newValue;
		this.oldValue = oldValue;
	}

	public int getNewValue() {
		return newValue;
	}

	public void setNewValue(int newValue) {
		this.newValue = newValue;
	}

	public int getOldValue() {
		return oldValue;
	}

	public void setOldValue(int oldValue) {
		this.oldValue = oldValue;
	}
	
}
