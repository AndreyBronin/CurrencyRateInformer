package CurrencyRateInformer;

import java.util.List;

public interface CurrencyProvider
{
    public List<String> GetCurrencyList();
    public String GetRate(String Base);
}


