import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controlecentrum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controlecentrum extends Minigames
{

    /**
     * Constructor for objects of class Controlecentrum.
     * 
     */
    public Controlecentrum()
    {
        fill();
        taskbar();
       
    }
    
    
    /* maakt controlehaven  */
    void fill(){
        for (int y = 38; y < 45; y++){
            for(int x = 0; x < 52; x++){
                 addObject(new controleHaven(), x, y);
               
                }
            }
        /* "linker" stuk */
        for (int y = 20; y < 40; y++){
            for(int x = 0; x < 4; x++){
                addObject(new controleHaven(), x, y);

            }
        }
        
        /* "middel" stuk */
        for (int y = 20; y < 40; y++){
            for(int x = 22; x < 27; x++){
               addObject(new controleHaven(), x, y);

            }
        }
        
        
        /* "rechter" stuk */
        
        for (int y = 20; y < 40; y++){
            for(int x = 46; x < 52; x++){
                addObject(new controleHaven(), x, y);

            }
        }
    }
}