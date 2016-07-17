package com.dto;

public class MotorLovZoneDTO extends BaseDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2916665043760688929L;
	private String id;
    private String description = "";
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
