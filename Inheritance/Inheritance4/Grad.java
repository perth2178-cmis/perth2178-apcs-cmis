public class Grad extends Student
{
    public Grad(String Name, String Major, int units)
    {
        setName(Name);
        setMajor(Major);
        setUnits(units);
    }

    public int calculateTuition()
    {
        int tuition = getUnits()*500;
        return tuition;
    }

    public String toString()
    {
        return super.toString();
    }
}
