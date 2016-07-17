package com.dto;


public class HappyFamilyFloaterPolicyPersonsDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1946534473453871460L;
	
    
    private RelationshipDTO relationshipByAsRelationIdDTO;
    private RelationshipDTO relationshipByRelationIdDTO;
    private GenderDTO genderDTO;
    private OccupationDTO occupationSTO;
    private HappyFamilyFloaterPolicySumInsuredDTO happyFamilyFloaterPolicySumInsuredDTO;
    private HappyFamilyFloaterPolicyChildPaSumInsuredDTO happyFamilyFloaterPolicyChildPaSumInsuredDTO;
    
    private String name = "";
    private String dateOfBirth;
    private String isDependantOnProposer;
    private String isPaCovered = "";
    private String assigneeName;
    private String preExistingAilments = "";
    private String sufferingSince;
    private String photoFileName;
    private byte[] fileArray;
    private String fileName;
    private String mimeType;
    
    
	public RelationshipDTO getRelationshipByAsRelationIdDTO() {
		return relationshipByAsRelationIdDTO;
	}
	public void setRelationshipByAsRelationIdDTO(
			RelationshipDTO relationshipByAsRelationIdDTO) {
		this.relationshipByAsRelationIdDTO = relationshipByAsRelationIdDTO;
	}
	public RelationshipDTO getRelationshipByRelationIdDTO() {
		return relationshipByRelationIdDTO;
	}
	public void setRelationshipByRelationIdDTO(
			RelationshipDTO relationshipByRelationIdDTO) {
		this.relationshipByRelationIdDTO = relationshipByRelationIdDTO;
	}
	public GenderDTO getGenderDTO() {
		return genderDTO;
	}
	public void setGenderDTO(GenderDTO genderDTO) {
		this.genderDTO = genderDTO;
	}
	public OccupationDTO getOccupationSTO() {
		return occupationSTO;
	}
	public void setOccupationSTO(OccupationDTO occupationSTO) {
		this.occupationSTO = occupationSTO;
	}
	public HappyFamilyFloaterPolicySumInsuredDTO getHappyFamilyFloaterPolicySumInsuredDTO() {
		return happyFamilyFloaterPolicySumInsuredDTO;
	}
	public void setHappyFamilyFloaterPolicySumInsuredDTO(
			HappyFamilyFloaterPolicySumInsuredDTO happyFamilyFloaterPolicySumInsuredDTO) {
		this.happyFamilyFloaterPolicySumInsuredDTO = happyFamilyFloaterPolicySumInsuredDTO;
	}
	public HappyFamilyFloaterPolicyChildPaSumInsuredDTO getHappyFamilyFloaterPolicyChildPaSumInsuredDTO() {
		return happyFamilyFloaterPolicyChildPaSumInsuredDTO;
	}
	public void setHappyFamilyFloaterPolicyChildPaSumInsuredDTO(
			HappyFamilyFloaterPolicyChildPaSumInsuredDTO happyFamilyFloaterPolicyChildPaSumInsuredDTO) {
		this.happyFamilyFloaterPolicyChildPaSumInsuredDTO = happyFamilyFloaterPolicyChildPaSumInsuredDTO;
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
	public String getIsDependantOnProposer() {
		return isDependantOnProposer;
	}
	public void setIsDependantOnProposer(String isDependantOnProposer) {
		this.isDependantOnProposer = isDependantOnProposer;
	}
	public String getIsPaCovered() {
		return isPaCovered;
	}
	public void setIsPaCovered(String isPaCovered) {
		this.isPaCovered = isPaCovered;
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
	public String getPhotoFileName() {
		return photoFileName;
	}
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}
	public byte[] getFileArray() {
		return fileArray;
	}
	public void setFileArray(byte[] fileArray) {
		this.fileArray = fileArray;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getMimeType() {
		return mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

}
