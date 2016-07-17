package com.dto;

import java.util.List;

public class HappyFamilyFloaterPolicyDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4172107288172909102L;

	private Character isRenewRecord;
	private Character isOiclPolicy;
	private OiclBranchDTO oiclBranchDTO;
	private String startDate;
	private String endDate;
	private String panNumber;
	private HappyFamilyFloaterPolicyPlansDTO happyFamilyFloaterPolicyPlansDTO;
	private HappyFamilyFloaterPolicySumInsuredDTO happyFamilyFloaterPolicySumInsuredDTO;
	private String doesAgreeWithFinalDeclaration;
	private String physicianName;
	private String physicianAddress;
	private String wantTpaService;
	private String address;
	private String insuredName;

	private HappyFamilyFloaterPolicyPersonsDTO hffDetailsSelf;
	private HappyFamilyFloaterPolicyPersonsDTO hffDetailsForSpouse;
	private HappyFamilyFloaterPolicyPersonsDTO hffDetailsForFather;
	private HappyFamilyFloaterPolicyPersonsDTO hffDetailsForMother;
	private HappyFamilyFloaterPolicyPersonsDTO hffDetailsForFatherInLaw;
	private HappyFamilyFloaterPolicyPersonsDTO hffDetailsForMotherInLaw;
	private List<HappyFamilyFloaterPolicyPersonsDTO> hffDetailsForChildrenList;
	
	private String totalPremium;
	private String premium;
	private String serviceTax;
	private String proposalNumber;
	private String policySysId;
	private boolean isUserloggedIn;
	private String paymentType;
	
	private UserDTO personalDetailsUserDTO;
	private UserDTO createdByUserDTO;
	private UserDTO updatedByUserDTO;
	
	public Character getIsRenewRecord() {
		return isRenewRecord;
	}
	public void setIsRenewRecord(Character isRenewRecord) {
		this.isRenewRecord = isRenewRecord;
	}
	public Character getIsOiclPolicy() {
		return isOiclPolicy;
	}
	public void setIsOiclPolicy(Character isOiclPolicy) {
		this.isOiclPolicy = isOiclPolicy;
	}
	public OiclBranchDTO getOiclBranchDTO() {
		return oiclBranchDTO;
	}
	public void setOiclBranchDTO(OiclBranchDTO oiclBranchDTO) {
		this.oiclBranchDTO = oiclBranchDTO;
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
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public HappyFamilyFloaterPolicyPlansDTO getHappyFamilyFloaterPolicyPlansDTO() {
		return happyFamilyFloaterPolicyPlansDTO;
	}
	public void setHappyFamilyFloaterPolicyPlansDTO(
			HappyFamilyFloaterPolicyPlansDTO happyFamilyFloaterPolicyPlansDTO) {
		this.happyFamilyFloaterPolicyPlansDTO = happyFamilyFloaterPolicyPlansDTO;
	}
	public HappyFamilyFloaterPolicySumInsuredDTO getHappyFamilyFloaterPolicySumInsuredDTO() {
		return happyFamilyFloaterPolicySumInsuredDTO;
	}
	public void setHappyFamilyFloaterPolicySumInsuredDTO(
			HappyFamilyFloaterPolicySumInsuredDTO happyFamilyFloaterPolicySumInsuredDTO) {
		this.happyFamilyFloaterPolicySumInsuredDTO = happyFamilyFloaterPolicySumInsuredDTO;
	}
	public String getDoesAgreeWithFinalDeclaration() {
		return doesAgreeWithFinalDeclaration;
	}
	public void setDoesAgreeWithFinalDeclaration(
			String doesAgreeWithFinalDeclaration) {
		this.doesAgreeWithFinalDeclaration = doesAgreeWithFinalDeclaration;
	}
	public String getPhysicianName() {
		return physicianName;
	}
	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}
	public String getPhysicianAddress() {
		return physicianAddress;
	}
	public void setPhysicianAddress(String physicianAddress) {
		this.physicianAddress = physicianAddress;
	}
	public String getWantTpaService() {
		return wantTpaService;
	}
	public void setWantTpaService(String wantTpaService) {
		this.wantTpaService = wantTpaService;
	}
	public HappyFamilyFloaterPolicyPersonsDTO getHffDetailsSelf() {
		return hffDetailsSelf;
	}
	public void setHffDetailsSelf(HappyFamilyFloaterPolicyPersonsDTO hffDetailsSelf) {
		this.hffDetailsSelf = hffDetailsSelf;
	}
	public HappyFamilyFloaterPolicyPersonsDTO getHffDetailsForSpouse() {
		return hffDetailsForSpouse;
	}
	public void setHffDetailsForSpouse(
			HappyFamilyFloaterPolicyPersonsDTO hffDetailsForSpouse) {
		this.hffDetailsForSpouse = hffDetailsForSpouse;
	}
	public HappyFamilyFloaterPolicyPersonsDTO getHffDetailsForFather() {
		return hffDetailsForFather;
	}
	public void setHffDetailsForFather(
			HappyFamilyFloaterPolicyPersonsDTO hffDetailsForFather) {
		this.hffDetailsForFather = hffDetailsForFather;
	}
	public HappyFamilyFloaterPolicyPersonsDTO getHffDetailsForMother() {
		return hffDetailsForMother;
	}
	public void setHffDetailsForMother(
			HappyFamilyFloaterPolicyPersonsDTO hffDetailsForMother) {
		this.hffDetailsForMother = hffDetailsForMother;
	}
	public HappyFamilyFloaterPolicyPersonsDTO getHffDetailsForFatherInLaw() {
		return hffDetailsForFatherInLaw;
	}
	public void setHffDetailsForFatherInLaw(
			HappyFamilyFloaterPolicyPersonsDTO hffDetailsForFatherInLaw) {
		this.hffDetailsForFatherInLaw = hffDetailsForFatherInLaw;
	}
	public HappyFamilyFloaterPolicyPersonsDTO getHffDetailsForMotherInLaw() {
		return hffDetailsForMotherInLaw;
	}
	public void setHffDetailsForMotherInLaw(
			HappyFamilyFloaterPolicyPersonsDTO hffDetailsForMotherInLaw) {
		this.hffDetailsForMotherInLaw = hffDetailsForMotherInLaw;
	}
	public List<HappyFamilyFloaterPolicyPersonsDTO> getHffDetailsForChildrenList() {
		return hffDetailsForChildrenList;
	}
	public void setHffDetailsForChildrenList(
			List<HappyFamilyFloaterPolicyPersonsDTO> hffDetailsForChildrenList) {
		this.hffDetailsForChildrenList = hffDetailsForChildrenList;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getTotalPremium() {
		return totalPremium;
	}
	public void setTotalPremium(String totalPremium) {
		this.totalPremium = totalPremium;
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
