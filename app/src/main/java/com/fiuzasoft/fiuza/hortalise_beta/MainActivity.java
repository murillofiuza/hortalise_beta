package com.fiuzasoft.fiuza.hortalise_beta;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inclui Toolbar no topo da tela
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Inclui o Menu Drawer no Toolbar.
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Infla o menu; esta adiciona itens pata o action bar se ele estiver presente.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //Menu lado Direito no Toolbar
        if (id == R.id.action_settings) {

                finish();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_cultivo) {
            // Menu Drawer_Navigation opção cultivo.
            Intent intent = new Intent(this, CultivoActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_praga) {
            // Menu Drawer_Navigation opção praga.
            Intent intent = new Intent(this, PragaActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_projeto) {
            // Menu Drawer_Navigation opção projeto.
            Intent intent = new Intent(this, ProjetoActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_informacao) {
            // Menu Drawer_Navigation opção projeto.
            Intent intent = new Intent(this, InformacaoActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_sobre) {
            // Menu Drawer_Navigation opção projeto.
            Intent intent = new Intent(this, SobreActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void cultivo(View v){
        Intent intent = new Intent(this, CultivoActivity.class);
        startActivity(intent);
    }
    public void praga(View v){
        Intent intent = new Intent(this, PragaActivity.class);
        startActivity(intent);
    }
    public void projeto(View v){
        Intent intent = new Intent(this, ProjetoActivity.class);
        startActivity(intent);
    }
    public void informacao(View v){
        Intent intent = new Intent(this, InformacaoActivity.class);
        startActivity(intent);
    }
    public void sobre(View v){
        Intent intent = new Intent(this, SobreActivity.class);
        startActivity(intent);
    }
}
