package org.tpmgt.consts;

public class UserRoles {

	public static final String GRATUITY_SUBJECT_CLARK = "GRATUITY_SUBJECT_CLARK";
	public static final String GRATUITY_ACCOUNTENT = "GRATUITY_ACCOUNTENT";
	public static final String AR_ACCOUNTENT = "AR_ACCOUNTENT";
	public static final String AR_SUBJECT_CLARK = "AR_SUBJECT_CLARK";
	public static final String DS_ACCOUNTENT = "DS_ACCOUNTENT";
	public static final String DS_PENSION_OFFICER = "DS_PENSION_OFFICER";
	public static final String DS = "DS";
	public static final String PENSION_POINT = "PENSION_POINT";

	/**
	 * check whether user role is a ds or not
	 * 
	 * @param role
	 * @return
	 */
	public static boolean isDsUSerRole(String role) {

		if (role.equals(DS_ACCOUNTENT) || role.equals(DS_PENSION_OFFICER) || role.equals(DS))
			return true;
		return false;
	}
}
