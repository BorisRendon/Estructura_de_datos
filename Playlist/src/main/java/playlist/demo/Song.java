package playlist.demo;

public class Song {
    private String title;
    private String artist;



    Song(String title, String artist){
        this.title=title;
        this.artist=artist;
    }
    public String getSongTitle(){
        return this.title;
    }
    public String getSongArtist(){
        return this.artist;
    }
    public String SongInfo(){
        return this.title + "\n" + this.artist;
    }

    public String PlaySong(){
        return SongInfo();
    }

}
