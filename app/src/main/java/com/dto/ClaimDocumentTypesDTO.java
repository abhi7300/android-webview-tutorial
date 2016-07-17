package com.dto;

public class ClaimDocumentTypesDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2829370553361188746L;
	private String claimDocumentCode;
	private String claimDocumentType;
	private String description;
	
	
	public String getClaimDocumentCode() {
		return claimDocumentCode;
	}
	public void setClaimDocumentCode(String claimDocumentCode) {
		this.claimDocumentCode = claimDocumentCode;
	}
	public String getClaimDocumentType() {
		return claimDocumentType;
	}
	public void setClaimDocumentType(String claimDocumentType) {
		this.claimDocumentType = claimDocumentType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
