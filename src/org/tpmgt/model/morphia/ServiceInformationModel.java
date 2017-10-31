package org.tpmgt.model.morphia;

import org.mongodb.morphia.annotations.Embedded;

/**
 * model for the service information of revision application
 * model will be embedded inside the Revision model
 * 
 * @author Anuruddha
 *
 */
public class ServiceInformationModel {

	@Embedded private StringData institue;
	@Embedded private StringData serviceDomain;
	@Embedded private StringData grade;
	@Embedded private StringData pensionType;
	@Embedded private StringData designation;
	@Embedded private BooleanData confirm;
	@Embedded private StringData retirementReason;
	@Embedded private StringData dateOfRetired;
	@Embedded private StringData circular;
	@Embedded private StringData sectionUnder;

	public ServiceInformationModel() {
		// TODO Auto-generated constructor stub
	}

	public StringData getInstitue() {
		return institue;
	}

	public void setInstitue(StringData institue) {
		this.institue = institue;
	}

	public StringData getServiceDomain() {
		return serviceDomain;
	}

	public void setServiceDomain(StringData serviceDomain) {
		this.serviceDomain = serviceDomain;
	}

	public StringData getGrade() {
		return grade;
	}

	public void setGrade(StringData grade) {
		this.grade = grade;
	}

	public StringData getPensionType() {
		return pensionType;
	}

	public void setPensionType(StringData pensionType) {
		this.pensionType = pensionType;
	}

	public StringData getDesignation() {
		return designation;
	}

	public void setDesignation(StringData designation) {
		this.designation = designation;
	}

	public BooleanData getConfirm() {
		return confirm;
	}

	public void setConfirm(BooleanData confirm) {
		this.confirm = confirm;
	}

	public StringData getRetirementReason() {
		return retirementReason;
	}

	public void setRetirementReason(StringData retirementReason) {
		this.retirementReason = retirementReason;
	}

	public StringData getDateOfRetired() {
		return dateOfRetired;
	}

	public void setDateOfRetired(StringData dateOfRetired) {
		this.dateOfRetired = dateOfRetired;
	}

	public StringData getCircular() {
		return circular;
	}

	public void setCircular(StringData circular) {
		this.circular = circular;
	}

	public StringData getSectionUnder() {
		return sectionUnder;
	}

	public void setSectionUnder(StringData sectionUnder) {
		this.sectionUnder = sectionUnder;
	}
	
	
}
