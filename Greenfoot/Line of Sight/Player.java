import greenfoot.*;
import java.awt.Color;
public class Player extends Actor
{
    private static final int SPEED = 4;

    public void act() {
        if((Greenfoot.isKeyDown("right")
        || Greenfoot.isKeyDown("d"))
        && getX() < getWorld().getWidth() - Block.SIZE/2 - 1) {
            setLocation(getX() + SPEED, getY());
            if(getOneIntersectingObject(Block.class) != null) setLocation(getX() - SPEED, getY());
        }
        if((Greenfoot.isKeyDown("left")
        || Greenfoot.isKeyDown("a"))
        && getX() > Block.SIZE/2) {
            setLocation(getX() - SPEED, getY());
            if(getOneIntersectingObject(Block.class) != null) setLocation(getX() + SPEED, getY());
        }
        if((Greenfoot.isKeyDown("up")
        || Greenfoot.isKeyDown("w"))
        && getX() < getWorld().getWidth() - Block.SIZE/2 - 1) {
            setLocation(getX(), getY() - SPEED);
            if(getOneIntersectingObject(Block.class) != null) setLocation(getX(), getY() + SPEED);
        }
        if((Greenfoot.isKeyDown("down")
        || Greenfoot.isKeyDown("s"))
        && getX() > Block.SIZE/2) {
            setLocation(getX(), getY() + SPEED);
            if(getOneIntersectingObject(Block.class) != null) setLocation(getX(), getY() - SPEED);
        }
    }
}
