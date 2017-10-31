package org.tpmgt.model.mappers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tpmgt.consts.RevisionStates;
import org.tpmgt.filters.params.AuthMeta;
import org.tpmgt.helpers.IdGenerator;
import org.tpmgt.model.dto.Model;
import org.tpmgt.model.dto.RevisionData;
import org.tpmgt.model.morphia.AllowanceDataContainer;
import org.tpmgt.model.morphia.BankInformationModel;
import org.tpmgt.model.morphia.BasicInformationModel;
import org.tpmgt.model.morphia.DeductionDataContainer;
import org.tpmgt.model.morphia.DoubleData;
import org.tpmgt.model.morphia.LongData;
import org.tpmgt.model.morphia.PaymentDetailsModel;
import org.tpmgt.model.morphia.PensionEntitlementDataContainer;
import org.tpmgt.model.morphia.PercentageDataContainer;
import org.tpmgt.model.morphia.PeriodContainerData;
import org.tpmgt.model.morphia.Revision;
import org.tpmgt.model.morphia.SalaryDataContainer;
import org.tpmgt.model.morphia.SalaryInformationModel;
import org.tpmgt.model.morphia.ServiceInformationModel;
import org.tpmgt.model.morphia.StringData;

public class RevisionModelToMorphiaMapper {
	private Logger logger = LoggerFactory.getLogger(RevisionModelToMorphiaMapper.class);

	/**
	 * convert revision model to morphia model
	 * @param dto
	 * @param meta
	 * @param revisionNo
	 * @param i
	 * @return
	 */
	public Revision revisionModelToMorphia(Model dto, AuthMeta meta, long revisionNo, int i){
		
		logger.info("revision model to morphia model mapper");
		
		Revision modal = new Revision();
		try{
		RevisionData _old = dto.getModel().getOldRevisionData();
		RevisionData _new = dto.getModel().getNewRevisionData();
		
		BasicInformationModel basic = new BasicInformationModel();
		ServiceInformationModel service = new ServiceInformationModel();
		SalaryInformationModel salary = new SalaryInformationModel();
		BankInformationModel bank = new BankInformationModel();
		PaymentDetailsModel payment = new PaymentDetailsModel();
		
		
		basic.setAddress(StringData.get(_old.get_pensionerProfile().getAddress(), _new.get_pensionerProfile().getAddress()));
		basic.setDateOfBirth(StringData.get(_old.get_pensionerProfile().getDateOfBirth(), _new.get_pensionerProfile().getDateOfBirth()));
		basic.setGender(StringData.get(_old.get_pensionerProfile().getGender(), _new.get_pensionerProfile().getGender()));
		basic.setLandNumber(StringData.get(_old.get_pensionerProfile().getLandNumber(), _new.get_pensionerProfile().getLandNumber()));
		basic.setMobileNumber(StringData.get(_old.get_pensionerProfile().getMobileNumber(), _new.get_pensionerProfile().getMobileNumber()));
		basic.setName(StringData.get(_old.get_pensionerProfile().getName(), _new.get_pensionerProfile().getName()));
		basic.setNic(StringData.get(_old.get_pensionerProfile().getNic(), _new.get_pensionerProfile().getNic()));
		basic.setPrefName(StringData.get(_old.get_pensionerProfile().getPrefName(), _new.get_pensionerProfile().getPrefName()));
		basic.setSalutation(StringData.get(_old.get_pensionerProfile().getSalutation(), _new.get_pensionerProfile().getSalutation()));
		basic.setwOPNumber(StringData.get(_old.get_pensionerProfile().getWOPNumber(), _new.get_pensionerProfile().getWOPNumber()));
		basic.setVillageOffice(StringData.get(_old.get_pensionerProfile().getVillageOffice(), _old.get_pensionerProfile().getVillageOffice()));
		basic.setVillageId(new LongData(_old.get_pensionerProfile().getVillageId(), _new.get_pensionerProfile().getVillageId()));
		basic.setDistrict(StringData.get(_old.get_pensionerProfile().getDistrict(), _new.get_pensionerProfile().getDistrict()));
		basic.setDs(StringData.get(_old.get_pensionerProfile().getDs(), _new.get_pensionerProfile().getDs()));
		
		service.setCircular(StringData.get(_old.get_pensionerService().getCircular(), _new.get_pensionerService().getCircular()));
		service.setDateOfRetired(StringData.get(_old.get_pensionerService().getDateOfRetired(), _new.get_pensionerService().getDateOfRetired()));
		service.setDesignation(StringData.get(_old.get_pensionerService().getDesignation(), _new.get_pensionerService().getDesignation()));
		service.setGrade(StringData.get(_old.get_pensionerService().getGrade(), _new.get_pensionerService().getGrade()));
		service.setInstitue(StringData.get(_old.get_pensionerService().getInstitute(), _new.get_pensionerService().getInstitute()));
		service.setPensionType(StringData.get(_old.get_pensionerService().getPensionerType(), _new.get_pensionerService().getPensionerType()));
		service.setRetirementReason(StringData.get(_old.get_pensionerService().getRetiredReason(), _new.get_pensionerService().getRetiredReason()));
		service.setServiceDomain(StringData.get(_old.get_pensionerService().getServiceDomain(), _new.get_pensionerService().getServiceDomain()));
		service.setSectionUnder(StringData.get(_old.get_pensionerService().getSectionUnder(), _new.get_pensionerService().getSectionUnder()));
		
		salary.setAnualConsolidatedSalary(new SalaryDataContainer(_old.get_pensionInfo().getConsolidatedSalary(), _new.get_pensionInfo().getConsolidatedSalary(), _new.get_pensionInfo().getConsolidatedSalary2020()));
		salary.setEarnedIncreament(new SalaryDataContainer(_old.get_pensionInfo().getEarnrdIncreament(), _new.get_pensionInfo().getEarnrdIncreament(), _new.get_pensionInfo().getEarnrdIncreament2020()));
		salary.setGrossSalary(new SalaryDataContainer(_old.get_pensionInfo().getGrossSalary(), _new.get_pensionInfo().getGrossSalary(), _new.get_pensionInfo().getGrossSalary2020()));
		salary.setIncrementDate(StringData.get(_old.get_pensionerService().getIncreamentDate(), _new.get_pensionerService().getIncreamentDate()));
		salary.setMonthlySalary(new DoubleData(_old.get_pensionInfo().getMonthlySalary(), _new.get_pensionInfo().getMonthlySalary()));
		salary.setSalaryCode(StringData.get(_old.get_pensionInfo().getScale(), _new.get_pensionInfo().getScale()));
		salary.setServicePeriod(new PeriodContainerData(_old.get_pensionerService().getServicePeriod().getYears(), 
				_old.get_pensionerService().getServicePeriod().getMonths(), 
				_old.get_pensionerService().getServicePeriod().getDays(), 
				_new.get_pensionerService().getServicePeriod().getYears(), 
				_new.get_pensionerService().getServicePeriod().getMonths(), 
				_new.get_pensionerService().getServicePeriod().getDays()));
		salary.setTotalNoPay(new PeriodContainerData(_old.get_pensionerService().getTotalNoPay().getYears(), 
				_old.get_pensionerService().getTotalNoPay().getMonths(), 
				_old.get_pensionerService().getTotalNoPay().getDays(), 
				_new.get_pensionerService().getTotalNoPay().getYears(), 
				_new.get_pensionerService().getTotalNoPay().getMonths(), 
				_new.get_pensionerService().getTotalNoPay().getDays()));
		salary.setTrainedPeriod(new PeriodContainerData(_old.get_pensionerService().getTrainedPeriod().getYears(), 
				_old.get_pensionerService().getTrainedPeriod().getMonths(), 
				_old.get_pensionerService().getTrainedPeriod().getDays(), 
				_new.get_pensionerService().getTrainedPeriod().getYears(), 
				_new.get_pensionerService().getTrainedPeriod().getMonths(), 
				_new.get_pensionerService().getTrainedPeriod().getDays()));
		salary.setPermanantPeriod(new PeriodContainerData(_old.get_pensionerService().getPermanantPeriod().getYears(), 
				_old.get_pensionerService().getPermanantPeriod().getMonths(),
				_old.get_pensionerService().getPermanantPeriod().getDays(), 
				_new.get_pensionerService().getPermanantPeriod().getYears(), 
				_new.get_pensionerService().getPermanantPeriod().getMonths(), 
				_new.get_pensionerService().getPermanantPeriod().getDays()));
		salary.setWnopDeductedPeriod(new PeriodContainerData(_old.get_pensionerService().getWnopDeductedPeriod().getYears(), 
				_old.get_pensionerService().getWnopDeductedPeriod().getMonths(), 
				_old.get_pensionerService().getWnopDeductedPeriod().getDays(), 
				_new.get_pensionerService().getWnopDeductedPeriod().getYears(), 
				_new.get_pensionerService().getWnopDeductedPeriod().getMonths(), 
				_new.get_pensionerService().getWnopDeductedPeriod().getDays()));
		salary.setGovNoPay(new PeriodContainerData(_old.get_pensionerService().getGovNoPay().getYears(), 
				_old.get_pensionerService().getGovNoPay().getMonths(), 
				_old.get_pensionerService().getGovNoPay().getDays(), 
				_new.get_pensionerService().getGovNoPay().getYears(), 
				_new.get_pensionerService().getGovNoPay().getMonths(), 
				_new.get_pensionerService().getGovNoPay().getDays()));
		salary.setReduceNoPay(new PeriodContainerData(_old.get_pensionerService().getReduceNoPay().getYears(), 
				_old.get_pensionerService().getReduceNoPay().getMonths(), 
				_old.get_pensionerService().getReduceNoPay().getDays(), 
				_new.get_pensionerService().getReduceNoPay().getYears(), 
				_new.get_pensionerService().getReduceNoPay().getMonths(), 
				_new.get_pensionerService().getReduceNoPay().getDays()));
		salary.setForiegnNoPay(new PeriodContainerData(_old.get_pensionerService().getForiegnNoPay().getYears(), 
				_old.get_pensionerService().getForiegnNoPay().getMonths(), 
				_old.get_pensionerService().getForiegnNoPay().getDays(), 
				_new.get_pensionerService().getForiegnNoPay().getYears(), 
				_new.get_pensionerService().getForiegnNoPay().getMonths(), 
				_new.get_pensionerService().getForiegnNoPay().getDays()));
		salary.setSetOffNoPay(new PeriodContainerData(_old.get_pensionerService().getSetOffNoPay().getYears(),
				_old.get_pensionerService().getSetOffNoPay().getMonths(), 
				_old.get_pensionerService().getSetOffNoPay().getDays(),
				_new.get_pensionerService().getSetOffNoPay().getYears(), 
				_new.get_pensionerService().getSetOffNoPay().getMonths(), 
				_new.get_pensionerService().getSetOffNoPay().getDays()));
		salary.setNetNoPay(new PeriodContainerData(_old.get_pensionerService().getNetNoPay().getYears(), 
				_old.get_pensionerService().getNetNoPay().getMonths(),
				_old.get_pensionerService().getNetNoPay().getDays(), 
				_new.get_pensionerService().getNetNoPay().getYears(), 
				_new.get_pensionerService().getNetNoPay().getMonths(), 
				_new.get_pensionerService().getNetNoPay().getDays()));
		
		salary.setTotalAllowance(new DoubleData(_new.get_pensionerService().getPresentTotalAllowance(), _new.get_pensionerService().getRevisedTotalAllowance()));
		
		// Add allowance list
		List<AllowanceDataContainer> allowanceList = new ArrayList<AllowanceDataContainer>();
		
		_new.get_pensionerService().getAllowances().forEach(allowance -> {
			AllowanceDataContainer allowanceContainer = new AllowanceDataContainer();
			allowanceContainer.setDescription(allowance.getAllowanceDesc());
			allowanceContainer.setNewValue(allowance.getPastAllowance());
			allowanceContainer.setOldValue(allowance.getPresentAllowance());

			allowanceList.add(allowanceContainer);
			
		});
		salary.setAllowances(allowanceList);
		
		bank.setPensionAccountNo(StringData.get(_old.get_pensionInfo().getAccountNumber(), _new.get_pensionInfo().getAccountNumber()));
		bank.setPensionBranch(StringData.get(_old.get_pensionInfo().getBranch().getName(), _new.get_pensionInfo().getBranch().getName()));
		bank.setPensionBank(StringData.get(_old.get_pensionInfo().getBranch().getBank().getName(), _new.get_pensionInfo().getBranch().getBank().getName()));
	
		payment.setGrossGratuity(new DoubleData(_old.get_pensionerPayment().getGratuity(), _new.get_pensionerPayment().getGratuity()));
		payment.setNetGratuity(new DoubleData(_old.get_pensionerPayment().getNetGratuity(), _new.get_pensionerPayment().getNetGratuity()));
		payment.setPayableToGovernment(new DoubleData(_old.get_pensionerPayment().getGovPayable(), _new.get_pensionerPayment().getGovPayable()));
		payment.setPensionEntitlement(new PensionEntitlementDataContainer(_old.get_pensionerPayment().getReducesPension(), 
				_old.get_pensionerPayment().getUnreducesPension(), 
				_old.get_pensionerPayment().getReducesPension2020(), 
				_old.get_pensionerPayment().getUnreducesPension2020(), 
				_new.get_pensionerPayment().getReducesPension(), 
				_new.get_pensionerPayment().getUnreducesPension(), 
				_new.get_pensionerPayment().getReducesPension2020(), 
				_new.get_pensionerPayment().getUnreducesPension2020()));
		payment.setTotalPercentage(new PercentageDataContainer(_old.get_pensionerPayment().getNetPercentage().getReduce(), 
				_old.get_pensionerPayment().getNetPercentage().getUnreduce(), 
				_new.get_pensionerPayment().getNetPercentage().getReduce(), 
				_new.get_pensionerPayment().getNetPercentage().getUnreduce()));
		payment.setDeductablePercentageLess(new PercentageDataContainer(_old.get_pensionerPayment().getDeductablePercentageLess().getReduce(), 
				_old.get_pensionerPayment().getDeductablePercentageLess().getUnreduce(), 
				_new.get_pensionerPayment().getDeductablePercentageLess().getReduce(), 
				_new.get_pensionerPayment().getDeductablePercentageLess().getUnreduce()));
		payment.setDeductablePercentageMore(new PercentageDataContainer(_old.get_pensionerPayment().getDeductablePercentageMore().getReduce(), 
				_old.get_pensionerPayment().getDeductablePercentageMore().getUnreduce(), 
				_new.get_pensionerPayment().getDeductablePercentageMore().getUnreduce(), 
				_new.get_pensionerPayment().getDeductablePercentageMore().getUnreduce()));
		payment.setPercentage(new PercentageDataContainer(_old.get_pensionerPayment().getPercentage().getReduce(), 
				_old.get_pensionerPayment().getPercentage().getUnreduce(), 
				_new.get_pensionerPayment().getPercentage().getReduce(), 
				_new.get_pensionerPayment().getPercentage().getUnreduce()));
		payment.setPercentageLess(new PercentageDataContainer(_old.get_pensionerPayment().getPercentageLess().getReduce(), 
				_old.get_pensionerPayment().getPercentageLess().getUnreduce(), 
				_new.get_pensionerPayment().getPercentageLess().getReduce(), 
				_new.get_pensionerPayment().getPercentageLess().getUnreduce()));
		payment.setPercentageMore(new PercentageDataContainer(_old.get_pensionerPayment().getPercentageMore().getReduce(), 
				_old.get_pensionerPayment().getPercentageMore().getUnreduce(), 
				_new.get_pensionerPayment().getPercentageMore().getReduce(), 
				_new.get_pensionerPayment().getPercentageMore().getUnreduce()));
		
		payment.setTotalDeduction(new DoubleData(_new.get_pensionerPayment().getPresentTotalDeduction(), _new.get_pensionerPayment().getRevisedTotalDeduction()));
		
		// Add deduction list
		List<DeductionDataContainer> deductionList = new ArrayList<DeductionDataContainer>();
		
		 _new.get_pensionerPayment().getDeductions().forEach(deduction -> {
			DeductionDataContainer deductionContainer = new DeductionDataContainer();
			deductionContainer.setDescription(deduction.getDeductionDesc());
			deductionContainer.setNewValue(deduction.getPastDeduction());
			deductionContainer.setOldValue(deduction.getPresentDeduction());
			
			deductionList.add(deductionContainer);
		});
		payment.setDeductions(deductionList);
		
		
		modal.setBasic(basic);
		modal.setService(service);
		modal.setSalary(salary);
		modal.setBank(bank);
		modal.setPayment(payment);
		
		
		modal.setPensionNumber(_new.get_pensionInfo().getId());
		modal.setResponsibleEmployee(meta.getUsername());
		if(i == 1){
			modal.setRevisionNumber(IdGenerator.generateRevisionId());
		}
		else{
			modal.setRevisionNumber(revisionNo);
		}
		modal.setStatus(RevisionStates.INIT);
		modal.setRefNumber(_new.get_revisionInfo().getRefNumber());
		modal.setType(_new.get_revisionInfo().getType());
		modal.setPensionPoint(meta.getPensionPoint());
		modal.setPensionerType(_new.get_pensionerProfile().getType());
		modal.setVillageId(_new.get_pensionerProfile().getVillageId());
		modal.setEffctiveDate(_new.get_pensionerService().getEffctiveDate());
		modal.setRevisionReason(_new.get_revisionInfo().getRevReason());
		
		return modal;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
