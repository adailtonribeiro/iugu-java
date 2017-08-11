package com.adailtonribeiro.iugu.services;

import com.adailtonribeiro.iugu.exceptions.IuguException;
import com.adailtonribeiro.iugu.interfaces.IuguParameterResolver;
import com.adailtonribeiro.iugu.model.payment.IuguPaymentReturn;
import com.adailtonribeiro.iugu.model.payment.IuguPaymentToken;
import com.adailtonribeiro.iugu.model.payment.IuguPaymentTokenReturn;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Class responsible for generating the payment Token through the Iugu API.
 * 
 * @author adailton.ribeiro
 */
public class IuguPaymentTokenService extends IuguBaseService {

	public IuguPaymentTokenService(IuguParameterResolver parameterResolver) {
		super(parameterResolver);
	}

	@Override
	public String getPath() {
		return "payment_token";
	}

	/**
	 * Generate the token from the payment data {@link IuguPaymentToken} informed by
	 * the user.
	 * 
	 * @param iuguPaymentToken
	 *            Payment data informed by user @{link IuguPaymentToken}.
	 * @return Return an object with the payment token {@link IuguPaymentReturn}
	 * @throws IuguException
	 */
	public IuguPaymentTokenReturn generateToken(IuguPaymentToken iuguPaymentToken) throws IuguException {
		IuguPaymentTokenReturn response = null;
		try {
			String jsonPaymentToken = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(iuguPaymentToken);
			String jsonPaymentTokenReturn = sendPost(jsonPaymentToken);
			response = new ObjectMapper().readValue(jsonPaymentTokenReturn, IuguPaymentTokenReturn.class);
		} catch (Throwable e) {
			new IuguException(e);
		}
		return response;
	}

}
