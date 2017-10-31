
package org.tpmgt.consts;

import java.util.Arrays;
import java.util.List;

public class DSPensionOfficerStates {

	public static final String ROLE = UserRoles.DS_PENSION_OFFICER;

	public static final int APPROVAL_PENDING = PensionPointStates.APPROVED;
	public static final int REJECTED_BY_UPPER_LEVEL = 302;
	public static final int CORRECTED_AND_PENDING_APPROVAL = PensionPointStates.CORRECTED_AND_APPROVED;
	public static final int APPROVED = 400;
	public static final int CORRECTED_APPROVED = 403;
	public static final int REJECT = PensionPointStates.REJECTED_BY_DS_PENSION_OFFICER;

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
		case ListTypes.REJECTED:
			return Arrays.asList(REJECTED_BY_UPPER_LEVEL);
		case ListTypes.APPROVED:
			return Arrays.asList(APPROVED, CORRECTED_APPROVED);
		case ListTypes.CORRECTED:
			return Arrays.asList(CORRECTED_AND_PENDING_APPROVAL);
		default:
			return null;
		}
	}

}
