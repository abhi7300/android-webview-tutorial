package com.dto;

public class StateDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4366816271780656847L;
	private String stateId;
	private String stateDescription;
	
	
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public String getStateDescription() {
		return stateDescription;
	}
	public void setStateDescription(String stateDescription) {
		this.stateDescription = stateDescription;
	}
	
	
}
