package org.tpmgt.consts;

import java.util.Arrays;
import java.util.List;

public class ARAccountentStates {

	public static final String ROLE = UserRoles.AR_ACCOUNTENT;

	public static final int APPROVAL_PENDING = ARSubjectClarkStates.APPROVED;
	public static final int APPROVED = 900;
	public static final int CORRECTED_APPROVED = 903;
	public static final int REJECT = DSPensionOfficerStates.REJECTED_BY_UPPER_LEVEL;
	public static final int REJECTED_BY_UPPER_LEVEL = 802;

	public static int getState(int currentState, boolean isVerified) {

		switch (currentState) {
		case APPROVAL_PENDING: {
			if (isVerified)
				return APPROVED;
			else
				return REJECT;
		}
		case REJECTED_BY_UPPER_LEVEL: {
			if (isVerified)
				return CORRECTED_APPROVED;
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
			return Arrays.asList(APPROVED, CORRECTED_APPROVED);
		case ListTypes.REJECTED:
			return Arrays.asList(REJECTED_BY_UPPER_LEVEL);
		default:
			return null;
		}
	}

}
