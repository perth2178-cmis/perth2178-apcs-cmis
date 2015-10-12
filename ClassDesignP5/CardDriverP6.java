import java.util.Random;
public class CardDriverP6
{
    public static void main(String[] args)
    {
        Card[] Dealer=new Card[2];
        Card[] Player1=new Card[2];
        Card[] Player2=new Card[2];
        Card[] Player3=new Card[2];
        Card[] Player4=new Card[2];
        Card[] Player5=new Card[2];
        int[] Score=new int[12];
        String[] PossibleRank={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] PossibleSuit={"♠","♣","♦","♥"};
        int cardscore=0;
        int rankvalue=2;
        int[] Rank= new int[2]; 
        int[] Suit= new int[2];
        System.out.println("Your Hands:");
        for(int i=0;i<Dealer.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card Dhand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            Dealer[i]=Dhand;
            System.out.print(Dhand);
        }   
        for(int i=0;i<Player1.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card P1hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            System.out.print(P1hand);
        } 
        for(int i=0;i<Player2.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card P2hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            System.out.print(P2hand);
        } 
        for(int i=0;i<Player3.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card P3hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            System.out.print(P3hand);
        } 
        for(int i=0;i<Player4.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card P4hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            System.out.print(P4hand);
        } 
        for(int i=0;i<Player5.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card P5hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            System.out.print(P5hand);
        } 
        for(int i=0;i<Dealer.length;i++)
        {
            if(Dealer[i].rank.equals("J"))
            {
                rankvalue=10;
            }
            else if(Dealer[i].equals("A"))
            {
                rankvalue=11;
            }
            else 
            {
                rankvalue=[i];
            }
            System.out.println(rankvalue);
            
        }
    }//end method main
}//end class CardDriverP6