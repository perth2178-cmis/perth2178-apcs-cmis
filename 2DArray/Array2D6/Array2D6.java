import javax.swing.JOptionPane;
public class Array2D6
{
    public static void main(String [] args)
    {
        String lastName = JOptionPane.showInputDialog( "What is your lastname?");
        String password = JOptionPane.showInputDialog( "What is your password?");
        String convertLastName = lastName.toLowerCase();
        String convertPassword = password.toLowerCase();
        int pass = 0;

        while(pass >= 0)
        {
            pass = convertPassword.indexOf(convertLastName);
            if(pass >= 0)
            {
                convertPassword = JOptionPane.showInputDialog( "What is your password?").toLowerCase();
            }
            else
            {
                System.out.print("You have successfully logged in");
            }
        }

    }
}
