public class Song 
{
    // Instance Variables
    private int rank;
    private double length;  //in seconds
    private String style;
    private int yearReleased;
    
    // zero argument
    public Song()
    {
        rank=56;
        length=210;
        style=new String("Jazz");
        yearReleased=1967;
    }//end zero argument
    
    //getter
    public int getYearReleased()
    {
        return yearReleased;
    }//end method getYearReleased()
    
    // setter
    public void setYearReleased(int year)
    {
        this.yearReleased=year;
    }//end method setYearReleased()
    
    // processor
    public int length()
    {
        int min=0;
        int sec=0;
        
    }//end method legnth()
    
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
                +"Song Style: "+style+"\n"
                +"Year Released: "+yearReleased+"\n";
        return output;
    }//end to String
    
}//end of class Song