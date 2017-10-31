package org.tpmgt.model.dto;

import java.util.ArrayList;
import java.util.List;

public class DashboardDTO {

	private List<DashboardModel> data = new ArrayList<>();

	public DashboardDTO() {

	}

	public DashboardDTO(List<DashboardModel> list) {
		this.data = list;
	}

	public List<DashboardModel> getDetails() {
		return data;
	}

	public void setDetails(List<DashboardModel> data) {
		this.data = data;
	}
}
