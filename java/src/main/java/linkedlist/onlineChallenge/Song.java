package linkedlist.onlineChallenge;

public class Song {
    private String songName;
    private double songDuration;

    public Song(String songName, double songDuration) {
        this.songName = songName;
        this.songDuration = songDuration;
    }

    public static Song newSong(String songName, double songDuration){
        return (new Song(songName, songDuration));
    }

    public String getSongName() {
        return songName;
    }

    public double getSongDuration(){
        return songDuration;
    }
}
