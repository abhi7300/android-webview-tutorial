package com.dto;

public class HappyFamilyFloaterPolicyPlansDTO extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3389971234671701176L;
	private String planCode;
    private String planName;
	public String getPlanCode() {
		return planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
}
