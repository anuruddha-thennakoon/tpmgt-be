package org.tpmgt.model.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class DashboardDetails {

	private List<Hetoes> details = new ArrayList<Hetoes>();
	
	public DashboardDetails(){
		// TODO Auto-generated constructor stub
	}
	
	public List<Hetoes> getDetails(){
		return details;
	}
	
	public void setDetails(List<Hetoes> details){
		this.details = details;
	}
	
}
