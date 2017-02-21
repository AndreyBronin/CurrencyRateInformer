package CurrencyRateInformer.api.fixer;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface Api {

    //@GET("{latest")
    //Call<List<RateObject>> latest(String base);

    @GET("/latest")
    Call<ApiResponse> getCurrencyList(@Query("base") String base);

    @GET("/latest")
    Call<ApiResponse> getRate(@Query("base") String base, @Query("symbols") String symbols);
}
