package com.example.emavias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpcionesAdmin extends AppCompatActivity {

    Button almacenar;
    Button inventario;
    Button pedidos;
    Button registro;
    Button despacho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_admin);

        almacenar = (Button) findViewById(R.id.almacen);
        almacenar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OpcionesAdmin.this, Almacenamiento.class));

            }
        });

        inventario = (Button) findViewById(R.id.inventario);
        inventario.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OpcionesAdmin.this, Inventario.class));

            }
        });

        pedidos = (Button) findViewById(R.id.pedido);
        pedidos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OpcionesAdmin.this, PedidoMateria.class));

            }
        });

        registro = (Button) findViewById(R.id.registro);
        registro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OpcionesAdmin.this, RegistroMaterial.class));

            }
        });

        despacho = (Button) findViewById(R.id.despacho);
        despacho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OpcionesAdmin.this, Despacho.class));

            }
        });
    }
}
