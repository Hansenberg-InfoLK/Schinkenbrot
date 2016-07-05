package me.lirex.schinkenbrot;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import me.lirex.schinkenbrot.database.PHPConnect;

public class EditorActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
    int userID;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        userID = 5;

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        /**
         * Create the adapter that will return a fragment for each of the three
         * primary sections of the activity.
         * Set up the ViewPager with the sections adapter.
         */

        ViewPager mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        assert drawer != null;
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        assert navigationView != null;
        navigationView.setNavigationItemSelectedListener(this);

        /**
         *The {@link ViewPager} that will host the section contents.
         */
        TabLayout mTabLayout = (TabLayout) findViewById(R.id.tabs);
        assert mTabLayout != null;
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(createListFragment("edAk"), "Aktuell");
        adapter.addFragment(createListFragment("edVe"), "Veröffentlicht");
        viewPager.setAdapter(adapter);
    }

    private String result;

    ArrayList<String> Nname = new ArrayList<>();

    private class UserGetTask extends AsyncTask<Void, Void, Boolean>
    {
        ArrayList<String> name = new ArrayList<>();

        public UserGetTask(){}

        @Override
        protected Boolean doInBackground(Void... params)
        {
            try
            {
                String sql = "SELECT * FROM `Episode` WHERE `author` = " + userID;
                JsonArray arr = (new PHPConnect().postParams(sql));
                if (arr.size() > 0)
                {
                    for (int i = 0; i < arr.size(); i++)
                    {
                        name.add(((JsonObject) arr.get(i)).get("name").toString().replace("\"", ""));
                    }
                }
                Nname = name;
                return true;
            }
            catch (RuntimeException e)
            {
                e.printStackTrace();
                return false;
            }
        }
    }

    private ListFragment createListFragment(String key)
    {
        ListFragment listFragment = new ListFragment();
        Bundle args = new Bundle();
        String[] listEntries;

        // Datenbankabruf
        UserGetTask task = new UserGetTask();
        try
        {
            boolean result = task.execute((Void) null).get();
        }
        catch (InterruptedException | ExecutionException e)
        {
            e.printStackTrace();
        }

        // Packen des Arrays
        switch (key)
        {
            case "edAk":
                listEntries = new String[Nname.size()];

                if (Nname != null)
                {
                    for (int i = 0; i < Nname.size(); i++)
                    {
                        listEntries[i] = Nname.get(i);
                    }
                }

                break;
            case "edVe":
                listEntries = new String[3];

                listEntries[0] = "test3";
                listEntries[1] = "test4";
                listEntries[2] = "test5";

                break;
            default:
                listEntries = new String[1];

                listEntries[0] = "Error #3";

                break;
        }

        // Bundle
        args.putStringArray("listEntries", listEntries);

        // Add to ListFragment
        listFragment.setArguments(args);

        return listFragment;
    }

    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        assert drawer != null;
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        } else
        {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.editor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            Intent intent = new Intent (this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
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

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class ViewPagerAdapter extends FragmentPagerAdapter {

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    public void goToEpisodeEditorActivity (View view){
        Intent intent = new Intent(this, EpisodeEditorActivity.class);
        startActivity(intent);
    }
}
