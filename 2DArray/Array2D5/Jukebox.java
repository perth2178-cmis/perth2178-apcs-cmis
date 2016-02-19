import java.util.ArrayList;
public class Jukebox
{
    MySong[][] songList= new MySong[3][4];
    int rvalue=0;
    int cvalue=0;

    public Jukebox()
    {
        songList[0][0] = new MySong("Jet Airliner", 5);
        songList[0][1] = new MySong("Everywhere I Go", 4);
        songList[0][2] = new MySong("Tom Sawyer", 3);
        songList[0][3] = new MySong("Purple Rain", 2);
        songList[1][0] = new MySong("Sing a Song", 1);
        songList[1][1] = new MySong("Baba O'Riley", 5);
        songList[1][2] = new MySong("Drops of Jupiter", 4);
        songList[1][3] = new MySong("Grease Lightning", 3);
        songList[2][0] = new MySong("Kung Fu Fighting", 2);
        songList[2][1] = new MySong("Right as Rain", 4);
        songList[2][2] = new MySong("Feel Good Inc.", 5);
        songList[2][3] = new MySong("Bust a Move", 4);
    }
    
    public MySong randomSong()
    {
        rvalue=(int) (Math.random()*songList.length);
        cvalue=(int) (Math.random()*songList[0].length);
        return songList[rvalue][cvalue];
    }
    
    public ArrayList<MySong> playSongofRating(int rating)
    {
        ArrayList<MySong> selectsong=new ArrayList();
        for(int r=0;r<songList.length;r++)
        {
            for(int c=0;c<songList[0].length;c++)
            {
                if(songList[r][c].getRating()==rating)
                {
                    selectsong.add(songList[r][c]);
                }
            }
        }
        return selectsong;
    }

    public String toString()
    {
        String output=new String();
        for(MySong[] r: songList)
        {
            for(MySong song:r)
            {
                output+=song+"\n";
            }
        }
        return output;
    }
}