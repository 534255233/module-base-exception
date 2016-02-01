package com.zlp.exception;

public class FileNoExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public FileNoExistException(String msg) {
		super(msg);
	}
	
	public FileNoExistException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
