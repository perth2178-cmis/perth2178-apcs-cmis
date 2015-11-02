public class Card 
{
    // Instance Variables
    public String rank;
    public String suit;
    
    // Consturctor for Instance Variable
    public Card()
    {
        rank=new String("A");
        suit=new String("♠");
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
        output=rank+suit+"\n";
        return output;
    }//end to String
    
}//end of class Card