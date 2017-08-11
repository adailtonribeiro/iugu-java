package com.adailtonribeiro.iugu.interfaces;

import com.adailtonribeiro.iugu.enums.IuguParameter;
import com.adailtonribeiro.iugu.exceptions.IuguException;

/**
 * Define an interface to provide the access for the Iugu parameters.
 * 
 * @author adailton.ribeiro
 *
 */
public interface IuguParameterResolver {

	/**
	 * Return the parameter's value from the Iugu parameter {@link IuguParameter}.
	 * 
	 * @param iuguParameter
	 *            Parameter of the Iugu API {@link IuguParameter}
	 * @return Return a <code>String</code> object with the value of a parameter
	 *         informed.
	 * @throws IuguException
	 */
	String getParameterValue(IuguParameter iuguParameter);

}
