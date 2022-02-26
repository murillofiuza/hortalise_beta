package com.fiuzasoft.fiuza.hortalise_beta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.fiuzasoft.fiuza.informacao.CompostagemActivity;
import com.fiuzasoft.fiuza.informacao.TipoSoloActivity;

public class InformacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacao);


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

    public void compostagem (View v){
        Intent intent = new Intent(this, CompostagemActivity.class);
        startActivity(intent);
    }

    public void tipoSolo (View v){
        Intent intent = new Intent(this, TipoSoloActivity.class);
        startActivity(intent);
    }

    public void epocaPlantio (View v){
        Intent intent = new Intent(this, TipoSoloActivity.class);
        startActivity(intent);
    }
}
