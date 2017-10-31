package org.tpmgt.controllers;

import java.util.List;

import org.tpmgt.consts.ARAccountentStates;
import org.tpmgt.consts.ARSubjectClarkStates;
import org.tpmgt.consts.DSAccountentStates;
import org.tpmgt.consts.DSPensionOfficerStates;
import org.tpmgt.consts.DSStates;
import org.tpmgt.consts.GratuityAccountentStates;
import org.tpmgt.consts.GratuitySubjectClarkStates;
import org.tpmgt.consts.PensionPointStates;

/**
 * Manager for status
 * 
 * @author Dinesh
 *
 */
public class StatusManager {

	/**
	 * get the next status for the requested status
	 * 
	 * @param currentStatus
	 * @return
	 */
	public static int getNextStatus(int currentState, String role, boolean isVerified) {
		switch (role) {
		case PensionPointStates.ROLE:
			return PensionPointStates.getState(currentState, isVerified);

		case DSPensionOfficerStates.ROLE:
			return DSPensionOfficerStates.getState(currentState, isVerified);

		case DSAccountentStates.ROLE:
			return DSAccountentStates.getState(currentState, isVerified);

		case DSStates.ROLE:
			return DSStates.getState(currentState, isVerified);

		case ARSubjectClarkStates.ROLE:
			return ARSubjectClarkStates.getState(currentState, isVerified);

		case ARAccountentStates.ROLE:
			return ARAccountentStates.getState(currentState, isVerified);

		case GratuitySubjectClarkStates.ROLE:
			return GratuitySubjectClarkStates.getState(currentState, isVerified);

		case GratuityAccountentStates.ROLE:
			return GratuityAccountentStates.getState(currentState, isVerified);

		default:
			return currentState;
		}

	}

	/**
	 * get list of status
	 * 
	 * @param role
	 * @param listType
	 * @return
	 */
	public static List<Integer> getListingStatus(String role, String listType) {

		switch (role) {
		case PensionPointStates.ROLE:
			return PensionPointStates.getListingState(listType);

		case DSPensionOfficerStates.ROLE:
			return DSPensionOfficerStates.getListingState(listType);

		case DSAccountentStates.ROLE:
			return DSAccountentStates.getListingState(listType);

		case DSStates.ROLE:
			return DSStates.getListingState(listType);

		case ARSubjectClarkStates.ROLE:
			return ARSubjectClarkStates.getListingState(listType);

		case ARAccountentStates.ROLE:
			return ARAccountentStates.getListingState(listType);

		case GratuitySubjectClarkStates.ROLE:
			return GratuitySubjectClarkStates.getListingState(listType);

		case GratuityAccountentStates.ROLE:
			return GratuityAccountentStates.getListingState(listType);

		default:
			return null;

		}
	}

}
