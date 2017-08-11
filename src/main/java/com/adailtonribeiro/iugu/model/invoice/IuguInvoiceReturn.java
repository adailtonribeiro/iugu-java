package com.adailtonribeiro.iugu.model.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author adailton.ribeiro
 */
public class IuguInvoiceReturn {

	private String id;
	private String dueDate;
	private String currency;
	private String discountCents;
	private String email;
	private String totalCents;
	private String itemsTotalCents;
	private String notificationURL;
	private String returnURL;
	private String status;
	private String taxCents;
	private String paid;
	private String paidCents;
	private String paidAt;
	private String secureId;
	private String secureURL;
	private String customerId;
	private String customerRef;
	private String userId;
	private String total;
	private String taxesPaid;
	private String taxesPaidCents;
	private String interest;
	private String discount;
	private String createdAt;
	private String updatedAt;
	private String refundable;
	private String installments;
	private String ccEmails;
	private Object bankSlip;
	private Object items;
	private Object variables;
	private Object customVariables;
	private Object logs;
	private Object errors;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("due_date")
	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@JsonProperty("discount_cents")
	public String getDiscountCents() {
		return discountCents;
	}

	public void setDiscountCents(String discountCents) {
		this.discountCents = discountCents;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("total_cents")
	public String getTotalCents() {
		return totalCents;
	}

	public void setTotalCents(String totalCents) {
		this.totalCents = totalCents;
	}

	@JsonProperty("items_total_cents")
	public String getItemsTotalCents() {
		return itemsTotalCents;
	}

	public void setItemsTotalCents(String itemsTotalCents) {
		this.itemsTotalCents = itemsTotalCents;
	}

	@JsonProperty("notification_url")
	public String getNotificationURL() {
		return notificationURL;
	}

	public void setNotificationURL(String notificationURL) {
		this.notificationURL = notificationURL;
	}

	@JsonProperty("return_url")
	public String getReturnURL() {
		return returnURL;
	}

	public void setReturnURL(String returnURL) {
		this.returnURL = returnURL;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("tax_cents")
	public String getTaxCents() {
		return taxCents;
	}

	public void setTaxCents(String taxCents) {
		this.taxCents = taxCents;
	}

	@JsonProperty("taxes_paid_cents")
	public String getTaxesPaidCents() {
		return taxesPaidCents;
	}

	public void setTaxesPaidCents(String taxesPaidCents) {
		this.taxesPaidCents = taxesPaidCents;
	}

	@JsonProperty("paid")
	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	@JsonProperty("paid_cents")
	public String getPaidCents() {
		return paidCents;
	}

	public void setPaidCents(String paidCents) {
		this.paidCents = paidCents;
	}

	@JsonProperty("paid_at")
	public String getPaidAt() {
		return paidAt;
	}

	public void setPaidAt(String paidAt) {
		this.paidAt = paidAt;
	}

	@JsonProperty("secure_id")
	public String getSecureId() {
		return secureId;
	}

	public void setSecureId(String secureId) {
		this.secureId = secureId;
	}

	@JsonProperty("secure_url")
	public String getSecureURL() {
		return secureURL;
	}

	public void setSecureURL(String secureURL) {
		this.secureURL = secureURL;
	}

	@JsonProperty("customer_ref")
	public String getCustomerRef() {
		return customerRef;
	}

	public void setCustomerRef(String customerRef) {
		this.customerRef = customerRef;
	}

	@JsonProperty("customer_id")
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@JsonProperty("user_id")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@JsonProperty("total")
	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@JsonProperty("taxes_paid")
	public String getTaxesPaid() {
		return taxesPaid;
	}

	public void setTaxesPaid(String taxesPaid) {
		this.taxesPaid = taxesPaid;
	}

	@JsonProperty("interest")
	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	@JsonProperty("discount")
	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@JsonProperty("refundable")
	public String getRefundable() {
		return refundable;
	}

	public void setRefundable(String refundable) {
		this.refundable = refundable;
	}

	@JsonProperty("installments")
	public String getInstallments() {
		return installments;
	}

	public void setInstallments(String installments) {
		this.installments = installments;
	}

	@JsonProperty("cc_emails")
	public String getCcEmails() {
		return ccEmails;
	}

	public void setCcEmails(String ccEmails) {
		this.ccEmails = ccEmails;
	}

	@JsonProperty("bank_slip")
	public Object getBankSlip() {
		return bankSlip;
	}

	public void setBankSlip(Object bankSlip) {
		this.bankSlip = bankSlip;
	}

	@JsonProperty("items")
	public Object getItems() {
		return items;
	}

	public void setItems(Object items) {
		this.items = items;
	}

	@JsonProperty("variables")
	public Object getVariables() {
		return variables;
	}

	public void setVariables(Object variables) {
		this.variables = variables;
	}

	@JsonProperty("custom_variables")
	public Object getCustomVariables() {
		return customVariables;
	}

	public void setCustomVariables(Object customVariables) {
		this.customVariables = customVariables;
	}

	@JsonProperty("logs")
	public Object getLogs() {
		return logs;
	}

	public void setLogs(Object logs) {
		this.logs = logs;
	}

	@JsonProperty("errors")
	public Object getErrors() {
		return errors;
	}

	public void setErrors(Object errors) {
		this.errors = errors;
	}
}
