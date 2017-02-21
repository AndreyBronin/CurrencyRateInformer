package CurrencyRateInformer.api.fixer;

import CurrencyRateInformer.RateObject;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;


public interface FixerIoService {
    //@GET("users/{user}/repos")
    @GET("{latest")
    Call<List<RateObject>> latest(String base);
}
