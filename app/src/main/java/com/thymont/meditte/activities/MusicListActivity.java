package com.thymont.meditte.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.thymont.meditte.adapter.MusicAdapter;
import com.thymont.meditte.model.Music;
import com.thymont.meditte.R;

import java.util.ArrayList;

public class MusicListActivity extends AppCompatActivity {
    private ArrayList<Music> musicList;
    private RecyclerView recyclerViewMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);
        getSupportActionBar().hide();
        recyclerViewMusic = findViewById(R.id.musicListRecyclerView);

        Intent intent = getIntent();
        musicList = (ArrayList<Music>) intent.getExtras().get("music_list");

        //Config Adapter
        MusicAdapter adapter = new MusicAdapter(musicList);


        //Config RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewMusic.setLayoutManager(layoutManager);
        recyclerViewMusic.setHasFixedSize(true);
        recyclerViewMusic.setAdapter(adapter);

    }


}