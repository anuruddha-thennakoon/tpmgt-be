package org.tpmgt.model.dto;

public class Deduction {

	private String deductionDesc;
	private double presentDeduction;
	private double pastDeduction;
	
	public String getDeductionDesc() {
		return deductionDesc;
	}
	
	public void setDeductionDesc(String deductionDesc) {
		this.deductionDesc = deductionDesc;
	}
	
	public double getPresentDeduction() {
		return presentDeduction;
	}
	
	public void setPresentDeduction(double presentDeduction) {
		this.presentDeduction = presentDeduction;
	}
	
	public double getPastDeduction() {
		return pastDeduction;
	}
	
	public void setPastDeduction(double pastDeduction) {
		this.pastDeduction = pastDeduction;
	}
	
	
}
