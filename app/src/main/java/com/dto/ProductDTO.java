package com.dto;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO extends BaseDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2012961947988962089L;
	private String productId;
	private String name;
	private List<PolicyTypesDTO> policyTypeses = new ArrayList<PolicyTypesDTO>(0);
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<PolicyTypesDTO> getPolicyTypeses() {
		return policyTypeses;
	}
	public void setPolicyTypeses(List<PolicyTypesDTO> policyTypeses) {
		this.policyTypeses = policyTypeses;
	}
}
