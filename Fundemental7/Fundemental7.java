
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
        myArray=new int[10];
        for(int index=0; index<myArray.length; index++ )
        {
            double num=Math.random();
            if(num<0.5)
            {
                 myArray[index]=(int)(-100*(Math.random()));
                 System.out.print(myArray[index]+(" "));
            }
            else{
                myArray[index]=(int)(100*(Math.random()));
                 System.out.print(myArray[index]+(" "));
            }
        }
        System.out.print("\n");
        int index=0;
        while (index<myArray.length)
        {
          System.out.print(myArray[index]+"\n");
          if(index>0.5)
            {
                 myArray[index]=(int)(-100*(Math.random()));
                 System.out.print(myArray[index]+(" "));
            }
          index++;
        }
    }
}
