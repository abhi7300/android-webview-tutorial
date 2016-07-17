package com.dto;

public class SumInsuredDTO extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2782958612504131644L;
	private String sumInsuredId;
    private String description;
	public String getSumInsuredId() {
		return sumInsuredId;
	}
	public void setSumInsuredId(String sumInsuredId) {
		this.sumInsuredId = sumInsuredId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
