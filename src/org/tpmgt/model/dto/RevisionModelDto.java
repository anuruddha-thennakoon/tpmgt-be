package org.tpmgt.model.dto;

public class RevisionModelDto {
	
	private RevisionData oldRevisionData;
	private RevisionData newRevisionData;
	
	public RevisionModelDto() {
		
	}

	public RevisionData getOldRevisionData() {
		return oldRevisionData;
	}

	public void setOldRevisionData(RevisionData oldRevisionData) {
		this.oldRevisionData = oldRevisionData;
	}

	public RevisionData getNewRevisionData() {
		return newRevisionData;
	}

	public void setNewRevisionData(RevisionData newRevisionData) {
		this.newRevisionData = newRevisionData;
	}
	
	
	

}
