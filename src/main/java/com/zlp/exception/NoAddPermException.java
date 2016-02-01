package com.zlp.exception;

public class NoAddPermException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoAddPermException(String msg) {
		super(msg);
	}
	
	public NoAddPermException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
