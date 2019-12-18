package com.example.emavias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PedidoMateria extends AppCompatActivity {

    Button pedir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_materia);

        pedir = findViewById(R.id.pedirMaterial);
        pedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pedido realizado", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
