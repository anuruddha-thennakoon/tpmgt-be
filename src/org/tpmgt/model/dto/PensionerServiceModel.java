package org.tpmgt.model.dto;

import java.util.ArrayList;
import java.util.List;

public class PensionerServiceModel {

	private String pensionerType;
	private String serviceDomain;
	private String grade;
	private String designation;
	private String firstAppoinmentDate;
	private String permanantAppoinmentDate;
	private String sectionUnder;
	private String retiredReason;
	private String dateOfRetired;
	private Duration servicePeriod;
	private Duration trainedPeriod;
	private Duration permanantPeriod;
	private Duration wnopDeductedPeriod;
	private Duration govNoPay;
	private Duration reduceNoPay;
	private Duration foriegnNoPay;
	private Duration setOffNoPay;
	private Duration netNoPay;
	private Duration totalNoPay;
	private String circular;
	private String institute;
	private String increamentDate;
	private List<Allowance> allowances =  new  ArrayList<Allowance>();
	private double presentTotalAllowance;
	private double revisedTotalAllowance;
	private String effctiveDate;
	
	
	public String getEffctiveDate() {
		return effctiveDate;
	}

	public void setEffctiveDate(String effctiveDate) {
		this.effctiveDate = effctiveDate;
	}

	public String getIncreamentDate() {
		return increamentDate;
	}

	public void setIncreamentDate(String increamentDate) {
		this.increamentDate = increamentDate;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getCircular() {
		return circular;
	}

	public void setCircular(String circular) {
		this.circular = circular;
	}

	public PensionerServiceModel() {

	}

	public String getPensionerType() {
		return pensionerType;
	}

	public void setPensionerType(String pensionerType) {
		this.pensionerType = pensionerType;
	}

	public String getServiceDomain() {
		return serviceDomain;
	}

	public void setServiceDomain(String serviceDomain) {
		this.serviceDomain = serviceDomain;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getFirstAppoinmentDate() {
		return firstAppoinmentDate;
	}

	public void setFirstAppoinmentDate(String firstAppoinmentDate) {
		this.firstAppoinmentDate = firstAppoinmentDate;
	}

	public String getPermanantAppoinmentDate() {
		return permanantAppoinmentDate;
	}

	public void setPermanantAppoinmentDate(String permanantAppoinmentDate) {
		this.permanantAppoinmentDate = permanantAppoinmentDate;
	}

	public String getSectionUnder() {
		return sectionUnder;
	}

	public void setSectionUnder(String sectionUnder) {
		this.sectionUnder = sectionUnder;
	}

	public String getRetiredReason() {
		return retiredReason;
	}

	public void setRetiredReason(String retiredReason) {
		this.retiredReason = retiredReason;
	}

	public String getDateOfRetired() {
		return dateOfRetired;
	}

	public void setDateOfRetired(String dateOfRetired) {
		this.dateOfRetired = dateOfRetired;
	}

	public Duration getServicePeriod() {
		return servicePeriod;
	}

	public void setServicePeriod(Duration servicePeriod) {
		this.servicePeriod = servicePeriod;
	}

	public Duration getTrainedPeriod() {
		return trainedPeriod;
	}

	public void setTrainedPeriod(Duration trainedPeriod) {
		this.trainedPeriod = trainedPeriod;
	}

	public Duration getPermanantPeriod() {
		return permanantPeriod;
	}

	public void setPermanantPeriod(Duration permanantPeriod) {
		this.permanantPeriod = permanantPeriod;
	}

	public Duration getWnopDeductedPeriod() {
		return wnopDeductedPeriod;
	}

	public void setWnopDeductedPeriod(Duration wnopDeductedPeriod) {
		this.wnopDeductedPeriod = wnopDeductedPeriod;
	}

	public Duration getTotalNoPay() {
		return totalNoPay;
	}

	public void setTotalNoPay(Duration totalNoPay) {
		this.totalNoPay = totalNoPay;
	}

	public List<Allowance> getAllowances() {
		return allowances;
	}

	public void setAllowances(List<Allowance> allowances) {
		this.allowances = allowances;
	}

	public double getPresentTotalAllowance() {
		return presentTotalAllowance;
	}

	public void setPresentTotalAllowance(double presentTotalAllowance) {
		this.presentTotalAllowance = presentTotalAllowance;
	}

	public double getRevisedTotalAllowance() {
		return revisedTotalAllowance;
	}

	public void setRevisedTotalAllowance(double revisedTotalAllowance) {
		this.revisedTotalAllowance = revisedTotalAllowance;
	}

	public Duration getGovNoPay() {
		return govNoPay;
	}

	public void setGovNoPay(Duration govNoPay) {
		this.govNoPay = govNoPay;
	}

	public Duration getReduceNoPay() {
		return reduceNoPay;
	}

	public void setReduceNoPay(Duration reduceNoPay) {
		this.reduceNoPay = reduceNoPay;
	}

	public Duration getForiegnNoPay() {
		return foriegnNoPay;
	}

	public void setForiegnNoPay(Duration foriegnNoPay) {
		this.foriegnNoPay = foriegnNoPay;
	}

	public Duration getSetOffNoPay() {
		return setOffNoPay;
	}

	public void setSetOffNoPay(Duration setOffNoPay) {
		this.setOffNoPay = setOffNoPay;
	}

	public Duration getNetNoPay() {
		return netNoPay;
	}

	public void setNetNoPay(Duration netNoPay) {
		this.netNoPay = netNoPay;
	}
	
	
	
	
}
