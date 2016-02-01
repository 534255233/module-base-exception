package com.zlp.exception;

public class NoDeletePermException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoDeletePermException(String msg) {
		super(msg);
	}
	
	public NoDeletePermException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
