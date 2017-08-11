package com.adailtonribeiro.iugu.model.payment;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author adailton.ribeiro
 */
public class IuguPaymentToken {

	private String accountId;
	private String Method;
	private Map<String, String> data;
	private Long number;
	private Integer verificationValue;
	private String firstName;
	private String lastName;
	private Integer month;
	private Integer year;

	@JsonProperty("account_id")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	@JsonProperty("method")
	public String getMethod() {
		return Method;
	}

	public void setMethod(String method) {
		Method = method;
	}

	@JsonProperty("data")
	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	@JsonProperty("number")
	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	@JsonProperty("verification_value")
	public Integer getVerificationValue() {
		return verificationValue;
	}

	public void setVerificationValue(Integer verificationValue) {
		this.verificationValue = verificationValue;
	}

	@JsonProperty("first_name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("last_name")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("month")
	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	@JsonProperty("year")
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
}
