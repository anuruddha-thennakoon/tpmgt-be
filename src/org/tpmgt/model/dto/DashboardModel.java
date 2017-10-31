package org.tpmgt.model.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class DashboardModel {

	private long refNumber;
	private String name;
	private String nic;
	private long pensionNumber;
	private long revisionNumber;

	private String dsOffice;
	private String retiredDate;
	private double currentSalary;
	private Date applicationDate;
	private double deductions;
	private double reducedSalary;
	private double unreducedSalary;
	

	public DashboardModel() {

	}

	public String getDsOffice() {
		return dsOffice;
	}

	public void setDsOffice(String dsOffice) {
		this.dsOffice = dsOffice;
	}

	public String getRetiredDate() {
		return retiredDate;
	}

	public void setRetiredDate(String retiredDate) {
		this.retiredDate = retiredDate;
	}

	public double getCurrentSalary() {
		return currentSalary;
	}

	public void setCurrentSalary(double currentSalary) {
		this.currentSalary = currentSalary;
	}

	public long getRefNumber() {
		return refNumber;
	}

	public void setRefNumber(long refNumber) {
		this.refNumber = refNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public long getPensionNumber() {
		return pensionNumber;
	}

	public void setPensionNumber(long pensionNumber) {
		this.pensionNumber = pensionNumber;
	}

	public long getRevisionNumber() {
		return revisionNumber;
	}

	public void setRevisionNumber(long revisionNumber) {
		this.revisionNumber = revisionNumber;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

	public double getReducedSalary() {
		return reducedSalary;
	}

	public void setReducedSalary(double reducedSalary) {
		this.reducedSalary = reducedSalary;
	}

	public double getUnreducedSalary() {
		return unreducedSalary;
	}

	public void setUnreducedSalary(double unreducedSalary) {
		this.unreducedSalary = unreducedSalary;
	}

}
