package CurrencyRateInformer.api.poloniex;


import CurrencyRateInformer.CurrencyProvider;

import java.util.List;

/**
 * Crypto currency poloniex.com provider class
 */
public class PoloniexCurrencyProvider implements CurrencyProvider {
    @Override
    public List<String> GetCurrencyList() {

        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public String GetRate(String Base) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public String GetName()
    {
        return "poloniex.com";
    }
}
