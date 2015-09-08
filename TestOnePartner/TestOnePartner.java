
/**
 * Write a description of class TestOnePartner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
public class TestOnePartner
{
    public static void main ( String args[])
    {
        String input=JOptionPane.showInputDialog("Enter a number");
        int num=Integer.parseInt(input);
        double [] Array;
        Array= new double[num];
        for(int index=0; index<Array.length; index++ )
        {
            System.out.print(index+":");
            Array[index]=(double)(51*(Math.random()));
            System.out.print(Array[index]);
            System.out.print("\n");
        }
        int index=Array.length-1;
        while(index>=0)
        {
            double p=Array[index];
            int x=(int)(51*(Math.random()));
            int y=x%2;
            if(y==0)
            {
                System.out.print(index+":");
                for(int i=0;i<x;i++)
                {
                    System.out.print("E");
                }
                System.out.print(p);
            }
            else
            {
                System.out.print(index+":");
                for(int i=0;i<x;i++)
                {
                    System.out.print("O");
                }
                System.out.print(p);
            }
            System.out.print("\n");
            index--;
        }
    }
}
