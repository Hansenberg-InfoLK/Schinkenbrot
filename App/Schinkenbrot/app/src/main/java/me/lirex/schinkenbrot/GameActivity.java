package me.lirex.schinkenbrot;

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
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class GameActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        assert fab != null;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        assert drawer != null;
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ListView gamelist = (ListView) findViewById(R.id.gamelist);
        gamelist.setAdapter(null);
        ArrayList<HashMap<String, String>> content = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Name", "Test");
        map.put("XP", "2000");
        map.put("Timer", "5");
        content.add(map);
        map.clear();
        map.put("Name", "Test2");
        map.put("XP", "5000");
        map.put("Timer", "10");
        content.add(map);
        map.clear();
        SimpleAdapter adapter = new SimpleAdapter(GameActivity.this, content, R.layout.content_game, new String[]{"Name", "XP", "Timer"}, new int[]{R.id.currentgame_name,R.id.currentgame_xp,R.id.currentgame_timer});

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
        /**
         * Inflate the menu; this adds items to the action bar if it is present.
         */
    	
        getMenuInflater().inflate(R.menu.game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /**
         * Handle action bar item clicks here. The action bar will
         * automatically handle clicks on the Home/Up button, so long
         * as you specify a parent activity in AndroidManifest.xml.
         */
    	 
        int id = item.getItemId();

        /**
         * noinspection SimplifiableIfStatement
         */
        
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Die Buttons in der Sidebar werden verlinkt
        int id = item.getItemId();

        if (id == R.id.nav_editor){
            Intent intent = new Intent(this, EditorActivity.class);
            startActivity(intent);
        }

        if (id == R.id.nav_home){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        if (id == R.id.nav_game){
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
        }

        if (id == R.id.nav_host){
            Intent intent = new Intent (this, HostActivity.class);
            startActivity(intent);
        }

        if (id == R.id.nav_settings){
            Intent intent = new Intent (this, SettingsActivity.class);
            startActivity(intent);
        }

        if (id == R.id.nav_profile){
            Intent intent = new Intent (this, ProfileActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
