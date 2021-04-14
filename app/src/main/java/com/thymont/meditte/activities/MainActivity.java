package com.thymont.meditte.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.thymont.meditte.model.Music;
import com.thymont.meditte.R;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Music> musicList;
    private Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MusicListActivity.class );
                intent.putExtra("music_list", musicList);
                startActivity(intent);
            }
        });

        musicList = new ArrayList<>();
        fillMusicList();


    }

    public void openMusicList(View view){

    }

    private void fillMusicList(){
        Music m1 = new Music(R.raw.dox_lonely_red_tree, "Dox", "Lonely Red Tree", "Lonely Red Tree by Dox | https://soundcloud.com/dox-free-music\n" +
                "Music promoted by https://www.free-stock-music.com\n" +
                "Attribution-NoDerivs 3.0 Unported (CC BY-ND 3.0)\n" +
                "https://creativecommons.org/licenses/by-nd/3.0/", R.drawable.dox_lonely_red_tree);
        Music m2 = new Music(R.raw.keys_of_moon_tropical_aura, "Keys of Moon", "Tropical Aura", "Tropical Aura by Keys of Moon | https://soundcloud.com/keysofmoon\n" +
                "Music promoted by https://www.free-stock-music.com\n" +
                "Attribution 4.0 International (CC BY 4.0)\n" +
                "https://creativecommons.org/licenses/by/4.0/", R.drawable.keys_of_moon_tropical_aura );
        Music m3 = new Music(R.raw.scott_buckley_borealis, "Scott Buckley", "Borealis", "Borealis by Scott Buckley | https://soundcloud.com/scottbuckley\n" +
                "Music promoted by https://www.free-stock-music.com\n" +
                "Attribution 4.0 International (CC BY 4.0)\n" +
                "https://creativecommons.org/licenses/by/4.0/", R.drawable.scott_buckley_borealis );
        musicList.addAll(Arrays.asList(m1, m2, m3));
    }
}