import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Croc extends Predator
{
    private static final int SPEED = 4;
    public void act() 
    {
        if((Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) && getX() < getWorld().getWidth() - Tree.SIZE/2 - 1) {
            turn(SPEED);
            //if(getOneIntersectingObject(Tree.class) != null) setLocation(getX() - SPEED, getY());
        }
        if((Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) && getX() > Tree.SIZE/2) {
            turn(-SPEED);
            //if(getOneIntersectingObject(Tree.class) != null) setLocation(getX() + SPEED, getY());
        }
        if((Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")) && getX() < getWorld().getWidth() - Tree.SIZE/2 - 1) {
            move(SPEED);
            //if(getOneIntersectingObject(Tree.class) != null) setLocation(getX(), getY() + SPEED);
        }
        if((Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")) && getX() > Tree.SIZE/2) {
            move(-SPEED);
            //if(getOneIntersectingObject(Tree.class) != null) setLocation(getX(), getY() - SPEED);
        }
    } 
    
    public void eat()
    {
        if(isTouching(Lobster.class))
        {
            Actor eaten=getOneIntersectingObject(Lobster.class);
            getWorld().removeObject(eaten);
        }
    }
}
