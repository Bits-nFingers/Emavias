package com.example.emavias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.emavias.Interface.JsonPlaceHolderApi;
import com.example.emavias.Model.Posts_Inventario;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Inventario extends AppCompatActivity {

    Button inventario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventario);

        inventario = (Button) findViewById(R.id.buscarInv);
        inventario.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Inventario.this, VerificacionMaterial.class));

            }
        });
    }
    private void getPosts_Inventario(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:9000/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<List<Posts_Inventario>> call = jsonPlaceHolderApi.getIinventario();
        call.enqueue(new Callback<List<Posts_Inventario>>() {
            @Override
            public void onResponse(Call<List<Posts_Inventario>> call, Response<List<Posts_Inventario>> response) {
                if(!response.isSuccessful()){

                    return;
                }
                List<Posts_Inventario> posts_inventariosList= response.body();
                for(Posts_Inventario post: posts_inventariosList){
                    String content = "";
                    content += "material"+ post.getMaterial()+"\n";
                    content += "cantidad"+ post.getCantidad()+"\n";
                    content += "nSerie"+ post.getnSerie()+"\n";
                    content += "fechaUltUso"+ post.getFechaUltUso()+"\n";

                }
            }

            @Override
            public void onFailure(Call<List<Posts_Inventario>> call, Throwable t) {

            }

        });
    }


}

