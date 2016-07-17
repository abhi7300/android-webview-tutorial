package com.dto;

import java.util.List;

public class HouseholderPolicyDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7413579211839443184L;

	private String isOiclPolicy;
	private String isRenewRecord;
	private String initialDeclarationResponse;
	private String finalDeclarationResponse;
	private OiclBranchDTO OiclBranchDTO;
	private String nameOfProposer;
	private String correspondenceAddress;
	private CityDTO cityByCorpCityId;
	private PincodeDTO pincodeByCorpPinId;
	private String correspondenceTelephone;
	private String correspondenceEmail;
	private String premiseAddress;
	private CityDTO cityByPremCityId;
	private PincodeDTO pincodeByPremPinId;
	private String periodOfInsuranceFrom;
	private String periodOfInsuranceTo;
	private String isPremiseOwned;
	private boolean isUserloggedIn;
	private String paymentType;
	
	private UserDTO personalDetailsUserDTO;
	
	private UserDTO createdByUserDTO;
	private UserDTO updatedByUserDTO;

	/**************** Section 1A *************************/
	private String building;
	private String fittingsFixtures;
	private String boundaryWalls;
	private String otherProperty;
	/**************** Section 1A *************************/

	/**************** Section 1B *************************/
	private String furnishings;
	private String clothings;
	private String kitchenAppliances;
	private String miscellaneous;
	private List<ElectricalItemDetailsDTO> electricalItemDetailsDTOList;
	/**************** Section 1B *************************/

	/**************** Section 2 *************************/
	private String isHousebreaking;
	private String houseBreakingFurnishing;
	private String houseBreakingClothing;
	private String houseBreakingKitchen;
	private String houseBreakingMisc;
	private List<ElectricalItemDetailsDTO> section2electricalItemDetailsDTOList;
	/**************** Section 2 *************************/

	/**************** Section 3 *************************/
	private String isJewellery;
	private List<HouseHolderJewelleryDTO> houseHolderJewelleryDTOList;
	/**************** Section 3 *************************/

	/**************** Section 4: Plate glass section *************************/
	private String isPlateglass;
	private List<PlateGlassDTO> plateGlassDTOList;
	/**************** Section 4: Plate glass section *************************/

	/**************** Section 5: Electrical equipments section *************************/
	private String isElectricalEquipment;
	private List<ElectricalItemDetailsDTO> section5ElectricalItemDetailsDTOList;
	/**************** Section 5: Electrical equipments section *************************/

	/**************** Section 6: Pedal cycle section *************************/
	private String isPedalcycle;
	private List<PedalCycleDTO> householderPedalCyclesDTOList;
	/**************** Section 6: Pedal cycle section *************************/

	/**************** Section 7: Baggage *************************/
	private String isBaggage;
	private String baggageDescription;
	private String baggageSumInsured;
	/**************** Section 7: Baggage *************************/

	/**************** Personal Accident section *************************/
	private String isPersonalAccident;
	private List<HHPPersonalAccidentDTO> hhpPersonalAccidentDTOList;
	/**************** Personal Accident section *************************/

	/**************** Public Liability section *************************/
	private String isLiabilities;
	private String publicLiability;
	/**************** Public Liability section *************************/

	/**************** Workman compensation section *************************/
	private String isWorkmanCompensation;
	private List<HHPWorkmenLiabilitiesDTO> hhpWorkmenLiabilitiesDTOList;

	/**************** Workman compensation section *************************/

	
	private String annualPremium;
	private String transactionId;
	private String proposalNumber;
	private String section1aPremium;
	private String section1bPremium;
	private String section2Premium;
	private String Section3Premium;
	private String section4Premium;
	private String section5Premium;
	private String section6Premium;
	private String section7Premium;
	private String section8Premium;
	private String section9Premium;
	private String section10aPremium;
	private String section10bPremium;
	private String inliasErrorCode;
	
	
	
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

	public String getInitialDeclarationResponse() {
		return initialDeclarationResponse;
	}

	public void setInitialDeclarationResponse(String initialDeclarationResponse) {
		this.initialDeclarationResponse = initialDeclarationResponse;
	}

	public String getFinalDeclarationResponse() {
		return finalDeclarationResponse;
	}

	public void setFinalDeclarationResponse(String finalDeclarationResponse) {
		this.finalDeclarationResponse = finalDeclarationResponse;
	}

	public OiclBranchDTO getOiclBranchDTO() {
		return OiclBranchDTO;
	}

	public void setOiclBranchDTO(OiclBranchDTO oiclBranchDTO) {
		OiclBranchDTO = oiclBranchDTO;
	}

	public String getNameOfProposer() {
		return nameOfProposer;
	}

	public void setNameOfProposer(String nameOfProposer) {
		this.nameOfProposer = nameOfProposer;
	}

	public String getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(String correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	public CityDTO getCityByCorpCityId() {
		return cityByCorpCityId;
	}

	public void setCityByCorpCityId(CityDTO cityByCorpCityId) {
		this.cityByCorpCityId = cityByCorpCityId;
	}

	public PincodeDTO getPincodeByCorpPinId() {
		return pincodeByCorpPinId;
	}

	public void setPincodeByCorpPinId(PincodeDTO pincodeByCorpPinId) {
		this.pincodeByCorpPinId = pincodeByCorpPinId;
	}

	public String getCorrespondenceTelephone() {
		return correspondenceTelephone;
	}

	public void setCorrespondenceTelephone(String correspondenceTelephone) {
		this.correspondenceTelephone = correspondenceTelephone;
	}

	public String getCorrespondenceEmail() {
		return correspondenceEmail;
	}

	public void setCorrespondenceEmail(String correspondenceEmail) {
		this.correspondenceEmail = correspondenceEmail;
	}

	public String getPremiseAddress() {
		return premiseAddress;
	}

	public void setPremiseAddress(String premiseAddress) {
		this.premiseAddress = premiseAddress;
	}

	public CityDTO getCityByPremCityId() {
		return cityByPremCityId;
	}

	public void setCityByPremCityId(CityDTO cityByPremCityId) {
		this.cityByPremCityId = cityByPremCityId;
	}

	public PincodeDTO getPincodeByPremPinId() {
		return pincodeByPremPinId;
	}

	public void setPincodeByPremPinId(PincodeDTO pincodeByPremPinId) {
		this.pincodeByPremPinId = pincodeByPremPinId;
	}

	public String getPeriodOfInsuranceFrom() {
		return periodOfInsuranceFrom;
	}

	public void setPeriodOfInsuranceFrom(String periodOfInsuranceFrom) {
		this.periodOfInsuranceFrom = periodOfInsuranceFrom;
	}

	public String getPeriodOfInsuranceTo() {
		return periodOfInsuranceTo;
	}

	public void setPeriodOfInsuranceTo(String periodOfInsuranceTo) {
		this.periodOfInsuranceTo = periodOfInsuranceTo;
	}

	public String getIsPremiseOwned() {
		return isPremiseOwned;
	}

	public void setIsPremiseOwned(String isPremiseOwned) {
		this.isPremiseOwned = isPremiseOwned;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getFittingsFixtures() {
		return fittingsFixtures;
	}

	public void setFittingsFixtures(String fittingsFixtures) {
		this.fittingsFixtures = fittingsFixtures;
	}

	public String getBoundaryWalls() {
		return boundaryWalls;
	}

	public void setBoundaryWalls(String boundaryWalls) {
		this.boundaryWalls = boundaryWalls;
	}

	public String getOtherProperty() {
		return otherProperty;
	}

	public void setOtherProperty(String otherProperty) {
		this.otherProperty = otherProperty;
	}

	public String getFurnishings() {
		return furnishings;
	}

	public void setFurnishings(String furnishings) {
		this.furnishings = furnishings;
	}

	public String getClothings() {
		return clothings;
	}

	public void setClothings(String clothings) {
		this.clothings = clothings;
	}

	public String getKitchenAppliances() {
		return kitchenAppliances;
	}

	public void setKitchenAppliances(String kitchenAppliances) {
		this.kitchenAppliances = kitchenAppliances;
	}

	public String getMiscellaneous() {
		return miscellaneous;
	}

	public void setMiscellaneous(String miscellaneous) {
		this.miscellaneous = miscellaneous;
	}


	public String getHouseBreakingFurnishing() {
		return houseBreakingFurnishing;
	}

	public void setHouseBreakingFurnishing(String houseBreakingFurnishing) {
		this.houseBreakingFurnishing = houseBreakingFurnishing;
	}

	public String getHouseBreakingClothing() {
		return houseBreakingClothing;
	}

	public void setHouseBreakingClothing(String houseBreakingClothing) {
		this.houseBreakingClothing = houseBreakingClothing;
	}

	public String getHouseBreakingKitchen() {
		return houseBreakingKitchen;
	}

	public void setHouseBreakingKitchen(String houseBreakingKitchen) {
		this.houseBreakingKitchen = houseBreakingKitchen;
	}

	public String getHouseBreakingMisc() {
		return houseBreakingMisc;
	}

	public void setHouseBreakingMisc(String houseBreakingMisc) {
		this.houseBreakingMisc = houseBreakingMisc;
	}

	public String getIsJewellery() {
		return isJewellery;
	}

	public void setIsJewellery(String isJewellery) {
		this.isJewellery = isJewellery;
	}

	public List<HouseHolderJewelleryDTO> getHouseHolderJewelleryDTOList() {
		return houseHolderJewelleryDTOList;
	}

	public void setHouseHolderJewelleryDTOList(
			List<HouseHolderJewelleryDTO> houseHolderJewelleryDTOList) {
		this.houseHolderJewelleryDTOList = houseHolderJewelleryDTOList;
	}

	public String getIsPlateglass() {
		return isPlateglass;
	}

	public void setIsPlateglass(String isPlateglass) {
		this.isPlateglass = isPlateglass;
	}

	public List<PlateGlassDTO> getPlateGlassDTOList() {
		return plateGlassDTOList;
	}

	public void setPlateGlassDTOList(List<PlateGlassDTO> plateGlassDTOList) {
		this.plateGlassDTOList = plateGlassDTOList;
	}

	public String getIsElectricalEquipment() {
		return isElectricalEquipment;
	}

	public void setIsElectricalEquipment(String isElectricalEquipment) {
		this.isElectricalEquipment = isElectricalEquipment;
	}

	public String getIsPedalcycle() {
		return isPedalcycle;
	}

	public void setIsPedalcycle(String isPedalcycle) {
		this.isPedalcycle = isPedalcycle;
	}

	public List<PedalCycleDTO> getHouseholderPedalCyclesDTOList() {
		return householderPedalCyclesDTOList;
	}

	public void setHouseholderPedalCyclesDTOList(
			List<PedalCycleDTO> householderPedalCyclesDTOList) {
		this.householderPedalCyclesDTOList = householderPedalCyclesDTOList;
	}

	public String getIsBaggage() {
		return isBaggage;
	}

	public void setIsBaggage(String isBaggage) {
		this.isBaggage = isBaggage;
	}

	public String getBaggageDescription() {
		return baggageDescription;
	}

	public void setBaggageDescription(String baggageDescription) {
		this.baggageDescription = baggageDescription;
	}

	public String getBaggageSumInsured() {
		return baggageSumInsured;
	}

	public void setBaggageSumInsured(String baggageSumInsured) {
		this.baggageSumInsured = baggageSumInsured;
	}

	public String getIsPersonalAccident() {
		return isPersonalAccident;
	}

	public void setIsPersonalAccident(String isPersonalAccident) {
		this.isPersonalAccident = isPersonalAccident;
	}

	public List<HHPPersonalAccidentDTO> getHhpPersonalAccidentDTOList() {
		return hhpPersonalAccidentDTOList;
	}

	public void setHhpPersonalAccidentDTOList(
			List<HHPPersonalAccidentDTO> hhpPersonalAccidentDTOList) {
		this.hhpPersonalAccidentDTOList = hhpPersonalAccidentDTOList;
	}

	public String getIsLiabilities() {
		return isLiabilities;
	}

	public void setIsLiabilities(String isLiabilities) {
		this.isLiabilities = isLiabilities;
	}

	public String getPublicLiability() {
		return publicLiability;
	}

	public void setPublicLiability(String publicLiability) {
		this.publicLiability = publicLiability;
	}

	public String getIsWorkmanCompensation() {
		return isWorkmanCompensation;
	}

	public void setIsWorkmanCompensation(String isWorkmanCompensation) {
		this.isWorkmanCompensation = isWorkmanCompensation;
	}

	public List<ElectricalItemDetailsDTO> getElectricalItemDetailsDTOList() {
		return electricalItemDetailsDTOList;
	}

	public void setElectricalItemDetailsDTOList(
			List<ElectricalItemDetailsDTO> electricalItemDetailsDTOList) {
		this.electricalItemDetailsDTOList = electricalItemDetailsDTOList;
	}

	public List<ElectricalItemDetailsDTO> getSection2electricalItemDetailsDTOList() {
		return section2electricalItemDetailsDTOList;
	}

	public void setSection2electricalItemDetailsDTOList(
			List<ElectricalItemDetailsDTO> section2electricalItemDetailsDTOList) {
		this.section2electricalItemDetailsDTOList = section2electricalItemDetailsDTOList;
	}

	public List<ElectricalItemDetailsDTO> getSection5ElectricalItemDetailsDTOList() {
		return section5ElectricalItemDetailsDTOList;
	}

	public void setSection5ElectricalItemDetailsDTOList(
			List<ElectricalItemDetailsDTO> section5ElectricalItemDetailsDTOList) {
		this.section5ElectricalItemDetailsDTOList = section5ElectricalItemDetailsDTOList;
	}

	public List<HHPWorkmenLiabilitiesDTO> getHhpWorkmenLiabilitiesDTOList() {
		return hhpWorkmenLiabilitiesDTOList;
	}

	public void setHhpWorkmenLiabilitiesDTOList(
			List<HHPWorkmenLiabilitiesDTO> hhpWorkmenLiabilitiesDTOList) {
		this.hhpWorkmenLiabilitiesDTOList = hhpWorkmenLiabilitiesDTOList;
	}

	public String getAnnualPremium() {
		return annualPremium;
	}

	public void setAnnualPremium(String annualPremium) {
		this.annualPremium = annualPremium;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getProposalNumber() {
		return proposalNumber;
	}

	public void setProposalNumber(String proposalNumber) {
		this.proposalNumber = proposalNumber;
	}

	public String getSection1aPremium() {
		return section1aPremium;
	}

	public void setSection1aPremium(String section1aPremium) {
		this.section1aPremium = section1aPremium;
	}

	public String getSection1bPremium() {
		return section1bPremium;
	}

	public void setSection1bPremium(String section1bPremium) {
		this.section1bPremium = section1bPremium;
	}

	public String getSection2Premium() {
		return section2Premium;
	}

	public void setSection2Premium(String section2Premium) {
		this.section2Premium = section2Premium;
	}

	public String getSection3Premium() {
		return Section3Premium;
	}

	public void setSection3Premium(String section3Premium) {
		Section3Premium = section3Premium;
	}

	public String getSection4Premium() {
		return section4Premium;
	}

	public void setSection4Premium(String section4Premium) {
		this.section4Premium = section4Premium;
	}

	public String getSection5Premium() {
		return section5Premium;
	}

	public void setSection5Premium(String section5Premium) {
		this.section5Premium = section5Premium;
	}

	public String getSection6Premium() {
		return section6Premium;
	}

	public void setSection6Premium(String section6Premium) {
		this.section6Premium = section6Premium;
	}

	public String getSection7Premium() {
		return section7Premium;
	}

	public void setSection7Premium(String section7Premium) {
		this.section7Premium = section7Premium;
	}

	public String getSection8Premium() {
		return section8Premium;
	}

	public void setSection8Premium(String section8Premium) {
		this.section8Premium = section8Premium;
	}

	public String getSection9Premium() {
		return section9Premium;
	}

	public void setSection9Premium(String section9Premium) {
		this.section9Premium = section9Premium;
	}

	public String getSection10aPremium() {
		return section10aPremium;
	}

	public void setSection10aPremium(String section10aPremium) {
		this.section10aPremium = section10aPremium;
	}

	public String getSection10bPremium() {
		return section10bPremium;
	}

	public void setSection10bPremium(String section10bPremium) {
		this.section10bPremium = section10bPremium;
	}

	public String getInliasErrorCode() {
		return inliasErrorCode;
	}

	public void setInliasErrorCode(String inliasErrorCode) {
		this.inliasErrorCode = inliasErrorCode;
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

	public String getIsHousebreaking() {
		return isHousebreaking;
	}

	public void setIsHousebreaking(String isHousebreaking) {
		this.isHousebreaking = isHousebreaking;
	}


}
