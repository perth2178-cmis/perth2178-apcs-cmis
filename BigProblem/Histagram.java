import javax.swing.JOptionPane;
import java.util.Random;
public class Histagram
{
    public static void main (String args[])
    {
        int [] Count;
        Count= new int[100];
        String input=JOptionPane.showInputDialog("Enter a number");
        int num=Integer.parseInt(input);
        int [] Arrayrandom;
        Arrayrandom = new int[num];
        for(int irandom=0;irandom<Arrayrandom.length;irandom++)
        {
           Arrayrandom[irandom]=(int) (100*(Math.random()));
           
        }
        for(int irandom=0;irandom<Arrayrandom.length; irandom++)
           {
               int n= Arrayrandom[irandom];
               Count[n]++;
           }
        for (int irandom=0; irandom<Count.length; irandom++)
            {
                System.out.println(irandom+":"+Count[irandom]);
            }
        int irandom=0
        while(irandom<Count.length)
        {
            int hashtag=Count[irandom]
            if()
            {
                System.out.println(irandom+":")
            }
            else
            {
                System.out.println(irandom+":")
            }
            irandom++;
        }
        
              }
    }
