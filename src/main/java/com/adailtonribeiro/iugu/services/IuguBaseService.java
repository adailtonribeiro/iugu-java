package com.adailtonribeiro.iugu.services;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;

import com.adailtonribeiro.iugu.enums.IuguParameter;
import com.adailtonribeiro.iugu.exceptions.IuguException;
import com.adailtonribeiro.iugu.interfaces.IuguParameterResolver;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.core.util.MultivaluedMapImpl;

/**
 * Base class responsible for consuming the REST services from Iugu payment
 * platform.
 * 
 * @author adailton.ribeiro
 */
public abstract class IuguBaseService {

	private IuguParameterResolver parameterResolver;

	/**
	 * Return the URI path, which will be used for consuming the REST services.
	 */
	public abstract String getPath();

	public IuguBaseService(IuguParameterResolver parameterResolver) {
		this.parameterResolver = parameterResolver;
	}

	/**
	 * Create a map with the required parameters to be used on Iugu API.
	 * 
	 * @return Return a multivalued map {@link MultivaluedMap} containing the Iugu
	 *         parameters and values.
	 * @throws IuguException
	 */
	private MultivaluedMap<String, String> getIuguRequiredParams() throws IuguException {
		MultivaluedMap<String, String> params = new MultivaluedMapImpl();
		params.add("api_token", parameterResolver.getParameterValue(IuguParameter.IUGU_API_TOKEN));
		return params;
	}

	/**
	 * Create a web resource from the base Iugu URI
	 * {@link IuguParameter.IUGU_BASE_URI}.
	 * 
	 * @return Return a web resource {@link WebResource} from the Iugu URI.
	 * @throws IuguException
	 */
	private WebResource getIuguWebResource() throws IuguException {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		return client.resource(UriBuilder.fromUri(parameterResolver.getParameterValue(IuguParameter.IUGU_BASE_URI)).build());
	}

	/**
	 * Send a POST request with JSON data to the Iugu REST service.
	 * 
	 * @param jsonData
	 *            Data in JSON format to be sent to the Iugu REST service.
	 * @return Return the response from a POST request containing the data in JSON
	 *         format.
	 * @throws IuguException
	 */
	protected String sendPost(String jsonData) throws IuguException {
		WebResource response = getIuguWebResource().path(getPath()).queryParams(getIuguRequiredParams());
		return response.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, jsonData).getEntity(String.class);
	}

	/**
	 * Send a GET request with JSON data to the Iugu REST service.
	 * 
	 * @param id
	 *            Request identification parameter.
	 * @return Return the response from a GET request containing the data in JSON
	 *         format.
	 * @throws IuguException
	 */
	protected String sendGet(String id) throws IuguException {
		WebResource response = getIuguWebResource().path(getPath() + "/" + id).queryParams(getIuguRequiredParams());
		return response.type(MediaType.APPLICATION_JSON).get(ClientResponse.class).getEntity(String.class);
	}
}
