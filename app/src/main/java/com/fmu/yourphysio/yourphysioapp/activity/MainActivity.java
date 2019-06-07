package com.fmu.yourphysio.yourphysioapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.fmu.yourphysio.yourphysioapp.R;
import com.fmu.yourphysio.yourphysioapp.helper.Preferencias;

public class MainActivity extends AppCompatActivity {

    private Button dicas;
    private Button lesoes;
    private Button equipe;
    private Button premium;
    private Button conta;
    private ImageView propaganda;

    private Toolbar toolbar;

    private Preferencias preferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);

        dicas = findViewById(R.id.btSolicitarDicas);
        lesoes = findViewById(R.id.btLesoesComuns);
        equipe = findViewById(R.id.btSobreNos);
        premium = findViewById(R.id.btSejaPremium);
        propaganda = findViewById(R.id.imageViewPropaganda);
        conta = findViewById(R.id.btDadosConta);

        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);

        preferencias = new Preferencias(getApplicationContext());
        String userPremium = preferencias.getPremium();
        if(userPremium != null){
            premium.setVisibility(View.INVISIBLE);
            propaganda.setVisibility(View.INVISIBLE);
        }
        else {
            premium.setVisibility(View.VISIBLE);
            propaganda.setVisibility(View.VISIBLE);
        }

        dicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CorpoCostasActivity.class);
                startActivity(intent);
            }
        });

        lesoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LesoesComunsActivity.class);
                startActivity(intent);
            }
        });

        equipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EquipeActivity.class);
                startActivity(intent);
            }
        });

        premium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(intent);
            }
        });

        conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DadosContaActivity.class);
                startActivity(intent);
            }
        });
    }
}
