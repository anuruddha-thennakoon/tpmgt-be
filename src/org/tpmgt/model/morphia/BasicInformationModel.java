package org.tpmgt.model.morphia;

import org.mongodb.morphia.annotations.Embedded;

/**
 * model for the basic pension information
 * modal will be embedded inside the Revision modal
 * @author Dinesh
 *
 */
public class BasicInformationModel {
	
	@Embedded private StringData salutation;
	@Embedded private StringData name;
	@Embedded private StringData prefName;
	@Embedded private StringData dateOfBirth;
	@Embedded private StringData nic;
	@Embedded private StringData gender;
	@Embedded private StringData district;
	@Embedded private StringData ds;
	@Embedded private StringData address;
	@Embedded private StringData landNumber;
	@Embedded private StringData mobileNumber;
	@Embedded private StringData wOPNumber;
	@Embedded private StringData villageOffice;
	@Embedded private LongData villageId;
	
	public StringData getVillageOffice() {
		return villageOffice;
	}

	public void setVillageOffice(StringData villageOffice) {
		this.villageOffice = villageOffice;
	}

	public StringData getSalutation() {
		return salutation;
	}

	public void setSalutation(StringData salutation) {
		this.salutation = salutation;
	}

	public StringData getwOPNumber() {
		return wOPNumber;
	}

	public void setwOPNumber(StringData wOPNumber) {
		this.wOPNumber = wOPNumber;
	}

	public StringData getName() {
		return name;
	}

	public void setName(StringData name) {
		this.name = name;
	}

	public StringData getPrefName() {
		return prefName;
	}

	public void setPrefName(StringData prefName) {
		this.prefName = prefName;
	}

	public StringData getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(StringData dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public StringData getNic() {
		return nic;
	}

	public void setNic(StringData nic) {
		this.nic = nic;
	}

	public StringData getGender() {
		return gender;
	}

	public void setGender(StringData gender) {
		this.gender = gender;
	}

	public StringData getDistrict() {
		return district;
	}

	public void setDistrict(StringData district) {
		this.district = district;
	}

	public StringData getDs() {
		return ds;
	}

	public void setDs(StringData ds) {
		this.ds = ds;
	}

	public StringData getAddress() {
		return address;
	}

	public void setAddress(StringData address) {
		this.address = address;
	}

	public StringData getLandNumber() {
		return landNumber;
	}

	public void setLandNumber(StringData landNumber) {
		this.landNumber = landNumber;
	}

	public StringData getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(StringData mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public LongData getVillageId() {
		return villageId;
	}

	public void setVillageId(LongData villageId) {
		this.villageId = villageId;
	}

	public BasicInformationModel() {
		// TODO Auto-generated constructor stub
	}

	
}
