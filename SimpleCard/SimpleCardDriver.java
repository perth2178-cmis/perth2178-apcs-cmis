public class SimpleCardDriver
{
    public static void main(String[] args)
    {
        String[] PossibleRank={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        SimpleCard[] Deck=new SimpleCard[52];
        SimpleCard[] Spade=new SimpleCard[13];
        SimpleCard[] Clubs=new SimpleCard[13];
        SimpleCard[] Heart=new SimpleCard[13];
        SimpleCard[] Diamond=new SimpleCard[13];
        SimpleCard[] Draw=new SimpleCard[5];
        for(int i=0;i<Spade.length;i++)
        {
            SimpleCard spade=new SimpleCard("♠",PossibleRank[i]);
            Spade[i]=spade;
            Deck[i]=Spade[i];
        }
        for(int i=0;i<Clubs.length;i++)
        {
            SimpleCard clubs=new SimpleCard("♣",PossibleRank[i]);
            Clubs[i]=clubs;
            Deck[i+13]=Clubs[i];
        }
        for(int i=0;i<Heart.length;i++)
        {
            SimpleCard heart=new SimpleCard("♥",PossibleRank[i]);
            Heart[i]=heart;
            Deck[i+26]=Heart[i];
        }
        for(int i=0;i<Diamond.length;i++)
        {
            SimpleCard diamond=new SimpleCard("♦",PossibleRank[i]);
            Diamond[i]=diamond;
            Deck[i+39]=Diamond[i];
        }
        for(int i=0;i<Draw.length;i++)
        {
            System.out.println(Deck[(int)(Math.random() * 52)]);
        }
    }
}