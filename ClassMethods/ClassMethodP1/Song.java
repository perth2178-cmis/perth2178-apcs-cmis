public class Song 
{
    // Instance Variables
    private int rank;
    private int length;  //in seconds
    private String style;
    private int yearReleased;
    private String minsec;

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

    // three constructor
    public Song(int rank, int length, String style)
    {
        this.rank=rank;
        this.length=length;
        this.style= new String(style);
    }//end three constructor

    // processor 
    public String convertToMinSec()
    {
        int min=0;
        int sec=0;
        min=length/60;
        sec=length%60;
        minsec=new String(min+" minutes and "+sec+" seconds");
        return minsec;
    }//end method legnth()
    
    // toString()
    public String toString()
    {
        String output=new String();
        output="Song Rank: " + rank + "\n" 
        +"The length of the song is: "+convertToMinSec()+"\n"
        +"Song Style: "+style+"\n"
        +"Year Released: "+yearReleased+"\n";
        return output;
    }//end to String

}//end of class Song