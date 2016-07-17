package com.dto;

import java.util.List;

public class NagarikSurakshaDetailsDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1594209164504547711L;
	private String name;
	private String disability;
	private String dob;
	private OccupationDTO occupationDTO;
	private RelationshipDTO relationshipDTO;
	private GenderDTO genderDTO;
	private SumInsuredDTO sumInsuredDTO;
	private String yearlyIncome;
	private boolean isAssigneeExist;
	private List<NagarikSurakshaAssgineeDTO> assigneeList;
	private Character isEmployed;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisability() {
		return disability;
	}
	public void setDisability(String disability) {
		this.disability = disability;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getYearlyIncome() {
		return yearlyIncome;
	}
	public void setYearlyIncome(String yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}
	public boolean isAssigneeExist() {
		return isAssigneeExist;
	}
	public void setAssigneeExist(boolean isAssigneeExist) {
		this.isAssigneeExist = isAssigneeExist;
	}
	
	public List<NagarikSurakshaAssgineeDTO> getAssigneeList() {
		return assigneeList;
	}
	public void setAssigneeList(List<NagarikSurakshaAssgineeDTO> assigneeList) {
		this.assigneeList = assigneeList;
	}
	public OccupationDTO getOccupationDTO() {
		return occupationDTO;
	}
	public void setOccupationDTO(OccupationDTO occupationDTO) {
		this.occupationDTO = occupationDTO;
	}
	public RelationshipDTO getRelationshipDTO() {
		return relationshipDTO;
	}
	public void setRelationshipDTO(RelationshipDTO relationshipDTO) {
		this.relationshipDTO = relationshipDTO;
	}
	public GenderDTO getGenderDTO() {
		return genderDTO;
	}
	public void setGenderDTO(GenderDTO genderDTO) {
		this.genderDTO = genderDTO;
	}
	public SumInsuredDTO getSumInsuredDTO() {
		return sumInsuredDTO;
	}
	public void setSumInsuredDTO(SumInsuredDTO sumInsuredDTO) {
		this.sumInsuredDTO = sumInsuredDTO;
	}
	public Character getIsEmployed() {
		return isEmployed;
	}
	public void setIsEmployed(Character isEmployed) {
		this.isEmployed = isEmployed;
	}

}
