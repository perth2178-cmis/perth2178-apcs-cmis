import java.util.ArrayList;
public class Roster2
{
    private ArrayList<Student> StudentList= new ArrayList<Student>();
    public Roster2()
    {
        StudentList.add(new Student("Ross","Clip",3.6)	);
    }

    public void addStudent ( Student newStudent )
    {
        StudentList.add(newStudent);
    }

    public void dropStudent ( String name ) 
    {
        for(int i=0; i<StudentList.size(); i++)
        {
            if(StudentList.get(i).getName().equals(name))
            {
                StudentList.remove(StudentList.get(i));
            }
        }

    }

    public String toString()
    {
        String output =new String();
        for (Student Student : StudentList)
        {
            output+= Student+"\n";
        }
        return output;

    }//toString
}
