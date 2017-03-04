package com.example.hp.top10downloader;

/**
 * Created by hp on 03-03-2017.
 */

public class Application {
    private String name;
    private String artist;
    private String ReleaseDate;

    public String getReleaseDate()
    {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate)
    {
        this.ReleaseDate = releaseDate;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getArtist()
    {
        return artist;
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Name: " + getName()+ "\n" +"Artist: " + getArtist() + "\n" + "Release Date: "+ getReleaseDate() + "\n";
    }
}
