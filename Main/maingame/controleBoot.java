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
    double currentX;
    double currentY;
    double vaarSnelheid = 0.04;
    
    public controleBoot()
    {

    }
    
    public enum Status {
    BINNENVAREN, OMLAAG, NAARHAVENX, NAARHAVENY, IDLE
    }
    Status bootStatus = Status.BINNENVAREN;
    
    public void act() 
    {
       if(bootStatus == Status.BINNENVAREN)
       {
           currentX += vaarSnelheid;
           
           if(getX() == 33)
           {
               turn(90);
               bootStatus = Status.OMLAAG;
           }
       }
       else if(bootStatus == Status.OMLAAG)
       {
           currentY += vaarSnelheid;
           
           if(getY() == 25)
           {
               //TODO turn naar goede kant
               bootStatus = Status.NAARHAVENX;
           }
       }
       else if(bootStatus == Status.NAARHAVENX)
       {
           //TODO ga naar goede kant
           
           //TODO als de haven x is bereikt, ga naar de Y van de haven
           /* if(getX() == )
           {
               bootStatus = Status.NAARHAVENY;
           } */
       }
       else if(bootStatus == Status.NAARHAVENY)
       {
           if(currentY < 37.0)
           {
               currentY += vaarSnelheid;
           }
       }
        
        
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
    
    public void varen()
    {
        
    }
}