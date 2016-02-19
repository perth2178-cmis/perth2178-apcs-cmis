public class MyPhone extends MyDevice
{
    private double Size;
    private double Weight;
    
    public MyPhone(String name, String devicetype, double Size, double Weight)
    {
        super(name,devicetype);
        this.Size=Size;
        this.Weight=Weight;
    }
    
    public String toString()
    {
        return super.toString() + String.format("Size: %f\nWeight: %f\n", Size, Weight);
    }
}
