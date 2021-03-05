package com.gustavoh.roleta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView parabains = findViewById(R.id.imageView);
        parabains.setVisibility(View.INVISIBLE);
    }

    public void Roletar(View view){
        TextView numero = findViewById(R.id.textView2);
        TextView teste3 = findViewById(R.id.textView3);
        ImageView parabains = findViewById(R.id.imageView);
        Random num = new Random();
        int valor = num.nextInt(10)+1;
        EditText teste = findViewById(R.id.editTextTextPersonName);
        int teste4;
        teste4 = Integer.parseInt(teste.getText().toString());

        if (teste4 == valor){
            numero.setText("");
            parabains.setVisibility(View.VISIBLE);
        }
        else {
            numero.setText("Os são diferentes");
        }
        teste3.setText("Número: "+valor);
    }
}