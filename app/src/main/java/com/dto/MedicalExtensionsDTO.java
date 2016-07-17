package com.dto;

public class MedicalExtensionsDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6373206363778425873L;
	private String medicalExtensionCode;
    private String description;
	public String getMedicalExtensionCode() {
		return medicalExtensionCode;
	}
	public void setMedicalExtensionCode(String medicalExtensionCode) {
		this.medicalExtensionCode = medicalExtensionCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
