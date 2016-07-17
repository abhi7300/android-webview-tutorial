package com.dto;


public class UserDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9034095338270676604L;
	private boolean isGuestUser;
	private String userId;
	private UserTypeDTO userTypeDTO;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String mobile;
	private String landline;
	private String dob;
	private OccupationDTO occupationDTO;
	private CustomerDTO customerDTO;
	private AgentDTO agentDTO;
	private BrokerDTO brokerDTO;
	

	public boolean isGuestUser() {
		return isGuestUser;
	}

	public void setGuestUser(boolean isGuestUser) {
		this.isGuestUser = isGuestUser;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public UserTypeDTO getUserTypeDTO() {
		return userTypeDTO;
	}

	public void setUserTypeDTO(UserTypeDTO userTypeDTO) {
		this.userTypeDTO = userTypeDTO;
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

	public String getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public OccupationDTO getOccupationDTO() {
		return occupationDTO;
	}

	public void setOccupationDTO(OccupationDTO occupationDTO) {
		this.occupationDTO = occupationDTO;
	}

	public CustomerDTO getCustomerDTO() {
		return customerDTO;
	}

	public void setCustomerDTO(CustomerDTO customerDTO) {
		this.customerDTO = customerDTO;
	}

	public AgentDTO getAgentDTO() {
		return agentDTO;
	}

	public void setAgentDTO(AgentDTO agentDTO) {
		this.agentDTO = agentDTO;
	}

	public BrokerDTO getBrokerDTO() {
		return brokerDTO;
	}

	public void setBrokerDTO(BrokerDTO brokerDTO) {
		this.brokerDTO = brokerDTO;
	}



}
