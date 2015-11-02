
/**
 * Write a description of class Fundemental3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class Fundemental3
{
    public static void main ( String args[])
    {
        String NA;
        String na=JOptionPane.showInputDialog("What is the variable?");
        int a=Integer.parseInt(na);
        String respond;
        int r1=a % 2;
        if (r1>0)
        {
            System.out.println(a+" is an odd number.");
        }
        else
        {
            System.out.println(a+" is an even number.");
        }
    }
}
