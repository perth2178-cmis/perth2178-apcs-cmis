import javax.swing.JOptionPane;
public class StudentDriver
{
    public static void main(String[] args)
    {
        double[] grades=new double[5];
        Student senior001=new Student();
        System.out.println(senior001);
        Student senior002=new Student();
        senior002.setGPA();
        senior002.calcGPA();
        System.out.println(senior002);
    }//end method main
}//end class StudentDriver