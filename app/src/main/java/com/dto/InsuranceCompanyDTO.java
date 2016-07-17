package com.dto;

public class InsuranceCompanyDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7491387701099506262L;
	private String id;
    private String companyName = "";
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
