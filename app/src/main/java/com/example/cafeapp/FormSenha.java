package com.example.cafeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.EditText;

public class FormSenha extends AppCompatActivity {

    EditText email_esqsenha, telefone_esqsenha;

    AppCompatButton bt_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_senha);

        email_esqsenha = (EditText) findViewById(R.id.email_esqsenha);
        telefone_esqsenha = (EditText) findViewById(R.id.telefone_esqsenha);
        bt_enviar = (AppCompatButton) findViewById(R.id.bt_enviar);}
}