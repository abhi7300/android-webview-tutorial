package com.dto;

public class ClaimDocumentDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -687803057305051926L;
	private String fileName;
	private String mimetype;
	private ClaimDocumentMapDTO claimDocumentMapDTO;
	
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getMimetype() {
		return mimetype;
	}
	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}
	public ClaimDocumentMapDTO getClaimDocumentMapDTO() {
		return claimDocumentMapDTO;
	}
	public void setClaimDocumentMapDTO(ClaimDocumentMapDTO claimDocumentMapDTO) {
		this.claimDocumentMapDTO = claimDocumentMapDTO;
	}
	
}
