package com.dto;


public class AgentResidenceAddressDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String agentResiAddId;
    private CityDTO cityDTO;
    private PincodeDTO pincodeDTO;
    private String addressLine1;
    private String addressLine2;
    private String otherCityText;
    
    
    
	public String getAgentResiAddId() {
		return agentResiAddId;
	}
	public void setAgentResiAddId(String agentResiAddId) {
		this.agentResiAddId = agentResiAddId;
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
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getOtherCityText() {
		return otherCityText;
	}
	public void setOtherCityText(String otherCityText) {
		this.otherCityText = otherCityText;
	}

}
