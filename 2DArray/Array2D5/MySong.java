public class MySong
{
   // Instance Variables
    private String name;
    private int charge;

    // zero argument
    public MySong()
    {
        name= new String("Wasteland");
        charge = 4;
    }//end zero argument

    // three constructor
    public MySong(String name,int charge)
    {
        this.name= new String(name);
        this.charge=charge;
    }//end three constructor

}
