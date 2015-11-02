public class Planet
{
    // Instance Variables
    private String name;
    //private String Name={"Alpha","Beta","Delta","Gamma"};
    //private int[] names= new int[1];
    //private int num;
    private String relation;
    private double r;
    private int maxPopulation;
    private double percentSpaceMarines;
    private double SpaceMarine;
    private double StarDestroyer;
    private double maxSpaceMarinesPerStarDestroyer;

    // Consturctor for Instance Variable
    public Planet()
    {
        /*for(int i=0;i<names.length;i++)
        {
        names[i]=(int)(Math.random() * 4);
        name=new (name[names[i]]);
        num=Math.random();
        name= new String(name+" "+num);
        }
        for(int i=0;i<names.length;i++)
        {
        names[i]=(int)(Math.random() * 3);
        String relate=new String(relation[names[i]]);
        relation=new String(relate);
        }*/
        name=new String("Beta "+Math.random());
        relation=new String("Friendly");
        r=1.00;
        maxPopulation=1;
        percentSpaceMarines=1.00;
        SpaceMarine=1;
        StarDestroyer=1;
        maxSpaceMarinesPerStarDestroyer=1.00;
    }//end constructor Planet

    // multi argument
    public Planet(int maxPopulation,double percentSpaceMarines,double maxSpaceMarinesPerStarDestroyer)
    {
        this.maxPopulation=maxPopulation;
        this.percentSpaceMarines=percentSpaceMarines;
        this.maxSpaceMarinesPerStarDestroyer=maxSpaceMarinesPerStarDestroyer;
        name=new String("Beta "+Math.random());
        relation=new String("Friendly");
        r=Math.random();
        SpaceMarine=(double)maxPopulation*percentSpaceMarines;
        StarDestroyer=SpaceMarine/(int)maxSpaceMarinesPerStarDestroyer;
    }//end multi argument

    // toString()
    public String toString()
    {
        String output=new String();
        output="\nName: "+name+
            "\nRelationship: "+relation+
            "\nRadius: "+r+
            "\nPopulation: "+maxPopulation+
            "\nSpace Marines as percent of Pop.: "+percentSpaceMarines+
            "\nSpace Marines: "+(int)SpaceMarine+
            "\nStar Destroyers: "+(int)SpaceMarine/(int)maxSpaceMarinesPerStarDestroyer+
            "\nSpace Marines per star destroyer: "+maxSpaceMarinesPerStarDestroyer;
        return output;
    }//end to String
}//end class Planet
