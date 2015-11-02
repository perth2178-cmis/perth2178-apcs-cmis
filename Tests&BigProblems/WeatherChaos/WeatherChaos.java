
/**
 * Write a description of class WeatherChaos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class WeatherChaos
{
    public static void main(String[] args)
    {
        String daynum=JOptionPane.showInputDialog("How many days?");
        int days=Integer.parseInt(daynum);
        int [] DayArray;
        DayArray=new int[days];
        int [] Array=new int[days];
        int swing=0;
        int org=0;
        int chg=0;
        int max=0;
        int min=99;
        int sum=0;
        double avg=0;
        int moc=0;
        int mst[]=new int [100];
        if(days<0)
        {
            System.out.println("That's not a valid number of days!");
        }
        if(days>31)
        {
            System.out.println("That's not a valid number of days!");
        }
        for(int i=0;i<DayArray.length;i++)
        {
            DayArray[i]=(int) (Math.random() * 200) - 100;
            sum=sum+DayArray[i];
           avg=sum/DayArray[i];
        }
        for(int i=0;i<DayArray.length;i++)
        {
            if(DayArray[1]<0)
            {
                org=DayArray[i]*-1;
            }
            if(DayArray[2]<0)
            {
                chg=DayArray[i]*-1;
            }
           swing=org+chg;
           DayArray[i]++;
        }
        System.out.println("Days"+"\t"+"Temp"+"\t"+"Swing"+"\t"+"Description");
        for(int i=0;i<DayArray.length;i++)
        {
            Array[i]=i+1;
            System.out.print(Array[i]+"\t"+DayArray[i]+"\t"+swing);
            if(DayArray[i]<=0)
            {
                System.out.print("\t"+"Freezing");
            }
            if(0<DayArray[i]&&DayArray[i]<+15)
            {
                System.out.print("\t"+"Chilly");
            }
            if(15<DayArray[i]&&DayArray[i]<+30)
            {
                System.out.print("\t"+"Comfortable");
            }
            if(30<DayArray[i]&&DayArray[i]<+40)
            {
                System.out.print("\t"+"Hot");
            }
            if(DayArray[i]>40)
            {
                System.out.print("\t"+"Burning!");
            }
            System.out.println();
        }
        for(int i=0;i<DayArray.length;i++)
        {
            if(DayArray[i]<min)
            {
                min=DayArray[i];
            }
        }
        for(int i=0;i<DayArray.length;i++)
        {
            if(DayArray[i]>=max)
            {
                max=DayArray[i];
            }
        }
        for(int i=0;i<DayArray.length;i++)
        {
            if(DayArray[i]>moc)
            {
                moc=DayArray[i];
            }
        }
        for(int i=0;i<DayArray.length;i++)
        {
            if(DayArray[i]==moc)
            {
                mst[i]=i;
            }
        }
        System.out.println("MIN: "+min);
        System.out.println("MAX: "+max);
        System.out.println("AVG: "+avg);
        System.out.print("MST: ");
        for(int i=0;i<DayArray.length;i++)
        {
            if(mst[i]>0)
            {
                System.out.print(mst[i]);
            }
        }
        System.out.print("\n");
              }
    }
 