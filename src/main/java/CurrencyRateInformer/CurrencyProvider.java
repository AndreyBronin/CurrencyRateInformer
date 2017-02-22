package CurrencyRateInformer;

import java.util.List;

/**
 * This is CurrencyProvider interface
 *
 */
public interface CurrencyProvider
{
    /**
     * @return list if available currency
     */
    public List<String> GetCurrencyList() throws Exception;

    /**
     * @param from currency convertion from
     * @param to currency convertion to
     * @return currency rate
     */
    public String GetRate(String from, String to) throws Exception;

    /**
     * @return api provider name
     */
    public String GetName();
}


