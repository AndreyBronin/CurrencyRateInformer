package CurrencyRateInformer.cache;

import java.time.LocalDateTime;

/**
 * Key-value cache interfase for currency providers
 */
public interface Cache {
    /**
     * Store data to cache storage
     * @param providerName currency provider name
     * @param key data key
     * @param value data value
     * @param expirationTime date and time then chache expired
     */
    public void StoreData(String providerName, String key, String value, LocalDateTime expirationTime) throws Exception;

    /**
     * Get data from cache storage
     * @param providerName currency provider name
     * @param key data key
     * @return currency rate
     */
    public String GetData(String providerName, String key) throws Exception;

}
