public class Roster
{
    private Student[] Students=new Student[3];

    public Roster()
    {
        Student s1=new Student("Mark","Hunter",3.4);
        Student s2=new Student("Grognac","The Strong",2.6);
        Student s3=new Student("Uthgerd","The Unbroken",3.6);
        Students[0]=s1;
        Students[1]=s2;
        Students[2]=s3;
    }

    public Student findStudentWithMaxGPA()
    {
        Student HighestStudent;
        int MaxGPA=0;
        for(int i=0;i<Students.length;i++)
        {
            Students[i].getGPA()
            if(f>MaxGPA)
            {
                MaxGPA=Students[i].GPA;
                HighestStudent=Students[i];
            }
        }
        return HighestStudent;
    }
    
    public String toString()
    {
        String ouput=new String();
        output= findStudentWithMaxGPA();
        return output;
    }
}
