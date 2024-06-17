package f_java_list.linkedlist.play_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    // write code here

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        if(trackNumber >= 1){
            playList.add(songs.get(trackNumber - 1));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song song = findSong(title);
        if (song == null){
            return false;
        }
        playList.add(song);
        return true;
    }

}
