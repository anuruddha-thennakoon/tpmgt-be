package org.tpmgt.model.dto;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Branch {

	private int id;
	private String name;
	private String address;
	private Bank bank;
	private int code;
	
	public Branch() {
		
	}
	
	
	public Branch(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public Bank getBank() {
		return bank;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public void setBank(Bank bank) {
		this.bank = bank;
	}

	
}
