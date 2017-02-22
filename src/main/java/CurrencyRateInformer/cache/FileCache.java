package CurrencyRateInformer.cache;

import java.time.LocalDateTime;

/**
 * File chache class
 */
public class FileCache implements Cache {

    public void StoreData(String providerName, String key, String value, LocalDateTime expirationTime) throws Exception
    {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public String GetData(String providerName, String key) throws Exception {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
