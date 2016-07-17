package com.dto;


public class AddressTypeDTO extends BaseDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -694091437667152559L;
	private String addressTypeId;
	private String addressTypeDescription;
	
	
	public String getAddressTypeId() {
		return addressTypeId;
	}
	public void setAddressTypeId(String addressTypeId) {
		this.addressTypeId = addressTypeId;
	}
	public String getAddressTypeDescription() {
		return addressTypeDescription;
	}
	public void setAddressTypeDescription(String addressTypeDescription) {
		this.addressTypeDescription = addressTypeDescription;
	}
	
	
}
