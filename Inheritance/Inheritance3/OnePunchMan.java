public class OnePunchMan extends SuperHero
{
    public OnePunchMan(String SuitColor)
    {
        setSuitColor(SuitColor);
        setCape(true);
    }

    public String motto()
    {
        return "I'm the guy whose a hero for fun";
    }

    public String toString()
    {
        return "One Punch Man\t" + super.toString();
    }
}
