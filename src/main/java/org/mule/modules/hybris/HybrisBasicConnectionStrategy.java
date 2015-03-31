package org.mule.modules.hybris;

import org.mule.api.ConnectionException;
import org.mule.api.annotations.Connect;
import org.mule.api.annotations.ConnectionIdentifier;
import org.mule.api.annotations.Disconnect;
import org.mule.api.annotations.TestConnectivity;
import org.mule.api.annotations.ValidateConnection;
import org.mule.api.annotations.components.ConnectionManagement;
import org.mule.api.annotations.param.ConnectionKey;
import org.mule.api.annotations.param.Default;
import org.mule.modules.hybris.client.HybrisClient;
import org.mule.modules.hybris.client.HybrisClientFactory;

@ConnectionManagement(configElementName = "config-type", friendlyName = "Basic Auth type strategy")
public class HybrisBasicConnectionStrategy
{
    private HybrisClient client;

    public HybrisClient getClient()
    {
        return client;
    }

    /**
     * Connect
     * 
     * @param username
     *            Hybris username
     * @param password
     *            Hybris password
     * @throws ConnectionException
     */
    @Connect
    @TestConnectivity
    public void connect(@ConnectionKey String username, String password,
            @Default(value = "http://localhost:9001/ws410/rest") String endpointUrl)
            throws ConnectionException
    {
        this.client = HybrisClientFactory.getClient(endpointUrl);
        this.client.login(username, password);
    }

    /**
     * Disconnect
     * 
     * @throws ConnectionException
     */
    @Disconnect
    public void disconnect()
    {
        this.client.logout();
    }

    /**
     * Are we connected
     */
    @ValidateConnection
    public boolean isConnected()
    {
        return this.client != null && this.client.isConnected();
    }

    /**
     * Are we connected
     */
    @ConnectionIdentifier
    public String connectionId()
    {
        return this.client.connectionId();
    }
}
