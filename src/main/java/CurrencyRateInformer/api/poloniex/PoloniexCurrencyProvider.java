package CurrencyRateInformer.api.poloniex;


import CurrencyRateInformer.CurrencyProvider;

import java.util.List;

public class PoloniexCurrencyProvider implements CurrencyProvider {
    @Override
    public List<String> GetCurrencyList() {
        return null;
    }

    @Override
    public String GetRate(String Base) {
        return null;
    }
}
