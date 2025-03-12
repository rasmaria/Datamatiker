package ArrayList.Spotify;

import java.util.ArrayList;

public class SongList {
    ArrayList<Song> songList;

    public SongList(){
        songList = new ArrayList<Song>();
    }
    public void addSong(Song song){
        songList.add(song);
    }
    public void removeSong(Song song){
        songList.remove(song);
    }
    public void showSongList(){
        for (Song song : songList) {
            System.out.println(song);
        }
    }
    public void editTitle(int index, String newTitle){
        if (index >= 0 && index < songList.size()) {
            Song song = songList.get(index);
            song.setTitle(newTitle);
        }
    }
    public void sortList() {
        songList.sort(null);
    }
    public boolean contains(String songTitle) {
        for (Song song : songList) {
            if (song.getTitle().equalsIgnoreCase(songTitle)) {
                return true;
            }
        }
        return false;
    }
}
