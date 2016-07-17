package com.dto;

import java.util.List;

public class JanataPersonalAccidentDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -555022034079601869L;
	private String startDate;
	private String endDate;
	private OiclBranchDTO oiclBranchDTO;
	private String address;
	private List<JanataPersonalAccidentDetailsDTO> JanataPersonalAccidentDetailsDTOList;
	private String premium;
	private String serviceTax;
	private String premiumWithoutSt;
	private String proposalNumber;
	private String policySysId;
	private boolean isUserloggedIn;
	private String paymentType;
	
	private UserDTO personalDetailsUserDTO;
	private UserDTO createdByUserDTO;
	private UserDTO updatedByUserDTO;
	
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public OiclBranchDTO getOiclBranchDTO() {
		return oiclBranchDTO;
	}
	public void setOiclBranchDTO(OiclBranchDTO oiclBranchDTO) {
		this.oiclBranchDTO = oiclBranchDTO;
	}
	public List<JanataPersonalAccidentDetailsDTO> getJanataPersonalAccidentDetailsDTOList() {
		return JanataPersonalAccidentDetailsDTOList;
	}
	public void setJanataPersonalAccidentDetailsDTOList(
			List<JanataPersonalAccidentDetailsDTO> janataPersonalAccidentDetailsDTOList) {
		JanataPersonalAccidentDetailsDTOList = janataPersonalAccidentDetailsDTOList;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getServiceTax() {
		return serviceTax;
	}
	public void setServiceTax(String serviceTax) {
		this.serviceTax = serviceTax;
	}
	public String getPremiumWithoutSt() {
		return premiumWithoutSt;
	}
	public void setPremiumWithoutSt(String premiumWithoutSt) {
		this.premiumWithoutSt = premiumWithoutSt;
	}
	public String getProposalNumber() {
		return proposalNumber;
	}
	public void setProposalNumber(String proposalNumber) {
		this.proposalNumber = proposalNumber;
	}
	public String getPolicySysId() {
		return policySysId;
	}
	public void setPolicySysId(String policySysId) {
		this.policySysId = policySysId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isUserloggedIn() {
		return isUserloggedIn;
	}
	public void setUserloggedIn(boolean isUserloggedIn) {
		this.isUserloggedIn = isUserloggedIn;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public UserDTO getPersonalDetailsUserDTO() {
		return personalDetailsUserDTO;
	}
	public void setPersonalDetailsUserDTO(UserDTO personalDetailsUserDTO) {
		this.personalDetailsUserDTO = personalDetailsUserDTO;
	}
	
		
	

}
