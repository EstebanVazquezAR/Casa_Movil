package com.example.mqtt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class P_Magnetica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmagnetica);
        Button regresar=findViewById(R.id.Regresar);



        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cuando se hace clic en el botón, se crea un Intent para cambiar a la nueva actividad.
                Intent intent = new Intent(P_Magnetica.this, login.class);
                startActivity(intent);
            }
        });
    }
    }
