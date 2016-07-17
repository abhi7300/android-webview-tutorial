package com.dto;



public class ClaimDocumentMapDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2045186118993240034L;
	private Long id;
	private ClaimsDTO claims;
	private ClaimDocumentTypesDTO claimDocumentTypes;
	private String claimIntimationNo;
	private String claimRegistrationNo;
	private String fileName;
	private String relativeFilePath;
	private String dmsUuid;
	private String uploadDate;
	private String createDate;
	private String updateDate;
	private OiclBranchDTO oiclBranchDTO;
	private UserDTO createdByUserDTO;
	private UserDTO updatedByUserDTO;
	
	
	
	public ClaimsDTO getClaims() {
		return claims;
	}
	public void setClaims(ClaimsDTO claims) {
		this.claims = claims;
	}
	public ClaimDocumentTypesDTO getClaimDocumentTypes() {
		return claimDocumentTypes;
	}
	public void setClaimDocumentTypes(ClaimDocumentTypesDTO claimDocumentTypes) {
		this.claimDocumentTypes = claimDocumentTypes;
	}
	public String getClaimIntimationNo() {
		return claimIntimationNo;
	}
	public void setClaimIntimationNo(String claimIntimationNo) {
		this.claimIntimationNo = claimIntimationNo;
	}
	public String getClaimRegistrationNo() {
		return claimRegistrationNo;
	}
	public void setClaimRegistrationNo(String claimRegistrationNo) {
		this.claimRegistrationNo = claimRegistrationNo;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getRelativeFilePath() {
		return relativeFilePath;
	}
	public void setRelativeFilePath(String relativeFilePath) {
		this.relativeFilePath = relativeFilePath;
	}
	public String getDmsUuid() {
		return dmsUuid;
	}
	public void setDmsUuid(String dmsUuid) {
		this.dmsUuid = dmsUuid;
	}
	public String getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public UserDTO getCreatedByUserDTO() {
		return createdByUserDTO;
	}
	public void setCreatedByUserDTO(UserDTO createdByUserDTO) {
		this.createdByUserDTO = createdByUserDTO;
	}
	public UserDTO getUpdatedByUserDTO() {
		return updatedByUserDTO;
	}
	public void setUpdatedByUserDTO(UserDTO updatedByUserDTO) {
		this.updatedByUserDTO = updatedByUserDTO;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public OiclBranchDTO getOiclBranchDTO() {
		return oiclBranchDTO;
	}
	public void setOiclBranchDTO(OiclBranchDTO oiclBranchDTO) {
		this.oiclBranchDTO = oiclBranchDTO;
	}
		
}
