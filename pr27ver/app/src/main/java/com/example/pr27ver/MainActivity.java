package com.example.pr27ver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        com.example.pr27ver.Draw draw = new  com.example.pr27ver.Draw(this);
        setContentView(draw);
    }
}