package com.dto;

public class PolicyDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -512368612942240446L;

	String policyNo;
	String StartDate;
	String endDate;
	String policyType;
	String isPolicyActive;
	
	
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public String getIsPolicyActive() {
		return isPolicyActive;
	}
	public void setIsPolicyActive(String isPolicyActive) {
		this.isPolicyActive = isPolicyActive;
	}
}
