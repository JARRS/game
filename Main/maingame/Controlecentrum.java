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
    ScoreLabel ControlecentrumScore = new ScoreLabel();
    public Controlecentrum()
    {
        fill();
        taskbar();
        addObject(ControlecentrumScore, 12, 0);
    }
    
    
    /* maakt controlehaven  */
    void fill(){
        /* "onderste stuk" */
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
        
        
        
            /*loods links, midden, rechts*/
         for (int y = 27; y < 28; y++){
                for(int x = 2; x < 3; x++){
                    addObject(new loods(),  x, y);
                }
        }
            
            
            
            for (int y = 27; y < 28; y++){
                for(int x = 24; x < 25; x++){
                    addObject(new loods(),  x, y);
                }
        }
            
            
            
        for (int y = 27; y < 28; y++){
                for(int x = 47; x < 48; x++){
                    addObject(new loods(),  x, y);
                }
            }
        }
    }
 
