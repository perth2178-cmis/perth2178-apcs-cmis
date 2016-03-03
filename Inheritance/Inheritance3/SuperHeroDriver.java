import java.util.ArrayList;
public class SuperHeroDriver
{
    public static void main(String[] args)
    {
        ArrayList<SuperHero> heroes = new ArrayList();
        heroes.add(new AsteroidMan());
        heroes.add(new FriedEggMan());
        heroes.add(new OnePunchMan());

        String[][] cappedhero= new String[3][3];

        for(SuperHero hero : heroes)
        {
            System.out.println(hero);
            
        }
        
        System.out.println();
        for(int i=0;i<heroes.size();i++)
        {
            for(int r=0;r<cappedhero.length;r++)
            {
                for(int c=0;c<cappedhero[0].length;c++)
                {
                    if(heroes.get(i).isCaped())
                    {
                        cappedhero[r][c]=heroes.get(i).getName();
                        SuperHero toremove=heroes.get(i);
                        heroes.remove(toremove);
                        
                    }
                    if(i>0)
                        {
                            i--;
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
