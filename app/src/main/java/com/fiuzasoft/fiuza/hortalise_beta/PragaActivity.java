package com.fiuzasoft.fiuza.hortalise_beta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.fiuzasoft.fiuza.pragas.LagartaTomateiro;
import com.fiuzasoft.fiuza.pragas.PragaDoencaRadiculares;
import com.fiuzasoft.fiuza.pragas.ReceitaAcabarPraga;

public class PragaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praga);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setNavigationIcon(R.drawable.ic_arrow_back_24dp);
            setSupportActionBar(toolbar);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
        }
    }

    public void volta(View v) {
        onBackPressed();
    }

    public void lagartaTomateiro(View v){
        Intent intent = new Intent(this, LagartaTomateiro.class);
        startActivity(intent);
    }

    public void praga_doenca_radiculares(View v){
        Intent intent = new Intent(this, PragaDoencaRadiculares.class);
        startActivity(intent);
    }

    public void receitaPesticida(View v){
        Intent intent = new Intent(this, ReceitaAcabarPraga.class);
        startActivity(intent);
    }
}
