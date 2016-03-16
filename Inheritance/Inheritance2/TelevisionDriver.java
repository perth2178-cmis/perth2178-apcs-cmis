public class TelevisionDriver
{
   public static void main(String[] args)
    {
        Television[] TV=new Television[5];
        TV[0]= new Television("Ye Olde Magic Box", 5.35);
        TV[1]= new DLP("Pixels",15.25,"Big Red Button",true);
        TV[2]= new LCD("Less Pixels",10.55,"Basic Remote",true);
        TV[3]= new LED("So Bright",25.55,"TV Remote",true);
        TV[4]= new Plasma("ICSE",40.25,"Universal Remote",true);
        for(Television TVs:TV)
        {
            System.out.println(TVs + "\n");
        }
    }
}
