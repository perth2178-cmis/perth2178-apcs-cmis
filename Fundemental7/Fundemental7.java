
/**
 * Write a description of class Fundemental7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class Fundemental7
{
    public static void main ( String args[])
    {
        int[] myArray;
        myArray=new int[5];
        Random rnd = new Random();
        for(int index=0; index<myArray.length; index++ )
        {
            System.out.print((int) 1*Math.ceil(Math.random()*100));
            System.out.print("\t");
            System.out.print((int) -1*Math.ceil(Math.random()*100));
            System.out.print("\t");
        }
        
        {
        }
    }
}
