import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Croc extends Predator
{
    public void act() 
    {
        if(Greenfoot.isKeyDown("up"))
        {
            move(1);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    } 
}
