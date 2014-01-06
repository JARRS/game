import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class controleBoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class controleBoot extends controleHavenObjecten
{
    /**
     * Act - do whatever the controleBoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean geklikt = false;
    boolean varen = true;
    int mx = 0;
    int my = 0;
    double currentX = (double) getX();
    double currentY = (double) getY();
    public void act() 
    {
       currentX += 0.1;
       if (Greenfoot.mouseClicked(this) == true && geklikt == false){
            geklikt = true;
        }
       else if (Greenfoot.mouseClicked(this) == true && geklikt == true){
           varen = true;
           
           MouseInfo mouse = Greenfoot.getMouseInfo(); 
            if(mouse!=null){  
               mx = mouse.getX();  
               my = mouse.getY();  
            }  
            geklikt = false;
            
        }
       
       if(varen == true){
           
           
           
           //aan het einde van de act
           if(getX() == mx && getY() == my){
               varen = false;
            }
        }
        
        setLocation((int)currentX, (int)currentY);
    }    
    
    public void varen(){
        
        
        
        
    }
}