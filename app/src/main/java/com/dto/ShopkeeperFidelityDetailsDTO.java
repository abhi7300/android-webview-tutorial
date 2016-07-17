package com.dto;

public class ShopkeeperFidelityDetailsDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1257551206922726727L;
	private String amountOfGuarantee;
	private String designation;
	private String monthlySalary;
	private String nameOfEmployee;
	
	
	public String getAmountOfGuarantee() {
		return amountOfGuarantee;
	}
	public void setAmountOfGuarantee(String amountOfGuarantee) {
		this.amountOfGuarantee = amountOfGuarantee;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(String monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public String getNameOfEmployee() {
		return nameOfEmployee;
	}
	public void setNameOfEmployee(String nameOfEmployee) {
		this.nameOfEmployee = nameOfEmployee;
	}

}
