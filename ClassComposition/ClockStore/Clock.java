public class Clock
{
    //Instance Variables
    private int hour;
    private int min;
    private int sec;
    
    //zero argument
    public Clock()
    {
        hour=10;
        min=28;
        sec=35;
    }//end zero argument
    
    // three constructor
    public Clock(int hour, int min, int sec)
    {
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
}//end class Clock