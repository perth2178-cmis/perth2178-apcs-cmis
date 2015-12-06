import javax.swing.JOptionPane;
public class Login
{
    public static void main ( String args[])
    {
        String user=JOptionPane.showInputDialog("Set Username");
        String pass=JOptionPane.showInputDialog("Set Password");
        CheckPassword password=new CheckPassword();
        CheckPassword.check(password);
        
    }
}
