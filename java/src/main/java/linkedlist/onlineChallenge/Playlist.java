package linkedlist.onlineChallenge;

import java.util.ArrayList;

public class Playlist {
    static class Node{
        private Song song;
        private Node previous;
        private Node next;

        private Node(Song song, Node previous, Node next){
            this.song = song;
            this.previous = previous;
            this.next = next;
        }
    }

    private String playlistName;
    private ArrayList<Album> albums;
    private Node head;
    private Node tail;
    private Node current;
    private int size;

    public Playlist(String playlistName, ArrayList<Album> albums){
        this.playlistName = playlistName;
        this.albums = albums;
        this.size = 0;
    }

    public void addSongToPlaylist(Song song){
        Album album = getAlbums(song);
        if(album != null){
            if(this.size == 0){
                Node new_node = new Node(song, null, null);
                this.head = new_node;
                this.tail = new_node;
                this.current = new Node(null, null, this.head);
            } else {
                Node new_node = new Node(null, this.tail, null);
                this.tail.next = new_node;
                this.tail = new_node;
            }
        }
    }

    private Album getAlbums(Song song){
        for(Album album: this.albums){
            for(Song song: album.getSongs()){
                if(song.getSongName().equals(song.getSongName())){
                    return album;
                }
            }
        }
        return null;
    }
}
