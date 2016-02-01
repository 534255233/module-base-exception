package com.zlp.exception;

public class SessionNullException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SessionNullException(String msg) {
		super(msg);
	}
	
	public SessionNullException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
