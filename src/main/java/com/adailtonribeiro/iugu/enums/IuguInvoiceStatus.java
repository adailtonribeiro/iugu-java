package com.adailtonribeiro.iugu.enums;

/**
 * @author adailton.ribeiro
 */
public enum IuguInvoiceStatus {

	DRAFT("draft"), // 0
	PENDING("pending"), // 1
	PARTIALLY_PAID("partially_paid"), // 2
	PAID("paid"), // 3
	CANCELED("canceled"), // 4
	REFUNDED("refunded"), // 5
	EXPIRED("expired"); // 6

	private String value;

	private IuguInvoiceStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
