public class Student 
{
    // Instance Variables
    private String first;
    private String last;
    private int age;
    private double[] grades;
    private double GPA;
    private double totalgrade;

    // Consturctor for Instance Variable
    public Student()
    {
        first=new String("Joe");
        last=new String("Senior");
        age=17;
        GPA=0;
        totalgrade=0;
        grades=new double[5];
        grades[0]=4.0;
        grades[1]=4.0;
        grades[2]=3.5;
        grades[3]=4.0;
        grades[4]=4.0;
    }//end constructor Student
    
    public double getGPA()
    {
        return GPA;
    }
    // zero arguent
    public void setGPA()
    {
        for(int i=0;i<grades.length;i++)
        {
            this.grades[i]=4.0;
        }
    }//end zero argument

    public double calcGPA()
    {
        totalgrade=0;
        for(int i=0;i<grades.length;i++)
        {
            totalgrade=totalgrade+grades[i];
        }
        GPA=totalgrade/grades.length;
        return GPA;
    }

    // toString()
    public String toString()
    {
        String output=new String();
        output="Student Profile:"+"\n"+
        "First Name: "+first+"\nLast Name: "+last+"\n"+
        "Age: "+age+"\n"+
        "Average GPA: "+calcGPA()+"\n";
        return output;
    }//end to String

}//end of class Student