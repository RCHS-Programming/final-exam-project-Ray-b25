import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Actor
{
    int enemy2DeathCounter = 0;
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        
    }    
    public void move()
    {
        Actor hero = getWorld().getObjects(Hero.class).get(0);
        if(getX() < hero.getX())
        {
            setLocation(getX() + 2, getY());
        }
        if(getX() > hero.getX())
        {
            setLocation(getX() - 2, getY());
        }
        
    }
    
}
