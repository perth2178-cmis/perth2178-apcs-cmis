import java.util.ArrayList;
public class SuperHeroDriver
{
    public static void main(String[] args)
    {
        ArrayList<SuperHero> heroes = new ArrayList();
        heroes.add(new AsteroidMan());
        heroes.add(new FriedEggMan());
        heroes.add(new OnePunchMan());
        
        SuperHero[][] cappedhero= new SuperHero[3][3];
        
        for(SuperHero hero : heroes)
        {
            System.out.println(hero.getName()+" the hero in "+hero.getSuitColor()+". It is "+hero.isCaped()+" that he has a cape. '"+hero.motto()+"'");
        }
        
        
    }
}
