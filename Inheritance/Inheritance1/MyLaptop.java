public class MyLaptop extends MyPhone
{
    private String GraphicCard;
    private String Processor;
    
    public MyLaptop(String name, String devicetype, int Size, int Weight, String GraphicCard, String Processor)
    {
        super(name,devicetype, Size, Weight);
        this.GraphicCard=GraphicCard;
        this.Processor=Processor;
    }
    
    public String toString()
    {
        return super.toString() +
    }
}
