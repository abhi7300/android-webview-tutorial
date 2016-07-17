package com.dto;

public class MotorInsurancePremiumDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5301114670063510658L;
	private long motorPremiumId;
    private MotorManufacturerDTO motorManufacturerDTO;
	
    private MotorPolicyDiscountsMasterOrganizationsDTO motorPolicyDiscountsMasterOrganizationsDTO;
    private MotorLovZoneDTO motorLovZoneDTO;
    private ExtendedGeographiesDTO extendedGeographiesDTO;
    private MotorFuelTypesDTO motorFuelTypesDTO;
    private MotorInsuranceBasicsDTO motorInsuranceBasicsDTO;
    private HigherDeductAmountDTO higherDeductAmountDTO;
    private String vehiclFirstRegistDate;
    private String purchaseDate;
    private String registeringAuthorityId;
    private String isNonConventionalFuel;
    private String isGeoExtRequired;
    private String isHigherDeductible;
    private String isMemberAai = "";
    private String aaiRegistrationNo;
    private String isAntiTheftFitted = "";
    private String antiTheftName;
    private String antiTheftAuthority;
    private String antiTheftPrice;
    private String isDriverLegalLiability = "";
    private String driverCounts = "";
    private String isEmployeeLegalLiability = "";
    private String employeeCounts = "";
    private String isPaUnnamed = "";
    private String paPersonCounts = "";
    private String paCsi="";
    private String nonElectricalAccessories = "";
    private String electricalAccessories = "";
    private String sideCarAccessories = "";
    private String cngAccessories;
    private String lpgAccessories;
    private String otherAccessories;
    private String premium;
    private String sumInsured = "";
    private String proposalNumber = "";
    private String transactionId;
    private String inliasVehicleCode;
    private String odPremium;
    private String tpPremium;
    private Character entitledToNcb;
    private String ncbPercentage = "";
    private String ncbPercentageInlias;
    private String ncbDiscountAmount;
    private Character claimLodgedInLastThreeYears;
    private String serviceTax;
    private String nonElectricalAccessoriesDesc = "";
    private String electricalAccessoriesDesc = "";
    private String cngLpgAccessoriesDesc;
    private String sideCarAccessoriesDesc = "";
    private String isCngRegistered = "";
    private String isOiclPolicy;
    private String isNcbDeclarationAgreed;
    private String mouOrgName = "";
    private String mouOrgMembershipNumber = "";
    private String mouOrgDeclarationIndicator;
    
    private String antiTheftDiscountCode = "";
 	private String aaiDiscountCode = "";
 	private String cngAccessoryCode = "";
 	private String electricalAccessoryCode = "";
 	private String driverCoverCode = "";
 	private String employeeCoverCode = "";
 	private String lpgAccessoryCode = "";
 	private String nonElectricalAccessoryCode = "";
 	private String paCoverCode = "";
 	private String sideCarAccessoryCode = "";
 	private String idvSmiCode = "";
 	private String electricalAccessoriesValue = "";
 	private String nonElectricalAccessoriesValue = "";
 	private String isExistingVehicle;
 	private String CNGAccessoriesValue = "";
 	private String isCNGRegisteredWithRto;
 	private String sideCarAccessoriesValue = "";      
    private String POLICY_SYS_ID;   
    private String ERROR_CODE;
    
	public long getMotorPremiumId() {
		return motorPremiumId;
	}
	public void setMotorPremiumId(long motorPremiumId) {
		this.motorPremiumId = motorPremiumId;
	}
	public MotorPolicyDiscountsMasterOrganizationsDTO getMotorPolicyDiscountsMasterOrganizationsDTO() {
		return motorPolicyDiscountsMasterOrganizationsDTO;
	}
	public void setMotorPolicyDiscountsMasterOrganizationsDTO(
			MotorPolicyDiscountsMasterOrganizationsDTO motorPolicyDiscountsMasterOrganizationsDTO) {
		this.motorPolicyDiscountsMasterOrganizationsDTO = motorPolicyDiscountsMasterOrganizationsDTO;
	}
	public MotorLovZoneDTO getMotorLovZoneDTO() {
		return motorLovZoneDTO;
	}
	public void setMotorLovZoneDTO(MotorLovZoneDTO motorLovZoneDTO) {
		this.motorLovZoneDTO = motorLovZoneDTO;
	}
	public ExtendedGeographiesDTO getExtendedGeographiesDTO() {
		return extendedGeographiesDTO;
	}
	public void setExtendedGeographiesDTO(
			ExtendedGeographiesDTO extendedGeographiesDTO) {
		this.extendedGeographiesDTO = extendedGeographiesDTO;
	}
	public MotorFuelTypesDTO getMotorFuelTypesDTO() {
		return motorFuelTypesDTO;
	}
	public void setMotorFuelTypesDTO(MotorFuelTypesDTO motorFuelTypesDTO) {
		this.motorFuelTypesDTO = motorFuelTypesDTO;
	}
	public MotorManufacturerDTO getMotorManufacturerDTO() {
		return motorManufacturerDTO;
	}
	public void setMotorManufacturerDTO(MotorManufacturerDTO motorManufacturerDTO) {
		this.motorManufacturerDTO = motorManufacturerDTO;
	}
	public MotorInsuranceBasicsDTO getMotorInsuranceBasicsDTO() {
		return motorInsuranceBasicsDTO;
	}
	public void setMotorInsuranceBasicsDTO(
			MotorInsuranceBasicsDTO motorInsuranceBasicsDTO) {
		this.motorInsuranceBasicsDTO = motorInsuranceBasicsDTO;
	}
	public HigherDeductAmountDTO getHigherDeductAmountDTO() {
		return higherDeductAmountDTO;
	}
	public void setHigherDeductAmountDTO(HigherDeductAmountDTO higherDeductAmountDTO) {
		this.higherDeductAmountDTO = higherDeductAmountDTO;
	}
	public String getVehiclFirstRegistDate() {
		return vehiclFirstRegistDate;
	}
	public void setVehiclFirstRegistDate(String vehiclFirstRegistDate) {
		this.vehiclFirstRegistDate = vehiclFirstRegistDate;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getRegisteringAuthorityId() {
		return registeringAuthorityId;
	}
	public void setRegisteringAuthorityId(String registeringAuthorityId) {
		this.registeringAuthorityId = registeringAuthorityId;
	}
	public String getIsNonConventionalFuel() {
		return isNonConventionalFuel;
	}
	public void setIsNonConventionalFuel(String isNonConventionalFuel) {
		this.isNonConventionalFuel = isNonConventionalFuel;
	}
	public String getIsGeoExtRequired() {
		return isGeoExtRequired;
	}
	public void setIsGeoExtRequired(String isGeoExtRequired) {
		this.isGeoExtRequired = isGeoExtRequired;
	}
	public String getIsHigherDeductible() {
		return isHigherDeductible;
	}
	public void setIsHigherDeductible(String isHigherDeductible) {
		this.isHigherDeductible = isHigherDeductible;
	}
	public String getIsMemberAai() {
		return isMemberAai;
	}
	public void setIsMemberAai(String isMemberAai) {
		this.isMemberAai = isMemberAai;
	}
	public String getAaiRegistrationNo() {
		return aaiRegistrationNo;
	}
	public void setAaiRegistrationNo(String aaiRegistrationNo) {
		this.aaiRegistrationNo = aaiRegistrationNo;
	}
	public String getIsAntiTheftFitted() {
		return isAntiTheftFitted;
	}
	public void setIsAntiTheftFitted(String isAntiTheftFitted) {
		this.isAntiTheftFitted = isAntiTheftFitted;
	}
	public String getAntiTheftName() {
		return antiTheftName;
	}
	public void setAntiTheftName(String antiTheftName) {
		this.antiTheftName = antiTheftName;
	}
	public String getAntiTheftAuthority() {
		return antiTheftAuthority;
	}
	public void setAntiTheftAuthority(String antiTheftAuthority) {
		this.antiTheftAuthority = antiTheftAuthority;
	}
	public String getAntiTheftPrice() {
		return antiTheftPrice;
	}
	public void setAntiTheftPrice(String antiTheftPrice) {
		this.antiTheftPrice = antiTheftPrice;
	}
	public String getIsDriverLegalLiability() {
		return isDriverLegalLiability;
	}
	public void setIsDriverLegalLiability(String isDriverLegalLiability) {
		this.isDriverLegalLiability = isDriverLegalLiability;
	}
	public String getDriverCounts() {
		return driverCounts;
	}
	public void setDriverCounts(String driverCounts) {
		this.driverCounts = driverCounts;
	}
	public String getIsEmployeeLegalLiability() {
		return isEmployeeLegalLiability;
	}
	public void setIsEmployeeLegalLiability(String isEmployeeLegalLiability) {
		this.isEmployeeLegalLiability = isEmployeeLegalLiability;
	}
	public String getEmployeeCounts() {
		return employeeCounts;
	}
	public void setEmployeeCounts(String employeeCounts) {
		this.employeeCounts = employeeCounts;
	}
	public String getIsPaUnnamed() {
		return isPaUnnamed;
	}
	public void setIsPaUnnamed(String isPaUnnamed) {
		this.isPaUnnamed = isPaUnnamed;
	}
	public String getPaPersonCounts() {
		return paPersonCounts;
	}
	public void setPaPersonCounts(String paPersonCounts) {
		this.paPersonCounts = paPersonCounts;
	}
	public String getPaCsi() {
		return paCsi;
	}
	public void setPaCsi(String paCsi) {
		this.paCsi = paCsi;
	}
	public String getNonElectricalAccessories() {
		return nonElectricalAccessories;
	}
	public void setNonElectricalAccessories(String nonElectricalAccessories) {
		this.nonElectricalAccessories = nonElectricalAccessories;
	}
	public String getElectricalAccessories() {
		return electricalAccessories;
	}
	public void setElectricalAccessories(String electricalAccessories) {
		this.electricalAccessories = electricalAccessories;
	}
	public String getSideCarAccessories() {
		return sideCarAccessories;
	}
	public void setSideCarAccessories(String sideCarAccessories) {
		this.sideCarAccessories = sideCarAccessories;
	}
	public String getCngAccessories() {
		return cngAccessories;
	}
	public void setCngAccessories(String cngAccessories) {
		this.cngAccessories = cngAccessories;
	}
	public String getLpgAccessories() {
		return lpgAccessories;
	}
	public void setLpgAccessories(String lpgAccessories) {
		this.lpgAccessories = lpgAccessories;
	}
	public String getOtherAccessories() {
		return otherAccessories;
	}
	public void setOtherAccessories(String otherAccessories) {
		this.otherAccessories = otherAccessories;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
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
	public String getInliasVehicleCode() {
		return inliasVehicleCode;
	}
	public void setInliasVehicleCode(String inliasVehicleCode) {
		this.inliasVehicleCode = inliasVehicleCode;
	}
	public String getOdPremium() {
		return odPremium;
	}
	public void setOdPremium(String odPremium) {
		this.odPremium = odPremium;
	}
	public String getTpPremium() {
		return tpPremium;
	}
	public void setTpPremium(String tpPremium) {
		this.tpPremium = tpPremium;
	}
	public Character getEntitledToNcb() {
		return entitledToNcb;
	}
	public void setEntitledToNcb(Character entitledToNcb) {
		this.entitledToNcb = entitledToNcb;
	}
	public String getNcbPercentage() {
		return ncbPercentage;
	}
	public void setNcbPercentage(String ncbPercentage) {
		this.ncbPercentage = ncbPercentage;
	}
	public String getNcbPercentageInlias() {
		return ncbPercentageInlias;
	}
	public void setNcbPercentageInlias(String ncbPercentageInlias) {
		this.ncbPercentageInlias = ncbPercentageInlias;
	}
	public String getNcbDiscountAmount() {
		return ncbDiscountAmount;
	}
	public void setNcbDiscountAmount(String ncbDiscountAmount) {
		this.ncbDiscountAmount = ncbDiscountAmount;
	}
	public Character getClaimLodgedInLastThreeYears() {
		return claimLodgedInLastThreeYears;
	}
	public void setClaimLodgedInLastThreeYears(Character claimLodgedInLastThreeYears) {
		this.claimLodgedInLastThreeYears = claimLodgedInLastThreeYears;
	}
	public String getServiceTax() {
		return serviceTax;
	}
	public void setServiceTax(String serviceTax) {
		this.serviceTax = serviceTax;
	}
	public String getNonElectricalAccessoriesDesc() {
		return nonElectricalAccessoriesDesc;
	}
	public void setNonElectricalAccessoriesDesc(String nonElectricalAccessoriesDesc) {
		this.nonElectricalAccessoriesDesc = nonElectricalAccessoriesDesc;
	}
	public String getElectricalAccessoriesDesc() {
		return electricalAccessoriesDesc;
	}
	public void setElectricalAccessoriesDesc(String electricalAccessoriesDesc) {
		this.electricalAccessoriesDesc = electricalAccessoriesDesc;
	}
	public String getCngLpgAccessoriesDesc() {
		return cngLpgAccessoriesDesc;
	}
	public void setCngLpgAccessoriesDesc(String cngLpgAccessoriesDesc) {
		this.cngLpgAccessoriesDesc = cngLpgAccessoriesDesc;
	}
	public String getSideCarAccessoriesDesc() {
		return sideCarAccessoriesDesc;
	}
	public void setSideCarAccessoriesDesc(String sideCarAccessoriesDesc) {
		this.sideCarAccessoriesDesc = sideCarAccessoriesDesc;
	}
	public String getIsCngRegistered() {
		return isCngRegistered;
	}
	public void setIsCngRegistered(String isCngRegistered) {
		this.isCngRegistered = isCngRegistered;
	}
	public String getIsOiclPolicy() {
		return isOiclPolicy;
	}
	public void setIsOiclPolicy(String isOiclPolicy) {
		this.isOiclPolicy = isOiclPolicy;
	}
	public String getIsNcbDeclarationAgreed() {
		return isNcbDeclarationAgreed;
	}
	public void setIsNcbDeclarationAgreed(String isNcbDeclarationAgreed) {
		this.isNcbDeclarationAgreed = isNcbDeclarationAgreed;
	}
	public String getMouOrgName() {
		return mouOrgName;
	}
	public void setMouOrgName(String mouOrgName) {
		this.mouOrgName = mouOrgName;
	}
	public String getMouOrgMembershipNumber() {
		return mouOrgMembershipNumber;
	}
	public void setMouOrgMembershipNumber(String mouOrgMembershipNumber) {
		this.mouOrgMembershipNumber = mouOrgMembershipNumber;
	}
	public String getMouOrgDeclarationIndicator() {
		return mouOrgDeclarationIndicator;
	}
	public void setMouOrgDeclarationIndicator(String mouOrgDeclarationIndicator) {
		this.mouOrgDeclarationIndicator = mouOrgDeclarationIndicator;
	}
	public String getAntiTheftDiscountCode() {
		return antiTheftDiscountCode;
	}
	public void setAntiTheftDiscountCode(String antiTheftDiscountCode) {
		this.antiTheftDiscountCode = antiTheftDiscountCode;
	}
	public String getAaiDiscountCode() {
		return aaiDiscountCode;
	}
	public void setAaiDiscountCode(String aaiDiscountCode) {
		this.aaiDiscountCode = aaiDiscountCode;
	}
	public String getCngAccessoryCode() {
		return cngAccessoryCode;
	}
	public void setCngAccessoryCode(String cngAccessoryCode) {
		this.cngAccessoryCode = cngAccessoryCode;
	}
	public String getElectricalAccessoryCode() {
		return electricalAccessoryCode;
	}
	public void setElectricalAccessoryCode(String electricalAccessoryCode) {
		this.electricalAccessoryCode = electricalAccessoryCode;
	}
	public String getDriverCoverCode() {
		return driverCoverCode;
	}
	public void setDriverCoverCode(String driverCoverCode) {
		this.driverCoverCode = driverCoverCode;
	}
	public String getEmployeeCoverCode() {
		return employeeCoverCode;
	}
	public void setEmployeeCoverCode(String employeeCoverCode) {
		this.employeeCoverCode = employeeCoverCode;
	}
	public String getLpgAccessoryCode() {
		return lpgAccessoryCode;
	}
	public void setLpgAccessoryCode(String lpgAccessoryCode) {
		this.lpgAccessoryCode = lpgAccessoryCode;
	}
	public String getNonElectricalAccessoryCode() {
		return nonElectricalAccessoryCode;
	}
	public void setNonElectricalAccessoryCode(String nonElectricalAccessoryCode) {
		this.nonElectricalAccessoryCode = nonElectricalAccessoryCode;
	}
	public String getPaCoverCode() {
		return paCoverCode;
	}
	public void setPaCoverCode(String paCoverCode) {
		this.paCoverCode = paCoverCode;
	}
	public String getSideCarAccessoryCode() {
		return sideCarAccessoryCode;
	}
	public void setSideCarAccessoryCode(String sideCarAccessoryCode) {
		this.sideCarAccessoryCode = sideCarAccessoryCode;
	}
	public String getIdvSmiCode() {
		return idvSmiCode;
	}
	public void setIdvSmiCode(String idvSmiCode) {
		this.idvSmiCode = idvSmiCode;
	}
	public String getElectricalAccessoriesValue() {
		return electricalAccessoriesValue;
	}
	public void setElectricalAccessoriesValue(String electricalAccessoriesValue) {
		this.electricalAccessoriesValue = electricalAccessoriesValue;
	}
	public String getNonElectricalAccessoriesValue() {
		return nonElectricalAccessoriesValue;
	}
	public void setNonElectricalAccessoriesValue(
			String nonElectricalAccessoriesValue) {
		this.nonElectricalAccessoriesValue = nonElectricalAccessoriesValue;
	}
	public String getIsExistingVehicle() {
		return isExistingVehicle;
	}
	public void setIsExistingVehicle(String isExistingVehicle) {
		this.isExistingVehicle = isExistingVehicle;
	}
	public String getCNGAccessoriesValue() {
		return CNGAccessoriesValue;
	}
	public void setCNGAccessoriesValue(String cNGAccessoriesValue) {
		CNGAccessoriesValue = cNGAccessoriesValue;
	}
	public String getIsCNGRegisteredWithRto() {
		return isCNGRegisteredWithRto;
	}
	public void setIsCNGRegisteredWithRto(String isCNGRegisteredWithRto) {
		this.isCNGRegisteredWithRto = isCNGRegisteredWithRto;
	}
	public String getSideCarAccessoriesValue() {
		return sideCarAccessoriesValue;
	}
	public void setSideCarAccessoriesValue(String sideCarAccessoriesValue) {
		this.sideCarAccessoriesValue = sideCarAccessoriesValue;
	}
	public String getPOLICY_SYS_ID() {
		return POLICY_SYS_ID;
	}
	public void setPOLICY_SYS_ID(String pOLICY_SYS_ID) {
		POLICY_SYS_ID = pOLICY_SYS_ID;
	}
	public String getERROR_CODE() {
		return ERROR_CODE;
	}
	public void setERROR_CODE(String eRROR_CODE) {
		ERROR_CODE = eRROR_CODE;
	}

}
