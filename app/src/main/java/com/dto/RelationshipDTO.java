package com.dto;

public class RelationshipDTO extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2702645078643370279L;
	private String relationshipId;
    private String description;
	public String getRelationshipId() {
		return relationshipId;
	}
	public void setRelationshipId(String relationshipId) {
		this.relationshipId = relationshipId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
