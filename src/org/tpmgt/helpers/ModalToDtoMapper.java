package org.tpmgt.helpers;

import org.tpmgt.model.dto.DashboardModel;
import org.tpmgt.model.morphia.Revision;

/**
 * modal to dto mapper, responsible for mapping the mongo modal to dto
 * 
 * @author Isuru Jayathilaka
 *
 */
public class ModalToDtoMapper {

	public static DashboardModel map(Revision modal) {
		DashboardModel dto = new DashboardModel();

		dto.setName(modal.getBasic().getName().getNewValue());
		dto.setNic(modal.getBasic().getNic().getNewValue());
		dto.setRefNumber(modal.getRefNumber());
		dto.setPensionNumber(modal.getPensionNumber());
		dto.setRevisionNumber(modal.getRevisionNumber());

		dto.setDsOffice(modal.getBasic().getDs().getNewValue());
		dto.setRetiredDate(modal.getService().getDateOfRetired().getNewValue());
		dto.setCurrentSalary(modal.getSalary().getGrossSalary().getNewValue());
		//dto.setApplicationDate(modal.getCreatedDate());
		//dto.setDeductions(modal.getPayment().getTotalDeduction().getNewValue());
		//dto.setReducedSalary(modal.getPayment().getPensionEntitlement().getNewReducedValue());
		//dto.setUnreducedSalary(modal.getPayment().getPensionEntitlement().getOldUnreducedValue());
		
		return dto;

	}
}
