
/**
 * Write a description of class TestOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
public class TestOne
{
    public static void main ( String args[])
    {
        String na=JOptionPane.showInputDialog("Please Input an Integer");
        int[] myArray;
        int input=Integer.parseInt(na);
        myArray=new int[input];
        for(int index=0; index<myArray.length; index++ )
        {
            System.out.println(index+":"+(double)(Math.random()*100));
        }
        int index=0;
        while(index<myArray.length)
        {
            double x=(Math.random()*100);
            double y=x%2;
            System.out.println(index+":");
            
                if(y>0)
                {
                    System.out.print(index+":");
                    System.out.print("0");
                    System.out.print(x);
                }
                else
                {
                    System.out.print(index+":");
                    System.out.print("E");
                    System.out.print(x);
                }
            
            index++; 
        }
    }
}
