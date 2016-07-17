package com.dto;

public class ExtendedGeographiesDTO extends BaseDTO{	
    /**
	 * 
	 */
	private static final long serialVersionUID = -1748098509050205906L;
	private String geographyId;	
    private String name;
	public String getGeographyId() {
		return geographyId;
	}
	public void setGeographyId(String geographyId) {
		this.geographyId = geographyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
