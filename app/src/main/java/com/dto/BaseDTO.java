package com.dto;

import java.io.Serializable;

public class BaseDTO implements Serializable{

	private String errorCode;

	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
}
