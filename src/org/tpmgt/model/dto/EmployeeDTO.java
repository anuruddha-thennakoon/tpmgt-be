package org.tpmgt.model.dto;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeDTO {

	private int ds;
	private String name;
	private int pensionPoint;

	public EmployeeDTO() {

	}

	public int getDs() {
		return ds;
	}

	public void setDs(int ds) {
		this.ds = ds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPensionPoint() {
		return pensionPoint;
	}

	public void setPensionPoint(int pensionPoint) {
		this.pensionPoint = pensionPoint;
	}
	
}
