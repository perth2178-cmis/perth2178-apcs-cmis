
/**
 * Write a description of class Fundemental2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class Fundemental2
{
    public static void main (String[] args)
           {
               String NA;
               String na=JOptionPane.showInputDialog("What is variable a?");
               int a=Integer.parseInt(na);
               String NB;
               String nb=JOptionPane.showInputDialog("What is variable b?");
               int b=Integer.parseInt(nb);
               String respond;
               if(a>b)
               {
                   System.out.println("The value of a is "+a+" and it is greater than b whose value is "+b+"."); 
                }
                if(a<b)
               {
                   System.out.println("The value of a is "+a+" and it is less than b whose value is "+b+".");
                }
                else
                {
                   System.out.println("The value of a is "+a+" and it is equal to b whose value is "+b+"."); 
                }
            }
}
