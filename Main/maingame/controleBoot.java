import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class controleBoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class controleBoot extends controleHavenObjecten
{
    
    boolean geklikt = false;
    boolean varen = true;
    int mx = 0;
    int my = 0;
    double currentX;
    double currentY;
    double vaarSnelheid = 0.06;
    controleBootCirkel cirkel = null;
    BoegNummer boegNummer = null;
    int destinationID = 0;
    int destinationX;
    
    public controleBoot()
    {
        
    }
    
    public enum Status {
    BINNENVAREN, OMLAAG, WACHTENOPLOODS, NAARHAVENX, NAARHAVENY, AANGEMEERD, UITHAVENY, UITHAVENX, OMHOOG, WEGVAREN, IDLE
    }
    Status bootStatus = Status.BINNENVAREN;
    
    public void act() 
    {  
       //maak boegnummer
       if(boegNummer == null)
       {
           boegNummer = new BoegNummer();
           getWorld().addObject(boegNummer, 0, 0);
       }
       
       //klikken op boten
       if (Greenfoot.mouseClicked(this) == true && geklikt == false && getY() < 24)
       {
            geklikt = true;
           
            cirkel = new controleBootCirkel();

            getWorld().addObject(cirkel, getX(), getY());
       }
       else if (Greenfoot.mouseClicked(this) && geklikt == true)
       {
           //destination = EEN HAVEN
           
           /*MouseInfo mouse = Greenfoot.getMouseInfo(); 
           if(mouse!=null){  
               mx = mouse.getX();  
               my = mouse.getY();  
           }  */
           geklikt = false; 
           getWorld().removeObject(cirkel);
       }
       else if(Greenfoot.mouseClicked(null) && geklikt == true) //als je ergens anders klikt, deselect alle boten
       {
           geklikt = false;  
           getWorld().removeObject(cirkel);
       }
       
       //klik op een haven
       //if(geklikt && opEenHavenGeklikt())
        //{
           
        //}
        
       if(bootStatus == Status.BINNENVAREN)
       {
           currentX += vaarSnelheid;
           
           if(getX() == 32)
           {
               turn(90);
               bootStatus = Status.OMLAAG;
           }
       }
       else if(bootStatus == Status.OMLAAG)
       {
           currentY += vaarSnelheid;

           if(getY() == 10)
           {
               bootStatus = Status.WACHTENOPLOODS;
           }
       }
       else if(bootStatus == Status.WACHTENOPLOODS)
       {
           if(isRouteVrij() && getY() < 24)
           {
               currentY += vaarSnelheid;
           }
           else
           {
               //VERLOREN
           }
            
           if(getY() == 24 && destinationID != 0)
           {
               //turn naar goede kant
               turn(-90 * linksOfRechts(destinationID));
               
               //zoek x positie van de haven
               destinationX = getDestinationXPos(destinationID);
               
               geklikt = false;
               getWorld().removeObject(cirkel);
               bootStatus = Status.NAARHAVENX;
           }
       }
       else if(bootStatus == Status.NAARHAVENX)
       {
           //ga naar goede kant
           currentX += vaarSnelheid * linksOfRechts(destinationID);
           
           //TODO als de haven x is bereikt, ga naar de Y van de haven
           if(getX() == destinationX)
           {
               turn(90 * linksOfRechts(destinationID));
               bootStatus = Status.NAARHAVENY;
           }
           
       }
       else if(bootStatus == Status.NAARHAVENY)
       {
           //if(currentY < 37.0)
           //{
               currentY += vaarSnelheid;
           //}
           
           if(getY() == 37)
           {
               turn(180);
               bootStatus = Status.AANGEMEERD;
           }
       }
       else if(bootStatus == Status.AANGEMEERD)
       {
           
       }
       else if(bootStatus == Status.UITHAVENY)
       {
           
       }
       else if(bootStatus == Status.UITHAVENX)
       {
           
       }
       else if(bootStatus == Status.OMHOOG)
       {
           
       }
       else if(bootStatus == Status.WEGVAREN)
       {
           currentY += vaarSnelheid;
       }
       
       
       //beweeg cirkel mee
       if(cirkel != null)
       {
           cirkel.setPosition((int)currentX, (int)currentY);
       }
       //beweeg boegnummer mee
       boegNummer.setPosition((int)currentX, (int)currentY);
       
       setLocation((int)currentX, (int)currentY);
    }    
    
    public int linksOfRechts(int havenID)
    {
        int kant;
        if(havenID < 6)
        {
            kant = -1;
        }
        else
        {
            kant = 1;
        }
        return kant;
    }
    
    public boolean isGeklikt()
    {
        return geklikt;
    }
    
    public void setDestinationID(int id)
    {
        destinationID = id;
        boegNummer.setBoegNummer(Integer.toString(id));
    }
    
    public int getDestinationID()
    {
        return destinationID;
    }
    
    public int getDestinationXPos(int id)
    {
        int position = 48;
        
        List<Haven> havens = getWorld().getObjects(Haven.class);
        for(int i = 0; i < havens.size();i++)
        {
            Haven haven = havens.get(i);
            if(haven.getID() == id)
            {
                position = haven.getX();
            }
        }
        return position;
    }
    
    public boolean isRouteVrij()
    {
        boolean vrij = true;
        boolean onderNiks = true;
        
        List<controleBoot> bootList = getWorld().getObjectsAt(getX(), getY(), controleBoot.class);
        for(int i = 0; i < bootList.size(); i++)
        {
            if(bootList.get(i) != this)
            {
                onderNiks = false;
            }
        }
        
        if(getOneObjectAtOffset(0, 1, controleBoot.class) == null && getOneObjectAtOffset(0, 2, controleBoot.class) == null && getOneObjectAtOffset(0, 3, controleBoot.class) == null && onderNiks)
        {
            vrij = true;
        }
        else
        {
            vrij = false;
        }
        return vrij;
    }
    
}