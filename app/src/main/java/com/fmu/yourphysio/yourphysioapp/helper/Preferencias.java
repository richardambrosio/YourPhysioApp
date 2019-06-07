package com.fmu.yourphysio.yourphysioapp.helper;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferencias {
    private Context contexto;

    private final String NOME_ARQUIVO = "yourphysio.preferencias";
    private int MODE = 0;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private String CHAVE_PREMIUM = "premium";

    public Preferencias(Context contextoParametro) {
        contexto = contextoParametro;

        preferences = contexto.getSharedPreferences(NOME_ARQUIVO, MODE);
        editor = preferences.edit();
    }

    public void salvarPremium(String premium){
        editor.putString(CHAVE_PREMIUM, premium);
        editor.commit();
    }

    public String getPremium(){
        return preferences.getString(CHAVE_PREMIUM, null);
    }

}
