package com.gustavoh.roleta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Roletar(View view){
        TextView numero = findViewById(R.id.textView2);
        Random num = new Random();
        int valor = num.nextInt(10)+1;
        numero.setText("Número: " +valor);
    }
}