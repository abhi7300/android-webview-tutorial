package com.dto;

public class CustomerResidenceAddressDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5568226816844982343L;
	private String custResAddId;
    private CityDTO cityDTO;
    private PincodeDTO pincodeDTO;
    private StateDTO stateDTO;
    private String addressLine;
    
    
	public String getCustResAddId() {
		return custResAddId;
	}
	public void setCustResAddId(String custResAddId) {
		this.custResAddId = custResAddId;
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
