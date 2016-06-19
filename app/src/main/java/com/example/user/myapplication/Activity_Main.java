package com.example.user.myapplication;

import android.app.FragmentManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Activity_Main extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TextView nav_header_text;
    TextView title_bar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView)findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View headerView = navigationView.inflateHeaderView(R.layout.nav_header_main);
        nav_header_text = (TextView)headerView.findViewById(R.id.nav_header_text);
        Typeface myTypeface= Typeface.createFromAsset(getAssets(), "HU110.ttf");
        FontsOverride.setDefaultFont(this, "MONOSPACE", "HU110.ttf");
        nav_header_text.setTypeface(myTypeface);
        title_bar.setTypeface(myTypeface);
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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getFragmentManager();
        if (id == R.id.nav_layout_menu1) {
            title_bar.setText("운동합시다");
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame,new Fragment_menu1())
                    .commit();
        } else if (id == R.id.nav_layout_menu2) {
            title_bar.setText("경로당은 어디에");
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame,new Fragment_menu2())
                    .commit();
        } else if (id == R.id.nav_layout_menu3) {
            title_bar.setText("아프지말기");
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame,new Fragment_menu3())
                    .commit();
        } else if (id == R.id.nav_layout_menu4) {
            title_bar.setText("사람은 일을 해야해");
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame,new Fragment_menu3())
                    .commit();

        } else if (id == R.id.nav_layout_menu5) {
            title_bar.setText("머리를 씁시다");
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame,new Fragment_menu3())
                    .commit();

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    /////사용자 추가 함수(Custom 함수들은 여기부터 추가하기)
    public void init(){
        title_bar = (TextView)findViewById(R.id.title_bar);
    }
}
