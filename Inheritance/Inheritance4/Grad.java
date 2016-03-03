public class Grad extends Student
{
   public Grad()
    {
        setName("Elliot");
        setMajor("Botany");
        setUnits(8);
    }
    
    public int calculateTuition(int units)
    {
        int tuition = units*500;
        return tuition;
    }
}
