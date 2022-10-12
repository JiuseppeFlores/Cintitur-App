package com.stisbolivia.cintiturapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MenuPrincipal extends AppCompatActivity {

    RelativeLayout btnComoLlegar, btnDondeDormir, btnDondeComer, btnSaboresSaberes, btnBodegasDO, btnQueVisitar, btnPaisajeCultural;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        btnComoLlegar = findViewById(R.id.btn_como_llegar);
        btnComoLlegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, ComoLlegar.class);
                startActivity(intent);
            }
        });
        btnDondeDormir = findViewById(R.id.btn_donde_dormir);
        btnDondeDormir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, DondeDormir.class);
                startActivity(intent);
            }
        });
        btnDondeComer = findViewById(R.id.btn_donde_comer);
        btnSaboresSaberes = findViewById(R.id.btn_bodegas_do);
        btnQueVisitar = findViewById(R.id.btn_que_visitar);
        btnPaisajeCultural = findViewById(R.id.btn_paisaje_cultural);

    }
}
