package CurrencyRateInformer.api.fixer;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface Api {

    @GET("/latest")
    Call<ApiResponse> getCurrencyList();

    @GET("/latest")
    Call<ApiResponse> getRate(@Query("base") String base, @Query("symbols") String symbols);
}
