import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

    }
    Tree[] tree= new Tree[20];
    int amount=0;
    boolean reset=false;
    public void act() 
    {
        for(int i=0;i<tree.length;i++)
        {
            tree[i] = new Tree();
            addObject(tree[i],Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
            amount=amount+1;
        }    
        if(reset=true)
        {
            for(int i=0;i<tree.length;i++)
            {
                removeObject(tree[i]);
                tree[i]=null;
            }
            reset=false;
        }

        Water lake = new Water();
        for(int i=0;i<1;i++)
        {
            addObject(lake,Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        if(reset=true)
        {
            removeObject(lake);
            reset=false;
        }
    }
}
