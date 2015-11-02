public class YourObject 
{
    // Instance Variables
    private String name;
    private int speed;
    private double accuracy;
    
    // Consturctor for Instance Variable
    public YourObject()
    {
        name=new String("SU-100Y");
        speed=26;
        accuracy=67.55;
    }//end constructor YourObject
    
    // zero arguent
    public YourObject(String name,int speed,double accuracy)
    {
        this.name=new String(name);        
        this.speed=speed;
        this.accuracy=accuracy;
    }//end zero argument
    
    // toString()
    public String toString()
    {
        String output=new String();
        output="Tank Stats\nName: "+name+"\nSpeed: "+speed+"\nAccuracy: "+accuracy+"\n";
        return output;
    }//end to String
    
}//end of class YourObject