package org.tpmgt.consts;

import java.util.Arrays;
import java.util.List;

public class GratuitySubjectClarkStates {

	public static final String ROLE = UserRoles.GRATUITY_SUBJECT_CLARK;

	public static final int APPROVAL_PENDING = ARAccountentStates.APPROVED;
	public static final int REJECT = ARAccountentStates.REJECTED_BY_UPPER_LEVEL;
	public static final int APPROVED = 1000;
	public static final int CORRECTED_AND_PENDING_APPROVAL = ARAccountentStates.CORRECTED_APPROVED;
	public static final int CORRECTED_APPROVED = 1003;

	public static int getState(int currentState, boolean isVerified) {

		switch (currentState) {
		case APPROVAL_PENDING: {
			if (isVerified)
				return APPROVED;
			else
				return REJECT;
		}
		case CORRECTED_AND_PENDING_APPROVAL: {
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
		case ListTypes.CORRECTED:
			return Arrays.asList(CORRECTED_AND_PENDING_APPROVAL);
		default:
			return null;
		}
	}

}
