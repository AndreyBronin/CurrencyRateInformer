package CurrencyRateInformer;

import CurrencyRateInformer.api.fixer.FixerIoCurrencyProvider;
import CurrencyRateInformer.api.poloniex.PoloniexCurrencyProvider;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class CurrencyProviderFactoryTest {
    @Test
    public void getProvidersList() throws Exception {
        List<String> providers = CurrencyProviderFactory.getProvidersList();
        Assert.assertEquals(providers, Arrays.asList("fixer.io", "poloniex.com"));
    }

    @Test
    public void create() throws Exception {

        CurrencyProvider providerFixer = CurrencyProviderFactory.create("fixer.io");
        Assert.assertTrue(providerFixer instanceof FixerIoCurrencyProvider);

        CurrencyProvider providerPoloniex = CurrencyProviderFactory.create("poloniex.com");
        Assert.assertTrue(providerPoloniex instanceof PoloniexCurrencyProvider);

        CurrencyProvider providerInvalid = CurrencyProviderFactory.create("lalala");
        Assert.assertEquals(providerInvalid, null);
    }

}