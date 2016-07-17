package com.dto;

public class OiclRenewalOtherPolicyDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1110137637540919011L;
	private String policyHolderUserId;
	private String address;
	private StateDTO stateDTO;
	private CityDTO cityDTO;
	private PincodeDTO pincodeDTO;
	private String email;
	private String mobile;
	private PolicyTypesDTO policyTypesDTO;
	private String existingPolicyNumber;
	private String existingPolicyStartDate;
	private String existingPolicyEndDate;
	private ProductDTO productDTO;
	private OiclBranchDTO oiclBranchDTO;
	
	
	public OiclBranchDTO getOiclBranchDTO() {
		return oiclBranchDTO;
	}
	public void setOiclBranchDTO(OiclBranchDTO oiclBranchDTO) {
		this.oiclBranchDTO = oiclBranchDTO;
	}
	public String getPolicyHolderUserId() {
		return policyHolderUserId;
	}
	public void setPolicyHolderUserId(String policyHolderUserId) {
		this.policyHolderUserId = policyHolderUserId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public StateDTO getStateDTO() {
		return stateDTO;
	}
	public void setStateDTO(StateDTO stateDTO) {
		this.stateDTO = stateDTO;
	}
	public CityDTO getCityDTO() {
		return cityDTO;
	}
	public void setCityDTO(CityDTO cityDTO) {
		this.cityDTO = cityDTO;
	}
	public PincodeDTO getPincodeDTO() {
		return pincodeDTO;
	}
	public void setPincodeDTO(PincodeDTO pincodeDTO) {
		this.pincodeDTO = pincodeDTO;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public PolicyTypesDTO getPolicyTypesDTO() {
		return policyTypesDTO;
	}
	public void setPolicyTypesDTO(PolicyTypesDTO policyTypesDTO) {
		this.policyTypesDTO = policyTypesDTO;
	}
	public String getExistingPolicyNumber() {
		return existingPolicyNumber;
	}
	public void setExistingPolicyNumber(String existingPolicyNumber) {
		this.existingPolicyNumber = existingPolicyNumber;
	}
	public String getExistingPolicyStartDate() {
		return existingPolicyStartDate;
	}
	public void setExistingPolicyStartDate(String existingPolicyStartDate) {
		this.existingPolicyStartDate = existingPolicyStartDate;
	}
	public String getExistingPolicyEndDate() {
		return existingPolicyEndDate;
	}
	public void setExistingPolicyEndDate(String existingPolicyEndDate) {
		this.existingPolicyEndDate = existingPolicyEndDate;
	}
	public ProductDTO getProductDTO() {
		return productDTO;
	}
	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}
	

}
