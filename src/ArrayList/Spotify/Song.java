package ArrayList.Spotify;

public class Song {
    private String title;

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString (){
        return "Title: " + this.title;
    }

}
