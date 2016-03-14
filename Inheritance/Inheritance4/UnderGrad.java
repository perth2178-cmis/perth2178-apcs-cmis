public class UnderGrad extends Student
{
    public UnderGrad(String Name, String Major, int units)
    {
        setName(Name);
        setMajor(Major);
        setUnits(units);
    }
    
    public int calculateTuition()
    {
        int tuition = getUnits()*250;
        return tuition;
    }
    
    public String toString()
    {
        return super.toString();
    }
}
