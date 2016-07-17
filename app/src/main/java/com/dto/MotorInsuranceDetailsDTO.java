package com.dto;

public class MotorInsuranceDetailsDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4634822730701450685L;
	private long insuranceDetailsId;
    private MotorInsurancePremiumDTO motorInsurancePremiumDTO;
    private MotorLovHypothecationDTO motorLovHypothecationDTO;
    private OiclBranchDTO oiclBranchDTO;
    private CityDTO phlCityDTO;
    private PincodeDTO phlPincodeDTO;
    private String PHLCompany = "";
    private String PHLCompanyAddress = "";
    private String insurancePeriodId = "";
    private String vehicleRegisNumber = "";
    private String engineNumber = "";
    private String chassisNumber = "";
    private String motorColor = "";
    private String isInsuranceEverDeclined;
    private String isDeclarationAccepted;
    private String proposalNo;
    private String startDate;
    private String endDate;
    private String isConfirmed;
    private String isPaid;
    private String isPolicyCreated;
    private String policyNumber = "";
    private String branchOffice;
    private String sourceCode = "";
    private String colorType;
    private String sourceType = "";
    private String sumInsured;    
    private String systemRemarks;
    private double discountPercentage = 0;       
    private String customerCode = "";
    private String customerLoginId = "";
    private String specialEmployeeView;
    private String specEmpRoleType;
    private String rtoCode;
    private String isOiclPolicy;
	private String isRenewRecord;
	private boolean isUserloggedIn;
	private String paymentType;
	
	private UserDTO personalDetailsUserDTO;
    private UserDTO createdByUserDTO;
	private UserDTO updatedByUserDTO;
	
	public long getInsuranceDetailsId() {
		return insuranceDetailsId;
	}
	public void setInsuranceDetailsId(long insuranceDetailsId) {
		this.insuranceDetailsId = insuranceDetailsId;
	}
	public MotorLovHypothecationDTO getMotorLovHypothecationDTO() {
		return motorLovHypothecationDTO;
	}
	public void setMotorLovHypothecationDTO(
			MotorLovHypothecationDTO motorLovHypothecationDTO) {
		this.motorLovHypothecationDTO = motorLovHypothecationDTO;
	}
	public MotorInsurancePremiumDTO getMotorInsurancePremiumDTO() {
		return motorInsurancePremiumDTO;
	}
	public void setMotorInsurancePremiumDTO(
			MotorInsurancePremiumDTO motorInsurancePremiumDTO) {
		this.motorInsurancePremiumDTO = motorInsurancePremiumDTO;
	}
	public OiclBranchDTO getOiclBranchDTO() {
		return oiclBranchDTO;
	}
	public void setOiclBranchDTO(OiclBranchDTO oiclBranchDTO) {
		this.oiclBranchDTO = oiclBranchDTO;
	}
	public CityDTO getPhlCityDTO() {
		return phlCityDTO;
	}
	public void setPhlCityDTO(CityDTO phlCityDTO) {
		this.phlCityDTO = phlCityDTO;
	}
	public PincodeDTO getPhlPincodeDTO() {
		return phlPincodeDTO;
	}
	public void setPhlPincodeDTO(PincodeDTO phlPincodeDTO) {
		this.phlPincodeDTO = phlPincodeDTO;
	}
	public String getPHLCompany() {
		return PHLCompany;
	}
	public void setPHLCompany(String pHLCompany) {
		PHLCompany = pHLCompany;
	}
	public String getPHLCompanyAddress() {
		return PHLCompanyAddress;
	}
	public void setPHLCompanyAddress(String pHLCompanyAddress) {
		PHLCompanyAddress = pHLCompanyAddress;
	}
	public String getInsurancePeriodId() {
		return insurancePeriodId;
	}
	public void setInsurancePeriodId(String insurancePeriodId) {
		this.insurancePeriodId = insurancePeriodId;
	}
	public String getVehicleRegisNumber() {
		return vehicleRegisNumber;
	}
	public void setVehicleRegisNumber(String vehicleRegisNumber) {
		this.vehicleRegisNumber = vehicleRegisNumber;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public String getMotorColor() {
		return motorColor;
	}
	public void setMotorColor(String motorColor) {
		this.motorColor = motorColor;
	}
	public String getIsInsuranceEverDeclined() {
		return isInsuranceEverDeclined;
	}
	public void setIsInsuranceEverDeclined(String isInsuranceEverDeclined) {
		this.isInsuranceEverDeclined = isInsuranceEverDeclined;
	}
	public String getIsDeclarationAccepted() {
		return isDeclarationAccepted;
	}
	public void setIsDeclarationAccepted(String isDeclarationAccepted) {
		this.isDeclarationAccepted = isDeclarationAccepted;
	}
	public String getProposalNo() {
		return proposalNo;
	}
	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}
	public String getIsConfirmed() {
		return isConfirmed;
	}
	public void setIsConfirmed(String isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	public String getIsPaid() {
		return isPaid;
	}
	public void setIsPaid(String isPaid) {
		this.isPaid = isPaid;
	}
	public String getIsPolicyCreated() {
		return isPolicyCreated;
	}
	public void setIsPolicyCreated(String isPolicyCreated) {
		this.isPolicyCreated = isPolicyCreated;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getBranchOffice() {
		return branchOffice;
	}
	public void setBranchOffice(String branchOffice) {
		this.branchOffice = branchOffice;
	}
	public String getSourceCode() {
		return sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}
	public String getColorType() {
		return colorType;
	}
	public void setColorType(String colorType) {
		this.colorType = colorType;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public String getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
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
	public String getSystemRemarks() {
		return systemRemarks;
	}
	public void setSystemRemarks(String systemRemarks) {
		this.systemRemarks = systemRemarks;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerLoginId() {
		return customerLoginId;
	}
	public void setCustomerLoginId(String customerLoginId) {
		this.customerLoginId = customerLoginId;
	}
	public String getSpecialEmployeeView() {
		return specialEmployeeView;
	}
	public void setSpecialEmployeeView(String specialEmployeeView) {
		this.specialEmployeeView = specialEmployeeView;
	}
	public String getSpecEmpRoleType() {
		return specEmpRoleType;
	}
	public void setSpecEmpRoleType(String specEmpRoleType) {
		this.specEmpRoleType = specEmpRoleType;
	}
	public String getRtoCode() {
		return rtoCode;
	}
	public void setRtoCode(String rtoCode) {
		this.rtoCode = rtoCode;
	}
	public String getIsOiclPolicy() {
		return isOiclPolicy;
	}
	public void setIsOiclPolicy(String isOiclPolicy) {
		this.isOiclPolicy = isOiclPolicy;
	}
	public String getIsRenewRecord() {
		return isRenewRecord;
	}
	public void setIsRenewRecord(String isRenewRecord) {
		this.isRenewRecord = isRenewRecord;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public boolean isUserloggedIn() {
		return isUserloggedIn;
	}
	public void setUserloggedIn(boolean isUserloggedIn) {
		this.isUserloggedIn = isUserloggedIn;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public UserDTO getPersonalDetailsUserDTO() {
		return personalDetailsUserDTO;
	}
	public void setPersonalDetailsUserDTO(UserDTO personalDetailsUserDTO) {
		this.personalDetailsUserDTO = personalDetailsUserDTO;
	}
}
