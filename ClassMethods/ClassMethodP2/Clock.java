public class Clock
{
    //Instance Variables
    private int hour;
    private int min;
    private int sec;
    private String time;

    //zero argument
    public Clock()
    {
        hour=10;
        min=28;
        sec=35;
    }//end zero argument

    public int getTime()
    {
        time= new String()
        return time;
    }//end method getYearReleased()

    // setter
    public void setTime(int time)
    {
    }//end method setYearReleased()

    // three constructor
    public Clock(int hour, int min, int sec)
    {
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }//end three constructor

    // toSring
    public String toString()
    {
        String output=new String();
        output="The time is now "+hour+":"+min+":"+sec;
        return output;
    }//end toString
}//end class Clock