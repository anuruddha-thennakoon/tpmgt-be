package org.tpmgt.consts;

import java.util.Arrays;
import java.util.List;

public class ARSubjectClarkStates {

	public static final String ROLE = UserRoles.AR_SUBJECT_CLARK;

	public static final int APPROVAL_PENDING = PensionPointStates.AWARD_PRINTED_UPLOADED;
	public static final int REJECT = DSPensionOfficerStates.REJECTED_BY_UPPER_LEVEL;
	public static final int APPROVED = 800;

	public static int getState(int currentState, boolean isVerified) {

		switch (currentState) {
		case APPROVAL_PENDING: {
			if (isVerified)
				return APPROVED;
			else
				return REJECT;
		}

		default:
			return currentState;
		}
	}

	/**
	 * get state number by list type
	 * 
	 * @param listType
	 * @return
	 */
	public static List<Integer> getListingState(String listType) {
		switch (listType) {
		case ListTypes.PENDING:
			return Arrays.asList(APPROVAL_PENDING);
		case ListTypes.APPROVED:
			return Arrays.asList(APPROVED);
		default:
			return null;
		}
	}

}
