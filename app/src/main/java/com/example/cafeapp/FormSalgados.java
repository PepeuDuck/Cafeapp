package com.example.cafeapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FormSalgados extends AppCompatActivity {

    View container1, container2, container3, container4, container5, container6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_salgados);

        container1 = (View) findViewById(R.id.container1);
        container2 = (View) findViewById(R.id.container2);
        container3 = (View) findViewById(R.id.container3);
        container4 = (View) findViewById(R.id.container4);
        container5 = (View) findViewById(R.id.container5);
        container6 = (View) findViewById(R.id.container6);
    };
}