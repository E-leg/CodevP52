package com.krypton.core.internal.exceptions;

public class EmailAlreadyConfirmedException extends KryptonException {

	private static final long serialVersionUID = -6308586756277279692L;

	public EmailAlreadyConfirmedException(String message) {
		super(message);
	}

}
