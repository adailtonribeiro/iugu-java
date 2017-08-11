package com.adailtonribeiro.iugu.services;

import com.adailtonribeiro.iugu.exceptions.IuguException;
import com.adailtonribeiro.iugu.interfaces.IuguParameterResolver;
import com.adailtonribeiro.iugu.model.payment.IuguPayment;
import com.adailtonribeiro.iugu.model.payment.IuguPaymentReturn;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Class responsible for executing payment services through the Iugu API.
 * 
 * @author adailton.ribeiro
 */
public class IuguChargeService extends IuguBaseService {

	public IuguChargeService(IuguParameterResolver parameterResolver) {
		super(parameterResolver);
	}

	@Override
	public String getPath() {
		return "charge";
	}

	/**
	 * Execute the payment by sending the payment data {@link IuguPayment} to the
	 * Iugu REST service.
	 * 
	 * @param iuguPayment
	 *            Object with the payment data {@link IuguPayment}
	 * @return Return an object with the payment data returned
	 *         {@link IuguPaymentReturn}
	 * @throws IuguException
	 */
	public IuguPaymentReturn executePayment(IuguPayment iuguPayment) throws IuguException {
		IuguPaymentReturn response = null;
		try {
			String jsonPayment = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(iuguPayment);
			String jsonPaymentReturn = sendPost(jsonPayment);
			response = new ObjectMapper().readValue(jsonPaymentReturn, IuguPaymentReturn.class);
		} catch (Throwable e) {
			throw new IuguException(e);
		}
		return response;
	}

}
