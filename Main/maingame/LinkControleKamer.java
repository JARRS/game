import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LinkControleKamer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkControleKamer extends Actor
{
    /**
     * Act - do whatever the LinkControleKamer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
        clicked();
    }   
    
    void clicked(){
        if(Greenfoot.mouseClicked(this) == true){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new Controlecentrum());
        }
    }
}
