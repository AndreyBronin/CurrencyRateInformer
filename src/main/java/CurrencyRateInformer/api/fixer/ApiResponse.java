package CurrencyRateInformer.api.fixer;

import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ApiResponse {

 @SerializedName("base")
 @Expose
 private String base;
 @SerializedName("date")
 @Expose
 private String date;
 @SerializedName("rates")
 @Expose
 private Map<String, Double> rates;

 public String getBase() {
  return base;
 }

 public void setBase(String base) {
  this.base = base;
 }

 public String getDate() {
  return date;
 }

 public void setDate(String date) {
  this.date = date;
 }

 public Map<String, Double> getRates() {
  return rates;
 }



}