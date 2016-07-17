package com.dto;

public class MotorPolicyDiscountsMasterOrganizationsDTO extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1396612381496508955L;
	private String orgId;
    private String orgDescription;
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getOrgDescription() {
		return orgDescription;
	}
	public void setOrgDescription(String orgDescription) {
		this.orgDescription = orgDescription;
	}

}
