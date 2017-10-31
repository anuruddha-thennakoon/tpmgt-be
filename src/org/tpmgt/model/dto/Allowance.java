package org.tpmgt.model.dto;

public class Allowance {

	private String allowanceDesc;
	private double presentAllowance;
	private double pastAllowance;
	
	public String getAllowanceDesc() {
		return allowanceDesc;
	}
	
	public void setAllowanceDesc(String allowanceDesc) {
		this.allowanceDesc = allowanceDesc;
	}
	
	public double getPresentAllowance() {
		return presentAllowance;
	}
	
	public void setPresentAllowance(double presentAllowance) {
		this.presentAllowance = presentAllowance;
	}
	
	public double getPastAllowance() {
		return pastAllowance;
	}
	
	public void setPastAllowance(double pastAllowance) {
		this.pastAllowance = pastAllowance;
	}
	
	
}
