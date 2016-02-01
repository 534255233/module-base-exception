package com.zlp.exception;

public class AddErrorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AddErrorException(String msg) {
		super(msg);
	}
	
	public AddErrorException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
