import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Toxodon extends Prey
{
    public void act() 
    {
        if(Greenfoot.getRandomNumber(100)<10)
        {
            move(4);
            if(getX() <=5||getX()>= getWorld().getWidth()-5)
            {
                turn(180);
            }
            if(getY() <=5||getY()>= getWorld().getHeight()-5)
            {
                turn(180);
            }
        }
        if(Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }   
}
