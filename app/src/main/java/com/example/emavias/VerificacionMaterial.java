package com.example.emavias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VerificacionMaterial extends AppCompatActivity {
    Inventario i = new Inventario();
    TextView nombre, cantidad, serie, fecha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificacion_material);
        nombre = findViewById(R.id.tw_material);
        cantidad = findViewById(R.id.tw_cantidad);
        serie = findViewById(R.id.tw_nDserie);
        fecha = findViewById(R.id.tw_fecha);
        //named = findViewById(R.id.texto_TV);
        i.getVerificar();
    }

    public void validar(){
        //boolean retorno=true;

        //String C1= .getText().toString();

        if (i.equals("Pintura Amarilla")){
            nombre.setText("Pintura Amarilla");
            cantidad.setText("42");
            serie.setText("9373");
            fecha.setText("29/11/19");
            //retorno = false;
        } else{
            Toast.makeText(this, "Material inexistente", Toast.LENGTH_SHORT).show();
        }

        //return retorno;
    }
}
