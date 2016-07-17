package com.dto;

public class OverseasMediclaimDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3151742185541849861L;
	private String isOiclPolicy;
	private String isRenewRecord;
	private OiclBranchDTO OiclBranchDTO;
	
	private String insuredName;
	private String insuredAddress;
	private String dateOfBirth;
	private GenderDTO genderDTO;
	private OccupationDTO occupationDTO;
	private String countriesOfVisit;
	private OverseasMediclaimPlansDTO overseasMediclaimPlansDTO;
	private OverseasMediclaimPurposeOfVisitDTO overseasMediclaimPurposeOfVisitDTO;
	private OverseasMediclaimAssigneeRelationDTO overseasMediclaimAssigneeRelationDTO;
	private String willEngageInWinterSportsMountaineering;
	private String passportNumber;
	private String insurancePeriod;
	private String preExistingAilments;
	private String physicianName;
	private String physicianAddress;
	private String assigneeName;
	private String medicalReport;
	private String startDt;
	private String endDt;
	private String isIndianResidingInIndia;
	private String isVisitingSchengenStates;
	private String doesIncludeUsCanada;
	private String passportExpiryDate;
	private String willAvailSpecialAsianCountryPlan;
	private String annualPremium;
	private String premium;
	private String serviceTax;
	private String proposalNo;
	private String policySysId;
	private String sumInsured;
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
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public GenderDTO getGenderDTO() {
		return genderDTO;
	}
	public void setGenderDTO(GenderDTO genderDTO) {
		this.genderDTO = genderDTO;
	}
	public OccupationDTO getOccupationDTO() {
		return occupationDTO;
	}
	public void setOccupationDTO(OccupationDTO occupationDTO) {
		this.occupationDTO = occupationDTO;
	}
	public String getCountriesOfVisit() {
		return countriesOfVisit;
	}
	public void setCountriesOfVisit(String countriesOfVisit) {
		this.countriesOfVisit = countriesOfVisit;
	}
	public OverseasMediclaimPlansDTO getOverseasMediclaimPlansDTO() {
		return overseasMediclaimPlansDTO;
	}
	public void setOverseasMediclaimPlansDTO(
			OverseasMediclaimPlansDTO overseasMediclaimPlansDTO) {
		this.overseasMediclaimPlansDTO = overseasMediclaimPlansDTO;
	}
	public OverseasMediclaimPurposeOfVisitDTO getOverseasMediclaimPurposeOfVisitDTO() {
		return overseasMediclaimPurposeOfVisitDTO;
	}
	public void setOverseasMediclaimPurposeOfVisitDTO(
			OverseasMediclaimPurposeOfVisitDTO overseasMediclaimPurposeOfVisitDTO) {
		this.overseasMediclaimPurposeOfVisitDTO = overseasMediclaimPurposeOfVisitDTO;
	}
	public OverseasMediclaimAssigneeRelationDTO getOverseasMediclaimAssigneeRelationDTO() {
		return overseasMediclaimAssigneeRelationDTO;
	}
	public void setOverseasMediclaimAssigneeRelationDTO(
			OverseasMediclaimAssigneeRelationDTO overseasMediclaimAssigneeRelationDTO) {
		this.overseasMediclaimAssigneeRelationDTO = overseasMediclaimAssigneeRelationDTO;
	}
	public String getWillEngageInWinterSportsMountaineering() {
		return willEngageInWinterSportsMountaineering;
	}
	public void setWillEngageInWinterSportsMountaineering(
			String willEngageInWinterSportsMountaineering) {
		this.willEngageInWinterSportsMountaineering = willEngageInWinterSportsMountaineering;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getPreExistingAilments() {
		return preExistingAilments;
	}
	public void setPreExistingAilments(String preExistingAilments) {
		this.preExistingAilments = preExistingAilments;
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
	public String getAssigneeName() {
		return assigneeName;
	}
	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}
	public String getMedicalReport() {
		return medicalReport;
	}
	public void setMedicalReport(String medicalReport) {
		this.medicalReport = medicalReport;
	}
	public String getStartDt() {
		return startDt;
	}
	public void setStartDt(String startDt) {
		this.startDt = startDt;
	}
	public String getEndDt() {
		return endDt;
	}
	public void setEndDt(String endDt) {
		this.endDt = endDt;
	}
	public OiclBranchDTO getOiclBranchDTO() {
		return OiclBranchDTO;
	}
	public void setOiclBranchDTO(OiclBranchDTO oiclBranchDTO) {
		OiclBranchDTO = oiclBranchDTO;
	}
	public String getAnnualPremium() {
		return annualPremium;
	}
	public void setAnnualPremium(String annualPremium) {
		this.annualPremium = annualPremium;
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
	public String getProposalNo() {
		return proposalNo;
	}
	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
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
	public String getInsurancePeriod() {
		return insurancePeriod;
	}
	public void setInsurancePeriod(String insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	public String getInsuredAddress() {
		return insuredAddress;
	}
	public void setInsuredAddress(String insuredAddress) {
		this.insuredAddress = insuredAddress;
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
	public String getIsIndianResidingInIndia() {
		return isIndianResidingInIndia;
	}
	public void setIsIndianResidingInIndia(String isIndianResidingInIndia) {
		this.isIndianResidingInIndia = isIndianResidingInIndia;
	}
	public String getIsVisitingSchengenStates() {
		return isVisitingSchengenStates;
	}
	public void setIsVisitingSchengenStates(String isVisitingSchengenStates) {
		this.isVisitingSchengenStates = isVisitingSchengenStates;
	}
	public String getDoesIncludeUsCanada() {
		return doesIncludeUsCanada;
	}
	public void setDoesIncludeUsCanada(String doesIncludeUsCanada) {
		this.doesIncludeUsCanada = doesIncludeUsCanada;
	}
	public String getPassportExpiryDate() {
		return passportExpiryDate;
	}
	public void setPassportExpiryDate(String passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}
	public String getWillAvailSpecialAsianCountryPlan() {
		return willAvailSpecialAsianCountryPlan;
	}
	public void setWillAvailSpecialAsianCountryPlan(
			String willAvailSpecialAsianCountryPlan) {
		this.willAvailSpecialAsianCountryPlan = willAvailSpecialAsianCountryPlan;
	}
	public String getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}
	
}
