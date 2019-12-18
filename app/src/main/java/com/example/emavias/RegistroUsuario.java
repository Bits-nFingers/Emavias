package com.example.emavias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.emavias.Interface.JsonPlaceHolderApi;
import com.example.emavias.Model.Posts_Usuario;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegistroUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);
    }

    private void getPosts_Usuario(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:9000/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<List<Posts_Usuario>> call = jsonPlaceHolderApi.getPeersonals();
        call.enqueue(new Callback<List<Posts_Usuario>>() {
            @Override
            public void onResponse(Call<List<Posts_Usuario>> call, Response<List<Posts_Usuario>> response) {
                if(!response.isSuccessful()){

                    return;
                }
                List<Posts_Usuario> posts_usuariosList= response.body();
                for(Posts_Usuario post: posts_usuariosList){
                    String content = "";
                    content += "id"+ post.getId()+"\n";
                    content += "nombre"+ post.getNombre()+"\n";
                    content += "apellido"+ post.getApellido()+"\n";
                    content += "contraseña"+ post.getContraseña()+"\n";


                }
            }

            @Override
            public void onFailure(Call<List<Posts_Usuario>> call, Throwable t) {

            }

        });
    }
}
