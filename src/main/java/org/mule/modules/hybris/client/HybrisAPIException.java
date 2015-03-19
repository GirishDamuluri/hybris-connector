package org.mule.modules.hybris.client;

public class HybrisAPIException extends RuntimeException
{
    private static final long serialVersionUID = 614116050690059033L;

    public HybrisAPIException(String message)
    {
        super(message);
    }
    public HybrisAPIException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
