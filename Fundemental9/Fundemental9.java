/**
 * Write a description of class Temp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
public class Fundemental9
{
    public static void main ( String args[])
    {
        String user=JOptionPane.showInputDialog("Username");
        String pass=JOptionPane.showInputDialog("Passcode");
        int pc=Integer.parseInt(pass);
        if(user.equals("Perth"))
        {
            if(pc==2178)
            {
                System.out.println("You have successfully logged in.");
            }
            else
        {
            System.out.println("Login unsuccessful. Check your username and password.");
        }
        }
        else
        {
            System.out.println("Login unsuccessful. Check your username and password.");
        }
    }
}
