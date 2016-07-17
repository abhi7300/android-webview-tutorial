package com.dto;

public class MotorModelDTO extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7872783535923273837L;
	private String id;
    private String modelId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModelId() {
		return modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

}
