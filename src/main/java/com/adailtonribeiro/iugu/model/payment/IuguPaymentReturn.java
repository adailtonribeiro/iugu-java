package com.adailtonribeiro.iugu.model.payment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author adailton.ribeiro
 */
public class IuguPaymentReturn {

	private String message;
	private Object errors;
	private String success;
	private String url;
	private String pdf;
	private String identification;
	private String invoiceId;
	private String LR;

	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@JsonProperty("success")
	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	@JsonProperty("errors")
	public Object getErrors() {
		return errors;
	}

	public void setErrors(Object errors) {
		this.errors = errors;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("pdf")
	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}

	@JsonProperty("identification")
	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	@JsonProperty("invoice_id")
	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	@JsonProperty("LR")
	public String getLR() {
		return LR;
	}

	public void setLR(String lR) {
		LR = lR;
	}
}
