import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage img = new GreenfootImage("steel-ball.png");
        img.scale(img.getWidth()/3, img.getHeight()/3);
        setImage(img);
        
        move();
    }    
    public void move()
    {
        Actor enemy2 = getWorld().getObjects(Enemy2.class).get(0);
        setLocation(getX(), getY() + 3);
        if(getY() >= 380)
        {
            setLocation(enemy2.getX(), 35);
            
        }
    }
}
