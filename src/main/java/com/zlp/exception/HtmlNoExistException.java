package com.zlp.exception;

public class HtmlNoExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public HtmlNoExistException(String msg) {
		super(msg);
	}
	
	public HtmlNoExistException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
