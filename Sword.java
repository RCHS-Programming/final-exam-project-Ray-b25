import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sword extends Actor
{
    
        
    /**
     * Act - do whatever the Sword wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage img = new GreenfootImage("20747-4-transparent-sword-clip-art.png");
        img.scale(img.getWidth()/20, img.getHeight()/20);
        setImage(img);
        
        keyPress();
        
        Actor hero = getWorld().getObjects(Hero.class).get(0);
        
    }    
    public void keyPress()
    {
        Actor hero = getWorld().getObjects(Hero.class).get(0);
        if(Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            setLocation(hero.getX(), hero.getY() - 75);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            setLocation(hero.getX(), hero.getY() + 75);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            setLocation(hero.getX() + 50, hero.getY());
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
            setLocation(hero.getX() - 50, hero.getY());
        }
    }
}
