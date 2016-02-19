
public class MyDeviceDriver
{
   public static void main(String[] args)
    {
        MyDevice[] device=new MyDevice[2];
        device[0]=new MyPhone("Asus Zenfone 2", "Smartphone", 5.5, 0.5);
        device[1]=new MyLaptop("Lenovo Y70", "Gaming Laptop", 20.0, 2.5, "Nvidia GTX750", "Intel i7");
        for ( MyDevice devices : device )
        {
            System.out.println(devices + "\n");
        }
    }
}
