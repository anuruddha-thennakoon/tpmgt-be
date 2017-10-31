package org.tpmgt.model.morphia;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

/**
 * model for the salary information of revision application
 * model will be embedded inside the Revision model
 * 
 * @author Anuruddha
 *
 */
public class SalaryInformationModel {

	@Embedded private StringData salaryCode;
	@Embedded private StringData incrementDate;
	@Embedded private DoubleData monthlySalary;
	@Embedded private PeriodContainerData totalNoPay;
	@Embedded private PeriodContainerData servicePeriod;
	@Embedded private PeriodContainerData trainedPeriod;
	@Embedded private PeriodContainerData permanantPeriod;
	@Embedded private PeriodContainerData wnopDeductedPeriod;
	@Embedded private PeriodContainerData govNoPay;
	@Embedded private PeriodContainerData reduceNoPay;
	@Embedded private PeriodContainerData foriegnNoPay;
	@Embedded private PeriodContainerData setOffNoPay;
	@Embedded private PeriodContainerData netNoPay;
	@Embedded private SalaryDataContainer anualConsolidatedSalary;
	@Embedded private SalaryDataContainer earnedIncreament;
	@Embedded private List<AllowanceDataContainer> allowances = new  ArrayList<AllowanceDataContainer>();
	@Embedded private SalaryDataContainer grossSalary;
	@Embedded private DoubleData totalAllowance;
	
	
	public SalaryInformationModel() {
		
	}


	public SalaryInformationModel(StringData salaryCode, StringData incrementDate, DoubleData monthlySalary,
			PeriodContainerData totalNoPay, PeriodContainerData servicePeriod, PeriodContainerData trainedPeriod,
			PeriodContainerData permanantPeriod, PeriodContainerData wnopDeductedPeriod, PeriodContainerData govNoPay,
			PeriodContainerData reduceNoPay, PeriodContainerData foriegnNoPay, PeriodContainerData setOffNoPay,
			PeriodContainerData netNoPay, SalaryDataContainer anualConsolidatedSalary,
			SalaryDataContainer earnedIncreament, List<AllowanceDataContainer> allowances, SalaryDataContainer grossSalary,
			DoubleData totalAllowance) {
		super();
		this.salaryCode = salaryCode;
		this.incrementDate = incrementDate;
		this.monthlySalary = monthlySalary;
		this.totalNoPay = totalNoPay;
		this.servicePeriod = servicePeriod;
		this.trainedPeriod = trainedPeriod;
		this.permanantPeriod = permanantPeriod;
		this.wnopDeductedPeriod = wnopDeductedPeriod;
		this.govNoPay = govNoPay;
		this.reduceNoPay = reduceNoPay;
		this.foriegnNoPay = foriegnNoPay;
		this.setOffNoPay = setOffNoPay;
		this.netNoPay = netNoPay;
		this.anualConsolidatedSalary = anualConsolidatedSalary;
		this.earnedIncreament = earnedIncreament;
		this.allowances = allowances;
		this.grossSalary = grossSalary;
		this.totalAllowance = totalAllowance;
	}


	public StringData getSalaryCode() {
		return salaryCode;
	}


	public void setSalaryCode(StringData salaryCode) {
		this.salaryCode = salaryCode;
	}


	public StringData getIncrementDate() {
		return incrementDate;
	}


	public void setIncrementDate(StringData incrementDate) {
		this.incrementDate = incrementDate;
	}


	public DoubleData getMonthlySalary() {
		return monthlySalary;
	}


	public void setMonthlySalary(DoubleData monthlySalary) {
		this.monthlySalary = monthlySalary;
	}


	public PeriodContainerData getTotalNoPay() {
		return totalNoPay;
	}


	public void setTotalNoPay(PeriodContainerData totalNoPay) {
		this.totalNoPay = totalNoPay;
	}


	public PeriodContainerData getServicePeriod() {
		return servicePeriod;
	}


	public void setServicePeriod(PeriodContainerData servicePeriod) {
		this.servicePeriod = servicePeriod;
	}


	public PeriodContainerData getTrainedPeriod() {
		return trainedPeriod;
	}


	public void setTrainedPeriod(PeriodContainerData trainedPeriod) {
		this.trainedPeriod = trainedPeriod;
	}


	public PeriodContainerData getPermanantPeriod() {
		return permanantPeriod;
	}


	public void setPermanantPeriod(PeriodContainerData permanantPeriod) {
		this.permanantPeriod = permanantPeriod;
	}


	public PeriodContainerData getWnopDeductedPeriod() {
		return wnopDeductedPeriod;
	}


	public void setWnopDeductedPeriod(PeriodContainerData wnopDeductedPeriod) {
		this.wnopDeductedPeriod = wnopDeductedPeriod;
	}


	public PeriodContainerData getGovNoPay() {
		return govNoPay;
	}


	public void setGovNoPay(PeriodContainerData govNoPay) {
		this.govNoPay = govNoPay;
	}


	public PeriodContainerData getReduceNoPay() {
		return reduceNoPay;
	}


	public void setReduceNoPay(PeriodContainerData reduceNoPay) {
		this.reduceNoPay = reduceNoPay;
	}


	public PeriodContainerData getForiegnNoPay() {
		return foriegnNoPay;
	}


	public void setForiegnNoPay(PeriodContainerData foriegnNoPay) {
		this.foriegnNoPay = foriegnNoPay;
	}


	public PeriodContainerData getSetOffNoPay() {
		return setOffNoPay;
	}


	public void setSetOffNoPay(PeriodContainerData setOffNoPay) {
		this.setOffNoPay = setOffNoPay;
	}


	public PeriodContainerData getNetNoPay() {
		return netNoPay;
	}


	public void setNetNoPay(PeriodContainerData netNoPay) {
		this.netNoPay = netNoPay;
	}


	public SalaryDataContainer getAnualConsolidatedSalary() {
		return anualConsolidatedSalary;
	}


	public void setAnualConsolidatedSalary(SalaryDataContainer anualConsolidatedSalary) {
		this.anualConsolidatedSalary = anualConsolidatedSalary;
	}


	public SalaryDataContainer getEarnedIncreament() {
		return earnedIncreament;
	}


	public void setEarnedIncreament(SalaryDataContainer earnedIncreament) {
		this.earnedIncreament = earnedIncreament;
	}


	public List<AllowanceDataContainer> getAllowances() {
		return allowances;
	}


	public void setAllowances(List<AllowanceDataContainer> allowances) {
		this.allowances = allowances;
	}


	public SalaryDataContainer getGrossSalary() {
		return grossSalary;
	}


	public void setGrossSalary(SalaryDataContainer grossSalary) {
		this.grossSalary = grossSalary;
	}


	public DoubleData getTotalAllowance() {
		return totalAllowance;
	}


	public void setTotalAllowance(DoubleData totalAllowance) {
		this.totalAllowance = totalAllowance;
	}


	
}
