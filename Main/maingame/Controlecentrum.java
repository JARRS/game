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
        for (int y = 41; y < 45; y++){
            for(int x = 0; x < 52; x++){
                 addObject(new controleHaven(), x, y);
               
                }
            }
       
           // van havens van links naar rechts//
        for (int y = 33; y < 43; y++){
            for(int x = 12; x < 13; x++){
                addObject(new controleHaven(), x, y);

            }
        }
       
        
        
        
        
        for (int y = 33; y < 43; y++){
            for(int x = 0; x < 1; x++){
                addObject(new controleHaven(), x, y);

            }
        }
        
        
                       
          
        for (int y = 33; y < 43; y++){
            for(int x = 26; x < 27; x++){
               addObject(new controleHaven(), x, y);

            }
        }
              
          
        
        
        
        
        for (int y = 33; y < 43; y++){
            for(int x = 38; x < 39; x++){
                addObject(new controleHaven(), x, y);

            }
        }
        
        
        
        
        
        
               for (int y = 33; y < 43; y++){
            for(int x = 51; x < 52; x++){
                addObject(new controleHaven(), x, y);

            }
        }
      }
    }
 
