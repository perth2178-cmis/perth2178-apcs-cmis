public class Card 
{
    // Instance Variables
    private String rank;
    private String suit;
    
    // Consturctor for Instance Variable
    public Card()
    {
        rank=new String("A");
        suit=new String("Spades");
    }//end constructor Card
    
    // zero arguent
    public Card(String rank, String suit)
    {
        this.rank=new String(rank);
        this.suit=new String(suit);
    }//end zero argument
    
    // toString()
    public String toString()
    {
        String output=new String();
        output="Card\nRank: "+rank+"\nSuit: "+suit+"\n";
        return output;
    }//end to String
    
}//end of class Card