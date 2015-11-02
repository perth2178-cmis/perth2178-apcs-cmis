/**
 * Write a description of class Temp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;
public class Fundemental8
{
    public static void main ( String args[])
    {
        String artist[]=new String[3];
        {
            artist[0]= "Dave Koz";
            artist[1]= "Kaori Kobayashi";
            artist[2]= "Mikey Deleasa";
        }
        for(int index=0; index<artist.length; index++ )
        {
            System.out.println(artist[index]);
        }
        artist[(int)(Math.random()*4)]="Micheal Jackson";
        for(int index=0; index<artist.length; index++ )
        { 
            if(artist[index].equals("Micheal Jackson"))
            {
               System.out.println("We Found Micheal!"); 
            }
            else
            {
                System.out.println("No Micheal in music["+index+"]");
            }
        }
    }
}
