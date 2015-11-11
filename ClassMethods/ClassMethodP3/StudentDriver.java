import javax.swing.JOptionPane;
public class StudentDriver
{
    public static void main(String[] args)
    {
        Student senior001=new Student();
        Student senior002=new Student("Joe","Senior",15,4.0,
        4.0,
        3.5,
        4.0,
        4.0);
        System.out.println(senior001);
        System.out.println(senior002);
    }//end method main
}//end class StudentDriver