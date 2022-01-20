package com.example.appcanzoni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView canzoni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String mersic = i.getStringExtra("string_fin");
        canzoni = (TextView)  findViewById(R.id.Lista);
        canzoni.append(mersic);
    }
}