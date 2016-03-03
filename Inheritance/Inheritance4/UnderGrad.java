public class UnderGrad extends Student
{
    public UnderGrad()
    {
        setName("Mark");
        setMajor("Sociology");
        setUnits(6);
    }
    
    public int calculateTuition(int units)
    {
        int tuition = units*250;
        return tuition;
    }
}
