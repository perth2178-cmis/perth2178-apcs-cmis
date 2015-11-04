public class Clock
{
    //Instance Variables
    private int hour;
    private int min;
    private int sec;
    private String Time;
    private String totalsec;

    
    
    //zero argument
    public Clock()
    {
        hour=10;
        min=28;
        sec=35;
        Time=new String(hour+":"+min+":"+sec);
    }//end zero argument
    
    // three constructor
    public Clock(int hour, int min, int sec)
    {
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }//end three constructor
    
    //Daylight Savings calculator
    public int convertDaylightSaving( int hour )
    {
        this.hour=hour+1;
        return hour;
    }
    
    //getter
    public String getTime()
    {
        return Time;
    }//end method getYearReleased()

    // setter
    public void setTime(String time)
    {
        this.Time=time;
    }//end method setYearReleased()

    //second calculator
    public String totalSeconds()
    {
        int sechour=0;
        int secmin=0;
        int total=0;
        sechour=hour*3600;
        secmin=min*60;
        total=sechour+secmin+sec;
        totalsec=new String(total+" seconds");
        return totalsec;
    }
    
    // toSring
    public String toString()
    {
        String output=new String();
        output="The time is now "+Time+
                "\nTotal seconds: "+totalSeconds();
        return output;
    }//end toString
}//end class Clock