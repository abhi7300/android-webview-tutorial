package com.dto;

public class ClaimWithTPADTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5405942123269081668L;
	private String policyNo;
	private String tpaUrl;
	
	
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getTpaUrl() {
		return tpaUrl;
	}
	public void setTpaUrl(String tpaUrl) {
		this.tpaUrl = tpaUrl;
	}
	
	
}
