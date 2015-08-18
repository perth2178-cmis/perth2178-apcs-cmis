
/**
 * Write a description of class numcalculate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class numcalculate
{
  public static void main ( String[] args)
    {
     int sum=0;
     Scanner user_input=new Scanner(System.in);
     String num1;
     System.out.print("Enter First Number ");
     num1=user_input.next();
     int n1=Integer.parseInt(num1);
     String num2;
     System.out.print("Enter Second Number ");
     num2=user_input.next();
     int n2=Integer.parseInt(num2);
     String result;
     int s1=n1+n2;
     int s2=n2+n1;
     int s3=n1-n2;
     int s4=n2-n1;
     int s5=n1*n2;
     int s6=n2*n1;
     int s7=n1/n2;
     int s8=n2/n1;
     int s9=n1%n2;
     int s10=n2%n1;
     System.out.print(s1+" = "+n1+" + "+n2);
     
     System.out.print(s2+" = "+n2+" + "+n1);
     
     System.out.print(s3+" = "+n1+" - "+n2);
     
     System.out.print(s4+" = "+n2+" - "+n1);
     
     System.out.print(s5+" = "+n1+" * "+n2);
     
     System.out.print(s6+" = "+n2+" * "+n1);
     
     System.out.print(s7+" = "+n1+" / "+n2);
     
     System.out.print(s8+" = "+n2+" / "+n1);
     
     System.out.print(s9+" = "+n1+" % "+n2);
     
     System.out.print(s10+" = "+n2+" % "+n1);
    }
}
