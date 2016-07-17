package com.dto;


public class AgentDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6147270527504649448L;
	private String portalAgentId;
    private OiclBranchDTO oiclBranchDTO;
	private String agentCode;
	private String irdaLicenseNo;
	private String irdaLicenseExpDate;
	private String email2;
	private String status;
	private String xformKey;
	private String adminComments;
	private AgentResidenceAddressDTO agentResidenceAddressDTO ;
	
	
	public String getPortalAgentId() {
		return portalAgentId;
	}
	public void setPortalAgentId(String portalAgentId) {
		this.portalAgentId = portalAgentId;
	}
	public OiclBranchDTO getOiclBranchDTO() {
		return oiclBranchDTO;
	}
	public void setOiclBranchDTO(OiclBranchDTO oiclBranchDTO) {
		this.oiclBranchDTO = oiclBranchDTO;
	}
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getIrdaLicenseNo() {
		return irdaLicenseNo;
	}
	public void setIrdaLicenseNo(String irdaLicenseNo) {
		this.irdaLicenseNo = irdaLicenseNo;
	}
	public String getIrdaLicenseExpDate() {
		return irdaLicenseExpDate;
	}
	public void setIrdaLicenseExpDate(String irdaLicenseExpDate) {
		this.irdaLicenseExpDate = irdaLicenseExpDate;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getXformKey() {
		return xformKey;
	}
	public void setXformKey(String xformKey) {
		this.xformKey = xformKey;
	}
	public String getAdminComments() {
		return adminComments;
	}
	public void setAdminComments(String adminComments) {
		this.adminComments = adminComments;
	}
	public AgentResidenceAddressDTO getAgentResidenceAddressDTO() {
		return agentResidenceAddressDTO;
	}
	public void setAgentResidenceAddressDTO(
			AgentResidenceAddressDTO agentResidenceAddressDTO) {
		this.agentResidenceAddressDTO = agentResidenceAddressDTO;
	}
	
	
	
	
}
