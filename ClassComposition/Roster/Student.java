public class Student 
{
    // Instance Variables
    private String first;
    private String last;
    private double GPA;
    
    // Consturctor for Instance Variable
    public Student()
    {
        first=new String("Shaun");
        last=new String("Miller");
        GPA=3.7;
    }//end constructor Song
    
    // zero arguent
    public Student(String first, String last, double GPA)
    {
        this.first=new String(first);
        this.last=new String(last);
        this.GPA=GPA;
    }//end zero argument

    public double getGPA()
    {
        return GPA;
    }
    // toString()
    public String toString()
    {
        String output=new String();
        output="Student Profile:"+"\n"+
                "First Name:"+first+"\n"+
                "Last Name:"+last+"\n"+
                "Highest GPA:"+GPA+"\n";
        return output;
    }//end to String
}//end of class Student