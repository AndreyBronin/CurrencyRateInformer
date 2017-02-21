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
    public List<String> GetCurrencyList();

    /**
     * @param Base currency convertion from
     * @return currency rate
     */
    public String GetRate(String Base);
}


