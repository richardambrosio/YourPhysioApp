package com.fmu.yourphysio.yourphysioapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.fmu.yourphysio.yourphysioapp.R;
import com.fmu.yourphysio.yourphysioapp.helper.Preferencias;

public class DadosContaActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_conta);

        toolbar = findViewById(R.id.toolbar);
        sair = findViewById(R.id.btSairConta);

        toolbar.setTitle(R.string.itemDadosConta);
        setSupportActionBar(toolbar);

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Preferencias preferencias = new Preferencias(getApplicationContext());
                preferencias.salvarPremium(null);

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
