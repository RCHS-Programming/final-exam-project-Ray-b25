import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    private int lives = 3; 
    
    
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        takeDamage();
    }    
    public void movement()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 3); 
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 3); 
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 3, getY()); 
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 3, getY()); 
        }
    }
    public void takeDamage()
    {
        if(isTouching(Projectile.class))
        {
            lives = lives - 1; 
        }
        if(lives <= 0)
        {
            setLocation(100, 100);
        }
    }
}
