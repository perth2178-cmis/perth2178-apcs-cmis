import javax.swing.JOptionPane;
public class ClockDriver
{
   public static void main(String[] args)
   {
       Clock kitchenClock=new Clock();
       int hour=Integer.parseInt(JOptionPane.showInputDialog("Hours?"));
       int min=Integer.parseInt(JOptionPane.showInputDialog("Minutes?"));
       int sec=Integer.parseInt(JOptionPane.showInputDialog("Seconds?"));
       Clock bedroomClock=new Clock(hour,min,sec);
       System.out.println(kitchenClock);
       System.out.println(bedroomClock);
    }//end method main
}//end class ClockDriver
