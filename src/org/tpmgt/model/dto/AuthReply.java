package org.tpmgt.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "AuthReply", description = "received when the user is authenticated")
public class AuthReply {

	@ApiModelProperty(value = "token to access revisions api")
	private String token;
	
	@ApiModelProperty(value = "key to access pensions api")
	private String sessionKey;
	
	@ApiModelProperty(value = "user role of the logged user")
	private String userRole;
	
	public AuthReply() {
		// TODO Auto-generated constructor stub
	}
	
	public final String getToken() {
		return token;
	}
	public final void setToken(String token) {
		this.token = token;
	}
	public final String getSessionKey() {
		return sessionKey;
	}
	public final void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	public final String getUserRole() {
		return userRole;
	}
	public final void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	
	
}
