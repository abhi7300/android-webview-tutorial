package com.dto;

import java.util.List;

public class NagarikSurakshaDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6580209470227690072L;
	private String startDate;
	private String endDate;
	private String address;
    private NagarikSurakshaDetailsDTO selfDetails;
    private NagarikSurakshaDetailsDTO spouseDetails;
    private List<NagarikSurakshaDetailsDTO> dependentChildDetailsList;
    private NagarikSurakshaDetailsDTO fatherDetails;
    private NagarikSurakshaDetailsDTO motherDetails;
	private OiclBranchDTO oiclBranchDTO;


	
	private String annualPremium;
	private String premiumWithoutServiceTAX;
	private String serviceTax;
	private String proposalNumber;
	private String transactionId;
	private boolean isUserloggedIn;
	private String paymentType;
	
	private UserDTO personalDetailsUserDTO;
	private UserDTO createdByUserDTO;
	private UserDTO updatedByUserDTO;
	
	public String getAnnualPremium() {
		return annualPremium;
	}
	public void setAnnualPremium(String annualPremium) {
		this.annualPremium = annualPremium;
	}
	public String getPremiumWithoutServiceTAX() {
		return premiumWithoutServiceTAX;
	}
	public void setPremiumWithoutServiceTAX(String premiumWithoutServiceTAX) {
		this.premiumWithoutServiceTAX = premiumWithoutServiceTAX;
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
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public NagarikSurakshaDetailsDTO getSelfDetails() {
		return selfDetails;
	}
	public void setSelfDetails(NagarikSurakshaDetailsDTO selfDetails) {
		this.selfDetails = selfDetails;
	}
	public NagarikSurakshaDetailsDTO getSpouseDetails() {
		return spouseDetails;
	}
	public void setSpouseDetails(NagarikSurakshaDetailsDTO spouseDetails) {
		this.spouseDetails = spouseDetails;
	}
	public List<NagarikSurakshaDetailsDTO> getDependentChildDetailsList() {
		return dependentChildDetailsList;
	}
	public void setDependentChildDetailsList(
			List<NagarikSurakshaDetailsDTO> dependentChildDetailsList) {
		this.dependentChildDetailsList = dependentChildDetailsList;
	}
	public NagarikSurakshaDetailsDTO getFatherDetails() {
		return fatherDetails;
	}
	public void setFatherDetails(NagarikSurakshaDetailsDTO fatherDetails) {
		this.fatherDetails = fatherDetails;
	}
	public NagarikSurakshaDetailsDTO getMotherDetails() {
		return motherDetails;
	}
	public void setMotherDetails(NagarikSurakshaDetailsDTO motherDetails) {
		this.motherDetails = motherDetails;
	}
	public OiclBranchDTO getOiclBranchDTO() {
		return oiclBranchDTO;
	}
	public void setOiclBranchDTO(OiclBranchDTO oiclBranchDTO) {
		this.oiclBranchDTO = oiclBranchDTO;
	}
	public UserDTO getUpdatedByUserDTO() {
		return updatedByUserDTO;
	}
	public void setUpdatedByUserDTO(UserDTO updatedByUserDTO) {
		this.updatedByUserDTO = updatedByUserDTO;
	}
	public UserDTO getCreatedByUserDTO() {
		return createdByUserDTO;
	}
	public void setCreatedByUserDTO(UserDTO createdByUserDTO) {
		this.createdByUserDTO = createdByUserDTO;
	}
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
