public class Jukebox
{
    MySong[][] songList= new MySong[3][4];
    int rvalue=0;
    int cvalue=0;

    public Jukebox()
    {
        songList[0][0] = new MySong("Jet Airliner", 5);
        songList[0][1] = new MySong("Slide", 4);
        songList[0][2] = new MySong("Tom Sawyer", 3);
        songList[0][3] = new MySong("Purple Rain", 2);
        songList[1][0] = new MySong("Sing a Song", 1);
        songList[1][1] = new MySong("Baba O'Riley", 5);
        songList[1][2] = new MySong("Jumper", 4);
        songList[1][3] = new MySong("Grease Lightning", 3);
        songList[2][0] = new MySong("Kung Fu Fighting", 2);
        songList[2][1] = new MySong("Right as Rain", 4);
        songList[2][2] = new MySong("Beat It", 5);
        songList[2][3] = new MySong("Bust a Move", 4);
    }
    
    public MySong randomSong()
    {
        rvalue=((int) Math.random()*3);
        cvalue=((int) Math.random()*4);
        return songList[rvalue][cvalue];
    }
    
    public MySong playSongofRating(int rating)
    {
        MySong selectsong=new MySong
        for(int r=0;r<songList.length;r++)
        {
            for(int c=0;c<songList[0].length;c++)
            {
                if(songList[i].getRating==rating)
                {
                    
                }
            }
        }
        return selectsong
    }

    public String toString()
    {
        String output=new String();
        for(MySong[] r: songList)
        {
            for(MySong song:r)
            {
                output+=song+"\t";
            }
            output+="\n";
        }
        return output;
    }
}
