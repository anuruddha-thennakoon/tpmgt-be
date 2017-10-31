package org.tpmgt.model.dto;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "RevisionOverview", description = "revision overview model")
public class RevisionOverviewDto {
	
	private long revisionNumber;
	private long pensionNumber;
	
	public RevisionOverviewDto() {
		// TODO Auto-generated constructor stub
	}

	public RevisionOverviewDto(long revisionNumber, long pensionNumber) {
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
	
}
