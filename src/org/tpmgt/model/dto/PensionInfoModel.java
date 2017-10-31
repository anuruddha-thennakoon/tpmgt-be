package org.tpmgt.model.dto;

public class PensionInfoModel {
	
	private double consolidatedSalary;
	private double consolidatedSalary2020;
	private long id;
	private double netReducedPercentage;
	private double netUnreducedPercentage;
	private double grossSalary;
	private double grossSalary2020;
	private double earnrdIncreament;
	private double earnrdIncreament2020;
	private double monthlySalary;
	private Branch branch;
	private String accountNumber;
	private String scale;
	private Duration totalNoPay;
	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public double getConsolidatedSalary2020() {
		return consolidatedSalary2020;
	}

	public double getEarnrdIncreament2020() {
		return earnrdIncreament2020;
	}

	public void setEarnrdIncreament2020(double earnrdIncreament2020) {
		this.earnrdIncreament2020 = earnrdIncreament2020;
	}

	public void setConsolidatedSalary2020(double consolidatedSalary2020) {
		this.consolidatedSalary2020 = consolidatedSalary2020;
	}
	
	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getEarnrdIncreament() {
		return earnrdIncreament;
	}

	public void setEarnrdIncreament(double earnrdIncreament) {
		this.earnrdIncreament = earnrdIncreament;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	
	public PensionInfoModel() {

	}

	public double getConsolidatedSalary() {
		return consolidatedSalary;
	}

	public void setConsolidatedSalary(double consolidatedSalary) {
		this.consolidatedSalary = consolidatedSalary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getNetReducedPercentage() {
		return netReducedPercentage;
	}

	public void setNetReducedPercentage(double netReducedPercentage) {
		this.netReducedPercentage = netReducedPercentage;
	}

	public double getNetUnreducedPercentage() {
		return netUnreducedPercentage;
	}

	public void setNetUnreducedPercentage(double netUnreducedPercentage) {
		this.netUnreducedPercentage = netUnreducedPercentage;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public Duration getTotalNoPay() {
		return totalNoPay;
	}

	public void setTotalNoPay(Duration totalNoPay) {
		this.totalNoPay = totalNoPay;
	}

	public double getGrossSalary2020() {
		return grossSalary2020;
	}

	public void setGrossSalary2020(double grossSalary2020) {
		this.grossSalary2020 = grossSalary2020;
	}
	
	
}
