package CurrencyRateInformer;

import CurrencyRateInformer.api.fixer.FixerIoCurrencyProvider;
import CurrencyRateInformer.api.poloniex.PoloniexCurrencyProvider;
import org.junit.Assert;
import org.junit.Test;


public class CurrencyProviderFactoryTest {
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