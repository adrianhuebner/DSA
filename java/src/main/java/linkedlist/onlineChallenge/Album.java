package linkedlist.onlineChallenge;

import java.util.ArrayList;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> songsInAlbum;

    public Album(String albumName, String artist, ArrayList<Song> songsInAlbum) {
        this.albumName = albumName;
        this.artist = artist;
        this.songsInAlbum = songsInAlbum;
    }

    public String getAlbumName(){
        return albumName;
    }

    public void addSongToAlbum(String songName, double songDuration){
        songsInAlbum.add(Song.newSong(songName, songDuration));
    }

    public void printSongs(){
        System.out.println("All the songs that are on " + albumName + " album");
        for(int i = 0; i < songsInAlbum.size(); i++){
            System.out.println((i + 1) + ". " + songsInAlbum.get(i).getSongName() + " song length: " + songsInAlbum.get(i).getSongDuration());
        }
    }

    public boolean checkSong(String songName){
        for(int i = 0; i < songsInAlbum.size(); i++){
            if(songsInAlbum.get(i).getSongName().equals(songName)){
                return true;
            }
        }
        return false;
    }
}
