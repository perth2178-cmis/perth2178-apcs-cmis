import java.util.ArrayList;
public class ClockStore
{
    private ArrayList clockInStock = new ArrayList();
    
    public ClockStore()
    {
        Clock Clock1=new Clock(11,25,35);
        Clock Clock2=new Clock(22,55,30);
        Clock Clock3=new Clock(9,19,15);
        clockInStock.add(Clock1);
        clockInStock.add(Clock2);
        clockInStock.add(Clock3);
    }
    
    public int mostSeconds()
    {
    }
}
 