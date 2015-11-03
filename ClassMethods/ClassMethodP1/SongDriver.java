import javax.swing.JOptionPane;
public class SongDriver
{
    public static void main(String[] args)
    {
        Song song1=new Song();
        String user=JOptionPane.showInputDialog("Username");
        String pass=JOptionPane.showInputDialog("Passcode");
        int year=0;
        if(user.equals("Perth"))
        {
            if(pass.equals("2178"))
            {
                String newyear=JOptionPane.showInputDialog("Set the Release Date");
                year=Integer.parseInt(newyear);
            }
            else
            {
                System.out.println("Login unsuccessful. Check your username and password.");
            }
        }
        else
        {
            System.out.println("Login unsuccessful. Check your username and password.");
        }
        System.out.println(song1);
        Song song2=new Song(35,324,"Pop");
        song2.setYearReleased(year);
        System.out.println(song2);
    }//end method main
}//end class SongDriver