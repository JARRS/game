import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MakkelijkKnop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MakkelijkKnopVrachtOverslaan extends StartKnoppenVrachtOverslaan
{
    /**
     * Act - do whatever the MakkelijkKnop wants to do. This method is called whenever
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
        VrachtOverslaan hetWereld = (VrachtOverslaan) getWorld();
        hetWereld.makkelijk();
    }
    
    public void geklikt(){
        setImage("../images/MakkelijkGeklikt.png");
    }
    
    public void undo(){
        setImage("../images/Makkelijk.png");
    }
}
