package org.tpmgt.model.dto;

import java.util.ArrayList;
import java.util.List;

public class VillageOfficeList {

	private List<VillageOfficeDTO> list = new ArrayList<>();

	public VillageOfficeList() {

	}

	public List<VillageOfficeDTO> getList() {
		return list;
	}

	public void setList(List<VillageOfficeDTO> list) {
		this.list = list;
	}

}
