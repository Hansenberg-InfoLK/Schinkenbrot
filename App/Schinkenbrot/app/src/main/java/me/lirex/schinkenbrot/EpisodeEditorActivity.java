package me.lirex.schinkenbrot;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class EpisodeEditorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_editor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onEpisodeEditorButtonPressed(View view) // FAB
    {
        Intent intent = new Intent(this, QuestEditorActivity.class);
        startActivity(intent);
    }
}
