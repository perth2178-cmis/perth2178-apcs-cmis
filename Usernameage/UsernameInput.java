
/**
 * Write a description of class User_name_age here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class UsernameInput
{
    public static void main ( String[] args)
    {
     Scanner user_input=new Scanner(System.in);
     String user_name;
     System.out.print("Enter Username");
     user_name=user_input.next();
     String user_age;
     System.out.print("How old are you?");
     user_age=user_input.next();
     String name_age;
     System.out.println("Hello,"+user_name);
     System.out.println("You are "+user_age);
    }
}
