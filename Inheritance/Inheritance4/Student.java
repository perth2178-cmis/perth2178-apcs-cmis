public abstract class Student
{
    private String Name;
    private String Major;
    private int Units;

    public Student()
    {
        this.Name = new String();
        this. Major = new String();
        this. Units = 0;
    }

    public void setName(String name)
    {
        this.Name = new String( name );
    }

    public String getName()
    {
        return Name; 
    }

    public void setMajor(String major)
    {
        this.Major = new String( major );
    }

    public String getMajor()
    {
        return Major; 
    }

    public void setUnits(int units)
    {
        this.Units = units;
    }

    public int getUnits()
    {
        return Units; 
    }

    abstract public int calculateTuition(int units);
}
