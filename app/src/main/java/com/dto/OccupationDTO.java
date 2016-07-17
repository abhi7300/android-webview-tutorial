package com.dto;

public class OccupationDTO  extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3687416968845174250L;
	private String occupationId;
	private String occupationDescription;
	
	
	public String getOccupationId() {
		return occupationId;
	}
	public void setOccupationId(String occupationId) {
		this.occupationId = occupationId;
	}
	public String getOccupationDescription() {
		return occupationDescription;
	}
	public void setOccupationDescription(String occupationDescription) {
		this.occupationDescription = occupationDescription;
	}

}
