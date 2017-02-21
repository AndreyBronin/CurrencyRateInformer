package CurrencyRateInformer.api.fixer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Rates {

    @SerializedName("RUB")
    @Expose
    private Double rUB;

    public Double getRUB() {
        return rUB;
    }

    public void setRUB(Double rUB) {
        this.rUB = rUB;
    }

}