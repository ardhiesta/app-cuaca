package id.ac.uns.cuaca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText editTextNamaKota;
    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        editTextNamaKota = findViewById(R.id.editTextKota);
    }

    public void getDataCuaca(View view){
        String namaKota = editTextNamaKota.getText().toString();

        Call<JsonObject> jsonObjectCall = apiInterface.getWeather(namaKota, "[ganti dengan appKey yang anda punya, register di openweather]");
        jsonObjectCall.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                System.out.println("");
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                System.out.println("");
            }
        });
    }
}
