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
        int max=0;
        int min=99;
        int sum=0;
        double avg=0;
        int moc=0;
        int mst[]=new int [100];
        for(int irandom=0;irandom<Arrayrandom.length;irandom++)
        {
           Arrayrandom[irandom]=(int) (100*(Math.random()));
           sum=sum+Arrayrandom[irandom];
           avg=(double)sum/(double)num;
        }
        for(int irandom=0;irandom<Arrayrandom.length; irandom++)
           {
               int n= Arrayrandom[irandom];
               Count[n]++;
           }
        for (int irandom=0; irandom<Count.length; irandom++)
            {
               System.out.print(irandom+":");
                  for(int i=0; i<Count[irandom]; i++)
                  {
                      System.out.print("#");
                  }
               System.out.print("\n");    
            }
        for(int irandom=0;irandom<Arrayrandom.length; irandom++)
        {
            if(Arrayrandom[irandom]<min)
            {
                min=Arrayrandom[irandom];
            }
        }
        for(int irandom=0;irandom<Arrayrandom.length; irandom++)
        {
            if(Arrayrandom[irandom]>=max)
            {
                max=Arrayrandom[irandom];
            }
        }
        for(int irandom=0;irandom<Arrayrandom.length; irandom++)
        {
            if(Count[irandom]>moc)
            {
                moc=Count[irandom];
            }
        }
        for(int irandom=0;irandom<Arrayrandom.length; irandom++)
        {
            if(Count[irandom]==moc)
            {
                mst[irandom]=irandom;
            }
        }
        System.out.println("MIN: "+min);
        System.out.println("MAX: "+max);
        System.out.println("SUM: "+sum);
        System.out.println("AVG: "+avg);
        System.out.print("MST: ");
        for(int irandom=0;irandom<Count.length; irandom++)
        {
            if(mst[irandom]>0)
            {
                System.out.print(mst[irandom]);
            }
        }
        System.out.print("\n");
              }
    }
