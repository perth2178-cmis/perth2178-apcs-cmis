import javax.swing.JOptionPane;
public class Array2D6
{
    public static void main(String [] args)
    {
        String LastName = JOptionPane.showInputDialog( "Please enter your lastname?");
        String Password = JOptionPane.showInputDialog( "Please enter your password?");
        String ConvertName = LastName.toLowerCase();
        String ConvertPass = Password.toLowerCase();
        int pass = 0;
        while(pass >= 0)
        {
            pass = ConvertPass.indexOf(ConvertName);
            if(pass >= 0)
            {
                ConvertPass = JOptionPane.showInputDialog( "Password not excepted, Please enter a new password.").toLowerCase();
            }
            else
            {
                System.out.println("Password excepted, you have successfully logged in");
            }
        }
        System.out.println(LastName+" : "+Password);
    }
}
