import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    int timer = 0; 
    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Hero(), 200, 200);
        addObject(new Projectile(), 0, 800);
        addObject(new Enemy1(), 25, 200);
        addObject(new Enemy1(), 225, 0);
        addObject(new Enemy1(), 775, 200);
        addObject(new Enemy1(), 575, 400);
        addObject(new Projectile2(), 600, 800);
        addObject(new Enemy2(), 300, 25);
        addObject(new Enemy3(), 25, 300);
        addObject(new Sword(), 300, 100);
        
        
        
    }
}
