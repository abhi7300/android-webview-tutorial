package com.dto;

public class CDBalanceDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1622704602206569566L;
	public String officeCode;
    public String officeName;
    public String cdBalance;
	
    public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getCdBalance() {
		return cdBalance;
	}
	public void setCdBalance(String cdBalance) {
		this.cdBalance = cdBalance;
	}
	
}
