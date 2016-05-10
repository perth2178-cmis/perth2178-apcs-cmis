import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Overlay extends Actor
{
    public void addedToWorld(World w) {
        setImage(new GreenfootImage(w.getWidth(), w.getHeight()));
    }    
}
