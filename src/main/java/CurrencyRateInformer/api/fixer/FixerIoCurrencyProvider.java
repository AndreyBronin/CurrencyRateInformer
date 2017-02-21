package CurrencyRateInformer.api.fixer;

import CurrencyRateInformer.CurrencyProvider;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;

import java.util.List;


public class FixerIoCurrencyProvider implements CurrencyProvider {


    @Override
    public List<String> GetCurrencyList() {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.fixer.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api service = retrofit.create(Api.class);
        //Call<ApiResponse> call = service.getCurrencyList("USD");
        Call<ApiResponse> call = service.getRate("RUB", "USD");
        Response<ApiResponse> responce;

        try {
            responce = call.execute();
        }
        catch (Exception e)
        {
            return null;
        }

        ApiResponse r = responce.body();

        return null;
    }

    @Override
    public String GetRate(String Base) {
        return null;
    }
}
