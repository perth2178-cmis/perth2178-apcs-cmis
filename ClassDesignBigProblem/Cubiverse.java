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
        volume=w*h*d;
        x=0.50;
        y=0.50;
        z=0.50;
        dleft=w*x;
        dbottom=h*y;
        dback=d*z;
    }//end constructor Cubiverse

    // multiple  argument
    public Cubiverse(int w,int h,int d,String name)
    {
        this.name = new String(name);
        this.w=w;
        this.h=h;
        this.d=d;
        volume=w*h*d;
        x=0.50;
        y=0.50;
        z=0.50;
        dleft=w*x;
        dbottom=h*y;
        dback=d*z;
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
        volume=w*h*d;
        dleft=w*x;
        dbottom=h*y;
        dback=d*z;
    }//end multiple  argument

    // toString()
    public String toString()
    {
        String output=new String();
        output=String.format("Name: %s\n"+
                             "w: %d\n"+        
                             "h: %d\n"+
                             "d: %d\n"+
                             "volume: %d\n"+
                             "x: %.2f\n"+
                             "y: %.2f\n"+
                             "z: %.2f\n"+
                             "distance from left: %.2f\n"+
                             "distance from bottom: %.2f\n"+
                             "distance from back: %.2f\n", name, w, h, d, volume, x, y, z, dleft, dbottom, dback);
        return output;
    }//end to String

}//end of class Cubiverse
