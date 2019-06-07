package com.fmu.yourphysio.yourphysioapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.fmu.yourphysio.yourphysioapp.R;
import com.fmu.yourphysio.yourphysioapp.helper.Preferencias;

public class CadastroActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private Button cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.tituloToolbarCadastro); //Informando título da toolbar
        setSupportActionBar(toolbar);

        cadastrar = findViewById(R.id.btCadastrar);
        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Preferencias preferencias = new Preferencias(getApplicationContext());
                preferencias.salvarPremium("premium");

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_cadastro, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemAjudaCadastro:
                Toast.makeText(getApplicationContext(), R.string.textoAjudaCadastro, Toast.LENGTH_LONG).show();
                return true;
            case R.id.itemTermosCondicoes:
                Toast.makeText(getApplicationContext(), R.string.textoTermosCondicoes, Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
