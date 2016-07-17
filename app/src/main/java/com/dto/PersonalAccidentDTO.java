package com.dto;

import java.util.List;

public class PersonalAccidentDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2643430210307774616L;

	private String isOiclPolicy;
	private String isRenewRecord;
	private OiclBranchDTO oiclBranchDTO;
	private String isEntireFamilyInsured;
	private String isSpouseInsured;
	private String isChildrenInsured;
	private String isParentsInsured;
	private String startDate;
	private String endDate;

	private PersonalAccidentDetailsDTO personalAccidentDetails;
	private PersonalAccidentDetailsDTO personalAccidentDetailsForSpouse;
	private PersonalAccidentDetailsDTO personalAccidentDetailsForFather;
	private PersonalAccidentDetailsDTO personalAccidentDetailsForMother;
	private PersonalAccidentDetailsDTO personalAccidentDetailsForFatherInLaw;
	private PersonalAccidentDetailsDTO personalAccidentDetailsForMotherInLaw;
	private List<PersonalAccidentDetailsDTO> personalAccidentDetailsForChildrenList;
	
	private String annualPremium;
	private String inliasProposalNoOut;
	private String inliasPolicySysId;
	private boolean isUserloggedIn;
	private String paymentType;
	
	private UserDTO personalDetailsUserDTO;
	private UserDTO createdByUserDTO;
	private UserDTO updatedByUserDTO;
	
	
	
	
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
	public OiclBranchDTO getOiclBranchDTO() {
		return oiclBranchDTO;
	}
	public void setOiclBranchDTO(OiclBranchDTO oiclBranchDTO) {
		this.oiclBranchDTO = oiclBranchDTO;
	}
	public String getIsEntireFamilyInsured() {
		return isEntireFamilyInsured;
	}
	public void setIsEntireFamilyInsured(String isEntireFamilyInsured) {
		this.isEntireFamilyInsured = isEntireFamilyInsured;
	}
	public String getIsSpouseInsured() {
		return isSpouseInsured;
	}
	public void setIsSpouseInsured(String isSpouseInsured) {
		this.isSpouseInsured = isSpouseInsured;
	}
	public String getIsChildrenInsured() {
		return isChildrenInsured;
	}
	public void setIsChildrenInsured(String isChildrenInsured) {
		this.isChildrenInsured = isChildrenInsured;
	}
	public String getIsParentsInsured() {
		return isParentsInsured;
	}
	public void setIsParentsInsured(String isParentsInsured) {
		this.isParentsInsured = isParentsInsured;
	}
	public PersonalAccidentDetailsDTO getPersonalAccidentDetails() {
		return personalAccidentDetails;
	}
	public void setPersonalAccidentDetails(
			PersonalAccidentDetailsDTO personalAccidentDetails) {
		this.personalAccidentDetails = personalAccidentDetails;
	}
	public PersonalAccidentDetailsDTO getPersonalAccidentDetailsForSpouse() {
		return personalAccidentDetailsForSpouse;
	}
	public void setPersonalAccidentDetailsForSpouse(
			PersonalAccidentDetailsDTO personalAccidentDetailsForSpouse) {
		this.personalAccidentDetailsForSpouse = personalAccidentDetailsForSpouse;
	}
	public PersonalAccidentDetailsDTO getPersonalAccidentDetailsForFather() {
		return personalAccidentDetailsForFather;
	}
	public void setPersonalAccidentDetailsForFather(
			PersonalAccidentDetailsDTO personalAccidentDetailsForFather) {
		this.personalAccidentDetailsForFather = personalAccidentDetailsForFather;
	}
	public PersonalAccidentDetailsDTO getPersonalAccidentDetailsForMother() {
		return personalAccidentDetailsForMother;
	}
	public void setPersonalAccidentDetailsForMother(
			PersonalAccidentDetailsDTO personalAccidentDetailsForMother) {
		this.personalAccidentDetailsForMother = personalAccidentDetailsForMother;
	}
	public PersonalAccidentDetailsDTO getPersonalAccidentDetailsForFatherInLaw() {
		return personalAccidentDetailsForFatherInLaw;
	}
	public void setPersonalAccidentDetailsForFatherInLaw(
			PersonalAccidentDetailsDTO personalAccidentDetailsForFatherInLaw) {
		this.personalAccidentDetailsForFatherInLaw = personalAccidentDetailsForFatherInLaw;
	}
	public PersonalAccidentDetailsDTO getPersonalAccidentDetailsForMotherInLaw() {
		return personalAccidentDetailsForMotherInLaw;
	}
	public void setPersonalAccidentDetailsForMotherInLaw(
			PersonalAccidentDetailsDTO personalAccidentDetailsForMotherInLaw) {
		this.personalAccidentDetailsForMotherInLaw = personalAccidentDetailsForMotherInLaw;
	}
	public List<PersonalAccidentDetailsDTO> getPersonalAccidentDetailsForChildrenList() {
		return personalAccidentDetailsForChildrenList;
	}
	public void setPersonalAccidentDetailsForChildrenList(
			List<PersonalAccidentDetailsDTO> personalAccidentDetailsForChildrenList) {
		this.personalAccidentDetailsForChildrenList = personalAccidentDetailsForChildrenList;
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
	public String getAnnualPremium() {
		return annualPremium;
	}
	public void setAnnualPremium(String annualPremium) {
		this.annualPremium = annualPremium;
	}
	public String getInliasProposalNoOut() {
		return inliasProposalNoOut;
	}
	public void setInliasProposalNoOut(String inliasProposalNoOut) {
		this.inliasProposalNoOut = inliasProposalNoOut;
	}
	public String getInliasPolicySysId() {
		return inliasPolicySysId;
	}
	public void setInliasPolicySysId(String inliasPolicySysId) {
		this.inliasPolicySysId = inliasPolicySysId;
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
