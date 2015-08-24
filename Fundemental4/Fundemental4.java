
/**
 * Write a description of class Fundemental4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class Fundemental4
{
    public static void main ( String args[])
    {
        Random randomGenerator = new Random();
        int x=1;
      for( x=1;x <= 10;   x++ )
      {
         showRandomInteger(x, a,randomGenerator );
          int a=x*x;
         
         System.out.print(x +"\t"+ a +"\t"+ b);
         System.out.print("\n");
      }
    }
}
