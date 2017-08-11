package com.adailtonribeiro.iugu.exceptions;

/**
 * @author adailton.ribeiro
 */
public class IuguException extends Throwable {

	private static final long serialVersionUID = -3081247126644306181L;

	public IuguException() {
		super();
	}

	public IuguException(Throwable rootCause) {
		super(rootCause);
	}

	public IuguException(String message) {
		super(message);
	}

	public IuguException(String message, Throwable t) {
		super(message, t);
		setStackTrace(t.getStackTrace());
	}

}
