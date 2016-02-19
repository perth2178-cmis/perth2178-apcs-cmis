import java.util.ArrayList;
public class ClockStore
{
    private Clock[] clockInStock = new Clock[3];

    public ClockStore()
    {
        Clock Clock1=new Clock(11,25,35);
        Clock Clock2=new Clock(22,55,30);
        Clock Clock3=new Clock(9,19,15);
        clockInStock[0]=Clock1;
        clockInStock[1]=Clock2;
        clockInStock[2]=Clock3;
    }

    public int mostSeconds()
    {
        int total=0;
        int newtotal=0;
        int index=0;
        for(int i=0;i<clockInStock.length;i++)
        {
            Clock ClockA=clockInStock[i];
            if(ClockA.totalSeconds(clockInStock[i])>newtotal)
            {
                newtotal=ClockA.totalSeconds(clockInStock[i]);
                index=i+1;
            }
        }
        return index;
    }
    
    public String toString()
    {
        String output=new String();
        output="The clock with the most seonds is clock "+mostSeconds()+".\n";
        for(Clock clock : clockInStock)
        {
            output+=clock+"\n";
        }
        return output;
    }
}
