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
    boolean GOAAAN = false;
    public void act() 
    {
        if(Greenfoot.isKeyDown("t")){
           GOAAAN = true;
        }
        
        if(GOAAAN == true){
            move();
        }
        else{
            place();
        }
        
        
        
    }
    
    
    public void move(){
        for(int y = -1; y <= 1; y+=2){
            for(int x = -13; x <= 14; x += 2){
                Actor container = getOneObjectAtOffset(x,y,Krat_vrachtoverslaan.class);
                if(container != null){
                    getWorld().removeObject(container);
                }
            }
        }
        setImage("../images/vrachtoverslaan_treinGesloten.png");
        
        if(getX() == 49){
            getWorld().addObject(new Trein_vrachtoverslaan(),0, 39);
            GOAAAN = false;
            getWorld().removeObject(this);
        }
        else{
            setLocation(getX() +1, getY());
        }
        
    }
    
    void place(){
        if(getX() < 30){
            setLocation(getX() +1, getY());
        }
    }
    
    }

