
/**
 * Write a description of class Fundemental5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class Fundemental5
{
    public static void main ( String args[])
    {
        String loop;
        String a=JOptionPane.showInputDialog("Give me a number");
        int x=Integer.parseInt(a);
        for(int i=1; i<x; i++)
        {
         System.out.println("\n");
         System.out.println("Jurassic Park"+"\n"+"Doctor Who 50th Anniversary"+"\n"+"Iron Man");
         System.out.println("\n");
         System.out.println("Don't Stop Me Now"+"\t"+"Smooth Criminal"+"\t"+"Rhapsody in Blue");
        }
    }
}
