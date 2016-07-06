package me.lirex.schinkenbrot;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import me.lirex.schinkenbrot.database.PHPConnect;

public class EpisodeEditorActivity extends AppCompatActivity {

    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_editor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText editText1 = (EditText) findViewById(R.id.editText_episode1);
        final EditText editText2 = (EditText) findViewById(R.id.editText_episode2);

        assert editText1 != null;
        editText1.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        assert editText2 != null;
        editText1.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        Bundle b = getIntent().getExtras();
        if(b != null)
        {
            id = b.getInt("id");
            load();
        }
    }

    String name, desc;

    private void load()
    {
        // Datenbankabruf
        GetTask task = new GetTask();
        try
        {
            boolean result = task.execute((Void) null).get();
        }
        catch (InterruptedException | ExecutionException e)
        {
            e.printStackTrace();
        }

        final EditText editText1 = (EditText) findViewById(R.id.editText_episode1);
        final EditText editText2 = (EditText) findViewById(R.id.editText_episode2);

        // Get from Database
        assert editText1 != null;
        editText1.setText(desc);
        assert editText2 != null;
        editText2.setText(name);
    }

    public void onEpisodeEditorButtonPressed(View view) // FAB
    {
        Intent intent = new Intent(this, QuestEditorActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed()
    {
        final EditText editText1 = (EditText) findViewById(R.id.editText_episode1);
        final EditText editText2 = (EditText) findViewById(R.id.editText_episode2);

        String lName = editText2.getText().toString();
        String lDesc = editText1.getText().toString();

        SetTask task = new SetTask(lName, lDesc);
        try
        {
            boolean result = task.execute((Void) null).get();
        }
        catch (InterruptedException | ExecutionException e)
        {
            e.printStackTrace();
        }

        Context context = getApplicationContext();
        CharSequence text = "Gespeichert";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


        super.onBackPressed();
    }

    private String result;

    private class GetTask extends AsyncTask<Void, Void, Boolean>
    {

        public GetTask(){}

        @Override
        protected Boolean doInBackground(Void... params)
        {
            try
            {
                String sql = "SELECT * FROM `Episode` WHERE `ID` = " + id;
                JsonArray arr = (new PHPConnect().postParams(sql));
                if (arr.size() > 0)
                {
                    JsonObject data = ((JsonObject) arr.get(0));
                    name = data.get("name").toString().replace("\"", "");
                    desc = data.get("description").toString().replace("\"", "");
                }
                return true;
            }
            catch (RuntimeException e)
            {
                e.printStackTrace();
                return false;
            }
        }
    }

    private class SetTask extends AsyncTask<Void, Void, Boolean>
    {
        private String iName, iDesc;

        public SetTask(String lName, String lDesc)
        {
            iName = lName;
            iDesc = lDesc;
        }

        @Override
        protected Boolean doInBackground(Void... params)
        {
            try
            {
                String sql = "UPDATE `Episode` SET `name`='" + iName + "', `description`='" + iDesc + "' WHERE `ID` = " + id;
                new PHPConnect().postParams(sql);
                return true;
            }
            catch (RuntimeException e)
            {
                e.printStackTrace();
                return false;
            }
        }
    }
}
