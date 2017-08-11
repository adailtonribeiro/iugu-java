package com.adailtonribeiro.iugu.model.invoice;

import java.util.ArrayList;
import java.util.List;

import com.adailtonribeiro.iugu.model.IuguItem;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author adailton.ribeiro
 */
public class IuguInvoice {

	private String invoiceId;
	private String email;
	private String dueDate;
	private String returnURL;
	private String expiredURL;
	private String notificationURL;
	private Integer taxCents;
	private Integer discountCents;
	private Boolean ignoreDueEmail;
	private List<IuguItem> items = new ArrayList<IuguItem>();

	public IuguInvoice(String invoiceId, String email, String dueDate, String returnURL, String expiredURL, String notificationURL, Integer taxCents,
			Integer discountCents, Boolean ignoreDueEmail, List<IuguItem> items) {
		this.invoiceId = invoiceId;
		this.email = email;
		this.dueDate = dueDate;
		this.returnURL = returnURL;
		this.expiredURL = expiredURL;
		this.notificationURL = notificationURL;
		this.taxCents = taxCents;
		this.discountCents = discountCents;
		this.ignoreDueEmail = ignoreDueEmail;
		this.items = items;
	}

	@JsonProperty("invoice_id")
	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("due_date")
	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	@JsonProperty("items")
	public List<IuguItem> getItems() {
		return items;
	}

	public void setItems(List<IuguItem> items) {
		this.items = items;
	}

	@JsonProperty("return_url")
	public String getReturnURL() {
		return returnURL;
	}

	public void setReturnURL(String returnURL) {
		this.returnURL = returnURL;
	}

	@JsonProperty("expired_url")
	public String getExpiredURL() {
		return expiredURL;
	}

	public void setExpiredURL(String expiredURL) {
		this.expiredURL = expiredURL;
	}

	@JsonProperty("notification_url")
	public String getNotificationURL() {
		return notificationURL;
	}

	public void setNotificationURL(String notificationURL) {
		this.notificationURL = notificationURL;
	}

	@JsonProperty("tax_cents")
	public Integer getTaxCents() {
		return taxCents;
	}

	public void setTaxCents(Integer taxCents) {
		this.taxCents = taxCents;
	}

	@JsonProperty("discount_cents")
	public Integer getDiscountCents() {
		return discountCents;
	}

	public void setDiscountCents(Integer discountCents) {
		this.discountCents = discountCents;
	}

	@JsonProperty("ignore_due_email")
	public Boolean getIgnoreDueEmail() {
		return ignoreDueEmail;
	}

	public void setIgnoreDueEmail(Boolean ignoreDueEmail) {
		this.ignoreDueEmail = ignoreDueEmail;
	}
}
