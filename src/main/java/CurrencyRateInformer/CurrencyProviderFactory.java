package CurrencyRateInformer;

/**
 * Factory for CurrencyProvider
 */
public class CurrencyProviderFactory {


    public static CurrencyProvider create(String provider)
    {
        if (provider.equals("fixer.io") )
            return new FixerIoCurrencyProvider();
        else if (provider.equals("poloniex.com"))
            return new PoloniexCurrencyProvider();
        return null;
    }
}
