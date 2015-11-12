import javax.swing.JOptionPane;
public class ClockDriver
{
    public static void main(String[] args)
    {
        Clock kitchenClock=new Clock();
        Clock bedroomClock=new Clock();
        bedroomClock.convertDaylightSaving(1);
        kitchenClock.setTime(kitchenClock);
        System.out.println(kitchenClock);
        bedroomClock.setTime(bedroomClock);
        System.out.println(bedroomClock);
    }//end method main
}//end class ClockDriver