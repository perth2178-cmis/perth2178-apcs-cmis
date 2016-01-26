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
    
    // three constructor
    public Clock(int hour, int min, int sec)
    {
        this.hour=hour;
        this.min=min;
        this.sec=sec;
        time=new String(hour+":"+min+":"+sec);
    }
    
    public void totalSeconds(Clock seconds)
    {
        int sechour=0;
        int secmin=0;
        int total=0;
        sechour=hour*3600;
        secmin=min*60;
        total=sechour+secmin+sec;
    }
}//end class Clock