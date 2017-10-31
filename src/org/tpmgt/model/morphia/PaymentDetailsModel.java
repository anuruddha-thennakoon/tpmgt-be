package org.tpmgt.model.morphia;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

/**
 * model for the payment details of revision application
 * model will be embedded inside the Revision modal
 * 
 * @author Anuruddha
 *
 */
public class PaymentDetailsModel {

	@Embedded private PercentageDataContainer totalPercentage;
	@Embedded private PercentageDataContainer percentageMore;
	@Embedded private PercentageDataContainer percentageLess;
	@Embedded private PercentageDataContainer deductablePercentageMore;
	@Embedded private PercentageDataContainer deductablePercentageLess;
	@Embedded private PercentageDataContainer percentage;
	@Embedded private DoubleData totalDeduction;
	@Embedded private DoubleData grossGratuity;
	@Embedded private DoubleData payableToGovernment;
	@Embedded private DoubleData netGratuity;
	@Embedded private PensionEntitlementDataContainer pensionEntitlement;
	@Embedded private List<DeductionDataContainer> deductions = new ArrayList<DeductionDataContainer>();

	public PaymentDetailsModel() {
		// TODO Auto-generated constructor stub
	}

	public PercentageDataContainer getTotalPercentage() {
		return totalPercentage;
	}

	public void setTotalPercentage(PercentageDataContainer totalPercentage) {
		this.totalPercentage = totalPercentage;
	}

	public DoubleData getTotalDeduction() {
		return totalDeduction;
	}

	public void setTotalDeduction(DoubleData totalDeduction) {
		this.totalDeduction = totalDeduction;
	}

	public DoubleData getGrossGratuity() {
		return grossGratuity;
	}

	public void setGrossGratuity(DoubleData grossGratuity) {
		this.grossGratuity = grossGratuity;
	}

	public DoubleData getPayableToGovernment() {
		return payableToGovernment;
	}

	public void setPayableToGovernment(DoubleData payableToGovernment) {
		this.payableToGovernment = payableToGovernment;
	}

	public DoubleData getNetGratuity() {
		return netGratuity;
	}

	public void setNetGratuity(DoubleData netGratuity) {
		this.netGratuity = netGratuity;
	}

	public PensionEntitlementDataContainer getPensionEntitlement() {
		return pensionEntitlement;
	}

	public void setPensionEntitlement(PensionEntitlementDataContainer pensionEntitlement) {
		this.pensionEntitlement = pensionEntitlement;
	}

	public List<DeductionDataContainer> getDeductions() {
		return deductions;
	}

	public void setDeductions(List<DeductionDataContainer> deductions) {
		this.deductions = deductions;
	}

	public PercentageDataContainer getPercentageMore() {
		return percentageMore;
	}

	public void setPercentageMore(PercentageDataContainer percentageMore) {
		this.percentageMore = percentageMore;
	}

	public PercentageDataContainer getPercentageLess() {
		return percentageLess;
	}

	public void setPercentageLess(PercentageDataContainer percentageLess) {
		this.percentageLess = percentageLess;
	}

	public PercentageDataContainer getDeductablePercentageMore() {
		return deductablePercentageMore;
	}

	public void setDeductablePercentageMore(PercentageDataContainer deductablePercentageMore) {
		this.deductablePercentageMore = deductablePercentageMore;
	}

	public PercentageDataContainer getDeductablePercentageLess() {
		return deductablePercentageLess;
	}

	public void setDeductablePercentageLess(PercentageDataContainer deductablePercentageLess) {
		this.deductablePercentageLess = deductablePercentageLess;
	}

	public PercentageDataContainer getPercentage() {
		return percentage;
	}

	public void setPercentage(PercentageDataContainer percentage) {
		this.percentage = percentage;
	}
	
	
}
