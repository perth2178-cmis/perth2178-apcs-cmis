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
        int[] Score=new int[1];
        String[] PossibleRank={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] PossibleSuit={"♠","♣","♦","♥"};
        int cardscore=0;
        int dealerscore=0;
        int rankvalue=2;
        int[] Rank= new int[2]; 
        int[] Suit= new int[2];
        System.out.println("Dealer:");
        for(int i=0;i<Dealer.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card Dhand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            Dealer[i]=Dhand;
            System.out.print(Dhand);
        }   
        for(int i=0;i<Dealer.length;i++)
        {
            if(Dealer[i].rank.equals("J"))
            {
                rankvalue=10;
            }
            else if(Dealer[i].rank.equals("Q"))
            {
                rankvalue=10;
            }
            else if(Dealer[i].rank.equals("K"))
            {
                rankvalue=10;
            }
            else if(Dealer[i].rank.equals("A"))
            {
                rankvalue=11;
            }
            else 
            {
                int ranks = Integer.parseInt(Dealer[i].rank);
                rankvalue=ranks;
            }
            cardscore=cardscore+rankvalue;
            dealerscore=cardscore;
        }
        System.out.println("Score:"+cardscore);
         if(cardscore==21)
        {
            System.out.println("BLACKJACK\n");
        }
        else if(cardscore>21)
        {
            System.out.println("DEALER LOSES\n");
        }
        System.out.println();
        cardscore=0;
        System.out.println("Player 1:");
        for(int i=0;i<Player1.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card P1hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            Player1[i]=P1hand;
            System.out.print(P1hand);
        } 
        for(int i=0;i<Player1.length;i++)
        {
            if(Player1[i].rank.equals("J"))
            {
                rankvalue=10;
            }
            else if(Player1[i].rank.equals("Q"))
            {
                rankvalue=10;
            }
            else if(Player1[i].rank.equals("K"))
            {
                rankvalue=10;
            }
            else if(Player1[i].rank.equals("A"))
            {
                rankvalue=11;
            }
            else 
            {
                int ranks = Integer.parseInt(Player1[i].rank);
                rankvalue=ranks;
            }
            cardscore=cardscore+rankvalue;
        }
        System.out.println("Score:"+cardscore);
         if(cardscore==21)
        {
            System.out.println("BLACKJACK PLAYER 1 WINS\n");
        }
        else if(cardscore>21)
        {
            System.out.println("PLAYER 1 LOSES\n");
        }
        else if(cardscore<=dealerscore)
        {
            System.out.println("DEALER WINS\n");
        }
        else if(cardscore>dealerscore)
        {
            System.out.println("PLAYER 1 WINS\n");
        }
        cardscore=0;
        System.out.println("Player 2:");
        for(int i=0;i<Player2.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card P2hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            Player2[i]=P2hand;
            System.out.print(P2hand);
        } 
        for(int i=0;i<Player2.length;i++)
        {
            if(Player2[i].rank.equals("J"))
            {
                rankvalue=10;
            }
            else if(Player2[i].rank.equals("Q"))
            {
                rankvalue=10;
            }
            else if(Player2[i].rank.equals("K"))
            {
                rankvalue=10;
            }
            else if(Player2[i].rank.equals("A"))
            {
                rankvalue=11;
            }
            else 
            {
                int ranks = Integer.parseInt(Player2[i].rank);
                rankvalue=ranks;
            }
            cardscore=cardscore+rankvalue;
        }
        System.out.println("Score:"+cardscore);
         if(cardscore==21)
        {
            System.out.println("BLACKJACK PLAYER 2 WINS\n");
        }
        else if(cardscore>21)
        {
            System.out.println("PLAYER 2 LOSES\n");
        }
        else if(cardscore<=dealerscore)
        {
            System.out.println("DEALER WINS\n");
        }
        else if(cardscore>dealerscore)
        {
            System.out.println("PLAYER 2 WINS\n");
        }
        cardscore=0;
        System.out.println("Player 3:");
        for(int i=0;i<Player3.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card P3hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            Player3[i]=P3hand;
            System.out.print(P3hand);
        } 
         for(int i=0;i<Player3.length;i++)
        {
            if(Player3[i].rank.equals("J"))
            {
                rankvalue=10;
            }
            else if(Player3[i].rank.equals("Q"))
            {
                rankvalue=10;
            }
            else if(Player3[i].rank.equals("K"))
            {
                rankvalue=10;
            }
            else if(Player3[i].rank.equals("A"))
            {
                rankvalue=11;
            }
            else 
            {
                int ranks = Integer.parseInt(Player3[i].rank);
                rankvalue=ranks;
            }
            cardscore=cardscore+rankvalue;
        }
        System.out.println("Score:"+cardscore);
         if(cardscore==21)
        {
            System.out.println("BLACKJACK PLAYER 3 WINS\n");
        }
        else if(cardscore>21)
        {
            System.out.println("PLAYER 3 LOSES\n");
        }
        else if(cardscore<=dealerscore)
        {
            System.out.println("DEALER WINS\n");
        }
        else if(cardscore>dealerscore)
        {
            System.out.println("PLAYER 3 WINS\n");
        }
        cardscore=0;
        System.out.println("Player 4:");
        for(int i=0;i<Player4.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card P4hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            Player4[i]=P4hand;
            System.out.print(P4hand);
        } 
        for(int i=0;i<Player4.length;i++)
        {
            if(Player4[i].rank.equals("J"))
            {
                rankvalue=10;
            }
            else if(Player4[i].rank.equals("Q"))
            {
                rankvalue=10;
            }
            else if(Player4[i].rank.equals("K"))
            {
                rankvalue=10;
            }
            else if(Player4[i].rank.equals("A"))
            {
                rankvalue=11;
            }
            else 
            {
                int ranks = Integer.parseInt(Player4[i].rank);
                rankvalue=ranks;
            }
            cardscore=cardscore+rankvalue;
        }
        System.out.println("Score:"+cardscore);
         if(cardscore==21)
        {
            System.out.println("BLACKJACK PLAYER 4 WINS\n");
        }
        else if(cardscore>21)
        {
            System.out.println("PLAYER 4 LOSES\n");
        }
        else if(cardscore<=dealerscore)
        {
            System.out.println("DEALER WINS\n");
        }
        else if(cardscore>dealerscore)
        {
            System.out.println("PLAYER 4 WINS\n");
        }
        cardscore=0;
        System.out.println("Player 5:");
        for(int i=0;i<Player5.length;i++)
        {
            Rank[i]=(int)(Math.random() * 13);
            Suit[i]=(int)(Math.random() * 4);
            Card P5hand=new Card(PossibleRank[Rank[i]],PossibleSuit[Suit[i]]);
            Player5[i]=P5hand;
            System.out.print(P5hand);
        }  
        for(int i=0;i<Player5.length;i++)
        {
            if(Player5[i].rank.equals("J"))
            {
                rankvalue=10;
            }
            else if(Player5[i].rank.equals("Q"))
            {
                rankvalue=10;
            }
            else if(Player5[i].rank.equals("K"))
            {
                rankvalue=10;
            }
            else if(Player5[i].rank.equals("A"))
            {
                rankvalue=11;
            }
            else 
            {
                int ranks = Integer.parseInt(Player5[i].rank);
                rankvalue=ranks;
            }
            cardscore=cardscore+rankvalue;
        }
        System.out.println("Score:"+cardscore);
         if(cardscore==21)
        {
            System.out.println("BLACKJACK PLAYER 5 WINS\n");
        }
        else if(cardscore>21)
        {
            System.out.println("PLAYER 5 LOSES\n");
        }
        else if(cardscore<=dealerscore)
        {
            System.out.println("DEALER WINS\n");
        }
        else if(cardscore>dealerscore)
        {
            System.out.println("PLAYER 5 WINS\n");
        }
    }//end method main
}//end class CardDriverP6