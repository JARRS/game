import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartKnop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartKnopVrachtOverslaan extends StartKnoppenVrachtOverslaan
{
    /**
     * Act - do whatever the StartKnop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        klikje();

    }    
    
    private void klikje(){
        if(Greenfoot.mouseClicked(this)){
            actie();
        }
    }
    
    
    public void actie(){
        VrachtOverslaan hetWereld = (VrachtOverslaan) getWorld();
        hetWereld.start();
    }  
}
