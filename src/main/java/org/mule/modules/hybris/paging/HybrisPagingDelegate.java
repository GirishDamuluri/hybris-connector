package org.mule.modules.hybris.paging;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.mule.api.MuleException;
import org.mule.streaming.PagingDelegate;

public abstract class HybrisPagingDelegate<T> extends PagingDelegate<T>
{

    public int start = 0;
    private boolean firstExecution = true;

    @Override
    public void close() throws MuleException
    {
        this.start = 0;

    }

    @Override
    public List<T> getPage()
    {
        if (!this.firstExecution && this.start == 0)
        {
            return Collections.emptyList();
        }
        try
        {
            this.firstExecution = false;
            List<T> entries = this.doGetPage();
            this.start += 1;
            return entries;
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    protected abstract List<T> doGetPage() throws IOException;

    @Override
    public int getTotalResults()
    {
        return -1;
    }

}
