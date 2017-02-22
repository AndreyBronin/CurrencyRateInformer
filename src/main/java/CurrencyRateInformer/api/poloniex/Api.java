package CurrencyRateInformer.api.poloniex;

import CurrencyRateInformer.api.fixer.ApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 *  Poloniex public api https://poloniex.com/support/api/
 */
public interface Api {

    @GET("public?command=returnTicker")
    Call<TickerResponse> getTicker();
}
