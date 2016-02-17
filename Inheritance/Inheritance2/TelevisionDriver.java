public class TelevisionDriver
{
   public static void main(String[] args)
    {
        Television[] TV=new Television[5];
        TV[0]= new Television();
        TV[1]= new DLP();
        TV[2]= new LCD();
        TV[3]= new LED();
        TV[4]= new Plasma();
        for(Television TVs:TV)
        {
            System.out.println(TVs + "\n");
        }
    }
}
