package com.dto;

import java.util.List;

public class ShopkeeperPolicyDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3272775889841639516L;
	private String isOiclPolicy;
	private String isRenewRecord;
	
	private String isInitialDeclarationAccepted;
	private String isFinalDeclarationAccepted;
	
	private OiclBranchDTO OiclBranch;
	
	/**************** Personal Details *************************/
	private String nameOfProposer;
	private String natureOfBusiness;
	private String isPremisesOwned;
	private String startDate;
	private String endDate;
	/**************** Personal Details *************************/
	
	
	/**************** Section 1A *************************/
	
	private String premiseAddress;
	private CityDTO cityByPremiseCityId;
	private PincodeDTO pincodeByPremPinId;
	private ShopkeeperConstructionClassDTO shopkeeperConstructionClassDTO;
	private String section1aSumInsured;
	
	/**************** Section 1A *************************/
	
	
	/**************** Section 1B *************************/
	
	private String contentsStocksInTrade;
	private String contentsFixturesAndFittings;
	private String contentsGoodsHeldInTrade;
	private String contentsAllOtherContents;
	
	/**************** Section 1B *************************/
	
	/**************** Section 2 *************************/
	
	private String burglaryStocksInTrade;
	private String burglaryFixturesAndFittings;
	private String burglaryGoodsHeldInTrade;
	private String burglaryAllOtherContents;
	
	/**************** Section 2 *************************/
	
	
	/**************** Section 3 *************************/
	
	private String isMoneyInsurance;
	private String moneyInTransitRate;
	private String moneyInTransitValue;
	
	/**************** Section 3 *************************/
	
	/**************** Pedal cycle section *************************/
	
	private String isPedalCycle;
	private List<ShopkeeperPedalCycleDTO> shopkeeperPedalCycleDTOList;
	
	/**************** Pedal cycle section *************************/
	
	
	/**************** Plate glass section *************************/
	
	private String isPlateGlass;
	private List<ShopkeeperPlateGlassDetailsDTO> shopkeeperPlateGlassDetailsDTOList;
	
	
	/**************** Plate glass section *************************/
	
	
	/**************** Neon Signs section *************************/
	
	private String isNeonSigns;
	private List<ShopkeeperNeonSignsDetailsDTO> shopkeeperNeonSignsDetailsDTOList;
	
	
	/**************** Neon Signs section *************************/

	
	/**************** Baggage *************************/
	
	private String isBaggage;
	private String baggageDescription;
	private String baggageValue;
	
	/**************** Baggage *************************/
	
	/**************** Personal Accident section *************************/
	private String isPersonalAccident;
	private List<SKPPersonalAccidentDTO> skpPersonalAccidentDTOList;
	/**************** Personal Accident section *************************/

	
	/**************** Fidelity section *************************/
	
	private String isFidelityGuarantee;
	private List<ShopkeeperFidelityDetailsDTO> shopkeeperFidelityDetailsDTOList;
	
	/**************** Fidelity section *************************/
	
	/**************** Public Liability section *************************/
	
	private String isLiabilities;
	private String publicLiability;
	
	/**************** Public Liability section *************************/
	
	/**************** Workman compensation section *************************/
	
	private String isWorkmanCompensation;
	private List<SKPWorkmenLiabilitiesDTO> skpWorkmenLiabilitiesDTOList;
	
	/**************** Workman compensation section *************************/
	
	
	/**************** Business Interruption section *************************/
	
	private String isBusinessInterruption;
	private String businessInterruptionGrossIncome;
	private String businessInterruptionAccountantsCharge;
	private String businessInterruptionPanNumber;
	private String businessInterruptionSalesTaxNumber;
	private String businessInterruptionIndemnityPeriod;
	private String businessInterruptionSumInsured;
	
	/**************** Business Interruption section *************************/
	
	
	
	private String proposalNumber;
	private String transactionId;
	private String grandPremium;
	private String section1aPremium;
	private String section1bPremium;
	private String section2Premium;
	private String section3Premium;
    private String section4Premium;
	private String section5Premium;
	private String section6Premium;
	private String section7Premium;
	private String section8Premium;
	private String section9Premium;
	private String section12aPremium;
	private String section12bPremium;
	private String section13Premium;
	
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
	public String getIsInitialDeclarationAccepted() {
		return isInitialDeclarationAccepted;
	}
	public void setIsInitialDeclarationAccepted(String isInitialDeclarationAccepted) {
		this.isInitialDeclarationAccepted = isInitialDeclarationAccepted;
	}
	public String getIsFinalDeclarationAccepted() {
		return isFinalDeclarationAccepted;
	}
	public void setIsFinalDeclarationAccepted(String isFinalDeclarationAccepted) {
		this.isFinalDeclarationAccepted = isFinalDeclarationAccepted;
	}
	public OiclBranchDTO getOiclBranch() {
		return OiclBranch;
	}
	public void setOiclBranch(OiclBranchDTO oiclBranch) {
		OiclBranch = oiclBranch;
	}
	public String getNameOfProposer() {
		return nameOfProposer;
	}
	public void setNameOfProposer(String nameOfProposer) {
		this.nameOfProposer = nameOfProposer;
	}
	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}
	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}
	public String getIsPremisesOwned() {
		return isPremisesOwned;
	}
	public void setIsPremisesOwned(String isPremisesOwned) {
		this.isPremisesOwned = isPremisesOwned;
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
	public String getPremiseAddress() {
		return premiseAddress;
	}
	public void setPremiseAddress(String premiseAddress) {
		this.premiseAddress = premiseAddress;
	}
	public CityDTO getCityByPremiseCityId() {
		return cityByPremiseCityId;
	}
	public void setCityByPremiseCityId(CityDTO cityByPremiseCityId) {
		this.cityByPremiseCityId = cityByPremiseCityId;
	}
	public PincodeDTO getPincodeByPremPinId() {
		return pincodeByPremPinId;
	}
	public void setPincodeByPremPinId(PincodeDTO pincodeByPremPinId) {
		this.pincodeByPremPinId = pincodeByPremPinId;
	}
	public String getSection1aSumInsured() {
		return section1aSumInsured;
	}
	public void setSection1aSumInsured(String section1aSumInsured) {
		this.section1aSumInsured = section1aSumInsured;
	}
	public String getContentsStocksInTrade() {
		return contentsStocksInTrade;
	}
	public void setContentsStocksInTrade(String contentsStocksInTrade) {
		this.contentsStocksInTrade = contentsStocksInTrade;
	}
	public String getContentsFixturesAndFittings() {
		return contentsFixturesAndFittings;
	}
	public void setContentsFixturesAndFittings(String contentsFixturesAndFittings) {
		this.contentsFixturesAndFittings = contentsFixturesAndFittings;
	}
	public String getContentsGoodsHeldInTrade() {
		return contentsGoodsHeldInTrade;
	}
	public void setContentsGoodsHeldInTrade(String contentsGoodsHeldInTrade) {
		this.contentsGoodsHeldInTrade = contentsGoodsHeldInTrade;
	}
	public String getContentsAllOtherContents() {
		return contentsAllOtherContents;
	}
	public void setContentsAllOtherContents(String contentsAllOtherContents) {
		this.contentsAllOtherContents = contentsAllOtherContents;
	}
	public String getBurglaryStocksInTrade() {
		return burglaryStocksInTrade;
	}
	public void setBurglaryStocksInTrade(String burglaryStocksInTrade) {
		this.burglaryStocksInTrade = burglaryStocksInTrade;
	}
	public String getBurglaryFixturesAndFittings() {
		return burglaryFixturesAndFittings;
	}
	public void setBurglaryFixturesAndFittings(String burglaryFixturesAndFittings) {
		this.burglaryFixturesAndFittings = burglaryFixturesAndFittings;
	}
	public String getBurglaryGoodsHeldInTrade() {
		return burglaryGoodsHeldInTrade;
	}
	public void setBurglaryGoodsHeldInTrade(String burglaryGoodsHeldInTrade) {
		this.burglaryGoodsHeldInTrade = burglaryGoodsHeldInTrade;
	}
	public String getBurglaryAllOtherContents() {
		return burglaryAllOtherContents;
	}
	public void setBurglaryAllOtherContents(String burglaryAllOtherContents) {
		this.burglaryAllOtherContents = burglaryAllOtherContents;
	}
	public String getIsMoneyInsurance() {
		return isMoneyInsurance;
	}
	public void setIsMoneyInsurance(String isMoneyInsurance) {
		this.isMoneyInsurance = isMoneyInsurance;
	}
	public String getMoneyInTransitRate() {
		return moneyInTransitRate;
	}
	public void setMoneyInTransitRate(String moneyInTransitRate) {
		this.moneyInTransitRate = moneyInTransitRate;
	}
	public String getMoneyInTransitValue() {
		return moneyInTransitValue;
	}
	public void setMoneyInTransitValue(String moneyInTransitValue) {
		this.moneyInTransitValue = moneyInTransitValue;
	}
	public String getIsPedalCycle() {
		return isPedalCycle;
	}
	public void setIsPedalCycle(String isPedalCycle) {
		this.isPedalCycle = isPedalCycle;
	}
	public List<ShopkeeperPedalCycleDTO> getShopkeeperPedalCycleDTOList() {
		return shopkeeperPedalCycleDTOList;
	}
	public void setShopkeeperPedalCycleDTOList(
			List<ShopkeeperPedalCycleDTO> shopkeeperPedalCycleDTOList) {
		this.shopkeeperPedalCycleDTOList = shopkeeperPedalCycleDTOList;
	}
	public String getIsPlateGlass() {
		return isPlateGlass;
	}
	public void setIsPlateGlass(String isPlateGlass) {
		this.isPlateGlass = isPlateGlass;
	}
	public List<ShopkeeperPlateGlassDetailsDTO> getShopkeeperPlateGlassDetailsDTOList() {
		return shopkeeperPlateGlassDetailsDTOList;
	}
	public void setShopkeeperPlateGlassDetailsDTOList(
			List<ShopkeeperPlateGlassDetailsDTO> shopkeeperPlateGlassDetailsDTOList) {
		this.shopkeeperPlateGlassDetailsDTOList = shopkeeperPlateGlassDetailsDTOList;
	}
	public String getIsNeonSigns() {
		return isNeonSigns;
	}
	public void setIsNeonSigns(String isNeonSigns) {
		this.isNeonSigns = isNeonSigns;
	}
	public List<ShopkeeperNeonSignsDetailsDTO> getShopkeeperNeonSignsDetailsDTOList() {
		return shopkeeperNeonSignsDetailsDTOList;
	}
	public void setShopkeeperNeonSignsDetailsDTOList(
			List<ShopkeeperNeonSignsDetailsDTO> shopkeeperNeonSignsDetailsDTOList) {
		this.shopkeeperNeonSignsDetailsDTOList = shopkeeperNeonSignsDetailsDTOList;
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
	public String getBaggageValue() {
		return baggageValue;
	}
	public void setBaggageValue(String baggageValue) {
		this.baggageValue = baggageValue;
	}
	public String getIsPersonalAccident() {
		return isPersonalAccident;
	}
	public void setIsPersonalAccident(String isPersonalAccident) {
		this.isPersonalAccident = isPersonalAccident;
	}
	public List<SKPPersonalAccidentDTO> getSkpPersonalAccidentDTOList() {
		return skpPersonalAccidentDTOList;
	}
	public void setSkpPersonalAccidentDTOList(
			List<SKPPersonalAccidentDTO> skpPersonalAccidentDTOList) {
		this.skpPersonalAccidentDTOList = skpPersonalAccidentDTOList;
	}
	public String getIsFidelityGuarantee() {
		return isFidelityGuarantee;
	}
	public void setIsFidelityGuarantee(String isFidelityGuarantee) {
		this.isFidelityGuarantee = isFidelityGuarantee;
	}
	public List<ShopkeeperFidelityDetailsDTO> getShopkeeperFidelityDetailsDTOList() {
		return shopkeeperFidelityDetailsDTOList;
	}
	public void setShopkeeperFidelityDetailsDTOList(
			List<ShopkeeperFidelityDetailsDTO> shopkeeperFidelityDetailsDTOList) {
		this.shopkeeperFidelityDetailsDTOList = shopkeeperFidelityDetailsDTOList;
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

	public String getIsBusinessInterruption() {
		return isBusinessInterruption;
	}
	public void setIsBusinessInterruption(String isBusinessInterruption) {
		this.isBusinessInterruption = isBusinessInterruption;
	}
	public String getBusinessInterruptionGrossIncome() {
		return businessInterruptionGrossIncome;
	}
	public void setBusinessInterruptionGrossIncome(
			String businessInterruptionGrossIncome) {
		this.businessInterruptionGrossIncome = businessInterruptionGrossIncome;
	}
	public String getBusinessInterruptionAccountantsCharge() {
		return businessInterruptionAccountantsCharge;
	}
	public void setBusinessInterruptionAccountantsCharge(
			String businessInterruptionAccountantsCharge) {
		this.businessInterruptionAccountantsCharge = businessInterruptionAccountantsCharge;
	}
	public String getBusinessInterruptionPanNumber() {
		return businessInterruptionPanNumber;
	}
	public void setBusinessInterruptionPanNumber(
			String businessInterruptionPanNumber) {
		this.businessInterruptionPanNumber = businessInterruptionPanNumber;
	}
	public String getBusinessInterruptionSalesTaxNumber() {
		return businessInterruptionSalesTaxNumber;
	}
	public void setBusinessInterruptionSalesTaxNumber(
			String businessInterruptionSalesTaxNumber) {
		this.businessInterruptionSalesTaxNumber = businessInterruptionSalesTaxNumber;
	}
	public String getBusinessInterruptionIndemnityPeriod() {
		return businessInterruptionIndemnityPeriod;
	}
	public void setBusinessInterruptionIndemnityPeriod(
			String businessInterruptionIndemnityPeriod) {
		this.businessInterruptionIndemnityPeriod = businessInterruptionIndemnityPeriod;
	}
	public String getBusinessInterruptionSumInsured() {
		return businessInterruptionSumInsured;
	}
	public void setBusinessInterruptionSumInsured(
			String businessInterruptionSumInsured) {
		this.businessInterruptionSumInsured = businessInterruptionSumInsured;
	}
	public ShopkeeperConstructionClassDTO getShopkeeperConstructionClassDTO() {
		return shopkeeperConstructionClassDTO;
	}
	public void setShopkeeperConstructionClassDTO(
			ShopkeeperConstructionClassDTO shopkeeperConstructionClassDTO) {
		this.shopkeeperConstructionClassDTO = shopkeeperConstructionClassDTO;
	}
	public List<SKPWorkmenLiabilitiesDTO> getSkpWorkmenLiabilitiesDTOList() {
		return skpWorkmenLiabilitiesDTOList;
	}
	public void setSkpWorkmenLiabilitiesDTOList(
			List<SKPWorkmenLiabilitiesDTO> skpWorkmenLiabilitiesDTOList) {
		this.skpWorkmenLiabilitiesDTOList = skpWorkmenLiabilitiesDTOList;
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
	public String getGrandPremium() {
		return grandPremium;
	}
	public void setGrandPremium(String grandPremium) {
		this.grandPremium = grandPremium;
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
		return section3Premium;
	}
	public void setSection3Premium(String section3Premium) {
		this.section3Premium = section3Premium;
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
	public String getSection12aPremium() {
		return section12aPremium;
	}
	public void setSection12aPremium(String section12aPremium) {
		this.section12aPremium = section12aPremium;
	}
	public String getSection12bPremium() {
		return section12bPremium;
	}
	public void setSection12bPremium(String section12bPremium) {
		this.section12bPremium = section12bPremium;
	}
	public String getSection13Premium() {
		return section13Premium;
	}
	public void setSection13Premium(String section13Premium) {
		this.section13Premium = section13Premium;
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
	
	/**************** Business Interruption section *************************/
}
