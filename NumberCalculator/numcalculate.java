
/**
 * Write a description of class numcalculate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class numcalculate
{
  public static void main ( String[] args)
    {
     DecimalFormat df = new DecimalFormat("#.000");
     int sum=0;
     Scanner user_input=new Scanner(System.in);
     String num1;
     System.out.print("Enter First Number ");
     num1=user_input.next();
     float n1=Integer.parseInt(num1);
     String num2;
     System.out.print("Enter Second Number ");
     num2=user_input.next();
     float n2=Integer.parseInt(num2);
     String result;
     float s1=n1+n2;
     float s2=n2+n1;
     float s3=n1-n2;
     float s4=n2-n1;
     float s5=n1*n2;
     float s6=n2*n1;
     float s7=n1/n2;
     float s8=n2/n1;
     float s9=n1%n2;
     float s10=n2%n1;
     System.out.println(s1+" = "+n1+" + "+n2);
     
     System.out.println(s2+" = "+n2+" + "+n1);
     
     System.out.println(s3+" = "+n1+" - "+n2);
     
     System.out.println(s4+" = "+n2+" - "+n1);
     
     System.out.println(s5+" = "+n1+" * "+n2);
     
     System.out.println(s6+" = "+n2+" * "+n1);
     
     System.out.println(s7+" = "+n1+" / "+n2);
     
     System.out.println(s8+" = "+n2+" / "+n1);
     
     System.out.println(s9+" = "+n1+" % "+n2);
     
     System.out.println(s10+" = "+n2+" % "+n1);
    }
}
