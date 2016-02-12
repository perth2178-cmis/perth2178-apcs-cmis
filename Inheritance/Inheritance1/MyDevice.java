public class MyDevice
{
    private String name;
    private String devicetype;
    
    public MyDevice(String name, String devicetype)
    {
        this.name = name; 
        this.devicetype = new String(devicetype);
    }

    public String toString()
    {
        return String.format("Name: %s\nType: %s", name, devicetype);
    }
}
