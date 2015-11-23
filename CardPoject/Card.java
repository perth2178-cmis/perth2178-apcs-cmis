
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
    //Instance Variables
    private String[] ranks={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private String[] suits={"♠","♣","♦","♥"};
    private String rank;
    private String suit;
    private String card;
    int value;

    public Card()
    {
        suit =suits[2];
        rank =ranks[7];
        card =new String(suit+rank); 
    }
    
    public int getvalue()
    {
        int value;
        if(rank.equals("J"))
            {
                value=10;
            }
            else if(rank.equals("Q"))
            {
                value=10;
            }
            else if(rank.equals("K"))
            {
                value=10;
            }
            else if(rank.equals("A"))
            {
                value=11;
            }
            else 
            {
                int ranks = Integer.parseInt(rank);
                value=ranks;
            }
        return value;
    }
    
    public String toString()
    {
        String output=new String();
        output=card+"\n"+getvalue();
        return output;
    }
}
