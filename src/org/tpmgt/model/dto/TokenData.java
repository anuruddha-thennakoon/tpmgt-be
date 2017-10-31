package org.tpmgt.model.dto;

/**
 * token data modal
 * @author Isuru Jayathilaka
 *
 */
public class TokenData {

	private String role;
	private int pensionPoint;
	private String username;
	
	public TokenData() {
		// TODO Auto-generated constructor stub
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getPensionPoint() {
		return pensionPoint;
	}

	public void setPensionPoint(int pensionPoint) {
		this.pensionPoint = pensionPoint;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTokenData() {
		return username + "||" + role + "||" + pensionPoint;
	}
}
