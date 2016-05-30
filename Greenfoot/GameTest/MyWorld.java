import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class MyWorld extends World
{
    private static Smilodon P1;
    private static Smilodon2 P2;
    private static Overlay OVERLAY;
    private static Toxodon[] F1= new Toxodon[5];

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
        addPlayer();
        addPlayer2();
        addPrey();
        addOverlay();
        genWorld();
        setPaintOrder(Smilodon.class,Smilodon2.class, Overlay.class,Toxodon.class);
        setActOrder(Smilodon.class,Smilodon2.class,Toxodon.class, MyWorld.class);
    }

    public void act() 
    {
        GreenfootImage img = OVERLAY.getImage();
        img.clear();
        img.setColor(new Color(0, 0, 0,0));//set the transparent thingy last number is Alpha it sets opacity
        img.fill();

        //line of sight for Smilodon
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
                Actor b = Util.getFirstActorBetween(this, pX, pY, x, y, Toxodon.class);
                if(a != null) {
                    if(!visibleBlocks.contains(a)) {
                        visibleBlocks.add(a);
                    }
                }
                if(b != null) {
                    if(!visibleBlocks.contains(b)) {
                        visibleBlocks.add(b);
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
        for(Actor a : visibleBlocks) 
        {
            img.drawImage(a.getImage(), a.getX() - a.getImage().getWidth()/2, a.getY() - a.getImage().getHeight()/2);//Lights up blocks
        }

        //line of sight for Smilodon
        List<Actor> visibleBlocks2 = new ArrayList<Actor>();
        int p2X = P2.getX();// sets the origin of the cones at the players center
        int p2Y = P2.getY();
        i=0;
        j=radius;
        while (i<=j) {
            for(int oct = 0; oct < 8; oct++) {
                int tx = 0;
                int ty = 0;
                switch(oct) {
                    case 0: tx = p2X + i; ty = p2Y - j; break;
                    case 1: tx = p2X + j; ty = p2Y - i; break;
                    case 2: tx = p2X + i; ty = p2Y + j; break;
                    case 3: tx = p2X + j; ty = p2Y + i; break;
                    case 4: tx = p2X - i; ty = p2Y - j; break;
                    case 5: tx = p2X - j; ty = p2Y - i; break;
                    case 6: tx = p2X - i; ty = p2Y + j; break;
                    case 7: tx = p2X - j; ty = p2Y + i; break;
                }//creates the eight wedges of curves
                Actor a = Util.getFirstActorBetween(this, p2X, p2Y, tx, ty, Tree.class);
                Actor b = Util.getFirstActorBetween(this, p2X, p2Y, tx, ty, Toxodon.class);
                if(a != null) {
                    if(!visibleBlocks2.contains(a)) {
                        visibleBlocks2.add(a);
                    }
                }

                if(b != null) {
                    if(!visibleBlocks2.contains(b)) {
                        visibleBlocks2.add(b);
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
        for(Actor a : visibleBlocks2) {
            img.drawImage(a.getImage(), a.getX() - a.getImage().getWidth()/2, a.getY() - a.getImage().getHeight()/2);//Lights up blocks
        }

        //line of sight for Toxodon
        /*List<Actor> visibleblocks = new ArrayList<Actor>();
        if(this.F1 != null)
        {
        int fX = F1.getX();// sets the origin of the cones at the players center
        int fY = F1.getY();
        i=0;
        j=radius;
        while (i<=j) 
        {
        for(int oct = 0; oct < 8; oct++) 
        {
        int px = 0;
        int py = 0;
        switch(oct) 
        {
        case 0: px = fX + i; py = fY - j; break;
        case 1: px = fX + j; py = fY - i; break;
        case 2: px = fX + i; py = fY + j; break;
        case 3: px = fX + j; py = fY + i; break;
        case 4: px = fX - i; py = fY - j; break;
        case 5: px = fX - j; py = fY - i; break;
        case 6: px = fX - i; py = fY + j; break;
        case 7: px = fX - j; py = fY + i; break;
        }//creates the eight wedges of curves
        Actor a = Util.getFirstActorBetween(this, fX, fY, px, py, Smilodon.class);
        if(a != null) 
        {
        if(!visibleblocks.contains(a)) 
        {
        visibleblocks.add(a);
        }
        px = Math.min(WIDTH - 1, Math.max(0, px));
        py = Math.min(HEIGHT - 1, Math.max(0, py));
        img.setColorAt(px, py, Color.RED);
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
        }*/
        OVERLAY.setImage(img);
    }
    Tree[] tree= new Tree[30];
    private void genWorld() 
    {
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
        addActor(P1, 10,10);
    }

    private void addPlayer2() 
    {
        P2 = new Smilodon2();
        addActor(P2, 10,15);
    }

    private void addPrey()
    {
        for(int i=0;i<F1.length;i++)
        {
            F1[i] = new Toxodon();
            addObject(F1[i],Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
    }

    private void addOverlay() 
    {
        OVERLAY = new Overlay();
        addObject(OVERLAY, WIDTH/2, HEIGHT/2);
    }
}
