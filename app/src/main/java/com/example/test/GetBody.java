package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class GetBody extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getbody);


        Intent intent = getIntent();
        TextView textView = findViewById(R.id.bodytext);
        textView.setText(intent.getStringExtra("body"));

    }



}


















