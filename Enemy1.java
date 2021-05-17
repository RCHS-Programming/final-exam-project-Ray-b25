import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Actor
{
    int enemy1DeathCounter = 0;
    
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        swordHit();
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
        if(getY() < hero.getY())
        {
            setLocation(getX(), getY() + 2);
        }
        if(getY() > hero.getY())
        {
            setLocation(getX(), getY() - 2);
        }
        
    }
    public void swordHit()
    {
        Actor sword = getWorld().getObjects(Sword.class).get(0);
        if(isTouching(Sword.class))
        {
             getWorld().removeObject(this);
             enemy1DeathCounter++;
        }
    }
    public void respawn()
    {
        
    }
}
