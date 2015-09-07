
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
        int[] Array;
        int x=(int)(Math.random()*100);
        int y=x%2;
        Array=new int[y];
        int index=myArray.length;
        while(index>=0)
        {
                if(y>0)
                {
                    System.out.print(index+":");
                    System.out.print("0");
                    System.out.print(x);
                    System.out.print("\n");
                }
                else
                {
                    System.out.print(index+":");
                    System.out.print("E");
                    System.out.print(x);
                    System.out.print("\n");
                } 
            index--; 
        }
    }
}
