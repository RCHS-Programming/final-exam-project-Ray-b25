import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile2 extends Actor
{
    /**
     * Act - do whatever the Projectile2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage img = new GreenfootImage("gold-ball.png");
        img.scale(img.getWidth()/3, img.getHeight()/3);
        setImage(img);
        
        move();
    }    
    public void move()
    {
        Actor enemy3 = getWorld().getObjects(Enemy3.class).get(0);
        setLocation(getX() + 5, getY());
        if(getX() >= 580)
        {
            setLocation(35, enemy3.getY());
            
        }
    }
}
