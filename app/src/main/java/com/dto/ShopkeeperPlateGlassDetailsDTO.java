package com.dto;

public class ShopkeeperPlateGlassDetailsDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3936207269821949346L;
	private String description;
	private String height;
	private String descriptionPosition;
	private String width;
	private ShopkeeperGlassTypeDTO shopkeeperGlassType;
	private String value;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getDescriptionPosition() {
		return descriptionPosition;
	}
	public void setDescriptionPosition(String descriptionPosition) {
		this.descriptionPosition = descriptionPosition;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public ShopkeeperGlassTypeDTO getShopkeeperGlassType() {
		return shopkeeperGlassType;
	}
	public void setShopkeeperGlassType(ShopkeeperGlassTypeDTO shopkeeperGlassType) {
		this.shopkeeperGlassType = shopkeeperGlassType;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
