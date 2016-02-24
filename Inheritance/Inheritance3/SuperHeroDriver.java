import java.util.ArrayList;
public class SuperHeroDriver
{
    public static void main(String[] args)
    {
        ArrayList<SuperHero> heroes = new ArrayList();
        heroes.add(AsteroidMan());
        heroes.add(FriedEggMan());
        heroes.add(OnePunchMan());
        System.out.println(heroes);
    }
}
