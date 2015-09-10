import javax.swing.JOptionPane;
import java.util.Random;
public class Histagram
{
    public static void main (String args[])
    {
        int [] Arraylist;
        Arraylist = new int[100];
        String input=JOptionPane.showInputDialog("Enter a number");
        int num=Integer.parseInt(input);
        int [] Arrayrandom;
        Arrayrandom = new int[num];
        for(int irandom=0;irandom<Arrayrandom.length;irandom++)
        {
           Arrayrandom[irandom]=(int) (100*(Math.random()));
        }
        for(int index = 0;index<Arraylist.length;index++)
        {
            System.out.print(index+":");
            for(int irandom=0;irandom<Arrayrandom.length;irandom++)
            {
                int i=0;
              if(index==Arrayrandom[irandom])
                 {
                    System.out.print("#");  
                 }
              else
                 {
                     System.out.print(" ");  
                 }
            }
            System.out.print("\n");
        }
              }
    }
