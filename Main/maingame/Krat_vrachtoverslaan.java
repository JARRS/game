import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Krat_vrachtoverslaan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Krat_vrachtoverslaan extends Vrachoverslaanobjecten
{
    /**
     * Act - do whatever the Krat_vrachtoverslaan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    boolean wordtgetild = false;
     public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx = 0;
        int my = 0;
        
        if(mouse!=null){  
           mx = mouse.getX();  
           my = mouse.getY();  
        }  
        Actor grijper = getOneObjectAtOffset(0,0, kraanGrijper.class);
        Actor xding = getOneObjectAtOffset(0,0, kraanXding.class);
        //zorg ervoor dat de container opgepakt kan worden!
        
        if(wordtgetild)
        {
                if(mx <= 48 && mx >= 10)
                    {
                    setLocation(mx, getY());
                }
                if(my <= 40 && my >= 24)
                {
                    setLocation(getX(), my);
                }
            
            
                if((Greenfoot.mouseClicked(grijper) || Greenfoot.mouseClicked(xding)))                {
                wordtgetild = false;
                }
                return ;
        }
        if(mx == getX() && my == getY() && (Greenfoot.mouseClicked(grijper) || Greenfoot.mouseClicked(xding) ) )
        {
            wordtgetild = true;

        }
        
    }    
}
