package com.example.mqtt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button puerta = findViewById(R.id.Puerta_magnetica);
        Button foco = findViewById(R.id.Foco);
        Button ventilador=findViewById(R.id.Ventilaodor);
        Button ventanas=findViewById(R.id.Ventanas);
        puerta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cuando se hace clic en el botón, se crea un Intent para cambiar a la nueva actividad.
                Intent intent = new Intent(menu.this, P_Magnetica.class);
                startActivity(intent);
            }
        });
        foco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cuando se hace clic en el botón, se crea un Intent para cambiar a la nueva actividad.
                Intent intent = new Intent(menu.this, Foco.class);
                startActivity(intent);
            }
        });
        ventilador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cuando se hace clic en el botón, se crea un Intent para cambiar a la nueva actividad.
                Intent intent = new Intent(menu.this, Ventilador.class);
                startActivity(intent);
            }
        });

        ventanas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cuando se hace clic en el botón, se crea un Intent para cambiar a la nueva actividad.
                Intent intent = new Intent(menu.this, Ventanas.class);
                startActivity(intent);
            }
        });
    }
    }
