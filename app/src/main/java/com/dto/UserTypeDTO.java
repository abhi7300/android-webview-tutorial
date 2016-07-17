package com.dto;

public class UserTypeDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8692866160971720589L;
	private String description;
	private String oiclIdentificationId;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOiclIdentificationId() {
		return oiclIdentificationId;
	}
	public void setOiclIdentificationId(String oiclIdentificationId) {
		this.oiclIdentificationId = oiclIdentificationId;
	}
	
	

}
