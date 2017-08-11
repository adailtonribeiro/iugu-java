package com.adailtonribeiro.iugu.model.payment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author adailton.ribeiro
 */
public class IuguPaymentCreditCard extends IuguPayment {

	protected String token;

	@JsonProperty("token")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
