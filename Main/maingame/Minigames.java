import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Minigames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minigames extends World
{

    /**
     * Constructor for objects of class Minigames.
     * 
     */
    public Minigames()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(50, 42, 20); 
        

        taskbar();

    }
    
    void taskbar(){
        addObject(new Taskbar2(), 24, 0);
        addObject(new Afsluiten(), 48, 0);
        addObject(new Hoofdmenu(), 44, 0);
    }
    
    
    
}
