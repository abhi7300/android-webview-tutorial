package com.dto;


public class CustomerDTO  extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5646671994116706100L;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String mobileNo;
	private String dob_input;
	private String typeOfOccupation;
	private String residentialTelephone;
	private String officeTelephone;
	private String userId;
	
	private AddressTypeDTO addressTypeDTO;
	private CustomerAddressDTO customerAddressDTO;
	private CustomerResidenceAddressDTO customerResidenceAddressDTO;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDob_input() {
		return dob_input;
	}
	public void setDob_input(String dob_input) {
		this.dob_input = dob_input;
	}
	public String getTypeOfOccupation() {
		return typeOfOccupation;
	}
	public void setTypeOfOccupation(String typeOfOccupation) {
		this.typeOfOccupation = typeOfOccupation;
	}

	public String getResidentialTelephone() {
		return residentialTelephone;
	}
	public void setResidentialTelephone(String residentialTelephone) {
		this.residentialTelephone = residentialTelephone;
	}
	
	public String getOfficeTelephone() {
		return officeTelephone;
	}
	public void setOfficeTelephone(String officeTelephone) {
		this.officeTelephone = officeTelephone;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public AddressTypeDTO getAddressTypeDTO() {
		return addressTypeDTO;
	}
	public void setAddressTypeDTO(AddressTypeDTO addressTypeDTO) {
		this.addressTypeDTO = addressTypeDTO;
	}
	public CustomerAddressDTO getCustomerAddressDTO() {
		return customerAddressDTO;
	}
	public void setCustomerAddressDTO(CustomerAddressDTO customerAddressDTO) {
		this.customerAddressDTO = customerAddressDTO;
	}
	public CustomerResidenceAddressDTO getCustomerResidenceAddressDTO() {
		return customerResidenceAddressDTO;
	}
	public void setCustomerResidenceAddressDTO(
			CustomerResidenceAddressDTO customerResidenceAddressDTO) {
		this.customerResidenceAddressDTO = customerResidenceAddressDTO;
	}
	
}
