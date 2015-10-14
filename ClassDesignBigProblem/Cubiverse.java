public class Cubiverse
{
    // Instance Variables
    private String name;
    private int w;
    private int h;
    private int d;
    private double volume;
    private double x;
    private double y;
    private double z;
    private double dleft;
    private double dbottom;
    private double dback;

    // Consturctor for Instance Variable
    public Cubiverse()
    {
        name = new String("CubiVerse-"+ 1 * Math.random());
        w=1;
        h=1;
        d=1;
        volume=1;
        x=0.50;
        y=0.50;
        z=0.50;
        dleft=0.50;
        dbottom=0.50;
        dback=0.50;
    }//end constructor Cubiverse

    // multiple  argument
    public Cubiverse(int w,int h,int d,String name)
    {
        this.name = new String(name);
        this.w=w;
        this.h=h;
        this.d=d;
        volume=Math.random();
        x=0.50;
        y=0.50;
        z=0.50;
        dleft=w/2;
        dbottom=h/2;
        dback=d/2;
    }//end multiple argument
    // multiple argument
    public Cubiverse(double x,double y,double z,String name)
    {
        this.name = new String(name);
        this.x=x;
        this.y=y;
        this.z=z;
        w=1;
        h=1;
        d=1;
        volume=1;
        dleft=w/2;
        dbottom=h/2;
        dback=d/2;
    }//end multiple  argument

    // toString()
    public String toString()
    {
        String output=new String();
        output="Name: Defualt"+name+
        "\nw: "+w+
        "\nh: "+h+
        "\nd: "+d+
        "\nvolume: "+volume+
        "\nx: "+x+
        "\ny:"+y+
        "\nz:"+z+
        "\ndistance from left: "+dleft+
        "\ndistance from bottom: "+dbottom+
        "\ndistance from back: " +dback+"\n";
        return output;
    }//end to String

}//end of class Cubiverse
