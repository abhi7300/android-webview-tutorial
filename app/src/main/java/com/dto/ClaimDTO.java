package com.dto;

public class ClaimDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7192607852524382717L;
    private String claimNo;
    private String policyNo;
    private String dateOfLoss;
    private String status;
    
    
    
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getDateOfLoss() {
		return dateOfLoss;
	}
	public void setDateOfLoss(String dateOfLoss) {
		this.dateOfLoss = dateOfLoss;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
}
