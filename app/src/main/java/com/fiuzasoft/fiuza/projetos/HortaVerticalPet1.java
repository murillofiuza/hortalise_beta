package com.fiuzasoft.fiuza.projetos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.fiuzasoft.fiuza.hortalise_beta.R;

public class HortaVerticalPet1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horta_vertical_pet1);


        Toolbar t_abobora = (Toolbar) findViewById(R.id.toolbar);
        if (t_abobora != null) {
            t_abobora.setNavigationIcon(R.drawable.ic_arrow_back_24dp);
            setSupportActionBar(t_abobora);
            t_abobora.setNavigationOnClickListener(new View.OnClickListener() {
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
}
