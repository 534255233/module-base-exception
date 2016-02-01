package com.zlp.exception;

public class NoUpdatePermException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoUpdatePermException(String msg) {
		super(msg);
	}
	
	public NoUpdatePermException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
