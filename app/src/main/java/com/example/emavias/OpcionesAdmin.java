package com.example.emavias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpcionesAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_admin);

        Button almacenar = (Button) findViewById(R.id.almacen);
        almacenar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OpcionesAdmin.this, Almacenamiento.class));

            }
        });

        Button inventario = (Button) findViewById(R.id.inventario);
        almacenar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OpcionesAdmin.this, Inventario.class));

            }
        });

        Button pedidos = (Button) findViewById(R.id.pedido);
        almacenar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OpcionesAdmin.this, PedidoMateria.class));

            }
        });

        Button registro = (Button) findViewById(R.id.registro);
        almacenar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OpcionesAdmin.this, RegistroMaterial.class));

            }
        });

        Button despacho = (Button) findViewById(R.id.despacho);
        almacenar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OpcionesAdmin.this, Despacho.class));

            }
        });
    }
}
