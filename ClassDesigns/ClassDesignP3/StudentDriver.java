import javax.swing.JOptionPane;
public class StudentDriver
{
    public static void main(String[] args)
    {
        Student senior001=new Student();
        Student junior001=new Student("Rob","Flinch",15,3.6);
        System.out.println(senior001);
        System.out.println(junior001);
        JOptionPane.showMessageDialog(null,junior001,"Student Profile",JOptionPane.PLAIN_MESSAGE);
    }//end method main
}//end class StudentDriver