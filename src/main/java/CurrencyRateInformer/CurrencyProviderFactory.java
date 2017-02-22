package CurrencyRateInformer;

import CurrencyRateInformer.api.fixer.FixerIoCurrencyProvider;
import CurrencyRateInformer.api.poloniex.PoloniexCurrencyProvider;

import java.util.Arrays;
import java.util.List;

/**
 * Factory for CurrencyProvider
 */
public class CurrencyProviderFactory {

    private static final String FIXER_IO = "fixer.io";
    private static final String POLONIEX_COM = "poloniex.com";

    public static CurrencyProvider create(String provider)
    {
        if (provider.equals(FIXER_IO))
            return new FixerIoCurrencyProvider();
        else if (provider.equals(POLONIEX_COM))
            return new PoloniexCurrencyProvider();
        return null;
    }

    public static List<String> getProvidersList()
    {
        return Arrays.asList(FIXER_IO, POLONIEX_COM);
    }
}
