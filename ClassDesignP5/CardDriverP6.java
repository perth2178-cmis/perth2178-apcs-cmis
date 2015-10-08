import java.util.Random;
public class CardDriverP6
{
    public static void main(String[] args)
    {
        int[] Dealer=new int[2];
        int[] Player1=new int[2];
        int[] Player2=new int[2];
        int[] Player3=new int[2];
        int[] Player4=new int[2];
        int[] Player5=new int[2];
        int[] Score=new int[6];
        String[] PossibleRank={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] PossibleSuit={"♠","♣","♦","♥"};
        int rankvalue=0;
        int[] Rank= new int[2]; 
        int[] Suit= new int[2];
        System.out.println("Your Hands:");
        for(int i=0;i<Dealer.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            System.out.print(hand);
        }   
        for(int i=0;i<Player1.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            System.out.print(hand);
        } 
        for(int i=0;i<Player2.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            System.out.print(hand);
        } 
        for(int i=0;i<Player3.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            System.out.print(hand);
        } 
        for(int i=0;i<Player4.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            System.out.print(hand);
        } 
        for(int i=0;i<Player5.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            System.out.print(hand);
        } 
        for(int i=0;i<Score.length;i++)
        {
            if(Rank[i]>10&&Rank[i]<13)
            {
                rankvalue=10;
            }
            else if(Rank[i]==13)
            {
                rankvalue=11;
            }
            System.out.println(rankvalue);
        }
    }//end method main
}//end class CardDriverP6