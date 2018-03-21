package com.example.uca.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView contador;
    private int puntosa=0;
    private int puntosb=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void masunoa(View v){
        Log.d("Mensaje", "+1");
        contador = findViewById(R.id.contador_a);
        puntosa+=1;
        contador.setText(puntosa+"");

    }

    public void masdosa(View v){
        Log.d("Mensaje", "+2");
        contador = findViewById(R.id.contador_a);
        puntosa+=2;
        contador.setText(puntosa+"");

    }

    public void mastresa(View v){
        Log.d("Mensaje", "+3");
        contador = findViewById(R.id.contador_a);
        puntosa+=3;
        contador.setText(puntosa+"");

    }

    public void masunob(View v){
        Log.d("Mensaje", "+1");
        contador = findViewById(R.id.contador_b);
        puntosb+=1;
        contador.setText(puntosb+"");


    }

    public void masdosb(View v){
        Log.d("Mensaje", "+2");
        contador = findViewById(R.id.contador_b);
        puntosb+=2;
        contador.setText(puntosb+"");
    }

    public void mastresb(View v){
        Log.d("Mensaje", "+3");
        contador = findViewById(R.id.contador_b);
        puntosb+=3;
        contador.setText(puntosb+"");
    }

    public void reset(View v){
        Log.d("Mensaje", "reset");
        puntosa=0;
        puntosb=0;
        contador = findViewById(R.id.contador_a);
        contador.setText(puntosa+"");
        contador = findViewById(R.id.contador_b);
        contador.setText(puntosb+"");
    }
}
