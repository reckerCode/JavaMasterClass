package com.reckercode;
import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	    Album album = new Album("Hybrid Theory", "Linkin Park");
	    album.addSong("One Step Closer", 2.37);
        album.addSong("With You", 3.23);
        album.addSong("Points of Authority", 3.20);
        album.addSong("Crawling", 3.09);
        album.addSong("Runaway", 3.03);
        albums.add(album);

        album = new Album("Minutes To Midnight", "Linkin park");
        album.addSong("Wake", 1.41);
        album.addSong("Given Up", 3.09);
        album.addSong("Leave Out All the Rest", 3.29);
        album.addSong("Bleed It out", 2.44);
        album.addSong("Shadow Of The Day", 4.49);
        album.addSong("What I've Done", 3.25);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<>();
        ListIterator<Song> listIterator = playlist.listIterator();
        albums.get(0).addToPlaylist("One Step Closer",playlist);
        albums.get(0).addToPlaylist("With You",playlist);

        albums.get(0).addToPlaylist(4, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(2, playlist);

        play(playlist);


    }

    private static void printOptions(){
        System.out.println("Player Options");
        System.out.println("0. Quit.\n"+
                    "1. Play Next.\n"+
                    "2. Play Previous.\n"+
                    "3. Replay the current song.\n"+
                    "4. List songs in the playlist.\n"+
                    "5. Print Available Actions.\n"+
                    "6. Delete current song.");
        }
    private static void printPlaylist(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("====================================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("====================================");
    }

    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size()==0){
            System.out.println("No songs in the playlist");
            return;
        }else{
            System.out.println("Now Playing: "+listIterator.next().toString());
            printOptions();
        }


        while(!flag){
            int options = scanner.nextInt();
            scanner.nextLine();
            switch (options){
                case 0:
                    System.out.println("Playlist complete");
                    flag = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing: "+listIterator.next().toString());
                    }else{
                        System.out.println("End of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing: "+listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Replaying " + listIterator.previous());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now relaying "+ listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We have reached ant the end of the list");
                        }
                    }
                    break;
                case 4:
                    printPlaylist(playlist);
                    break;
                case 5:
                    printOptions();
                    break;
                case 6:
                    if((playlist.size())>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing "+ listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now Playing "+ listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
}
