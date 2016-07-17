package com.dto;

public class CustomerAddressDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5258115177730724831L;
	private String customerAddId;
    private CityDTO cityDTO;
    private PincodeDTO pincodeDTO;
    private StateDTO stateDTO;
    private String addressLine;
    private String otherCityText;
    
    
    
	public String getCustomerAddId() {
		return customerAddId;
	}
	public void setCustomerAddId(String customerAddId) {
		this.customerAddId = customerAddId;
	}

	public StateDTO getStateDTO() {
		return stateDTO;
	}
	public void setStateDTO(StateDTO stateDTO) {
		this.stateDTO = stateDTO;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getOtherCityText() {
		return otherCityText;
	}
	public void setOtherCityText(String otherCityText) {
		this.otherCityText = otherCityText;
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


}
