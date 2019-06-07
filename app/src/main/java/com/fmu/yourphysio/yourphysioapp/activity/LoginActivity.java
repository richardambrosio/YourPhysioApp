package com.fmu.yourphysio.yourphysioapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.fmu.yourphysio.yourphysioapp.R;

public class LoginActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        toolbar = findViewById(R.id.toolbar);

        toolbar.setTitle(R.string.app_name); //Informando título da toolbar
        setSupportActionBar(toolbar);
    }
}
