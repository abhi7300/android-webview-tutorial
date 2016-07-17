package com.dto;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BrokerDashboardDTO extends BaseDTO{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4079478785026121262L;
	private Map<String, String> dashboardDetailsMap = new LinkedHashMap<String, String>();
	private boolean isLicenseExpired;
	private String licenseExpiredText;
	private String licenseExpiredDate;
	private boolean isLicenseAboutToExpire;
	private String licenseAboutToExpireText;
	private String licenseAboutToExpireDate;
	private List<CDBalanceDTO> cDBalanceDTOList;

	public Map<String, String> getDashboardDetailsMap() {
		return dashboardDetailsMap;
	}

	public void setDashboardDetailsMap(Map<String, String> dashboardDetailsMap) {
		this.dashboardDetailsMap = dashboardDetailsMap;
	}


	public String getLicenseExpiredText() {
		return licenseExpiredText;
	}

	public void setLicenseExpiredText(String licenseExpiredText) {
		this.licenseExpiredText = licenseExpiredText;
	}

	public String getLicenseExpiredDate() {
		return licenseExpiredDate;
	}

	public void setLicenseExpiredDate(String licenseExpiredDate) {
		this.licenseExpiredDate = licenseExpiredDate;
	}


	public String getLicenseAboutToExpireText() {
		return licenseAboutToExpireText;
	}

	public void setLicenseAboutToExpireText(String licenseAboutToExpireText) {
		this.licenseAboutToExpireText = licenseAboutToExpireText;
	}

	public String getLicenseAboutToExpireDate() {
		return licenseAboutToExpireDate;
	}

	public void setLicenseAboutToExpireDate(String licenseAboutToExpireDate) {
		this.licenseAboutToExpireDate = licenseAboutToExpireDate;
	}

	public boolean isLicenseExpired() {
		return isLicenseExpired;
	}

	public void setLicenseExpired(boolean isLicenseExpired) {
		this.isLicenseExpired = isLicenseExpired;
	}

	public boolean isLicenseAboutToExpire() {
		return isLicenseAboutToExpire;
	}

	public void setLicenseAboutToExpire(boolean isLicenseAboutToExpire) {
		this.isLicenseAboutToExpire = isLicenseAboutToExpire;
	}

	public List<CDBalanceDTO> getcDBalanceDTOList() {
		return cDBalanceDTOList;
	}

	public void setcDBalanceDTOList(List<CDBalanceDTO> cDBalanceDTOList) {
		this.cDBalanceDTOList = cDBalanceDTOList;
	}

	


}
