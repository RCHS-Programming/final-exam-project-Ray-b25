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
    int setSpawn = 1;
    
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        
        respawn();
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
             if(enemy1DeathCounter >= 5)
             {
                 getWorld().removeObject(this);
                 
             }
             enemy1DeathCounter++;
             
        }
    }
    public void respawn()
    {
        
        int numberOfEnemy1 = getWorld().getObjects(Enemy1.class).size();
        if(setSpawn >= 7)
        {
            setSpawn = 1;
        }
        if(numberOfEnemy1 <= 2)
        {
            setSpawn++;
            if(setSpawn == 1)
            {
                getWorld().addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 25);
                getWorld().addObject(new Enemy1(), 25, Greenfoot.getRandomNumber(400));
                
            }
            if(setSpawn == 2)
            {
                getWorld().addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 25);
                getWorld().addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 375);
                
            }
            if(setSpawn == 3)
            {
                getWorld().addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 25);
                getWorld().addObject(new Enemy1(), 575, Greenfoot.getRandomNumber(400));
                
            }
            if(setSpawn == 4)
            {
                getWorld().addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 375);
                getWorld().addObject(new Enemy1(), 25, Greenfoot.getRandomNumber(400));
               
            }
            if(setSpawn == 5)
            {
                getWorld().addObject(new Enemy1(), 575, Greenfoot.getRandomNumber(400));
                getWorld().addObject(new Enemy1(), 25, Greenfoot.getRandomNumber(400));
                
            }
            if(setSpawn == 6)
            {
                getWorld().addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 375);
                getWorld().addObject(new Enemy1(), 575, Greenfoot.getRandomNumber(400));
                
            }
            
        }
           
            
            
            
            
            
            
            
            
            
    }
       
    }

