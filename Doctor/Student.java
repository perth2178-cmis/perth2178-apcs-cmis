public class Student extends Person
{
    String schoolName;
    
    public Student(String name, String yob, String mob, String dob, String schoolName)
    {
        super(name, yob, mob, dob);
        this.schoolName = schoolName;
    }
    
        
    public String toString()
    {
        return super.toString() + String.format("\nSchool: %s", schoolName);
    }
    
}