public class Jukebox
{
    MySong[][] songList= new MySong[3][4];

    public Jukebox()
    {
        songList[0][0] = new MySong( "Jet Airliner", 5 );
        songList[0][1] = new MySong( "Slide", 4 );
        songList[0][2] = new MySong( "Tom Sawyer", 3 );
        songList[0][3] = new MySong( "Purple Rain", 2 );
        songList[1][0] = new MySong( "Sing a Song", 1 );
        songList[1][1] = new MySong( "Baba O'Riley", 5 );
        songList[1][2] = new MySong( "Jumper", 4 );
        songList[1][3] = new MySong( "Grease Lightning", 3 );
        songList[2][0] = new MySong( "Kung Fu Fighting", 2 );
        songList[2][1] = new MySong( "Right as Rain", 4 );
        songList[2][2] = new MySong( "Beat It", 5 );
        songList[2][3] = new MySong( "Bust a Move", 4 );
    }

    public String toString()
    {
        String output=new String();
        for(int r=0;r<songList.length;r++)
        {
            for(int c=0;c<songList[0].length;c++)
            {
                output+=songList[r][c]+"\t";
            }
            output+="\n";
        }
        return output;
    }
}
