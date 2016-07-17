package com.dto;

public class MotorInsuranceBasicsDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8733009752481511802L;
	private long insuranceId;
	private AddressTypeDTO addressType;
     private CityDTO cityDTO;
     private PincodeDTO pincodeDTO;
     private InsuranceCompanyDTO existingInsuranceCompanyDTO;
     private String firstName;
     private String middleName;
     private String lastName;
     private String addressLine1 = "";
     private String email = "";
     private String mobile = "";
     private String telephone;
     private String dob;
     private OccupationDTO occupationDTO;
     private String existingPolicyCompanyName;
     private String existingPolicyNo = "";
     private String existingPolicyStartDate;
     private String existingPolicyEndDate;
     private String existingPolicyCompanyAddress = "";
     private String existingPolicyCompanyEmail = "";
     private String existingPolicyCompanyPhone = "";
	public long getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(long insuranceId) {
		this.insuranceId = insuranceId;
	}
	public AddressTypeDTO getAddressType() {
		return addressType;
	}
	public void setAddressType(AddressTypeDTO addressType) {
		this.addressType = addressType;
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
	public InsuranceCompanyDTO getExistingInsuranceCompanyDTO() {
		return existingInsuranceCompanyDTO;
	}
	public void setExistingInsuranceCompanyDTO(
			InsuranceCompanyDTO existingInsuranceCompanyDTO) {
		this.existingInsuranceCompanyDTO = existingInsuranceCompanyDTO;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public OccupationDTO getOccupationDTO() {
		return occupationDTO;
	}
	public void setOccupationDTO(OccupationDTO occupationDTO) {
		this.occupationDTO = occupationDTO;
	}
	public String getExistingPolicyCompanyName() {
		return existingPolicyCompanyName;
	}
	public void setExistingPolicyCompanyName(String existingPolicyCompanyName) {
		this.existingPolicyCompanyName = existingPolicyCompanyName;
	}
	public String getExistingPolicyNo() {
		return existingPolicyNo;
	}
	public void setExistingPolicyNo(String existingPolicyNo) {
		this.existingPolicyNo = existingPolicyNo;
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
	public String getExistingPolicyCompanyAddress() {
		return existingPolicyCompanyAddress;
	}
	public void setExistingPolicyCompanyAddress(String existingPolicyCompanyAddress) {
		this.existingPolicyCompanyAddress = existingPolicyCompanyAddress;
	}
	public String getExistingPolicyCompanyEmail() {
		return existingPolicyCompanyEmail;
	}
	public void setExistingPolicyCompanyEmail(String existingPolicyCompanyEmail) {
		this.existingPolicyCompanyEmail = existingPolicyCompanyEmail;
	}
	public String getExistingPolicyCompanyPhone() {
		return existingPolicyCompanyPhone;
	}
	public void setExistingPolicyCompanyPhone(String existingPolicyCompanyPhone) {
		this.existingPolicyCompanyPhone = existingPolicyCompanyPhone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}


}
