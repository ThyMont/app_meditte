package com.thymont.meditte.model;

import java.io.Serializable;

public class Music implements Serializable {
    private Integer id;
    private String artist;
    private String name;
    private String description;
    private Integer image;

    public Music() {
    }

    public Music(Integer id, String artist, String name, String description, Integer image) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
