package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg6 extends AppCompatActivity {

    private Object Çevre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg6);
       
        final int PI = 3;
        int yariCap = 5;
        System.out.println("Çevre =  " + (2*PI*yariCap));
    }
}