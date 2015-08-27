
/**
 * Write a description of class Fundemental6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class Fundemental6
{
    public static void main ( String args[])
    {
        int[] myArray;
        myArray=new int[50];
        for(int index=0; index<myArray.length; index++ )
        {
            System.out.print((int) Math.ceil(Math.random()*100));
            System.out.print(" ");
        }
    }
}
