public class DieRoll
{
   public static void main(String[] args)
   {
       String numdice=JOptionPane.showInputDialog("How many dices?");
       String[] numdie= new String[]();
       Die6 roll1=new Die6(1);
       System.out.println(roll1);
    }
}
