package org.tpmgt.model.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Bank {
	
	private Integer id;
	private String name;

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
