package com.dto;

public class OiclBranchDTO extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7092339878705485571L;
	private String oiclBranchId;
    private String description;
	public String getOiclBranchId() {
		return oiclBranchId;
	}
	public void setOiclBranchId(String oiclBranchId) {
		this.oiclBranchId = oiclBranchId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
