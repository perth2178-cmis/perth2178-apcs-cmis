
/**
 * Write a description of class WeatherChaos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class WeatherChaos
{
    public static void main(String[] args)
    {
        String daynum=JOptionPane.showInputDialog("How many days?");
        int days=Integer.parseInt(daynum);
        int [] DayArray;
        DayArray=new int[days];
        int swing=0;
        if(days<0)
        {
            System.out.println("That's not a valid number of days!");
        }
        if(days>31)
        {
            System.out.println("That's not a valid number of days!");
        }
        for(int i=0;i<DayArray.length;i++)
        {
            DayArray[i]=(int) (Math.random() * 200) - 100;
            System.out.println(DayArray[i]);
        }
    }
}
