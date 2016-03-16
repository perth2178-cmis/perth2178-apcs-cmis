public class LED extends Television
{
    private String remote;
    private boolean ON;
    
   public LED(String model, double price, String remote, boolean ON)
   {
       super(model,price);
       this.remote=remote;
       this.ON=true;
    }
    
    public String toString()
    {
        return super.toString() + String.format("It has a %s ... Is it on? %b",remote,ON);
    }
}
