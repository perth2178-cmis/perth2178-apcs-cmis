import javax.swing.JOptionPane;
import java.util.Random;
public class Histagram
{
    public static void main (String args[])
    {
        int [] Arraylist;
        Arraylist = new int[100];
        int [] Hashtag;
        Hashtag= new int[100];
        String input=JOptionPane.showInputDialog("Enter a number");
        int num=Integer.parseInt(input);
        int [] Arrayrandom;
        Arrayrandom = new int[num];
        int hashtag=0;
        for(int irandom=0;irandom<Arrayrandom.length;irandom++)
        {
           Arrayrandom[irandom]=(int) (100*(Math.random()));
           
        }
        for(int irandom=0;irandom<Arrayrandom.length; irandom++)
           {
               int n= Arrayrandom[irandom];
               Hashtag[n]++;
           }
        int irandom=0;
        while(irandom<Hashtag.length)
            {
                System.out.print(irandom+":");
            if(Hashtag[irandom]>0)
            {
                System.out.print("#");
            }
            else
            {
                System.out.print(" ");
            }
            System.out.print("\n");
                irandom++;
            }
              }
    }
