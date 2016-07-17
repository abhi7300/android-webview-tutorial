package com.dto;

public class ClaimsDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3684702898216559718L;
	private boolean isClaimNumberValid;
	
	
	
	public boolean isClaimNumberValid() {
		return isClaimNumberValid;
	}
	public void setClaimNumberValid(boolean isClaimNumberValid) {
		this.isClaimNumberValid = isClaimNumberValid;
	}

}
