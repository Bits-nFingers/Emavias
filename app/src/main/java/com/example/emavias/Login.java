package com.example.emavias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button iniciar_sesion;
    EditText et_correoLogin , et_contrasenaLogin;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_contrasenaLogin = findViewById(R.id.et_contrasenaLogin);
        et_correoLogin = findViewById(R.id.et_correoLogin);
        iniciar_sesion  = findViewById(R.id.iniciar_sesion);

    }
    public void ingresar(View v){

        if (validar()) {
            String C1=et_correoLogin.getText().toString();
            String C2=et_contrasenaLogin.getText().toString();

            if (C1.equals("admin") && C2.equals("admin") ) {
                Toast.makeText(this, "Usuario iniciado", Toast.LENGTH_SHORT).show();
                iniciar_sesion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Login.this, OpcionesAdmin.class));
                        finish();
                    }
                });
            }
            else if (C1.equals("sbellott@hotmail.com") && C2.equals("12345")){
                iniciar_sesion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Login.this, Opciones.class));
                        finish();
                    }
                });

            }
            else{
                Toast.makeText(this, "Correo o Contraseña erronea", Toast.LENGTH_SHORT).show();
            }
        }

    }


    public boolean validar(){
        boolean retorno=true;

        String C1=et_correoLogin.getText().toString();
        String C2=et_contrasenaLogin.getText().toString();

        if (C1.isEmpty()){
            et_correoLogin.setError("Este campo no puede ser estar vacio");
            retorno = false;
        }
        if (C2.isEmpty()){
            et_contrasenaLogin.setError("Este campo no puede ser estar vacio");
            retorno = false;
        }



        return retorno;
    }

}
