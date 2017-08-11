package com.adailtonribeiro.iugu.model.payment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author adailton.ribeiro
 */
public class IuguPaymentBankSlip extends IuguPayment {

	protected String method = "bank_slip";

	@JsonProperty("method")
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

}
