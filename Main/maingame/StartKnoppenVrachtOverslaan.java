import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartKnoppen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartKnoppenVrachtOverslaan extends StartMenuObjectenVrachtOverslaan
{
    /**
     * Act - do whatever the StartKnoppen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    VrachtOverslaan hetWereld = (VrachtOverslaan) getWorld();
    
    public void act() 
    {
        klikje();

    }    
    
    private void klikje(){
        if(Greenfoot.mouseClicked(this)){
            actie();
        }
    }
    

    
    private void actie(){
        
    }  
}
