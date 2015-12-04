public class Die6
{
    private String[] Dsides={"1","2","3","4","5","6"};
    private String side;
    private String[] Result;
    private int value;

    public Die6(String[] numdie)
    {
        for (int i=0;i<numdie.length;i++)
        {
            this.side=new String(Dsides[(int)(Math.random()*6)]);
            Result[i]=side;
        }
    }

    public String toString()
    {
        String result=new String();
        result=side+"\n";
        return result;
    }
}
