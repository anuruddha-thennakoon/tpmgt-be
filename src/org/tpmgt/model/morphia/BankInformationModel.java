package org.tpmgt.model.morphia;

import org.mongodb.morphia.annotations.Embedded;

/**
 * model for the bank information of revision application
 * model will be embedded inside the Revision modal
 * 
 * @author Anuruddha
 *
 */
public class BankInformationModel {
	
	@Embedded private StringData pensionBank;
	@Embedded private StringData pensionBranch;
	@Embedded private StringData pensionAccountNo;
	@Embedded private StringData gratuityBank;
	@Embedded private StringData gratuityBranch;
	@Embedded private StringData gratuityAccountNo;
	
	public BankInformationModel() {
		// TODO Auto-generated constructor stub
	}

	public StringData getPensionBank() {
		return pensionBank;
	}

	public void setPensionBank(StringData pensionBank) {
		this.pensionBank = pensionBank;
	}

	public StringData getPensionBranch() {
		return pensionBranch;
	}

	public void setPensionBranch(StringData pensionBranch) {
		this.pensionBranch = pensionBranch;
	}

	public StringData getPensionAccountNo() {
		return pensionAccountNo;
	}

	public void setPensionAccountNo(StringData pensionAccountNo) {
		this.pensionAccountNo = pensionAccountNo;
	}

	public StringData getGratuityBank() {
		return gratuityBank;
	}

	public void setGratuityBank(StringData gratuityBank) {
		this.gratuityBank = gratuityBank;
	}

	public StringData getGratuityBranch() {
		return gratuityBranch;
	}

	public void setGratuityBranch(StringData gratuityBranch) {
		this.gratuityBranch = gratuityBranch;
	}

	public StringData getGratuityAccountNo() {
		return gratuityAccountNo;
	}

	public void setGratuityAccountNo(StringData gratuityAccountNo) {
		this.gratuityAccountNo = gratuityAccountNo;
	}

}
