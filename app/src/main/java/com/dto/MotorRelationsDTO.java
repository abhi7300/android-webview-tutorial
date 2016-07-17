package com.dto;

public class MotorRelationsDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -588571611481332352L;
	private CityDTO cityDTO;
    private MotorManufacturerDTO motorManufacturerDTO;
    private MotorVariantDTO motorVariantDTO;
    private ProductDTO productDTO;
    private MotorModelDTO motorModelDTO;
	public CityDTO getCityDTO() {
		return cityDTO;
	}
	public void setCityDTO(CityDTO cityDTO) {
		this.cityDTO = cityDTO;
	}
	public MotorManufacturerDTO getMotorManufacturerDTO() {
		return motorManufacturerDTO;
	}
	public void setMotorManufacturerDTO(MotorManufacturerDTO motorManufacturerDTO) {
		this.motorManufacturerDTO = motorManufacturerDTO;
	}
	public MotorVariantDTO getMotorVariantDTO() {
		return motorVariantDTO;
	}
	public void setMotorVariantDTO(MotorVariantDTO motorVariantDTO) {
		this.motorVariantDTO = motorVariantDTO;
	}
	public ProductDTO getProductDTO() {
		return productDTO;
	}
	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}
	public MotorModelDTO getMotorModelDTO() {
		return motorModelDTO;
	}
	public void setMotorModelDTO(MotorModelDTO motorModelDTO) {
		this.motorModelDTO = motorModelDTO;
	}
}
