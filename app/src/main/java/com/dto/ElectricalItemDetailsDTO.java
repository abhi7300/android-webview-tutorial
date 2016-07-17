package com.dto;


public class ElectricalItemDetailsDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1413485518790567162L;
	private ElectricalItemsDTO electricalItems;
	private String itemNumber;
	private String quantity;
	private String yearOfManufacture;
	private String make;
	private String model;
	private String machineNumber;
	private String value;
	
	
	public ElectricalItemsDTO getElectricalItems() {
		return electricalItems;
	}
	public void setElectricalItems(ElectricalItemsDTO electricalItems) {
		this.electricalItems = electricalItems;
	}
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(String yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMachineNumber() {
		return machineNumber;
	}
	public void setMachineNumber(String machineNumber) {
		this.machineNumber = machineNumber;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
