package com.example.emavias.Interface;

import com.example.emavias.Model.Posts_Inventario;
import com.example.emavias.Model.Posts_RegistroMaterial;
import com.example.emavias.Model.Posts_Usuario;

import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface JsonPlaceHolderApi {

    @GET("inventarios")
    Call<List<Posts_Inventario>> getIinventario();

    @GET("personals")
    Call<List<Posts_Usuario>> getPeersonals();

    @GET("inventarios")
    Call<List<Posts_RegistroMaterial>> getRegMaterial();

}
