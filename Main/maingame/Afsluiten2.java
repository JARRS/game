import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Afsluiten2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Afsluiten2 extends Taskbar2
{
    /**
     * Act - do whatever the Afsluiten2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        hover();
        pressed();
    }    
    
    public void hover(){
        GreenfootImage button = getImage();
        if(Greenfoot.mouseMoved(this) == true ){
            setImage("../images/taskbar_afsluitenHover.png");
        }
        else{
            setImage("../images/taskbar2_afsluiten.png");
        }
    }
    
    public void pressed(){
        if(Greenfoot.mousePressed(this) == true){
            int reply = JOptionPane.showConfirmDialog(null, "Wilt u echt afsluiten?", "Afsluiten", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION){
                Greenfoot.stop();
            }
        }
    }
}
