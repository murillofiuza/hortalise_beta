package com.fiuzasoft.fiuza.hortalise_beta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.fiuzasoft.fiuza.projetos.HortaVerticalPet1;
import com.fiuzasoft.fiuza.projetos.PreparoHortaVertical;

public class ProjetoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projeto);

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

    public void hortaVerticalPet1(View v){
        Intent intent = new Intent(this, HortaVerticalPet1.class);
        startActivity(intent);
    }

    public void preparoHortaVertical(View v){
        Intent intent = new Intent(this, PreparoHortaVertical.class);
        startActivity(intent);
    }


}
