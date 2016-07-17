package com.dto;


public class PersonalAccidentDetailsDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7265451200382477321L;

	
	private String name = "";
	private String dateOfBirth;
	private GenderDTO genderDTO;
	private RiskClassDTO riskClassDTO;
	private String monthlyIncome;
	private RelationshipDTO assigneeRelationshipDTO;
	private String medicalHistory = "";
	private String assigneeName;
	private TableOfCoverDTO tableOfCoverDTO;
	private SumInsuredDTO sumInsuredDTO;
    private MedicalExtensionsDTO medicalExtensionsDTO;
    private String isEmployed = "";
    private String cumBonus;
    
    
    
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
	public GenderDTO getGenderDTO() {
		return genderDTO;
	}
	public void setGenderDTO(GenderDTO genderDTO) {
		this.genderDTO = genderDTO;
	}
	public RiskClassDTO getRiskClassDTO() {
		return riskClassDTO;
	}
	public void setRiskClassDTO(RiskClassDTO riskClassDTO) {
		this.riskClassDTO = riskClassDTO;
	}
	public String getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(String monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	public RelationshipDTO getAssigneeRelationshipDTO() {
		return assigneeRelationshipDTO;
	}
	public void setAssigneeRelationshipDTO(RelationshipDTO assigneeRelationshipDTO) {
		this.assigneeRelationshipDTO = assigneeRelationshipDTO;
	}
	public String getMedicalHistory() {
		return medicalHistory;
	}
	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	public String getAssigneeName() {
		return assigneeName;
	}
	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}
	public TableOfCoverDTO getTableOfCoverDTO() {
		return tableOfCoverDTO;
	}
	public void setTableOfCoverDTO(TableOfCoverDTO tableOfCoverDTO) {
		this.tableOfCoverDTO = tableOfCoverDTO;
	}
	public SumInsuredDTO getSumInsuredDTO() {
		return sumInsuredDTO;
	}
	public void setSumInsuredDTO(SumInsuredDTO sumInsuredDTO) {
		this.sumInsuredDTO = sumInsuredDTO;
	}
	public MedicalExtensionsDTO getMedicalExtensionsDTO() {
		return medicalExtensionsDTO;
	}
	public void setMedicalExtensionsDTO(MedicalExtensionsDTO medicalExtensionsDTO) {
		this.medicalExtensionsDTO = medicalExtensionsDTO;
	}
	public String getIsEmployed() {
		return isEmployed;
	}
	public void setIsEmployed(String isEmployed) {
		this.isEmployed = isEmployed;
	}
	public String getCumBonus() {
		return cumBonus;
	}
	public void setCumBonus(String cumBonus) {
		this.cumBonus = cumBonus;
	}    
    
   
}
