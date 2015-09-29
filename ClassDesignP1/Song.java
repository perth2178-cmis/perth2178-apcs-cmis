public class Song 
{
    // Instance Variables
    private int rank;
    private double length;  //in minutes
    private String style;
    
    // Consturctor for Instance Variable
    public Song()
    {
        rank=56;
        length=5.45;
        style=new String("Jazz");
    }//end constructor Song
    
    // zero arguent
    public Song(int rank, double length, String style)
    {
        this.rank=rank;
        this.length=length;
        this.style= new String(style);
    }//end zero argument
    
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
