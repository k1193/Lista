package com.example.mylista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        TextView  textView = findViewById(R.id.textViewnombre);
        textView.setText(getIntent().getStringExtra(  "nombre" ));
    }
}