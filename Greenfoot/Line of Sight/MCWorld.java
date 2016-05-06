import greenfoot.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class MCWorld extends World {
    private static Player PLAYER;
    private static Overlay OVERLAY;
    
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    
    private static final int nX = WIDTH/Block.SIZE;
    private static final int nY = HEIGHT/Block.SIZE;
    
    private static final int cX = WIDTH/2;
    private static final int cY = HEIGHT/2;
    
    // Set SHOW_RAYS to false to remove the yellow&green.
    private static boolean SHOW_RAYS;
    
    public MCWorld() {
        super(WIDTH, HEIGHT, 1, false);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addPlayer();
        addOverlay();
        genWorld();
        setPaintOrder(Player.class, Overlay.class);
        setActOrder(Player.class, MCWorld.class);
        Object[] options = { "Sure", "Nope" };
        int response = JOptionPane.showOptionDialog(null, "Should I show the radius and rays?", "Show rays?",
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
            null, options, options[0]);
        SHOW_RAYS = response != JOptionPane.NO_OPTION;
    }
    
    public void act() {
        GreenfootImage img = OVERLAY.getImage();
        img.clear();
        img.setColor(new Color(0, 0, 0, 200));//set the transparent thingy last number is Alpha it sets opacity
        img.fill();
        //OVERLAY_GRAPHICS.setColor(new Color(55, 55, 55));
        //OVERLAY_GRAPHICS.fillRect(0, 0, WIDTH, HEIGHT);
        if(SHOW_RAYS) img.setColor(Color.BLUE);//making green cone
        List<Actor> visibleBlocks = new ArrayList<Actor>();
        int pX = PLAYER.getX();// sets the origin of the cones at the players center
        int pY = PLAYER.getY();
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
                Actor a = Util.getFirstActorBetween(this, pX, pY, x, y, Block.class);
                if(a != null) {
                    if(!visibleBlocks.contains(a)) {
                        visibleBlocks.add(a);
                    }
                    if(SHOW_RAYS) img.drawLine(pX, pY, x, y);
                }
                if(SHOW_RAYS) {
                    x = Math.min(WIDTH - 1, Math.max(0, x));
                    y = Math.min(HEIGHT - 1, Math.max(0, y));
                    img.setColorAt(x, y, Color.YELLOW);
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
    
    private void genWorld() {
        // Auto-generated from a map maker program I made.
        addActor(new Dirt(), 0, 0);
        addActor(new Dirt(), 0, 1);
        addActor(new Dirt(), 0, 2);
        addActor(new Dirt(), 0, 3);
        addActor(new Dirt(), 0, 4);
        addActor(new Dirt(), 0, 5);
        addActor(new Dirt(), 0, 6);
        addActor(new Dirt(), 0, 7);
        addActor(new Dirt(), 0, 8);
        addActor(new Dirt(), 0, 9);
        addActor(new Dirt(), 0, 10);
        addActor(new Dirt(), 0, 11);
        addActor(new Dirt(), 0, 12);
        addActor(new Dirt(), 0, 13);
        addActor(new Dirt(), 0, 14);
        addActor(new Dirt(), 0, 15);
        addActor(new Dirt(), 0, 16);
        addActor(new Dirt(), 0, 17);
        addActor(new Dirt(), 0, 18);
        addActor(new Dirt(), 0, 19);
        addActor(new Dirt(), 1, 0);
        addActor(new Dirt(), 1, 19);
        addActor(new Dirt(), 2, 0);
        addActor(new Dirt(), 2, 19);
        addActor(new Dirt(), 3, 0);
        addActor(new Dirt(), 3, 19);
        addActor(new Dirt(), 4, 0);
        addActor(new Dirt(), 4, 19);
        addActor(new Dirt(), 5, 0);
        addActor(new Dirt(), 5, 19);
        addActor(new Dirt(), 6, 0);
        addActor(new Dirt(), 6, 19);
        addActor(new Dirt(), 7, 0);
        addActor(new Dirt(), 7, 19);
        addActor(new Dirt(), 8, 0);
        addActor(new Dirt(), 8, 19);
        addActor(new Dirt(), 9, 0);
        addActor(new Dirt(), 9, 19);
        addActor(new Dirt(), 10, 0);
        addActor(new Dirt(), 10, 19);
        addActor(new Dirt(), 11, 0);
        addActor(new Dirt(), 11, 19);
        addActor(new Dirt(), 12, 0);
        addActor(new Dirt(), 12, 19);
        addActor(new Dirt(), 13, 0);
        addActor(new Dirt(), 13, 19);
        addActor(new Dirt(), 14, 0);
        addActor(new Dirt(), 14, 19);
        addActor(new Dirt(), 15, 0);
        addActor(new Dirt(), 15, 19);
        addActor(new Dirt(), 16, 0);
        addActor(new Dirt(), 16, 19);
        addActor(new Dirt(), 17, 0);
        addActor(new Dirt(), 17, 19);
        addActor(new Dirt(), 18, 0);
        addActor(new Dirt(), 18, 19);
        addActor(new Dirt(), 19, 0);
        addActor(new Dirt(), 19, 19);
        addActor(new Dirt(), 20, 0);
        addActor(new Dirt(), 20, 19);
        addActor(new Dirt(), 21, 0);
        addActor(new Dirt(), 21, 19);
        addActor(new Dirt(), 22, 0);
        addActor(new Dirt(), 22, 19);
        addActor(new Dirt(), 23, 0);
        addActor(new Dirt(), 23, 19);
        addActor(new Dirt(), 24, 0);
        addActor(new Dirt(), 24, 19);
        addActor(new Dirt(), 25, 0);
        addActor(new Dirt(), 25, 19);
        addActor(new Dirt(), 26, 0);
        addActor(new Dirt(), 26, 19);
        addActor(new Dirt(), 27, 0);
        addActor(new Dirt(), 27, 19);
        addActor(new Dirt(), 28, 0);
        addActor(new Dirt(), 28, 19);
        addActor(new Dirt(), 29, 0);
        addActor(new Dirt(), 29, 1);
        addActor(new Dirt(), 29, 2);
        addActor(new Dirt(), 29, 3);
        addActor(new Dirt(), 29, 4);
        addActor(new Dirt(), 29, 5);
        addActor(new Dirt(), 29, 6);
        addActor(new Dirt(), 29, 7);
        addActor(new Dirt(), 29, 8);
        addActor(new Dirt(), 29, 9);
        addActor(new Dirt(), 29, 10);
        addActor(new Dirt(), 29, 11);
        addActor(new Dirt(), 29, 12);
        addActor(new Dirt(), 29, 13);
        addActor(new Dirt(), 29, 14);
        addActor(new Dirt(), 29, 15);
        addActor(new Dirt(), 29, 16);
        addActor(new Dirt(), 29, 17);
        addActor(new Dirt(), 29, 18);
        addActor(new Dirt(), 29, 19);
        addActor(new Dirt(), 5, 5);
        addActor(new Dirt(), 6, 5);
        addActor(new Dirt(), 7, 5);
        addActor(new Dirt(), 5, 6);
        addActor(new Dirt(), 5, 7);
        addActor(new Dirt(), 25, 5);
        addActor(new Dirt(), 25, 6);
        addActor(new Dirt(), 24, 5);
        addActor(new Dirt(), 25, 7);
        addActor(new Dirt(), 23, 5);
        addActor(new Dirt(), 25, 15);
        addActor(new Dirt(), 5, 15);
        addActor(new Dirt(), 25, 14);
        addActor(new Dirt(), 25, 13);
        addActor(new Dirt(), 24, 15);
        addActor(new Dirt(), 23, 15);
        addActor(new Dirt(), 5, 14);
        addActor(new Dirt(), 6, 15);
        addActor(new Dirt(), 7, 15);
        addActor(new Dirt(), 5, 13);
        addActor(new Dirt(), 14, 8);
        addActor(new Dirt(), 16, 8);
        addActor(new Dirt(), 14, 12);
        addActor(new Dirt(), 16, 12);
    }
    
    private void addPlayer() {
        PLAYER = new Player();
        addActor(PLAYER, nX/2, nY/2 - 1);
    }
    
   private void addOverlay() {
        OVERLAY = new Overlay();
        addObject(OVERLAY, WIDTH/2, HEIGHT/2);
    }
    
    private void addActor(Actor block, int x, int y) {
        addObject(block, toReal(x), toReal(y));
    }
    
    private int toReal(int xy) {
        return xy*Block.SIZE + Block.HALF_SIZE;
    }
}
