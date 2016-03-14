public class FriedEggMan extends SuperHero
{
    public FriedEggMan(String SuitColor)
    {
        setSuitColor(SuitColor);
        setCape(true);
    }

    public String motto()
    {
        return "Time to crack a few eggs";
    }
    
    public String toString()
    {
        return "Fried Egg Man\t" + super.toString();
    }
}
