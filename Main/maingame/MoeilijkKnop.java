import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoeijlijkKnop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoeilijkKnop extends StartKnoppen
{
    /**
     * Act - do whatever the MoeijlijkKnop wants to do. This method is called whenever
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
        hetWereld.moeilijk();
    }
    
    public void geklikt(){
        setImage("../images/MoeilijkGeklikt.png");
    }
    
    public void undo(){
        setImage("../images/Moeilijk.png");
    }
}
