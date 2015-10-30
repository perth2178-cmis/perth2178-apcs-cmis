import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
public class iRobot_M1
{
    public static void main ( String args[])
    {
        System.out.println("What's my name?");
        Scanner scanner = new Scanner(System.in);
        String botname = scanner.nextLine();
        System.out.println("What's your name?");
        Scanner scanner1 = new Scanner(System.in);
        String username = scanner1.nextLine();
        System.out.println("Hi "+username+" my name is "+botname);
        String[] choices = { "Tatuin", "Galifrey", "Victorian London", "Futuristic Japan", "The Enterpirse", "Present Day Earth" };
        String location = (String) JOptionPane.showInputDialog(null, "Where am I?",
                "Calculatinging Spawn Point", JOptionPane.QUESTION_MESSAGE, null,
                choices, // Array of choices
                choices[1]); // Initial choice
        System.out.println(location+", interesting let's go explore.");
        System.out.println("");
    }
}