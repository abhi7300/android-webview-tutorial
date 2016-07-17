package com.dto;

import java.util.List;

public class ClaimNumberListDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8283699302294499848L;
	List<String> claimIntimationNoList;
	List<String> claimRegistrationNoList;
	
	
	
	public List<String> getClaimIntimationNoList() {
		return claimIntimationNoList;
	}
	public void setClaimIntimationNoList(List<String> claimIntimationNoList) {
		this.claimIntimationNoList = claimIntimationNoList;
	}
	public List<String> getClaimRegistrationNoList() {
		return claimRegistrationNoList;
	}
	public void setClaimRegistrationNoList(List<String> claimRegistrationNoList) {
		this.claimRegistrationNoList = claimRegistrationNoList;
	}
	
	
	

}
