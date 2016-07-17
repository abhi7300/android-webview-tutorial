package com.dto;

public class OneTimePasswordDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3612867829670873564L;
	private String encryptedOtp;
	private String userId;
	
	
	public String getEncryptedOtp() {
		return encryptedOtp;
	}
	public void setEncryptedOtp(String encryptedOtp) {
		this.encryptedOtp = encryptedOtp;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
