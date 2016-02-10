public class JukeboxDriver
{
    public static void main(String[] args)
    {
        Jukebox Playlist = new Jukebox();
        System.out.println(Playlist);
        System.out.println("Random song: " + Playlist.randomSong());
        System.out.println("Songs with the rating of : "+Playlist.playSongofRating(3));
    }
}

