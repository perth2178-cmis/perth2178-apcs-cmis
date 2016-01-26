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

    /*public int mostSeconds()
    {
        int total=0;
        int newtotal=0;
        for(int i=0;i<clockInStock.length;i++)
        {
            Clock ClockA=clockInStock[i];
            ClockA.totalSeconds(clockInStock[i]);
            if(total>newtotal)
            {
                total=newtotal;
            }
        }
        return newtotal;
    }*/
    
    public String toString()
    {
        String output=new String();
        for(Clock clock : clockInStock)
        {
            output+=clock+"\n";
        }
        return output;
    }
}
