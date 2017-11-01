package org.tpmgt.model.morphia;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * modal for the revision data
 * @author Dinesh
 *
 */
@Entity("revisions")
public class Revision extends BaseModel {
	
	//@NotBlank(message ="") private long smple;
	@Id private long revisionNumber;
	@Property private long pensionNumber;
	@Property private int status;
	@Property private long refNumber;
	@Property private String type;
	@Property private int pensionPoint;
	@Property private long villageId;
	@Property private String responsibleEmployee;
	@Embedded private BasicInformationModel basic;
	@Embedded private ServiceInformationModel service;
	@Embedded private BankInformationModel bank;
	@Embedded private SalaryInformationModel salary;
	@Embedded private PaymentDetailsModel payment;
	@Property private String pensionerType;
	@Property private String effctiveDate;
	@Property private String revisionReason;
	@Embedded private ArrearsModel arrears;

	
	public Revision() {
		// TODO Auto-generated constructor stub
	}

	public String getPensionerType() {
		return pensionerType;
	}

	public void setPensionerType(String pensionerType) {
		this.pensionerType = pensionerType;
	}
	
	public long getRevisionNumber() {
		return revisionNumber;
	}

	public void setRevisionNumber(long revisionNumber) {
		this.revisionNumber = revisionNumber;
	}

	public long getPensionNumber() {
		return pensionNumber;
	}

	public void setPensionNumber(long pensionNumber) {
		this.pensionNumber = pensionNumber;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getResponsibleEmployee() {
		return responsibleEmployee;
	}

	public void setResponsibleEmployee(String responsibleEmployee) {
		this.responsibleEmployee = responsibleEmployee;
	}

	public BasicInformationModel getBasic() {
		return basic;
	}

	public void setBasic(BasicInformationModel basic) {
		this.basic = basic;
	}

	public ServiceInformationModel getService() {
		return service;
	}

	public void setService(ServiceInformationModel service) {
		this.service = service;
	}

	public BankInformationModel getBank() {
		return bank;
	}

	public void setBank(BankInformationModel bank) {
		this.bank = bank;
	}

	public SalaryInformationModel getSalary() {
		return salary;
	}

	public void setSalary(SalaryInformationModel salary) {
		this.salary = salary;
	}

	public PaymentDetailsModel getPayment() {
		return payment;
	}

	public void setPayment(PaymentDetailsModel payment) {
		this.payment = payment;
	}

	public long getRefNumber() {
		return refNumber;
	}

	public void setRefNumber(long refNumber) {
		this.refNumber = refNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPensionPoint() {
		return pensionPoint;
	}

	public void setPensionPoint(int pensionPoint) {
		this.pensionPoint = pensionPoint;
	}
	
	public long getVillageId() {
		return villageId;
	}

	public void setVillageId(long villageId) {
		this.villageId = villageId;
	}

	public String getEffctiveDate() {
		return effctiveDate;
	}

	public void setEffctiveDate(String effctiveDate) {
		this.effctiveDate = effctiveDate;
	}

	public String getRevisionReason() {
		return revisionReason;
	}

	public void setRevisionReason(String revisionReason) {
		this.revisionReason = revisionReason;
	}

	public ArrearsModel getArrears() {
		return arrears;
	}

	public void setArrears(ArrearsModel arrears) {
		this.arrears = arrears;
	}
	
	
}

