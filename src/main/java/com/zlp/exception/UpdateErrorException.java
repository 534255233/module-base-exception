package com.zlp.exception;

public class UpdateErrorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UpdateErrorException(String msg) {
		super(msg);
	}
	
	public UpdateErrorException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
