import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Toxodon extends Prey
{
    public void act() 
    {
        move(3);
        if(Greenfoot.getRandomNumber(100)<10)
        {
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
        if(Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        detect();
    }
    
    public void detect()
    {
        if(MyWorld.visibleblocks.contains(a))
        {
            move(10);
        }
        else
        {
            move(3);
        }
    }
}
