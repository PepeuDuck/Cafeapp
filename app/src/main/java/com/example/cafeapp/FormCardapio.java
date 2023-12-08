package com.example.cafeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FormCardapio extends AppCompatActivity {

    AppCompatButton bt_bebidas, bt_salgados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cardapio);

        bt_bebidas = (AppCompatButton) findViewById(R.id.bt_bebidas);
        bt_salgados = (AppCompatButton) findViewById(R.id.bt_salgados);

        bt_bebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bebida = new Intent(FormCardapio.this, FormBebidas.class);
                startActivity(bebida);
            }
        });

        bt_salgados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salgado = new Intent(FormCardapio.this, FormSalgados.class);
                startActivity(salgado);
            }
    });

}
}