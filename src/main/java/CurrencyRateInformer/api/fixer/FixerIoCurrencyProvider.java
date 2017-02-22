package CurrencyRateInformer.api.fixer;

import CurrencyRateInformer.CurrencyProvider;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class FixerIoCurrencyProvider implements CurrencyProvider {

    private Retrofit retrofit;
    private Api apiService;

    public FixerIoCurrencyProvider()
    {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://api.fixer.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(Api.class);
    }

    @Override
    public List<String> GetCurrencyList() throws Exception{

        Call<ApiResponse> call = apiService.getCurrencyList();
        Response<ApiResponse> responce;
        responce = call.execute();

        Map<String, Double> rates = responce.body().getRates();

        List<String> list = new ArrayList<String>(rates.keySet());
        //add base element "EUR"
        list.add(responce.body().getBase());
        return list;
    }

    @Override
    public String GetRate(String from, String to) throws Exception{

        Call<ApiResponse> call = apiService.getRate(from, to);
        Response<ApiResponse> responce;
        responce = call.execute();
        Map<String, Double> rates = responce.body().getRates();
        return rates.values().toArray()[0].toString();
    }

    @Override
    public String GetName()
    {
        return "fixer.io";
    }
}
