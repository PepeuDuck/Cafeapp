package com.example.cafeapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.EditText;

public class FormAutenticacao extends AppCompatActivity {

    AppCompatButton bt_concluir;

    EditText email_autentica, telefone_autentica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_autenticacao);

        email_autentica = (EditText) findViewById(R.id.email_autentica);
        telefone_autentica = (EditText) findViewById(R.id.telefone_autentica);

        bt_concluir = (AppCompatButton) findViewById(R.id.bt_concluir);

}
}