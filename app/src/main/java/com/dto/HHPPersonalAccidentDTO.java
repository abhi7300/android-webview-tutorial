package com.dto;

public class HHPPersonalAccidentDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8166648538364000677L;
	private String assigneeName;
	private RelationshipDTO relationshipByAsRelationId;
	private RelationshipDTO relationshipByRelationid;
	private String dateOfBirth;
	private GenderDTO genderDTO;
	private String monthlyIncome;
	private String name;
	private OccupationDTO occupationDTO;
	private String existingDiseases;
	private RiskClassDTO riskClassDTO;
	private SumInsuredDTO sumInsuredDTO;
	private TableOfCoverDTO tableOfCoverDTO;
	private MedicalExtensionsDTO medicalExtensions;
	
	
	public String getAssigneeName() {
		return assigneeName;
	}
	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}
	public RelationshipDTO getRelationshipByAsRelationId() {
		return relationshipByAsRelationId;
	}
	public void setRelationshipByAsRelationId(
			RelationshipDTO relationshipByAsRelationId) {
		this.relationshipByAsRelationId = relationshipByAsRelationId;
	}
	public RelationshipDTO getRelationshipByRelationid() {
		return relationshipByRelationid;
	}
	public void setRelationshipByRelationid(RelationshipDTO relationshipByRelationid) {
		this.relationshipByRelationid = relationshipByRelationid;
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
	public String getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(String monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public OccupationDTO getOccupationDTO() {
		return occupationDTO;
	}
	public void setOccupationDTO(OccupationDTO occupationDTO) {
		this.occupationDTO = occupationDTO;
	}
	public String getExistingDiseases() {
		return existingDiseases;
	}
	public void setExistingDiseases(String existingDiseases) {
		this.existingDiseases = existingDiseases;
	}
	public RiskClassDTO getRiskClassDTO() {
		return riskClassDTO;
	}
	public void setRiskClassDTO(RiskClassDTO riskClassDTO) {
		this.riskClassDTO = riskClassDTO;
	}
	public TableOfCoverDTO getTableOfCoverDTO() {
		return tableOfCoverDTO;
	}
	public void setTableOfCoverDTO(TableOfCoverDTO tableOfCoverDTO) {
		this.tableOfCoverDTO = tableOfCoverDTO;
	}
	public MedicalExtensionsDTO getMedicalExtensions() {
		return medicalExtensions;
	}
	public void setMedicalExtensions(MedicalExtensionsDTO medicalExtensions) {
		this.medicalExtensions = medicalExtensions;
	}
	public SumInsuredDTO getSumInsuredDTO() {
		return sumInsuredDTO;
	}
	public void setSumInsuredDTO(SumInsuredDTO sumInsuredDTO) {
		this.sumInsuredDTO = sumInsuredDTO;
	}
	
	

}
