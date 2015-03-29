package org.mule.modules.hybris.client;

import java.util.Arrays;

import javax.ws.rs.core.Response;

public class ClientUtil
{
    public static <T> T validateAndParseResponse(Response clientResponse, Class<T> typeToReturn,
            Integer... expectedStatus) throws HybrisAPIException
    {
        if (responseValid(clientResponse, expectedStatus))
        {
            return parseResponse(clientResponse, typeToReturn);
        } else
        {
            throw new HybrisAPIException("API returned unexpected response: "
                    + clientResponse.getStatus() + System.getProperty("line.separator") + "Body: "
                    + parseResponse(clientResponse, String.class));
        }
    }

    private static boolean responseValid(Response clientResponse, Integer... expectedStatus)
    {
        return Arrays.asList(expectedStatus).contains(clientResponse.getStatus());
    }

    private static <T> T parseResponse(Response clientResponse, Class<T> typeToReturn)
            throws HybrisAPIException
    {
        try
        {
            return clientResponse.readEntity(typeToReturn);
        } catch (Exception e)
        {
            throw new HybrisAPIException("Error parsing response", e);
        }
    }
}
