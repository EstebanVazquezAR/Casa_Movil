package com.example.mqtt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

// Wifi manager para rasberry
    private static final String BROKER_URL = "tcp://52.15.215.169";
    private static final String CLIENT_ID = "your_client_id";
    private MqttHandler mqttHandler;


    Button R_Encender,R_Apagar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         R_Encender = findViewById(R.id.R_Encender);
         R_Apagar = findViewById(R.id.R_Apagar);

        Button A_Encender = findViewById(R.id.A_Encender);
        Button A_Apagar = findViewById(R.id.A_Apagar);

        Button V_Encender = findViewById(R.id.V_Encender);
        Button V_Apagar = findViewById(R.id.V_Apagar);

        R_Encender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mqttHandler = new MqttHandler();
                mqttHandler.connect(BROKER_URL,CLIENT_ID);

                publishMessage("DEMO","F_R_E");

            }
        });
        R_Apagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mqttHandler = new MqttHandler();
                mqttHandler.connect(BROKER_URL,CLIENT_ID);

                publishMessage("DEMO","F_R_A");

            }
        });






        A_Encender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mqttHandler = new MqttHandler();
                mqttHandler.connect(BROKER_URL,CLIENT_ID);

                publishMessage("DEMO","F_A_E");

            }
        });
        A_Apagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mqttHandler = new MqttHandler();
                mqttHandler.connect(BROKER_URL,CLIENT_ID);

                publishMessage("DEMO","F_A_A");

            }
        });





        V_Encender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mqttHandler = new MqttHandler();
                mqttHandler.connect(BROKER_URL,CLIENT_ID);

                publishMessage("DEMO","F_V_E");

            }
        });
        V_Apagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mqttHandler = new MqttHandler();
                mqttHandler.connect(BROKER_URL,CLIENT_ID);

                publishMessage("DEMO","F_V_A");

            }
        });
    }


    @Override
    protected void onDestroy() {
        mqttHandler.disconnect();
        super.onDestroy();

    }
    private void publishMessage(String topic, String message){
        Toast.makeText(this, "Publishing message: " + message, Toast.LENGTH_SHORT).show();
        mqttHandler.publish(topic,message);
    }
    private void subscribeToTopic(String topic){
        Toast.makeText(this, "Subscribing to topic "+ topic, Toast.LENGTH_SHORT).show();
        mqttHandler.subscribe(topic);
    }
}