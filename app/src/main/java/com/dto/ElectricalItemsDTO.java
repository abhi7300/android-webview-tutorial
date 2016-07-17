package com.dto;

public class ElectricalItemsDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8536652147339378899L;
	private String electricalItemId;
    private String electricalItemDescription;
    
    
	public String getElectricalItemId() {
		return electricalItemId;
	}
	public void setElectricalItemId(String electricalItemId) {
		this.electricalItemId = electricalItemId;
	}
	public String getElectricalItemDescription() {
		return electricalItemDescription;
	}
	public void setElectricalItemDescription(String electricalItemDescription) {
		this.electricalItemDescription = electricalItemDescription;
	}
    
}
