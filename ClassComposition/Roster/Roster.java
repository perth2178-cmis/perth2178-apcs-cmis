public class Roster
{
    private Student[] Students=new Student[3];
    private String HighestStudent;
    private double MaxGPA=0;

    public Roster()
    {
        Student s1=new Student("Mark","Hunter",3.4);
        Student s2=new Student("Grognac","The Strong",2.6);
        Student s3=new Student("Uthgerd","The Unbroken",3.6);
        Students[0]=s1;
        Students[1]=s2;
        Students[2]=s3;
    }

    public String findStudentWithMaxGPA()
    {
        for(int i=0;i<Students.length;i++)
        {
            double GPA= Students[i].getGPA();
            String Name= Students[i].getName();
            if(GPA>MaxGPA)
            {
                MaxGPA=GPA;
                HighestStudent=Name;
            }
        }
        return HighestStudent;
    }
    
    public String toString()
    {
        String output=new String();
        output= findStudentWithMaxGPA();
        return output;
    }
}
