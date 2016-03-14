public class MyCar extends Vehicle implements Connectable, Discountable
{
    private double cost;

    public MyCar(int numpassenger, double cost)
    {
        super(numpassenger);
        this.cost = cost;
    }

    public void connectToBluetooth()
    {
        System.out.println("Connecting to bluetooth for a MyCar");
    }

    public void applyDiscount()
    {
        cost=cost*0.8;
    }

    public String toString()
    {
        return super.toString() + "Cost: " + cost;
    }
}
