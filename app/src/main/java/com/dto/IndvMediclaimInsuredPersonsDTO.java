package com.dto;


public class IndvMediclaimInsuredPersonsDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8388870072681178644L;
    private RelationshipDTO relationshipByAsRelationDTO;
    private GenderDTO genderDTO;
    private RelationshipDTO relationshipByRelationDTO;
    private String name;
    private String dateOfBirth;
    private String assigneeName;
    private String preExistingAilments;
    private String sufferingSince;
    private String createdBy;
    private String updatedBy;
    private String photoFileName;
    private String isSpouseEmployed;
    
    
    
	public RelationshipDTO getRelationshipByAsRelationDTO() {
		return relationshipByAsRelationDTO;
	}
	public void setRelationshipByAsRelationDTO(
			RelationshipDTO relationshipByAsRelationDTO) {
		this.relationshipByAsRelationDTO = relationshipByAsRelationDTO;
	}
	public GenderDTO getGenderDTO() {
		return genderDTO;
	}
	public void setGenderDTO(GenderDTO genderDTO) {
		this.genderDTO = genderDTO;
	}
	public RelationshipDTO getRelationshipByRelationDTO() {
		return relationshipByRelationDTO;
	}
	public void setRelationshipByRelationDTO(
			RelationshipDTO relationshipByRelationDTO) {
		this.relationshipByRelationDTO = relationshipByRelationDTO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAssigneeName() {
		return assigneeName;
	}
	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}
	public String getPreExistingAilments() {
		return preExistingAilments;
	}
	public void setPreExistingAilments(String preExistingAilments) {
		this.preExistingAilments = preExistingAilments;
	}
	public String getSufferingSince() {
		return sufferingSince;
	}
	public void setSufferingSince(String sufferingSince) {
		this.sufferingSince = sufferingSince;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getPhotoFileName() {
		return photoFileName;
	}
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}
	public String getIsSpouseEmployed() {
		return isSpouseEmployed;
	}
	public void setIsSpouseEmployed(String isSpouseEmployed) {
		this.isSpouseEmployed = isSpouseEmployed;
	}

    
    
}
