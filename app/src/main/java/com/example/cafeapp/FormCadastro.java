package com.example.cafeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FormCadastro extends AppCompatActivity {

    AppCompatButton bt_cadastrar;

    EditText edit_nome, edit_usuário, edit_email, edit_telefone, edit_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        edit_nome = (EditText) findViewById(R.id.edit_nome);
        edit_usuário = (EditText) findViewById(R.id.edit_usuário);
        edit_email = (EditText) findViewById(R.id.edit_email);
        edit_telefone = (EditText) findViewById(R.id.edit_telefone);
        edit_nome = (EditText) findViewById(R.id.edit_nome);
        edit_senha = (EditText) findViewById(R.id.edit_senha);


        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intencao = new Intent(FormCadastro.this, FormAutenticacao.class);
                startActivity(intencao);
            }
    });

}
}