package org.tpmgt.model.dto;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "AuthParams", description = "reuired data for authentication")
public class AuthParams {
	
	private String username;
	private String password;
	
	public AuthParams() {
		// TODO Auto-generated constructor stub
	}

	public final String getUsername() {
		return username;
	}

	public final void setUsername(String username) {
		this.username = username;
	}

	public final String getPassword() {
		return password;
	}

	public final void setPassword(String password) {
		this.password = password;
	}
	
	
}
