package com.dto;

public class SKPWorkmenLiabilitiesDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6956667962964031135L;
	private String annualEarning;
	private SPNatureOfWorkDTO shopkeeperWorkNatureDTO;
	private String numberOfEmployees;
	private WageTypesDTO wageTypesDTO;
	
	
	public String getAnnualEarning() {
		return annualEarning;
	}
	public void setAnnualEarning(String annualEarning) {
		this.annualEarning = annualEarning;
	}
	public String getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(String numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public WageTypesDTO getWageTypesDTO() {
		return wageTypesDTO;
	}
	public void setWageTypesDTO(WageTypesDTO wageTypesDTO) {
		this.wageTypesDTO = wageTypesDTO;
	}
	public SPNatureOfWorkDTO getShopkeeperWorkNatureDTO() {
		return shopkeeperWorkNatureDTO;
	}
	public void setShopkeeperWorkNatureDTO(SPNatureOfWorkDTO shopkeeperWorkNatureDTO) {
		this.shopkeeperWorkNatureDTO = shopkeeperWorkNatureDTO;
	}
	



}
