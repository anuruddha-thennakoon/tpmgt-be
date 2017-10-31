package org.tpmgt.model.dto;

import java.util.ArrayList;
import java.util.List;

public class RevisionList {

	private List<RevisionOverviewDto> data = new ArrayList<>();
	
	public RevisionList() {
		// TODO Auto-generated constructor stub
	}

	public final List<RevisionOverviewDto> getData() {
		return data;
	}

	public final void setData(List<RevisionOverviewDto> data) {
		this.data = data;
	}
	
}
