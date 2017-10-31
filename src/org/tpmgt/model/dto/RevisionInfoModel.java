package org.tpmgt.model.dto;

public class RevisionInfoModel {

	private long refNumber;
	private String type;
	private String revReason;
	
	public long getRefNumber() {
		return refNumber;
	}
	
	public void setRefNumber(long refNumber) {
		this.refNumber = refNumber;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getRevReason() {
		return revReason;
	}

	public void setRevReason(String revReason) {
		this.revReason = revReason;
	}
	
	
	
}
