package org.mule.modules.hybris.client;

import org.mule.modules.hybris.client.impl.HybrisRestClient;

public class HybrisClientFactory {

	/**
	 * Returns an instance of {@link HybrisRestClient}
	 * @param endpointUrl Endpoint to connect
	 * @return Instance configured with the values. 
	 */
	public static HybrisClient getClient(String endpointUrl) {
		return new HybrisRestClient(endpointUrl);
	}
}
