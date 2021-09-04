package com.Andika_Training.demo.exceptionHandling.custom;



public class GeneralErrorException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6441407542243332878L;
	String errorCode = "99";
	String descErrorCode;
	String descErrorCodeEN;
	String errCause = "";
	
	public GeneralErrorException(String message) {
		super(message);
	}
	
	public GeneralErrorException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public GeneralErrorException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	public GeneralErrorException(String locale, String errorCode, String message, String messageEn) {
		super(locale.equalsIgnoreCase("en") ? messageEn : message);
		this.errorCode = errorCode;
		this.descErrorCode = message;
		this.descErrorCodeEN = messageEn;
	}

	public GeneralErrorException(String locale, String errorCode, String message, String messageEn, String errCause) {
		super(locale.equalsIgnoreCase("en") ? messageEn : message);
		this.errorCode = errorCode;
		this.descErrorCode = message;
		this.descErrorCodeEN = messageEn;
		this.errCause = errCause + " ";
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDescErrorCode() {
		return descErrorCode;
	}

	public void setDescErrorCode(String descErrorCode) {
		this.descErrorCode = descErrorCode;
	}

	public String getDescErrorCodeEN() {
		return descErrorCodeEN;
	}

	public void setDescErrorCodeEN(String descErrorCodeEN) {
		this.descErrorCodeEN = descErrorCodeEN;
	}

	public String getErrCause() {
		return errCause;
	}
}
