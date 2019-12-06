package id.ac.uns.cuaca;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("weather")
    Call<JsonObject> getWeather(@Query("q") String namaKota, @Query("APPID") String appKey);
}
