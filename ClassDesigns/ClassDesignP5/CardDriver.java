import java.util.Random;
public class CardDriver
{
    public static void main(String[] args)
    {
        int[] MyHand=new int[3];
        String[] PossibleRank={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] PossibleSuit={"♠","♣","♦","♥"};
        int[] Rank= new int[3]; 
        int[] Suit= new int[3];
        System.out.println("Your Hand:");
        for(int i=0;i<MyHand.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            System.out.print(hand);
        }
    }//end method main
}//end class CardDriver