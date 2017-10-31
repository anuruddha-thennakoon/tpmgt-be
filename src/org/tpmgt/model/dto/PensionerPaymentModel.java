package org.tpmgt.model.dto;

import java.util.ArrayList;
import java.util.List;

public class PensionerPaymentModel {

	private Percentage netPercentage;
	private Percentage percentageMore;
	private Percentage percentageLess;
	private Percentage deductablePercentageMore;
	private Percentage deductablePercentageLess;
	private Percentage percentage;
	private double gratuity;
	private double govPayable;
	private double netGratuity;
	private double reducesPension;
	private double unreducesPension;
	private double reducesPension2020;
	private double unreducesPension2020;
	private List<Deduction> deductions = new ArrayList<Deduction>();
	private double presentTotalDeduction;
	private double revisedTotalDeduction;
	
	public PensionerPaymentModel() {
		
	}

	public Percentage getNetPercentage() {
		return netPercentage;
	}

	public void setNetPercentage(Percentage netPercentage) {
		this.netPercentage = netPercentage;
	}

	public double getGratuity() {
		return gratuity;
	}

	public void setGratuity(double gratuity) {
		this.gratuity = gratuity;
	}

	public double getGovPayable() {
		return govPayable;
	}

	public void setGovPayable(double govPayable) {
		this.govPayable = govPayable;
	}

	public double getNetGratuity() {
		return netGratuity;
	}

	public void setNetGratuity(double netGratuity) {
		this.netGratuity = netGratuity;
	}

	public double getReducesPension() {
		return reducesPension;
	}

	public void setReducesPension(double reducesPension) {
		this.reducesPension = reducesPension;
	}

	public double getUnreducesPension() {
		return unreducesPension;
	}

	public void setUnreducesPension(double unreducesPension) {
		this.unreducesPension = unreducesPension;
	}

	public double getReducesPension2020() {
		return reducesPension2020;
	}

	public void setReducesPension2020(double reducesPension2020) {
		this.reducesPension2020 = reducesPension2020;
	}

	public double getUnreducesPension2020() {
		return unreducesPension2020;
	}

	public void setUnreducesPension2020(double unreducesPension2020) {
		this.unreducesPension2020 = unreducesPension2020;
	}

	public List<Deduction> getDeductions() {
		return deductions;
	}

	public void setDeductions(List<Deduction> deductions) {
		this.deductions = deductions;
	}

	public double getPresentTotalDeduction() {
		return presentTotalDeduction;
	}

	public void setPresentTotalDeduction(double presentTotalDeduction) {
		this.presentTotalDeduction = presentTotalDeduction;
	}

	public double getRevisedTotalDeduction() {
		return revisedTotalDeduction;
	}

	public void setRevisedTotalDeduction(double revisedTotalDeduction) {
		this.revisedTotalDeduction = revisedTotalDeduction;
	}

	public Percentage getPercentageMore() {
		return percentageMore;
	}

	public void setPercentageMore(Percentage percentageMore) {
		this.percentageMore = percentageMore;
	}

	public Percentage getPercentageLess() {
		return percentageLess;
	}

	public void setPercentageLess(Percentage percentageLess) {
		this.percentageLess = percentageLess;
	}

	public Percentage getDeductablePercentageMore() {
		return deductablePercentageMore;
	}

	public void setDeductablePercentageMore(Percentage deductablePercentageMore) {
		this.deductablePercentageMore = deductablePercentageMore;
	}

	public Percentage getDeductablePercentageLess() {
		return deductablePercentageLess;
	}

	public void setDeductablePercentageLess(Percentage deductablePercentageLess) {
		this.deductablePercentageLess = deductablePercentageLess;
	}

	public Percentage getPercentage() {
		return percentage;
	}

	public void setPercentage(Percentage percentage) {
		this.percentage = percentage;
	}
	
	
	
}
