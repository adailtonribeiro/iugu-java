package com.adailtonribeiro.iugu.services;

import com.adailtonribeiro.iugu.exceptions.IuguException;
import com.adailtonribeiro.iugu.interfaces.IuguParameterResolver;
import com.adailtonribeiro.iugu.model.invoice.IuguInvoice;
import com.adailtonribeiro.iugu.model.invoice.IuguInvoiceReturn;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Class responsible for executing operations related to the customer's invoice
 * through the Iugu API.
 * 
 * @author adailton.ribeiro
 */
public class IuguInvoiceService extends IuguBaseService {

	public IuguInvoiceService(IuguParameterResolver parameterResolver) {
		super(parameterResolver);
	}

	@Override
	public String getPath() {
		return "invoices";
	}

	/**
	 * Create an invoice from the data informed by the user {@link IuguInvoice}.
	 * 
	 * @param iuguInvoice
	 *            Object with the invoice data {@link IuguInvoice}.
	 * @return Return an object with the invoice data returned
	 *         {@link IuguInvoiceReturn}.
	 * @throws IuguException
	 */
	public IuguInvoiceReturn createInvoice(IuguInvoice iuguInvoice) throws IuguException {
		IuguInvoiceReturn response = null;
		try {
			String jsonInvoice = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(iuguInvoice);
			String jsonInvoiceReturn = sendPost(jsonInvoice);
			response = new ObjectMapper().readValue(jsonInvoiceReturn, IuguInvoiceReturn.class);
		} catch (Throwable e) {
			throw new IuguException(e);
		}
		return response;
	}

	/**
	 * Find an invoice from the invoice identification <code>invoiceId</code>
	 * informed.
	 * 
	 * @param invoiceId
	 *            Invoice Identification.
	 * @return Return an object with the invoice data returned
	 *         {@link IuguInvoiceReturn}.
	 * @throws IuguException
	 */
	public IuguInvoiceReturn findInvoice(String invoiceId) throws IuguException {
		IuguInvoiceReturn response = null;
		try {
			String jsonInvoiceReturn = sendGet(invoiceId);
			response = new ObjectMapper().readValue(jsonInvoiceReturn, IuguInvoiceReturn.class);
		} catch (Throwable e) {
			throw new IuguException(e);
		}
		return response;
	}

}
