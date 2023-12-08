package com.example.cafeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView text_tela_cadastro;
    TextView text_esqsenha;
    EditText edit_email, edit_telefone;
    AppCompatButton bt_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        text_esqsenha = (TextView) findViewById(R.id.text_esqsenha);

        bt_entrar = (AppCompatButton) findViewById(R.id.bt_entrar);

        edit_email = (EditText) findViewById(R.id.edit_email);

        edit_telefone = (EditText) findViewById(R.id.edit_telefone);

        IniciarComponentes();

        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FormLogin.this,FormCadastro.class);
                startActivity(intent);
            }
        });
        text_esqsenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencao = new Intent(FormLogin.this, FormSenha.class);
                startActivity(intencao);
            }
        });

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent interagir = new Intent(FormLogin.this, FormCardapio.class);
                startActivity(interagir);
            }
        });

    }

    private void IniciarComponentes(){
        text_tela_cadastro = findViewById(R.id.text_telacadastro);
}



}