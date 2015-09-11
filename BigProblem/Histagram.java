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
           int n= Arrayrandom[irandom];
           for(int h=0;h<Hashtag.length; h++)
           {
            Hashtag[n]=Hashtag[n]++;
           }
        }
        
        for(int index = 0;index<Arraylist.length;index++)
        {
            System.out.print(index+":");
            if(Hashtag[n]>0)
            {
                System.out.print("#");
            }
            else
            {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
              }
    }
