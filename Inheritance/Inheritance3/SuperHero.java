public abstract class SuperHero
{
    private String Name;
    private String suitColor;
    private boolean hasCape;

    public SuperHero()
    {
        this.Name = new String();
        this.suitColor = new String();
        this.hasCape = false;
    } // end zero-arg constructor SuperHero

    public void setName(String name)
    {
        this.Name = new String( name );
    }

    public String getName()
    {
        return Name; 
    }

    public void setSuitColor(String suitColor)
    {
        this.suitColor = new String( suitColor );
    } // end method setSuitColor

    public String getSuitColor()
    {
        return suitColor;   
    } // end method getSuitColor

    public void setCape(boolean cape)
    {
        this.hasCape = cape;    
    } // end method setCape

    public boolean isCaped()
    {
        return hasCape; 
    } // end method isCaped

    public abstract String motto();   

    public String toString()
    {
        String output=new String();
        output=" the hero in "+getSuitColor()+". It is "+isCaped()+" that he has a cape. '"+motto()+"'";
        return output;
    }
} // end abstract class SuperHero
