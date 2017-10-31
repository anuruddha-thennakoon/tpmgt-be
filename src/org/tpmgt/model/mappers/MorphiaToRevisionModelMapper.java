package org.tpmgt.model.mappers;

import java.util.ArrayList;
import java.util.List;

import org.tpmgt.model.dto.Allowance;
import org.tpmgt.model.dto.Bank;
import org.tpmgt.model.dto.Branch;
import org.tpmgt.model.dto.Deduction;
import org.tpmgt.model.dto.Duration;
import org.tpmgt.model.dto.Model;
import org.tpmgt.model.dto.PensionInfoModel;
import org.tpmgt.model.dto.PensionerPaymentModel;
import org.tpmgt.model.dto.PensionerProfileModel;
import org.tpmgt.model.dto.PensionerServiceModel;
import org.tpmgt.model.dto.Percentage;
import org.tpmgt.model.dto.RevisionData;
import org.tpmgt.model.dto.RevisionInfoModel;
import org.tpmgt.model.dto.RevisionModelDto;
import org.tpmgt.model.morphia.PercentageDataContainer;
import org.tpmgt.model.morphia.PeriodContainerData;
import org.tpmgt.model.morphia.Revision;

public class MorphiaToRevisionModelMapper {

	/**
	 * convert morphia model to revision model
	 * @param revision
	 * @return
	 */
	public Model morphiaToRevisionModel(Revision revision) {

		Model model = new Model();
		RevisionModelDto dto = new RevisionModelDto();

		RevisionData oldRevision = new RevisionData();
		RevisionData newRevision = new RevisionData();

		PensionerProfileModel oldProfile = new PensionerProfileModel();
		PensionerProfileModel newProfile = new PensionerProfileModel();

		PensionerServiceModel oldService = new PensionerServiceModel();
		PensionerServiceModel newService = new PensionerServiceModel();

		PensionerPaymentModel oldPayment = new PensionerPaymentModel();
		PensionerPaymentModel newPayment = new PensionerPaymentModel();

		PensionInfoModel oldPension = new PensionInfoModel();
		PensionInfoModel newPension = new PensionInfoModel();

		RevisionInfoModel revisionData = new RevisionInfoModel();

		oldProfile.setAddress(revision.getBasic().getAddress().getOldValue());
		newProfile.setAddress(revision.getBasic().getAddress().getNewValue());
		oldProfile.setDateOfBirth(revision.getBasic().getDateOfBirth().getOldValue());
		newProfile.setDateOfBirth(revision.getBasic().getDateOfBirth().getNewValue());
		oldProfile.setDistrict(revision.getBasic().getDistrict().getOldValue());
		newProfile.setDistrict(revision.getBasic().getDistrict().getNewValue());
		oldProfile.setDs(revision.getBasic().getDs().getOldValue());
		newProfile.setDs(revision.getBasic().getDs().getNewValue());
		oldProfile.setGender(revision.getBasic().getGender().getOldValue());
		newProfile.setGender(revision.getBasic().getGender().getNewValue());
		oldProfile.setLandNumber(revision.getBasic().getLandNumber().getOldValue());
		newProfile.setLandNumber(revision.getBasic().getLandNumber().getNewValue());
		oldProfile.setMobileNumber(revision.getBasic().getMobileNumber().getOldValue());
		newProfile.setMobileNumber(revision.getBasic().getMobileNumber().getNewValue());
		oldProfile.setName(revision.getBasic().getName().getOldValue());
		newProfile.setName(revision.getBasic().getName().getNewValue());
		oldProfile.setNic(revision.getBasic().getNic().getOldValue());
		newProfile.setNic(revision.getBasic().getNic().getNewValue());
		oldProfile.setPrefName(revision.getBasic().getPrefName().getOldValue());
		newProfile.setPrefName(revision.getBasic().getPrefName().getNewValue());
		oldProfile.setSalutation(revision.getBasic().getSalutation().getOldValue());
		newProfile.setSalutation(revision.getBasic().getSalutation().getNewValue());
		oldProfile.setType(revision.getPensionerType());
		newProfile.setType(revision.getPensionerType());
		oldProfile.setVillageOffice(revision.getBasic().getVillageOffice().getOldValue());
		newProfile.setVillageOffice(revision.getBasic().getVillageOffice().getNewValue());
		oldProfile.setVillageId(revision.getBasic().getVillageId().getOldValue());
		newProfile.setVillageId(revision.getBasic().getVillageId().getNewValue());
		oldProfile.setWOPNumber(revision.getBasic().getwOPNumber().getOldValue());
		newProfile.setWOPNumber(revision.getBasic().getwOPNumber().getNewValue());

		// Set allowance list
		List<Allowance> allowanceList = new ArrayList<Allowance>();

		revision.getSalary().getAllowances().forEach(allowance -> {
			Allowance allowanceContainer = new Allowance();
			allowanceContainer.setAllowanceDesc(allowance.getDescription());
			allowanceContainer.setPresentAllowance(allowance.getOldValue());
			allowanceContainer.setPastAllowance(allowance.getNewValue());

			allowanceList.add(allowanceContainer);

		});
		newService.setAllowances(allowanceList);
		oldService.setCircular(revision.getService().getCircular().getOldValue());
		newService.setCircular(revision.getService().getCircular().getNewValue());
		oldService.setDateOfRetired(revision.getService().getDateOfRetired().getOldValue());
		newService.setDateOfRetired(revision.getService().getDateOfRetired().getNewValue());
		oldService.setDesignation(revision.getService().getDesignation().getOldValue());
		newService.setDesignation(revision.getService().getDesignation().getNewValue());
		oldService.setGrade(revision.getService().getGrade().getOldValue());
		newService.setGrade(revision.getService().getGrade().getNewValue());
		oldService.setIncreamentDate(revision.getSalary().getIncrementDate().getOldValue());
		newService.setIncreamentDate(revision.getSalary().getIncrementDate().getNewValue());
		oldService.setInstitute(revision.getService().getInstitue().getOldValue());
		newService.setInstitute(revision.getService().getInstitue().getNewValue());
		oldService.setPensionerType(revision.getService().getPensionType().getOldValue());
		newService.setPensionerType(revision.getService().getPensionType().getNewValue());
		oldService.setForiegnNoPay(getPeriod(revision.getSalary().getForiegnNoPay(), 1));
		newService.setForiegnNoPay(getPeriod(revision.getSalary().getForiegnNoPay(), 2));
		oldService.setGovNoPay(getPeriod(revision.getSalary().getGovNoPay(), 1));
		newService.setGovNoPay(getPeriod(revision.getSalary().getGovNoPay(), 2));
		oldService.setNetNoPay(getPeriod(revision.getSalary().getNetNoPay(), 1));
		newService.setNetNoPay(getPeriod(revision.getSalary().getNetNoPay(), 2));
		oldService.setPermanantPeriod(getPeriod(revision.getSalary().getPermanantPeriod(), 1));
		newService.setPermanantPeriod(getPeriod(revision.getSalary().getPermanantPeriod(), 2));
		newService.setPresentTotalAllowance(revision.getSalary().getTotalAllowance().getOldValue());
		newService.setRevisedTotalAllowance(revision.getSalary().getTotalAllowance().getNewValue());
		oldService.setReduceNoPay(getPeriod(revision.getSalary().getReduceNoPay(), 1));
		newService.setReduceNoPay(getPeriod(revision.getSalary().getReduceNoPay(), 2));
		oldService.setRetiredReason(revision.getService().getRetirementReason().getOldValue());
		newService.setRetiredReason(revision.getService().getRetirementReason().getNewValue());
		oldService.setServiceDomain(revision.getService().getServiceDomain().getOldValue());
		newService.setServiceDomain(revision.getService().getServiceDomain().getNewValue());
		oldService.setServicePeriod(getPeriod(revision.getSalary().getServicePeriod(), 1));
		newService.setServicePeriod(getPeriod(revision.getSalary().getServicePeriod(), 2));
		oldService.setSetOffNoPay(getPeriod(revision.getSalary().getSetOffNoPay(), 1));
		newService.setSetOffNoPay(getPeriod(revision.getSalary().getSetOffNoPay(), 2));
		oldService.setTotalNoPay(getPeriod(revision.getSalary().getTotalNoPay(), 1));
		newService.setTotalNoPay(getPeriod(revision.getSalary().getTotalNoPay(), 2));
		oldService.setTrainedPeriod(getPeriod(revision.getSalary().getTrainedPeriod(), 1));
		newService.setTrainedPeriod(getPeriod(revision.getSalary().getTrainedPeriod(), 2));
		oldService.setWnopDeductedPeriod(getPeriod(revision.getSalary().getWnopDeductedPeriod(), 1));
		newService.setWnopDeductedPeriod(getPeriod(revision.getSalary().getWnopDeductedPeriod(), 2));
		newService.setEffctiveDate(revision.getEffctiveDate());
		oldService.setSectionUnder(revision.getService().getSectionUnder().getOldValue());
		newService.setSectionUnder(revision.getService().getSectionUnder().getNewValue());

		// Set deduction list
		List<Deduction> deductionList = new ArrayList<Deduction>();

		revision.getPayment().getDeductions().forEach(deduction -> {
			Deduction deductionContainer = new Deduction();
			deductionContainer.setDeductionDesc(deduction.getDescription());
			deductionContainer.setPastDeduction(deduction.getNewValue());
			deductionContainer.setPresentDeduction(deduction.getOldValue());

			deductionList.add(deductionContainer);
		});
		newPayment.setDeductions(deductionList);
		oldPayment.setGovPayable(revision.getPayment().getPayableToGovernment().getOldValue());
		newPayment.setGovPayable(revision.getPayment().getPayableToGovernment().getNewValue());
		oldPayment.setGratuity(revision.getPayment().getGrossGratuity().getOldValue());
		newPayment.setGratuity(revision.getPayment().getGrossGratuity().getNewValue());
		oldPayment.setNetGratuity(revision.getPayment().getNetGratuity().getOldValue());
		newPayment.setNetGratuity(revision.getPayment().getNetGratuity().getNewValue());
		oldPayment.setDeductablePercentageLess(getPercentage(revision.getPayment().getDeductablePercentageLess(), 1));
		newPayment.setDeductablePercentageLess(getPercentage(revision.getPayment().getDeductablePercentageLess(), 2));
		oldPayment.setDeductablePercentageMore(getPercentage(revision.getPayment().getDeductablePercentageMore(), 1));
		newPayment.setDeductablePercentageMore(getPercentage(revision.getPayment().getDeductablePercentageMore(), 2));
		oldPayment.setNetPercentage(getPercentage(revision.getPayment().getTotalPercentage(), 1));
		newPayment.setNetPercentage(getPercentage(revision.getPayment().getTotalPercentage(), 2));
		oldPayment.setPercentage(getPercentage(revision.getPayment().getPercentage(), 1));
		newPayment.setPercentage(getPercentage(revision.getPayment().getPercentage(), 2));
		oldPayment.setPercentageLess(getPercentage(revision.getPayment().getPercentageLess(), 1));
		newPayment.setPercentageLess(getPercentage(revision.getPayment().getPercentageLess(), 2));
		oldPayment.setPercentageMore(getPercentage(revision.getPayment().getPercentageMore(), 1));
		newPayment.setPercentageMore(getPercentage(revision.getPayment().getPercentageMore(), 2));
		newPayment.setPresentTotalDeduction(revision.getPayment().getTotalDeduction().getOldValue());
		newPayment.setRevisedTotalDeduction(revision.getPayment().getTotalDeduction().getNewValue());
		oldPayment.setReducesPension(revision.getPayment().getPensionEntitlement().getOldReducedValue());
		newPayment.setReducesPension(revision.getPayment().getPensionEntitlement().getNewReducedValue());
		oldPayment.setReducesPension2020(revision.getPayment().getPensionEntitlement().getOldReduced2020Value());
		newPayment.setReducesPension2020(revision.getPayment().getPensionEntitlement().getNewReduced2020Value());
		oldPayment.setUnreducesPension(revision.getPayment().getPensionEntitlement().getOldUnreducedValue());
		newPayment.setUnreducesPension(revision.getPayment().getPensionEntitlement().getNewUnreducedValue());
		oldPayment.setUnreducesPension2020(revision.getPayment().getPensionEntitlement().getOldUnreduced2020Value());
		newPayment.setUnreducesPension2020(revision.getPayment().getPensionEntitlement().getNewUnreduced2020Value());
		
		oldPension.setAccountNumber(revision.getBank().getPensionAccountNo().getOldValue());
		newPension.setAccountNumber(revision.getBank().getPensionAccountNo().getNewValue());
		
		// Set bank details
		Branch oldBranch = new Branch();
		Bank oldBank = new Bank();
		oldBank.setName(revision.getBank().getPensionBank().getOldValue());
		oldBank.setId(0);
		oldBranch.setAddress(revision.getBank().getPensionBranch().getOldValue());
		oldBranch.setName(revision.getBank().getPensionBranch().getOldValue());
		oldBranch.setBank(oldBank);
		oldBranch.setCode(0);
		oldBranch.setId(0);
		oldPension.setBranch(oldBranch);
		
		Branch newBranch = new Branch();
		Bank newBank = new Bank();
		newBank.setName(revision.getBank().getPensionBank().getNewValue());
		newBank.setId(0);
		newBranch.setAddress(revision.getBank().getPensionBranch().getNewValue());
		newBranch.setName(revision.getBank().getPensionBranch().getNewValue());
		newBranch.setBank(oldBank);
		newBranch.setCode(0);
		newBranch.setId(0);
		newPension.setBranch(newBranch);
		
		oldPension.setConsolidatedSalary(revision.getSalary().getAnualConsolidatedSalary().getOldValue());
		newPension.setConsolidatedSalary(revision.getSalary().getAnualConsolidatedSalary().getNewValue());
		newPension.setConsolidatedSalary2020(revision.getSalary().getAnualConsolidatedSalary().getAt2020Value());
		oldPension.setEarnrdIncreament(revision.getSalary().getEarnedIncreament().getOldValue());
		newPension.setEarnrdIncreament(revision.getSalary().getEarnedIncreament().getNewValue());
		newPension.setEarnrdIncreament2020(revision.getSalary().getEarnedIncreament().getAt2020Value());
		oldPension.setGrossSalary(revision.getSalary().getGrossSalary().getOldValue());
		newPension.setGrossSalary(revision.getSalary().getGrossSalary().getNewValue());
		newPension.setGrossSalary2020(revision.getSalary().getGrossSalary().getAt2020Value());
		oldPension.setId(revision.getPensionNumber());
		newPension.setId(revision.getPensionNumber());
		oldPension.setMonthlySalary(revision.getSalary().getMonthlySalary().getOldValue());
		newPension.setMonthlySalary(revision.getSalary().getMonthlySalary().getNewValue());
		oldPension.setNetReducedPercentage(revision.getPayment().getTotalPercentage().getOldReduced());
		newPension.setNetReducedPercentage(revision.getPayment().getTotalPercentage().getNewReduced());
		oldPension.setNetUnreducedPercentage(revision.getPayment().getTotalPercentage().getOldUnreduced());
		newPension.setNetUnreducedPercentage(revision.getPayment().getTotalPercentage().getNewUnreduced());
		oldPension.setScale(revision.getSalary().getSalaryCode().getOldValue());
		newPension.setScale(revision.getSalary().getSalaryCode().getNewValue());
		oldPension.setTotalNoPay(getPeriod(revision.getSalary().getTotalNoPay(), 1));
		newPension.setTotalNoPay(getPeriod(revision.getSalary().getTotalNoPay(), 2));

		revisionData.setRefNumber(revision.getRefNumber());
		revisionData.setType(revision.getType());
		revisionData.setRevReason(revision.getRevisionReason());

		oldRevision.set_pensionerProfile(oldProfile);
		oldRevision.set_pensionerService(oldService);
		oldRevision.set_pensionerPayment(oldPayment);
		oldRevision.set_pensionInfo(oldPension);
		newRevision.set_pensionerProfile(newProfile);
		newRevision.set_pensionerService(newService);
		newRevision.set_pensionerPayment(newPayment);
		newRevision.set_pensionInfo(newPension);
		newRevision.set_revisionInfo(revisionData);

		dto.setNewRevisionData(newRevision);
		dto.setOldRevisionData(oldRevision);

		model.setModel(dto);

		return model;
	}

	/**
	 * get period
	 * @param period
	 * @param i
	 * @return
	 */
	private Duration getPeriod(PeriodContainerData period, int i) {
		Duration duration = new Duration();

		if (i == 1) {
			duration.setYears(1);
			duration.setMonths(2);
			duration.setDays(2);
		} else {
			duration.setYears(period.getNewYears());
			duration.setMonths(period.getNewMonths());
			duration.setDays(period.getNewDays());
		}
		return duration;
	}

	/**
	 * get percentage
	 * @param percentage
	 * @param i
	 * @return
	 */
	private Percentage getPercentage(PercentageDataContainer percentage, int i) {
		Percentage p = new Percentage();

		if (i == 1) {
			p.setReduce(percentage.getOldReduced());
			p.setUnreduce(percentage.getOldUnreduced());
		} else {
			p.setReduce(percentage.getNewReduced());
			p.setUnreduce(percentage.getNewUnreduced());
		}
		return p;
	}
}
