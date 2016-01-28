import java.util.ArrayList;
public class Family
{
    public static void main(String[] args)
    {
        ArrayList<String> myFamily = new ArrayList();
        myFamily.add("Numchai");
        myFamily.add("Supani");
        myFamily.add("Pear");
        myFamily.add("Punch");
        myFamily.add("Po");

        System.out.println(myFamily.size());
        for(int i=0;i<myFamily.size();i++)
        {
            System.out.println(myFamily.get(i));
        }

        for(String member : myFamily)
        {
            System.out.println(member);
        }
    }
}
