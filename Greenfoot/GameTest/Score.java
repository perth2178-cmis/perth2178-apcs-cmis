import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Score extends Actor
{
    int score = 5;
    
    public void act() 
    {
        getScore();
        setImage(new GreenfootImage("Score : " + score, 24, Color.GREEN, Color.BLACK));
        gameover();
    }    
    
    public void minusscore()
    {
        score--;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void gameover()
    {
        if (score == 0)
        {
            Game_Over gameover= new Game_Over();
            World myWorld = getWorld();
            myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
            Greenfoot.stop();
        }
    }
}
