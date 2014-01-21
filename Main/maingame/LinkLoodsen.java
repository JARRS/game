import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LinkLoodsen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkLoodsen extends Links
{
    /**
     * Act - do whatever the LinkLoodsen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.{
        clicked();
    }   
    
    void clicked(){
        if(Greenfoot.mouseClicked(this) == true){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new Loodsen_Endlessrunner());
        }
    }
}
