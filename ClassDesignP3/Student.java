public class Student 
{
    // Instance Variables
    private String first;
    private String last;
    private int age;
    private double GPA;
    
    // Consturctor for Instance Variable
    public Student()
    {
        first=new String("Shaun");
        last=new String("Miller");
        age=17;
        GPA=3.7;
    }//end constructor Song
    
    // zero arguent
    public Student(String first, String last, int age, double GPA)
    {
        this.first=new String(first);
        this.last=new String(last);
        this.age=age;
        this.GPA=GPA;
    }//end zero argument
    
    // toString()
    public String toString()
    {
        String output=new String();
        output="Student Profile:"+"\n"+
                "First Name:"+first+"\n"+
                "Last Name:"+last+"\n"+
                "Age:"+age+"\n"+
                "Average GPA:"+GPA+"\n";
        return output;
    }//end to String
    
}//end of class Song
