import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Highscores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Highscores extends World
{

    /**
     * Constructor for objects of class Highscores.
     * 
     */
    ScoreVrachtoverslaan scoreLabel = new ScoreVrachtoverslaan();
    public Highscores()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 560, 1); 
        taskbar();
        addObject(scoreLabel, 491, 144);
    }
    
    void taskbar(){
        addObject(new Taskbar(), 400, 10);
        addObject(new Afsluiten(), 750, 10);
        addObject(new Hoofdmenu(), 650, 10);
    }
    
    public void setScore(String score){
        scoreLabel.setScore(score);
    }
}
