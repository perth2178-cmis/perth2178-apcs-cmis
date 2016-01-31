import java.util.ArrayList;
public class Roster2
{
    public ArrayList myStudents=new ArrayList();

    public void addStudent(Student newStudent)
    {
        myStudents.add(newStudent);
    }

    public void dropStudent(String last)
    {
        for(int i=0;i<myStudents.size;i++)
        {
            if(myStudent.get(i).equals(last))
            {
                myStudents.remove(i);
            }
        }	
    }

}
