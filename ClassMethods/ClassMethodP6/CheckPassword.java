public class CheckPassword
{
    private String pass;

    public String check(String pass)
    {
        if(pass.length()<6)
        {
            System.out.println("Invalid password you need at least 6 characters.");
        }
        for(int i=0;i<pass.length();i++)
        {
            if(pass.substring(i,i+1).equals("+"))
            {
                System.out.println("Invalid password");
            }
        }
    }
}
