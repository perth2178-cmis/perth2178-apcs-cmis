public class CheckPassword
{
    private String pass;
    private boolean checkresult;

    public boolean check(String pass)
    {
        if(pass.length()<6)
        {
            System.out.println("Invalid password you need at least 6 characters.");
        }
        for(int i=0;i<pass.length();i++)
        {
            if(pass.substring(i,i+1).equals("+"))
            {
                checkresult=true;
            }
            else if(pass.substring(i,i+1).equals("-"))
            {
                checkresult=true;
            }
            else if(pass.substring(i,i+1).equals("*"))
            {
                checkresult=true;
            }
            else if(pass.substring(i,i+1).equals("/"))
            {
                checkresult=true;
            }
            else if(pass.substring(i,i+1).equals("@"))
            {
                checkresult=true;
            }
            else
            {
                checkresult=false;
                System.out.println("Invalid password you need at least one non-alphanumeric character.");
            }
        }
        return checkresult;
    }
}
