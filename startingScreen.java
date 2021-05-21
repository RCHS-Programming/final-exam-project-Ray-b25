import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startingScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startingScreen extends World
{

    /**
     * Constructor for objects of class startingScreen.
     * 
     */
    public startingScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText("Press the space bar to play", 300, 200);
        
        
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new Background());
        }
    }
}
