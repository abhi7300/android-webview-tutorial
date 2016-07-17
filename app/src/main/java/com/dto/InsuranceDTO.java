package com.dto;

public class InsuranceDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -867035190186798657L;
	private String insuredName;
	private String policyNo;
	private String isContinueWithAgent;
	private String existingPolicyNumber;
	private OiclBranchDTO oiclBranchDTO;
	private OiclRenewalOtherPolicyDTO oiclRenewalOtherPolicyDTO;
	
	private String totalPremium;
	private String premium;
	private String serviceTax;
	private String proposalNumber;
	private String inliasPortalSysId;
	
	private String vehicleRegistrationNumber;
	
	private UserDTO createdByUserDTO;
	private UserDTO updatedByUserDTO;
	
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getExistingPolicyNumber() {
		return existingPolicyNumber;
	}
	public void setExistingPolicyNumber(String existingPolicyNumber) {
		this.existingPolicyNumber = existingPolicyNumber;
	}
	public UserDTO getCreatedByUserDTO() {
		return createdByUserDTO;
	}
	public void setCreatedByUserDTO(UserDTO createdByUserDTO) {
		this.createdByUserDTO = createdByUserDTO;
	}
	public UserDTO getUpdatedByUserDTO() {
		return updatedByUserDTO;
	}
	public void setUpdatedByUserDTO(UserDTO updatedByUserDTO) {
		this.updatedByUserDTO = updatedByUserDTO;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getIsContinueWithAgent() {
		return isContinueWithAgent;
	}
	public void setIsContinueWithAgent(String isContinueWithAgent) {
		this.isContinueWithAgent = isContinueWithAgent;
	}
	public OiclBranchDTO getOiclBranchDTO() {
		return oiclBranchDTO;
	}
	public void setOiclBranchDTO(OiclBranchDTO oiclBranchDTO) {
		this.oiclBranchDTO = oiclBranchDTO;
	}
	public OiclRenewalOtherPolicyDTO getOiclRenewalOtherPolicyDTO() {
		return oiclRenewalOtherPolicyDTO;
	}
	public void setOiclRenewalOtherPolicyDTO(
			OiclRenewalOtherPolicyDTO oiclRenewalOtherPolicyDTO) {
		this.oiclRenewalOtherPolicyDTO = oiclRenewalOtherPolicyDTO;
	}
	public String getTotalPremium() {
		return totalPremium;
	}
	public void setTotalPremium(String totalPremium) {
		this.totalPremium = totalPremium;
	}

	public String getServiceTax() {
		return serviceTax;
	}
	public void setServiceTax(String serviceTax) {
		this.serviceTax = serviceTax;
	}
	public String getProposalNumber() {
		return proposalNumber;
	}
	public void setProposalNumber(String proposalNumber) {
		this.proposalNumber = proposalNumber;
	}
	public String getInliasPortalSysId() {
		return inliasPortalSysId;
	}
	public void setInliasPortalSysId(String inliasPortalSysId) {
		this.inliasPortalSysId = inliasPortalSysId;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getVehicleRegistrationNumber() {
		return vehicleRegistrationNumber;
	}
	public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}

}
