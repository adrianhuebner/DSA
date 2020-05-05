package linkedlist.onlineChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> songsInAlbum;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songsInAlbum = new ArrayList<Song>();
    }

    public void addSongToAlbum(String songName, double songDuration) {
        songsInAlbum.add(Song.newSong(songName, songDuration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songsInAlbum.size())) {
            playList.add(this.songsInAlbum.get(index));
            return true;
        }
        return false;
    }
}
