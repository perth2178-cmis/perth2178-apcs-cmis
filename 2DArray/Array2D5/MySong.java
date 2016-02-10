public class MySong
{
   // Instance Variables
    private String name;
    private int rating;

    // zero argument
    public MySong()
    {
        name= new String("Wasteland");
        rating = 4;
    }//end zero argument
    
    public int getRating()
    {
        return rating;
    }

    // three constructor
    public MySong(String name,int rating)
    {
        this.name= new String(name);
        this.rating=rating;
    }//end three constructor

    public String toString()
    {
        String output=new String();
        output="Name: "+name+"\tRating: "+rating;
        return output;
    }
}
