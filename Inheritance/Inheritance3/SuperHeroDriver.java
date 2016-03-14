import java.util.ArrayList;
public class SuperHeroDriver
{
    public static void main(String[] args)
    {
        ArrayList<SuperHero> heroes = new ArrayList();
        heroes.add(new AsteroidMan("Brownish Red"));
        heroes.add(new FriedEggMan("White"));
        heroes.add(new OnePunchMan("Yellow"));

        SuperHero[][] cappedhero= new SuperHero[3][3];

        System.out.println("All Superheroes:");
        for(SuperHero hero : heroes)
        {
            System.out.println(hero);
        }
        
        for(int r=0;r<cappedhero.length;r++)
        {
            for(int c=0;c<cappedhero[0].length;c++)
            {
                if(cappedhero[r][c] == null)
                {
                    for(SuperHero hero : heroes)
                    {
                        if ( hero.isCaped())
                        {
                            heroes.remove(hero);
                            cappedhero[r][c] = hero;
                            break;
                        } 
                    }
                }
            }
        }
        System.out.println();
        System.out.println("\n2D Array of Caped");
        for(int r=0;r<cappedhero.length;r++)
        {
            for(int c=0;c<cappedhero[0].length;c++)
            {
                System.out.print(cappedhero[r][c]+"    ");
            }
            System.out.print("\n");
        }
        System.out.println();
        System.out.println("\nNon Caped");
        for(SuperHero hero : heroes)
        {
            System.out.println(hero);
        }
        System.out.println();
        System.out.println("\nCaped");
        for(int r=0;r<cappedhero.length;r++)
        {
            for(int c=0;c<cappedhero[0].length;c++)
            {
                if(cappedhero[r][c] != null)
                {
                    System.out.println(cappedhero[r][c]);
                }
            }
        }
    }
}
