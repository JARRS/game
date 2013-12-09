import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Trein_vrachtoverslaan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trein_vrachtoverslaan extends Vrachoverslaanobjecten
{
    /**
     * Act - do whatever the Trein_vrachtoverslaan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int load = 0;
    public void act() 
    {
        if(load == 7){
            move();
        }
        
        else{
        mount();
    }
    } 
    
    public void mount(){
        Actor container = getOneObjectAtOffset(0,0, Krat_vrachtoverslaan.class);
        if(container != null){
           load++;
           getWorld().removeObject(container); 
        }
        else{
            
        }
    }
    
    public void move(){
        if(getX() == 19){
            succes();
        }
        else if(getX() == 7){
            setLocation(getX()+1,getY());
            load = 0;
        }
        else{
            setLocation(getX()+1,getY());
        }
    }
    
    void succes(){
        int reply = JOptionPane.showConfirmDialog(null, "Gefeliciteerd, wilt u nog een keer spelen?", "Gewonnen!", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION){
                 getWorld().removeObject(this);
                 Greenfoot.setWorld(new VrachtOverslaan());
            }
            else if(reply == JOptionPane.NO_OPTION){
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Menu());
            }
        }
}
