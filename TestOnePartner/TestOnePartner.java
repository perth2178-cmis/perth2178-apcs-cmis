import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
public class TestOnePartner
{
      public static void main ( String args[])
    {
        String input=JOptionPane.showInputDialog("Enter a number");
        int num=Integer.parseInt(input);
        int[] myArray;
        myArray = new int[num];
        for(int index=0; index<myArray.length; index++ )
        {
           System.out.print(index+";");
           System.out.print((double)(50*(Math.random())));
           System.out.print("\n");
        }
        int index=myArray.length-1;
        while (index >= 0)
        {
            int x=(int)(50*(Math.random()));
            int y=x%2;
            int[] narray;
            narray=new int[y];
            if(y==0)
            {
            System.out.print(index+":");
            for(int even=0; even<narray.length; even++ )
            {
                System.out.print("E");
            }
            System.out.print(x);
            }
        else{
            System.out.print(index+":");
            for(int odds=0; odds<narray.length; odds++ )
            {
                System.out.print("O");
            }
            System.out.print(x);
        }
            System.out.print("\n");
            index--;
        }
    } 
}
