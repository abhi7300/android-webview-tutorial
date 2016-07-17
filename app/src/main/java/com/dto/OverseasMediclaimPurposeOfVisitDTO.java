package com.dto;

public class OverseasMediclaimPurposeOfVisitDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1060819390568188869L;
	private String purposeOfVisitCode;
    private String purposeOfVisitDesc;
	public String getPurposeOfVisitCode() {
		return purposeOfVisitCode;
	}
	public void setPurposeOfVisitCode(String purposeOfVisitCode) {
		this.purposeOfVisitCode = purposeOfVisitCode;
	}
	public String getPurposeOfVisitDesc() {
		return purposeOfVisitDesc;
	}
	public void setPurposeOfVisitDesc(String purposeOfVisitDesc) {
		this.purposeOfVisitDesc = purposeOfVisitDesc;
	}
}
