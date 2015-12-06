import javax.swing.JOptionPane;
public class DieRoll
{
   public static void main(String[] args)
   {
       String numdice=JOptionPane.showInputDialog("How many dices?");
       String[] numdie= new String[1];
       Die6 roll1=new Die6(numdie);
       System.out.println(roll1);
    }
}
