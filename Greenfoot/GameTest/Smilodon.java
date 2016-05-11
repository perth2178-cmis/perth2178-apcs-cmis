import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Smilodon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Smilodon extends Predator
{
    private int SPEED = 4;
    public void act() 
    {
        if((Greenfoot.isKeyDown("c") || Greenfoot.isKeyDown("0")) && getX() < getWorld().getWidth() - Tree.SIZE/2 - 1) 
        {
            SPEED=8;
        }
        else
        {
            SPEED=4;
        }
        if((Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) && getX() < getWorld().getWidth() - Tree.SIZE/2 - 1) 
        {
            turn(SPEED);
        }
        if((Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) && getX() > Tree.SIZE/2) 
        {
            turn(-SPEED);
        }
        if((Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")) && getX() < getWorld().getWidth() - Tree.SIZE/2 - 1) 
        {
            move(SPEED);
        }
        if((Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")) && getX() > Tree.SIZE/2) 
        {
            move(-SPEED);
        }

        if (getX() <= 15)
        {
            setRotation(getRotation() + 80);
        }
        if (getY() <= 15)
        {
            setRotation(getRotation() + 80);
        }
        if (getX() >= getWorld().getWidth() - 15)
        {
            setRotation(getRotation() + 80);
        }
        if (getY() >= getWorld().getHeight() - 15)
        {
            setRotation(getRotation() + 80);
        }
    } 

    public void eat()
    {
        if(isTouching(Toxodon.class))
        {
            Actor eaten=getOneIntersectingObject(Toxodon.class);
            getWorld().removeObject(eaten);
        }
    }   
}
