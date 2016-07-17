package com.dto;

public class HouseHolderJewelleryDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2105236962419944918L;

	private String jewlleryValue;
	private String valuationCertificateNumber;
	private String itemWeight;
	private String itemDescription;
	
	
	public String getJewlleryValue() {
		return jewlleryValue;
	}
	public void setJewlleryValue(String jewlleryValue) {
		this.jewlleryValue = jewlleryValue;
	}
	public String getValuationCertificateNumber() {
		return valuationCertificateNumber;
	}
	public void setValuationCertificateNumber(String valuationCertificateNumber) {
		this.valuationCertificateNumber = valuationCertificateNumber;
	}
	public String getItemWeight() {
		return itemWeight;
	}
	public void setItemWeight(String itemWeight) {
		this.itemWeight = itemWeight;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

}
