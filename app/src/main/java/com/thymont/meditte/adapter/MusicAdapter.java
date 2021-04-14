package com.thymont.meditte.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thymont.meditte.R;
import com.thymont.meditte.model.Music;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MyViewHolder> {
    private ArrayList<Music> musicList;

    public MusicAdapter(ArrayList<Music> musicList) {
        this.musicList = musicList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_music_list, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Music music = musicList.get(position);
        holder.musicImage.setImageResource(music.getImage());
        holder.musicName.setText(music.getName());
        holder.artist.setText(music.getArtist());
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView musicName;
        private TextView artist;
        private ImageView musicImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            musicName = itemView.findViewById(R.id.txtMusica);
            artist = itemView.findViewById(R.id.txtArtist);
            musicImage = itemView.findViewById(R.id.imageMusic);
        }
    }

}
