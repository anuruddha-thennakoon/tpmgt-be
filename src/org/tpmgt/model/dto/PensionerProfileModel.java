package org.tpmgt.model.dto;

public class PensionerProfileModel {
	
	private String salutation;
	private String name;
	private String prefName;
	private String dateOfBirth;
	private String nic;
	private String gender;
	private Photo Photo;
	private String district;
	private String ds;
	private String villageOffice;
	private String address;
	private String mobileNumber;
	private String landNumber;
	private String type;
	private long villageId;
	private String WOPNumber;
	
	public PensionerProfileModel() {

	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrefName() {
		return prefName;
	}

	public void setPrefName(String prefName) {
		this.prefName = prefName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Photo getPhoto() {
		return Photo;
	}

	public void setPhoto(Photo photo) {
		Photo = photo;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDs() {
		return ds;
	}

	public void setDs(String ds) {
		this.ds = ds;
	}

	public String getVillageOffice() {
		return villageOffice;
	}

	public void setVillageOffice(String villageOffice) {
		this.villageOffice = villageOffice;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getLandNumber() {
		return landNumber;
	}

	public void setLandNumber(String landNumber) {
		this.landNumber = landNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getVillageId() {
		return villageId;
	}

	public void setVillageId(long villageId) {
		this.villageId = villageId;
	}

	public String getWOPNumber() {
		return WOPNumber;
	}

	public void setWOPNumber(String wOPNumber) {
		WOPNumber = wOPNumber;
	}
	
	
	
	

}
