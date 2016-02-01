package com.zlp.exception;

public class NoReadPermException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoReadPermException(String msg) {
		super(msg);
	}
	
	public NoReadPermException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
