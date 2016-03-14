public class AsteroidMan extends SuperHero
{
    public AsteroidMan(String SuitColor)
    {
        setSuitColor(SuitColor);
        setCape(false);
    }

    public String motto()
    {
        return "IMPACT!!!";
    }
    
    public String toString()
    {
        return "Asteroid Man\t" + super.toString();
    }
}
