package CurrencyRateInformer.api.fixer;

import CurrencyRateInformer.CurrencyProvider;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;

import java.util.Arrays;
import java.util.List;


public class FixerIoCurrencyProvider implements CurrencyProvider {


    @Override
    public List<String> GetCurrencyList() throws Exception{


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.fixer.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api service = retrofit.create(Api.class);
        //Call<ApiResponse> call = service.getCurrencyList("USD");
        Call<ApiResponse> call = service.getRate("RUB", "USD");
        Response<ApiResponse> responce;

        responce = call.execute();

        ApiResponse r = responce.body();

        //TODO
        return Arrays.asList("EUR", "USD", "RUB");
    }

    @Override
    public String GetRate(String Base) {

        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public String GetName()
    {
        return "fixer.io";
    }
}
