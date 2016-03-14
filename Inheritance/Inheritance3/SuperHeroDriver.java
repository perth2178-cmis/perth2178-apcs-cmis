import java.util.ArrayList;
public class SuperHeroDriver
{
    public static void main(String[] args)
    {
        ArrayList<SuperHero> heroes = new ArrayList();
        heroes.add(new AsteroidMan("Brownish Red"));
        heroes.add(new FriedEggMan("White"));
        heroes.add(new OnePunchMan("Yellow"));

        String[][] cappedhero= new String[3][3];

        for(SuperHero hero : heroes)
        {
            System.out.println(hero);
        }

        System.out.println();
        for(int r=0;r<cappedhero.length;r++)
        {
            for(int c=0;c<cappedhero[0].length;c++)
            {
                if(cappedhero[r][c] == null)
                {
                    if ( e.isCaped())
                        {
                            heroes.remove(e);
                            cappedhero[r][c] = e;
                            break;
                        } 
                }
            }
        }

        for(int r=0;r<cappedhero.length;r++)
        {
            for(int c=0;c<cappedhero[0].length;c++)
            {
                System.out.print(cappedhero[r][c]+"    ");
            }
            System.out.print("\n");
        }

        System.out.println();
        for(SuperHero hero : heroes)
        {
            System.out.println(hero);
        }

    }
}
