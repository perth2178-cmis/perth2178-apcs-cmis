public class Song 
{
    // Instance Variables
    private int rank;
    private double length;  //in minutes
    private String style;
    
    // zero argument
    public Song()
    {
        rank=56;
        length=5.45;
        style=new String("Jazz");
    }//end zero argument
    
    // three constructor
    public Song(int rank, double length, String style)
    {
        this.rank=rank;
        this.length=length;
        this.style= new String(style);
    }//end three constructor
    
    // toString()
    public String toString()
    {
        String output=new String();
        output="Song Rank: " + rank + "\n" 
                +"Song Duration: "+ length + "\n"
                +"Song Style: "+style+"\n";
        return output;
    }//end to String
    
}//end of class Song
