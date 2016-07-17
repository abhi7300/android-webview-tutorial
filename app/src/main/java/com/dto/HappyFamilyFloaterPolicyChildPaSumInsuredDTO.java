package com.dto;


public class HappyFamilyFloaterPolicyChildPaSumInsuredDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4257086356487893066L;
	
	private HappyFamilyFloaterPolicyPlansDTO happyFamilyFloaterPolicyPlansDTO;
    private String hffChildPaSiId;
	private String planCode;
    private String sumInsured;
    private String sumInsuredType;
    private String comments;
    
    
	public HappyFamilyFloaterPolicyPlansDTO getHappyFamilyFloaterPolicyPlansDTO() {
		return happyFamilyFloaterPolicyPlansDTO;
	}
	public void setHappyFamilyFloaterPolicyPlansDTO(
			HappyFamilyFloaterPolicyPlansDTO happyFamilyFloaterPolicyPlansDTO) {
		this.happyFamilyFloaterPolicyPlansDTO = happyFamilyFloaterPolicyPlansDTO;
	}
	public String getPlanCode() {
		return planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	public String getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getSumInsuredType() {
		return sumInsuredType;
	}
	public void setSumInsuredType(String sumInsuredType) {
		this.sumInsuredType = sumInsuredType;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getHffChildPaSiId() {
		return hffChildPaSiId;
	}
	public void setHffChildPaSiId(String hffChildPaSiId) {
		this.hffChildPaSiId = hffChildPaSiId;
	}

}
