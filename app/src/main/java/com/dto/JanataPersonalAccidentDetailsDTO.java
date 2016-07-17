package com.dto;


public class JanataPersonalAccidentDetailsDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7794446461675448473L;

	private String name = "";
	private String address = "";
	private String birthDate;
	private GenderDTO genderDTO;
	private String fatherOrSpouseName = "";
	private SumInsuredDTO sumInsuredDTO;
	private String assigneeName = "";
	private RelationshipDTO relationshipDTO;
	private String assigneeDobDt;
	private String witness = "";
	private String employeeNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public GenderDTO getGenderDTO() {
		return genderDTO;
	}

	public void setGenderDTO(GenderDTO genderDTO) {
		this.genderDTO = genderDTO;
	}

	public String getFatherOrSpouseName() {
		return fatherOrSpouseName;
	}

	public void setFatherOrSpouseName(String fatherOrSpouseName) {
		this.fatherOrSpouseName = fatherOrSpouseName;
	}

	public SumInsuredDTO getSumInsuredDTO() {
		return sumInsuredDTO;
	}

	public void setSumInsuredDTO(SumInsuredDTO sumInsuredDTO) {
		this.sumInsuredDTO = sumInsuredDTO;
	}

	public String getAssigneeName() {
		return assigneeName;
	}

	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}

	public RelationshipDTO getRelationshipDTO() {
		return relationshipDTO;
	}

	public void setRelationshipDTO(RelationshipDTO relationshipDTO) {
		this.relationshipDTO = relationshipDTO;
	}

	public String getWitness() {
		return witness;
	}

	public void setWitness(String witness) {
		this.witness = witness;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAssigneeDobDt() {
		return assigneeDobDt;
	}

	public void setAssigneeDobDt(String assigneeDobDt) {
		this.assigneeDobDt = assigneeDobDt;
	}

}
