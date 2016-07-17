package com.dto;

public class RenewPolicyDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -603815407036776283L;
	private String policyNumber;
	private boolean isUserloggedIn;
	private InsuranceDTO insuranceDTO;
	private boolean showPlicyDownloadLink;
	private boolean showInsuredCode;
	private UserDTO userDTO;
	private String paymentType;
	
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public UserDTO getUserDTO() {
		return userDTO;
	}
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	public InsuranceDTO getInsuranceDTO() {
		return insuranceDTO;
	}
	public void setInsuranceDTO(InsuranceDTO insuranceDTO) {
		this.insuranceDTO = insuranceDTO;
	}
	public boolean isUserloggedIn() {
		return isUserloggedIn;
	}
	public void setUserloggedIn(boolean isUserloggedIn) {
		this.isUserloggedIn = isUserloggedIn;
	}
	public boolean isShowPlicyDownloadLink() {
		return showPlicyDownloadLink;
	}
	public void setShowPlicyDownloadLink(boolean showPlicyDownloadLink) {
		this.showPlicyDownloadLink = showPlicyDownloadLink;
	}
	public boolean isShowInsuredCode() {
		return showInsuredCode;
	}
	public void setShowInsuredCode(boolean showInsuredCode) {
		this.showInsuredCode = showInsuredCode;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
}
