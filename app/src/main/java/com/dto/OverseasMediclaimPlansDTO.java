package com.dto;

public class OverseasMediclaimPlansDTO extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4462792000193234563L;
	private String mediclaimPlanId;
    private String description;
	public String getMediclaimPlanId() {
		return mediclaimPlanId;
	}
	public void setMediclaimPlanId(String mediclaimPlanId) {
		this.mediclaimPlanId = mediclaimPlanId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
