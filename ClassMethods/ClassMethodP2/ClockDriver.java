import javax.swing.JOptionPane;
public class ClockDriver
{
    public static void main(String[] args)
    {
        Clock kitchenClock=new Clock();
        Clock bedroomClock=new Clock();
        String time;
        int hour=Integer.parseInt(JOptionPane.showInputDialog("Hours?"));
        int min=Integer.parseInt(JOptionPane.showInputDialog("Minutes?"));
        int sec=Integer.parseInt(JOptionPane.showInputDialog("Seconds?"));
        System.out.println(kitchenClock);
        time=new String(hour+":"+min+":"+sec);
        bedroomClock.setTime(time);
        System.out.println(bedroomClock);
    }//end method main
}//end class ClockDriver