package com.dto;

import java.util.List;

public class IndvMediclaimPolicyDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4820795993035224100L;
	private String isOiclPolicy;
	private String isRenewRecord;
	private String startDate;
	private String endDate;
	private String address;
	private OiclBranchDTO OiclBranchDTO;
	private String panNumber;
	private String insuredName;
	private String haveInsuredEntireFamily;
	private String physicianAddress;
	private String physicianName;
	private String wantTpaService;
	private String doesAgreeWithFinalDeclaration;
	private SumInsuredDTO sumInsuredDTO;
	
	private IndvMediclaimInsuredPersonsDTO indvMedPersonSelf;
	private IndvMediclaimInsuredPersonsDTO indvMedPersonSpouse;
	private List<IndvMediclaimInsuredPersonsDTO> indvMedPersonChildList;

	private String annualPremium;
	private String outputProposalNumber;
	private String policySystemId;
	private String serviceTax;
	private String premiumWithoutServiceTax;
	private String familyDiscountPerc;
	private boolean isUserloggedIn;
	private String paymentType;
	
	private UserDTO personalDetailsUserDTO;
	private UserDTO createdByUserDTO;
	private UserDTO updatedByUserDTO;
	
	
	private byte[] insuredPhoto;
	private String spousePhoto;
	private List<String> childPhotoList;
	
	public String getIsOiclPolicy() {
		return isOiclPolicy;
	}
	public void setIsOiclPolicy(String isOiclPolicy) {
		this.isOiclPolicy = isOiclPolicy;
	}
	public String getIsRenewRecord() {
		return isRenewRecord;
	}
	public void setIsRenewRecord(String isRenewRecord) {
		this.isRenewRecord = isRenewRecord;
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
	public OiclBranchDTO getOiclBranchDTO() {
		return OiclBranchDTO;
	}
	public void setOiclBranchDTO(OiclBranchDTO oiclBranchDTO) {
		OiclBranchDTO = oiclBranchDTO;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getHaveInsuredEntireFamily() {
		return haveInsuredEntireFamily;
	}
	public void setHaveInsuredEntireFamily(String haveInsuredEntireFamily) {
		this.haveInsuredEntireFamily = haveInsuredEntireFamily;
	}
	public String getPhysicianAddress() {
		return physicianAddress;
	}
	public void setPhysicianAddress(String physicianAddress) {
		this.physicianAddress = physicianAddress;
	}
	public String getPhysicianName() {
		return physicianName;
	}
	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}
	public String getWantTpaService() {
		return wantTpaService;
	}
	public void setWantTpaService(String wantTpaService) {
		this.wantTpaService = wantTpaService;
	}
	public String getDoesAgreeWithFinalDeclaration() {
		return doesAgreeWithFinalDeclaration;
	}
	public void setDoesAgreeWithFinalDeclaration(
			String doesAgreeWithFinalDeclaration) {
		this.doesAgreeWithFinalDeclaration = doesAgreeWithFinalDeclaration;
	}
	public IndvMediclaimInsuredPersonsDTO getIndvMedPersonSelf() {
		return indvMedPersonSelf;
	}
	public void setIndvMedPersonSelf(
			IndvMediclaimInsuredPersonsDTO indvMedPersonSelf) {
		this.indvMedPersonSelf = indvMedPersonSelf;
	}
	public IndvMediclaimInsuredPersonsDTO getIndvMedPersonSpouse() {
		return indvMedPersonSpouse;
	}
	public void setIndvMedPersonSpouse(
			IndvMediclaimInsuredPersonsDTO indvMedPersonSpouse) {
		this.indvMedPersonSpouse = indvMedPersonSpouse;
	}
	public List<IndvMediclaimInsuredPersonsDTO> getIndvMedPersonChildList() {
		return indvMedPersonChildList;
	}
	public void setIndvMedPersonChildList(
			List<IndvMediclaimInsuredPersonsDTO> indvMedPersonChildList) {
		this.indvMedPersonChildList = indvMedPersonChildList;
	}
	public String getAnnualPremium() {
		return annualPremium;
	}
	public void setAnnualPremium(String annualPremium) {
		this.annualPremium = annualPremium;
	}
	public String getOutputProposalNumber() {
		return outputProposalNumber;
	}
	public void setOutputProposalNumber(String outputProposalNumber) {
		this.outputProposalNumber = outputProposalNumber;
	}
	public String getPolicySystemId() {
		return policySystemId;
	}
	public void setPolicySystemId(String policySystemId) {
		this.policySystemId = policySystemId;
	}
	public String getServiceTax() {
		return serviceTax;
	}
	public void setServiceTax(String serviceTax) {
		this.serviceTax = serviceTax;
	}
	public String getPremiumWithoutServiceTax() {
		return premiumWithoutServiceTax;
	}
	public void setPremiumWithoutServiceTax(String premiumWithoutServiceTax) {
		this.premiumWithoutServiceTax = premiumWithoutServiceTax;
	}
	public String getFamilyDiscountPerc() {
		return familyDiscountPerc;
	}
	public void setFamilyDiscountPerc(String familyDiscountPerc) {
		this.familyDiscountPerc = familyDiscountPerc;
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
	public SumInsuredDTO getSumInsuredDTO() {
		return sumInsuredDTO;
	}
	public void setSumInsuredDTO(SumInsuredDTO sumInsuredDTO) {
		this.sumInsuredDTO = sumInsuredDTO;
	}

	public String getSpousePhoto() {
		return spousePhoto;
	}
	public void setSpousePhoto(String spousePhoto) {
		this.spousePhoto = spousePhoto;
	}
	public List<String> getChildPhotoList() {
		return childPhotoList;
	}
	public void setChildPhotoList(List<String> childPhotoList) {
		this.childPhotoList = childPhotoList;
	}
	public byte[] getInsuredPhoto() {
		return insuredPhoto;
	}
	public void setInsuredPhoto(byte[] insuredPhoto) {
		this.insuredPhoto = insuredPhoto;
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
