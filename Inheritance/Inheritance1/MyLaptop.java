public class MyLaptop extends MyPhone
{
    private String GraphicCard;
    private String Processor;
    
    public MyLaptop(String name, String devicetype, double Size, double Weight, String GraphicCard, String Processor)
    {
        super(name,devicetype, Size, Weight);
        this.GraphicCard=GraphicCard;
        this.Processor=Processor;
    }
    
    public String toString()
    {
        return super.toString() + String.format("Graphics Card: %s\nProcessor: %s\n", GraphicCard, Processor);
    }
}
