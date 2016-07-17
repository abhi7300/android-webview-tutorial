package com.dto;

import java.util.ArrayList;
import java.util.List;

public class MotorManufacturerDTO extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6673617251969193829L;
	private String id;
    private String description;
    private List<MotorRelationsDTO> motorRelationses = new ArrayList<MotorRelationsDTO>();
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<MotorRelationsDTO> getMotorRelationses() {
		return motorRelationses;
	}
	public void setMotorRelationses(List<MotorRelationsDTO> motorRelationses) {
		this.motorRelationses = motorRelationses;
	}	

}
