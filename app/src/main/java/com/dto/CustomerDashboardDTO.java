package com.dto;

import java.util.List;

public class CustomerDashboardDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1507948485343842148L;

    private List<PolicyDTO> policyList;
    private List<ClaimDTO> claimList;
    private List<ClaimWithTPADTO> claimWithTPAList;
    
    private String errorCodePolicyList;
    private String errorCodeClaimList;
    private String errorCodeClaimTPAList;
    
    
	public List<PolicyDTO> getPolicyList() {
		return policyList;
	}
	public void setPolicyList(List<PolicyDTO> policyList) {
		this.policyList = policyList;
	}
	public List<ClaimDTO> getClaimList() {
		return claimList;
	}
	public void setClaimList(List<ClaimDTO> claimList) {
		this.claimList = claimList;
	}
	public List<ClaimWithTPADTO> getClaimWithTPAList() {
		return claimWithTPAList;
	}
	public void setClaimWithTPAList(List<ClaimWithTPADTO> claimWithTPAList) {
		this.claimWithTPAList = claimWithTPAList;
	}
	public String getErrorCodePolicyList() {
		return errorCodePolicyList;
	}
	public void setErrorCodePolicyList(String errorCodePolicyList) {
		this.errorCodePolicyList = errorCodePolicyList;
	}
	public String getErrorCodeClaimList() {
		return errorCodeClaimList;
	}
	public void setErrorCodeClaimList(String errorCodeClaimList) {
		this.errorCodeClaimList = errorCodeClaimList;
	}
	public String getErrorCodeClaimTPAList() {
		return errorCodeClaimTPAList;
	}
	public void setErrorCodeClaimTPAList(String errorCodeClaimTPAList) {
		this.errorCodeClaimTPAList = errorCodeClaimTPAList;
	}
	
}
