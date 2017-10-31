package org.tpmgt.model.dto;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "Revision", description = "full revision model")
public class RevisionDto {
	
	private long revisionNumber;
	private long pensionNumber;
	private long pensionAmount;
	
	public RevisionDto() {
		// TODO Auto-generated constructor stub
	}

	public RevisionDto(long revisionNumber, long pensionNumber) {
		super();
		this.revisionNumber = revisionNumber;
		this.pensionNumber = pensionNumber;
	}

	public final long getRevisionNumber() {
		return revisionNumber;
	}

	public final void setRevisionNumber(long revisionNumber) {
		this.revisionNumber = revisionNumber;
	}

	public final long getPensionNumber() {
		return pensionNumber;
	}

	public final void setPensionNumber(long pensionNumber) {
		this.pensionNumber = pensionNumber;
	}

	public final long getPensionAmount() {
		return pensionAmount;
	}

	public final void setPensionAmount(long pensionAmount) {
		this.pensionAmount = pensionAmount;
	}
	
}
