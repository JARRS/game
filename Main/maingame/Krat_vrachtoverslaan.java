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
    
    Boolean wordtgetild = false;
   
    
     public void act() 
    {
       oppakken();
    }  
    
    void oppakken(){
         MouseInfo mouse = Greenfoot.getMouseInfo();
        int mx = 0;
        int my = 0;
        
        if(mouse!=null){  
           mx = mouse.getX();  
           my = mouse.getY();  
        }  
        Actor grijper = getOneObjectAtOffset(0,0, kraanGrijper.class);
        kraanGrijper grijpObject = (kraanGrijper) grijper;
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
            
            
                if((Greenfoot.mouseClicked(grijper) || Greenfoot.mouseClicked(xding)) && my % 2 == 0 && ruimteGenoeg())                {
                wordtgetild = false;
                grijpObject.setOpgepakt(false);
                
                if((getY() >= 38 && getY() <= 40) && (getX() >= 17 && getX() <= 34)){
                }

                }
                return;
        }
        if(mx == getX() && my == getY() && (Greenfoot.mouseClicked(grijper) || Greenfoot.mouseClicked(xding)) && grijpObject.getOpgepakt() == false )
        {
            wordtgetild = true;
            grijpObject.setOpgepakt(true);
    
            //verander de balans van de boot
            int balansKant = 0;
            if(getY() == 26)
            {
                balansKant = 0;
            }
            else if(getY() == 24)
            {
                balansKant = 1;
            }
            else if(getY() == 28)
            {
                balansKant = -1;
            }
                    
            String containerType = "" + this;
            //containerType = containerType.substring(0, containerType.indexOf("@"));
            //containerType = (String) containerType;
            int testLength = containerType.length();
 
            
            if(containerType.contains("Container1"))
            {
                getWorld().removeObjects(getWorld().getObjects(AanwijsBalk.class));
                eigenBalans += 1 * balansKant;
                getWorld().addObject(new AanwijsBalk(), 46, 26 + (eigenBalans / 2));
                //balansBalk.veranderBalans(1 * balansKant);
            }
            else if(containerType.contains( "Container2"))
            {
                getWorld().removeObjects(getWorld().getObjects(AanwijsBalk.class));
                eigenBalans += 2 * balansKant;
                getWorld().addObject(new AanwijsBalk(), 46, 26 + (eigenBalans / 2));
                //balansBalk.veranderBalans(2 * balansKant);
            }
            else if(containerType.contains("Container3"))
            {
                getWorld().removeObjects(getWorld().getObjects(AanwijsBalk.class));
                eigenBalans += 3 * balansKant;
                getWorld().addObject(new AanwijsBalk(), 46, 26 + (eigenBalans / 2));
                //balansBalk.veranderBalans(3 * balansKant);
            }
        }
    }
    
    boolean ruimteGenoeg()
    {
        //check of er containers naast of onder staan, afhankelijk van het type container dat je vast hebt
        
        if(getOneIntersectingObject(Container1.class) == null && getOneIntersectingObject(Container2.class) == null && getOneIntersectingObject(Container3.class) == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}