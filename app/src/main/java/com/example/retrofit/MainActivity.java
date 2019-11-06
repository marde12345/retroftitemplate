package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.retrofit.model.Coba;

public class MainActivity extends AppCompatActivity {
    private Button btnRun;
    private TextView tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRun = findViewById(R.id.btnRun);
        tvNama = findViewById(R.id.tvNama);

        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                API api = Server.getInstance().create(API.class);
                Call<Coba> res = api.getCoba();
                res.enqueue(new Callback<Coba>() {
                    @Override
                    public void onResponse(Call<Coba> call, Response<Coba> response) {
//                        Toast.makeText(MainActivity.this, response.toString(), Toast.LENGTH_SHORT).show();
                        Log.d("Response", "onResponse: "+response.body().toString());
                        tvNama.setText(response.body().toString());
                    }

                    @Override
                    public void onFailure(Call<Coba> call, Throwable t) {
                        String message = t.getMessage();
                        Log.d("failure", message);
                    }
                });
            }
        });
    }
}
