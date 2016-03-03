public class PostGrad extends Student
{
   public PostGrad()
    {
        setName("Rebecca");
        setMajor("Zoology");
        setUnits(8);
    }
    
    public int calculateTuition(int units)
    {
        int tuition = units*750;
        return tuition;
    }
}
