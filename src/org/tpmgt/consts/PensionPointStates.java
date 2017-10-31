package org.tpmgt.consts;

import java.util.Arrays;
import java.util.List;

public class PensionPointStates {

	public static final String ROLE = "PENSION_POINT";

	public static final int CREATED = 100;
	public static final int APPROVED_BY_DS = 600;
	public static final int REJECTED_BY_DS_PENSION_OFFICER = 102;
	public static final int DOCUMENT_UPLOADED = 200;
	public static final int CORRECTED_AND_DOCUMENT_NOT_UPLOATED = 203;
	public static final int APPROVED = 300;
	public static final int CORRECTED_AND_APPROVED = 303;
	public static final int AWARD_PRINTED_UPLOADED = 700;

	public static int getState(int currentState, boolean isVerified) {

		switch (currentState) {
		case CREATED: {
			if (isVerified)
				return DOCUMENT_UPLOADED;
		}
		case DOCUMENT_UPLOADED: {
			if (isVerified)
				return APPROVED;
		}
		case REJECTED_BY_DS_PENSION_OFFICER: {
			if (isVerified)
				return CORRECTED_AND_DOCUMENT_NOT_UPLOATED;
		}
		case CORRECTED_AND_DOCUMENT_NOT_UPLOATED: {
			if (isVerified)
				return CORRECTED_AND_APPROVED;
		}
		case APPROVED_BY_DS: {
			if (isVerified)
				return AWARD_PRINTED_UPLOADED;
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
			return Arrays.asList(CREATED, DOCUMENT_UPLOADED);
		case ListTypes.REJECTED:
			return Arrays.asList(REJECTED_BY_DS_PENSION_OFFICER, CORRECTED_AND_DOCUMENT_NOT_UPLOATED);
		case ListTypes.APPROVED:
			return Arrays.asList(APPROVED_BY_DS);
		case ListTypes.AWARD_PRINTING:
			return Arrays.asList(AWARD_PRINTED_UPLOADED);
		case ListTypes.CORRECTED:
			return Arrays.asList(CORRECTED_AND_DOCUMENT_NOT_UPLOATED);
		default:
			return null;
		}
	}

}
