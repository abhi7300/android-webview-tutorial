package com.dto;

public class OverseasMediclaimAssigneeRelationDTO extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5756141914223149803L;
	private String ompAssigneeRelationCode;
    private String ompAssigneeRelationName;
	public String getOmpAssigneeRelationCode() {
		return ompAssigneeRelationCode;
	}
	public void setOmpAssigneeRelationCode(String ompAssigneeRelationCode) {
		this.ompAssigneeRelationCode = ompAssigneeRelationCode;
	}
	public String getOmpAssigneeRelationName() {
		return ompAssigneeRelationName;
	}
	public void setOmpAssigneeRelationName(String ompAssigneeRelationName) {
		this.ompAssigneeRelationName = ompAssigneeRelationName;
	}
}
