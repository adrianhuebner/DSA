package linkedlist.onlineChallenge;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Abbey Road", "The Beatles");
        album.addSongToAlbum("Come Together", 4.19);
        album.addSongToAlbum("Something", 3.03);
        album.addSongToAlbum("Maxwell's Silver Hammer", 3.27);
        album.addSongToAlbum("Oh! Darling", 3.27);
        album.addSongToAlbum("Octopus\'s Garden", 2.51);
        album.addSongToAlbum("I Want You(She\'s So Heavy)", 7.47);
        album.addSongToAlbum("Here Comes the Sun", 3.06);
        album.addSongToAlbum("Because", 2.46);
        album.addSongToAlbum("You Never Give Me Your Money", 4.02);
        album.addSongToAlbum("Sun King", 2.26);
        album.addSongToAlbum("Mean Mr. Mustard", 1.06);
        album.addSongToAlbum("Polythene Pam", 1.13);
        album.addSongToAlbum("She Came in Through the Bathroom Window", 1.58);
        album.addSongToAlbum("Golden Slumbers", 1.32);
        album.addSongToAlbum("Carry That Weight", 1.37);
        album.addSongToAlbum("The End", 2.20);
        album.addSongToAlbum("Her Majesty", 0.23);

        album = new Album("Station to Station", "David Bowie");
        album.addSongToAlbum("Station to Station", 10.14);
        album.addSongToAlbum("Golden Years", 4.01);
        album.addSongToAlbum("Word on a Wing", 6.04);
        album.addSongToAlbum("TVC 15", 5.33);
        album.addSongToAlbum("Stay", 6.15);
        album.addSongToAlbum("Wild Is the Wind", 6.01);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList(10, playList);
        albums.get(0).addToPlayList(1, playList);
        albums.get(0).addToPlayList(14, playList);
        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList(5, playList);
        albums.get(1).addToPlayList(3, playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.size() == 0){
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the playlist");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printPlaylist(playList);
                    break;
                case 5:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }
                        else if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: \npress");
        System.out.println("0 - Quit\n" +
                "1 - Play the Next Song\n" +
                "2 - Play the Previous Song\n" +
                "3 - Replay the Current Song\n" +
                "4 - Print the songs in the playlist\n" +
                "5 - Delete current song from the playlist\n" +
                "6 - Reprint available actions");
    }

    private static void printPlaylist(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("========================");
    }
}
