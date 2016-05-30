import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Score extends Actor
{
    int score = 0;
    
    public void act() 
    {
        setImage(new GreenfootImage("Score : " + score, 24, Color.GREEN, Color.BLACK));
        gameover();
    }    
    
    public void addscore()
    {
        score++;
    }
    
    public void gameover()
    {
    }
}
