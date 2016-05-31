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
        if(Greenfoot.isKeyDown("c") && getX() < getWorld().getWidth() - Tree.SIZE/2 - 1) 
        {
            SPEED=8;
        }
        else
        {
            SPEED=4;
        }
        if(Greenfoot.isKeyDown("d") && getX() < getWorld().getWidth() - Tree.SIZE/2 - 1) 
        {
            turn(SPEED);
        }
        if(Greenfoot.isKeyDown("a") && getX() > Tree.SIZE/2) 
        {
            turn(-SPEED);
        }
        if(Greenfoot.isKeyDown("w") && getX() < getWorld().getWidth() - Tree.SIZE/2 - 1) 
        {
            move(SPEED);
        }
        if(Greenfoot.isKeyDown("s") && getX() > Tree.SIZE/2) 
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
        eat();
    } 

    public void eat()
    {
        if(isTouching(Toxodon.class))
        {
            Actor eaten=getOneIntersectingObject(Toxodon.class);
            getWorld().removeObject(eaten);
            World myWorld = getWorld();
            MyWorld world = (MyWorld)myWorld;
            Score counter = world.getScores();
            counter.minusscore();
        }
    }   
}
