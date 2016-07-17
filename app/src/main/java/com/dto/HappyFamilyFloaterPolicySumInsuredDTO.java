package com.dto;


public class HappyFamilyFloaterPolicySumInsuredDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 307150213014879349L;
	private HappyFamilyFloaterPolicyPlansDTO happyFamilyFloaterPolicyPlansDTO;
	private String sumInsuredId;
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
	public String getSumInsuredId() {
		return sumInsuredId;
	}
	public void setSumInsuredId(String sumInsuredId) {
		this.sumInsuredId = sumInsuredId;
	}
	

}
