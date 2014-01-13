import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
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
    
    Actor MakkelijkKnop = new MakkelijkKnop();
    MakkelijkKnop Makkelijk = (MakkelijkKnop) MakkelijkKnop;
    Actor NormaalKnop = new NormaalKnop();
    NormaalKnop Normaal = (NormaalKnop) NormaalKnop;
    Actor MoeilijkKnop = new MoeilijkKnop();
    MoeilijkKnop Moeilijk = (MoeilijkKnop) MoeilijkKnop;
    public Controlecentrum()
    {
        fill();
        taskbar();
        startMenu();
    }
    
    
    /* maakt controlehaven  */
    void fill(){
        //"Gate" naar haven //
        
        for (int y = 16; y < 17; y++){
            for(int x = 0; x < 28; x++){
                addObject(new controleHaven(), x, y);
            }
        }
        
        for (int y = 16; y < 17; y++){
            for(int x = 39; x < 50; x++){
                addObject(new controleHaven(), x, y);
            }
        }
        
        /* "onderste stuk" */
        for (int y = 41; y < 45; y++){
            for(int x = 0; x < 52; x++){
                 addObject(new controleHaven(), x, y);
               
                }
            }
       
           // van havens van links naar rechts//
       for (int y = 33; y < 43; y++){
            for(int x = 0; x < 1; x++){
                addObject(new controleHaven(), x, y);

            }
        }
        
           
           for (int y = 33; y < 43; y++){
            for(int x = 12; x < 13; x++){
                addObject(new controleHaven(), x, y);

            }
        }
       
          
        for (int y = 33; y < 43; y++){
            for(int x = 24; x < 25; x++){
               addObject(new controleHaven(), x, y);

            }
        }
           
        
        for (int y = 33; y < 43; y++){
            for(int x = 37; x < 38; x++){
                addObject(new controleHaven(), x, y);

            }
        }
        
        
        for (int y = 33; y < 43; y++){
            for(int x = 51; x < 52; x++){
                addObject(new controleHaven(), x, y);

            }
        }
      }
      
      public void objects(){
          addObject(ControlecentrumScore, 12, 0);
          addObject(new Spawner(), 24, 41);
        }
      public void startMenu(){
        //voegt startMenu toe
        addObject(new StartMenuAchtergrond(), 25, 20);
        addObject(new ControleCentrumTekst(), 25, 20);
        addObject(new StartKnop(), 30, 33);
        
      
        
        addObject(MakkelijkKnop, 19, 30);
        addObject(NormaalKnop, 25, 30);
        addObject(MoeilijkKnop, 31, 30);
        
        Normaal.geklikt();
    }
    
     
    public void makkelijk(){
        
        Makkelijk.geklikt();
        Normaal.undo();
        Moeilijk.undo();
        
    }
    
    public void normaal(){
        
        Makkelijk.undo();
        Normaal.geklikt();
        Moeilijk.undo();
    }
    
    public void moeilijk(){
        
        Makkelijk.undo();
        Normaal.undo();
        Moeilijk.geklikt();
    }
    
    public void start(){
        objects();
        remove();
    }
    
    private void remove(){
        List startMenu = getObjects(StartMenuObjecten.class);
        removeObjects(startMenu);
    }
    }
 
