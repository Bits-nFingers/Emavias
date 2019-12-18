package com.example.emavias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.emavias.Interface.JsonPlaceHolderApi;
import com.example.emavias.Model.Posts_RegistroMaterial;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegistroMaterial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_material);
    }

    private void getPosts_RegistroMaterial(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:9000/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<List<Posts_RegistroMaterial>> call = jsonPlaceHolderApi.getRegMaterial();
        call.enqueue(new Callback<List<Posts_RegistroMaterial>>() {
            @Override
            public void onResponse(Call<List<Posts_RegistroMaterial>> call, Response<List<Posts_RegistroMaterial>> response) {
                if(!response.isSuccessful()){

                    return;
                }
                List<Posts_RegistroMaterial> posts_registroMaterialsList= response.body();
                for(Posts_RegistroMaterial post: posts_registroMaterialsList){
                    String content = "";
                    content += "idmaterial"+ post.getIdMaterial()+"\n";
                    content += "cantidad"+ post.getCantidad()+"\n";
                    content += "nombProveedor"+ post.getNombProveedor()+"\n";
                    content += "nSerie"+ post.getnSerie()+"\n";


                }
            }

            @Override
            public void onFailure(Call<List<Posts_RegistroMaterial>> call, Throwable t) {

            }

        });
    }
}
