package com.krypton.core.internal.exceptions;

public class AlreadyLoggedInException extends KryptonException {

	private static final long serialVersionUID = 1416121959745446925L;

	public AlreadyLoggedInException(String message) {
		super(message);
	}
}
