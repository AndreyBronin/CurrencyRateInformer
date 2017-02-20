package CurrencyRateInformer;

import retrofit2.Call;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;

import java.util.List;


public class FixerIoCurrencyProvider implements CurrencyProvider {


    @Override
    public List<String> GetCurrencyList() {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.fixer.io/latest")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        FixerIoService service = retrofit.create(FixerIoService.class);
        Call<List<RateObject>> repos = service.latest("USD");
        //repos.execute();


        return null;
    }

    @Override
    public String GetRate(String Base) {
        return null;
    }
}
