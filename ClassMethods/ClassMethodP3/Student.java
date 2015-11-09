public class Student 
{
    // Instance Variables
    private String first;
    private String last;
    private int age;
    public double[] grades;
    private double GPA;
    private double gpa;
    private double totalgrade;
    
    // Consturctor for Instance Variable
    public Student()
    {
        first=new String("Shaun");
        last=new String("Miller");
        age=17;
        GPA=3.7;
        grades=new double[5];
    }//end constructor Song

    // zero arguent
    public Student(String first, String last, int age,double[] grades)
    {
        this.first=new String(first);
        this.last=new String(last);
        this.age=age;
        this.grades[0]=grades[0];
        this.grades[1]=grades[1];
        this.grades[2]=grades[2];
        this.grades[3]=grades[3];
        this.grades[4]=grades[4];
    }//end zero argument

    //getter
    public double getGPA()
    {
        return GPA;
    }//end method getGPA()

    // setter
    public void setGPA(double gpa)
    {
        this.GPA=gpa;
    }//end method setGPA()

    public double calcGPA()
    {
        for(int i=0;i<grades.length;i++)
        {
            totalgrade=grades[i]++;
        }
        gpa=totalgrade/5;
        return gpa;
    }

    // toString()
    public String toString()
    {
        String output=new String();
        output="Student Profile:"+"\n"+
        "First Name:"+first+"\tLast Name:"+last+"\n"+
        "Age:"+age+"\n"+
        "Average GPA:"+calcGPA()+"\n";
        return output;
    }//end to String

}//end of class Song