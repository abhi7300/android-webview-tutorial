package com.dto;

public class HigherDeductAmountDTO extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2915716971195807495L;
	private String higherDeductId;
    private String amount;
	public String getHigherDeductId() {
		return higherDeductId;
	}
	public void setHigherDeductId(String higherDeductId) {
		this.higherDeductId = higherDeductId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
}
