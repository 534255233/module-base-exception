package com.zlp.exception;

public class DeleteErrorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DeleteErrorException(String msg) {
		super(msg);
	}
	
	public DeleteErrorException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
