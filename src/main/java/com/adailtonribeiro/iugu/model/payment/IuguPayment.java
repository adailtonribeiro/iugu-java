package com.adailtonribeiro.iugu.model.payment;

import java.util.ArrayList;
import java.util.List;

import com.adailtonribeiro.iugu.model.IuguItem;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author adailton.ribeiro
 */
public class IuguPayment {

	protected String email;
	protected String invoceId;
	protected List<IuguItem> items = new ArrayList<IuguItem>();

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("invoice_id")
	public String getInvoceId() {
		return invoceId;
	}

	public void setInvoceId(String invoceId) {
		this.invoceId = invoceId;
	}

	@JsonProperty("items")
	public List<IuguItem> getItems() {
		return items;
	}

	public void setItems(List<IuguItem> items) {
		this.items = items;
	}
}
