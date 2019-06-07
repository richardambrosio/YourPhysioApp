package com.fmu.yourphysio.yourphysioapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.fmu.yourphysio.yourphysioapp.R;

public class ExerciciosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicios);

        Toast.makeText(getApplicationContext(), R.string.textoAlertaApp, Toast.LENGTH_LONG).show();
    }
}
