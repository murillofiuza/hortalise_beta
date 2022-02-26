package com.fiuzasoft.fiuza.hortalise_beta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.fiuzasoft.fiuza.cultivos.Abobora;
import com.fiuzasoft.fiuza.cultivos.Acelga;
import com.fiuzasoft.fiuza.cultivos.Alface;
import com.fiuzasoft.fiuza.cultivos.Alho;
import com.fiuzasoft.fiuza.cultivos.Batata;
import com.fiuzasoft.fiuza.cultivos.Berinjela;
import com.fiuzasoft.fiuza.cultivos.Beterraba;
import com.fiuzasoft.fiuza.cultivos.Cebola;
import com.fiuzasoft.fiuza.cultivos.Cebolinha;
import com.fiuzasoft.fiuza.cultivos.Cenoura;
import com.fiuzasoft.fiuza.cultivos.Chicoria;
import com.fiuzasoft.fiuza.cultivos.Chuchu;
import com.fiuzasoft.fiuza.cultivos.Coentro;
import com.fiuzasoft.fiuza.cultivos.Couve;
import com.fiuzasoft.fiuza.cultivos.Feijao;

public class CultivoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultivo);

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

    public void abobora(View v){
        Intent intent = new Intent(this, Abobora.class);
        startActivity(intent);
    }


    public void acelga(View v){
        Intent intent = new Intent(this, Acelga.class);
        startActivity(intent);
    }

    public void alface(View v){
        Intent intent = new Intent(this, Alface.class);
        startActivity(intent);
    }

    public void alho(View v){
        Intent intent = new Intent(this, Alho.class);
        startActivity(intent);
    }

    public void batata(View v){
        Intent intent = new Intent(this, Batata.class);
        startActivity(intent);
    }

    public void berinjela(View v){
        Intent intent = new Intent(this, Berinjela.class);
        startActivity(intent);
    }

    public void beterraba(View v){
        Intent intent = new Intent(this, Beterraba.class);
        startActivity(intent);
    }

    public void cebola(View v){
        Intent intent = new Intent(this, Cebola.class);
        startActivity(intent);
    }

    public void cebolinha(View v){
        Intent intent = new Intent(this, Cebolinha.class);
        startActivity(intent);
    }

    public void cenoura(View v){
        Intent intent = new Intent(this, Cenoura.class);
        startActivity(intent);
    }

    public void chicoria(View v){
        Intent intent = new Intent(this, Chicoria.class);
        startActivity(intent);
    }

    public void chuchu(View v){
        Intent intent = new Intent(this, Chuchu.class);
        startActivity(intent);
    }

    public void coentro(View v){
        Intent intent = new Intent(this, Coentro.class);
        startActivity(intent);
    }

    public void couve(View v){
        Intent intent = new Intent(this, Couve.class);
        startActivity(intent);
    }

    public void feijao(View v){
        Intent intent = new Intent(this, Feijao.class);
        startActivity(intent);
    }

    public void gengibre(View v) {
        setContentView(R.layout.gengibre);
    }

    public void jilo(View View) {
        setContentView(R.layout.jilo);
    }

    /*public void maxixe(View v) {
        setContentView(R.layout.maxixe);
    }

    public void melancia(View v) {
        setContentView(R.layout.melancia);
    }

    public void melao(View v) {
        setContentView(R.layout.melao);
    }

    public void morango(View v) {
        setContentView(R.layout.morango);
    }*/
}
