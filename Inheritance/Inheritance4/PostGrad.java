public class PostGrad extends Student
{
   public PostGrad(String Name, String Major, int units)
    {
        setName(Name);
        setMajor(Major);
        setUnits(units);
    }
    
    public int calculateTuition()
    {
        int tuition = getUnits()*750;
        return tuition;
    }
    
    public String toString()
    {
        return super.toString();
    }
}
