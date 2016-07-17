package com.dto;

public class NagarikSurakshaAssgineeDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8691967745739873609L;
	private String assigneeName;
	private RelationshipDTO relationshipDTO;
	private String sharePercentage;
	
	
	
	public String getAssigneeName() {
		return assigneeName;
	}
	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}

	public String getSharePercentage() {
		return sharePercentage;
	}
	public void setSharePercentage(String sharePercentage) {
		this.sharePercentage = sharePercentage;
	}
	public RelationshipDTO getRelationshipDTO() {
		return relationshipDTO;
	}
	public void setRelationshipDTO(RelationshipDTO relationshipDTO) {
		this.relationshipDTO = relationshipDTO;
	}

}
