import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class MyWorld extends World
{
    private static Croc P1;
    private static Overlay OVERLAY;
    private static Toxodon F1;

    private static final int WIDTH = 1200;
    private static final int HEIGHT = 800;

    private static final int nX = WIDTH/Tree.SIZE;
    private static final int nY = HEIGHT/Tree.SIZE;

    private static final int cX = WIDTH/2;
    private static final int cY = HEIGHT/2;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDTH, HEIGHT, 1, false);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addPlayer();
        addOverlay();
        genWorld();
        setPaintOrder(Smilodon.class, Overlay.class);
        setActOrder(Smilodon.class, MyWorld.class);
    }

    public void act() 
    {
        GreenfootImage img = OVERLAY.getImage();
        img.clear();
        img.setColor(new Color(0, 0, 0, 200));//set the transparent thingy last number is Alpha it sets opacity
        img.fill();
        List<Actor> visibleBlocks = new ArrayList<Actor>();
        int pX = P1.getX();// sets the origin of the cones at the players center
        int pY = P1.getY();
        int radius = 100;
        int discriminant = (5 - radius<<2)>>2 ;//creates the curve
        int i = 0;
        int j = radius;
        while (i<=j) {
            for(int oct = 0; oct < 8; oct++) {
                int x = 0;
                int y = 0;
                switch(oct) {
                    case 0: x = pX + i; y = pY - j; break;
                    case 1: x = pX + j; y = pY - i; break;
                    case 2: x = pX + i; y = pY + j; break;
                    case 3: x = pX + j; y = pY + i; break;
                    case 4: x = pX - i; y = pY - j; break;
                    case 5: x = pX - j; y = pY - i; break;
                    case 6: x = pX - i; y = pY + j; break;
                    case 7: x = pX - j; y = pY + i; break;
                }//creates the eight wedges of curves
                Actor a = Util.getFirstActorBetween(this, pX, pY, x, y, Tree.class);
                if(a != null) {
                    if(!visibleBlocks.contains(a)) {
                        visibleBlocks.add(a);
                    }
                }
            }
            i++ ;
            if (discriminant < 0) {                
                discriminant += (i<<1) + 1 ;
            } else {
                j-- ;
                discriminant += (1 + i - j)<<1 ;
            }
        }
        for(Actor a : visibleBlocks) {
            img.drawImage(a.getImage(), a.getX() - a.getImage().getWidth()/2, a.getY() - a.getImage().getHeight()/2);//Lights up blocks
        }
    }

    Tree[] tree= new Tree[10];
    private void genWorld() 
    {
        // Auto-generated from a map maker program I made.
        addActor(new Tree(), nX/2, nY/2 - 1);
        addActor(new Tree(),0 ,0);
        
        for(int i=0;i<tree.length;i++)
        {
            tree[i] = new Tree();
            addObject(tree[i],Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
    }

    private int toReal(int xy) 
    {
        return xy*Tree.SIZE + Tree.HALF_SIZE;
    }

    private void addActor(Actor block, int x, int y) {
        addObject(block, toReal(x), toReal(y));
    }

    private void addPlayer() 
    {
        P1 = new Smilodon();
        addActor(P1, nX/2, nY/2 - 1);
    }
    
    private void addPrey()
    {
        for(int i=0;i<herdsize;i++)
        {
            addActor(F1,3,10);
        }
    }

    private void addOverlay() 
    {
        OVERLAY = new Overlay();
        addObject(OVERLAY, WIDTH/2, HEIGHT/2);
    }
}
