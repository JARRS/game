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
        objects();
        //setPaintOrder(Haven.class, controleBoot.class);
    }
    
    void objects()
    {
        
        addObject(ControlecentrumScore, 12, 0);
        addObject(new Spawner(), 24, 41);
        
        //zet havens neer + havennummers
        Haven haven1 = new Haven(1);
        addObject(haven1, 2, 37);
        addObject(new HavenNummer("1"), 2, 38);
        
        Haven haven2 = new Haven(2);
        addObject(haven2, 11, 37);
        haven2.setImage("../images/HavenRechts.png");
        addObject(new HavenNummer("2"), 11, 38);
        
        Haven haven3 = new Haven(3);
        addObject(haven3, 14, 37);
        addObject(new HavenNummer("3"), 14, 38);
        
        Haven haven4 = new Haven(4);
        addObject(haven4, 23, 37);
        haven4.setImage("../images/HavenRechts.png");
        addObject(new HavenNummer("4"), 23, 38);
        
        Haven haven5 = new Haven(5);
        addObject(haven5, 26, 37);
        addObject(new HavenNummer("5"), 26, 38);
        
        Haven haven6 = new Haven(6);
        addObject(haven6, 35, 37);
        haven6.setImage("../images/HavenRechts.png");
        addObject(new HavenNummer("6"), 35, 38);
        
        Haven haven7 = new Haven(7);
        addObject(haven7, 38, 37);
        addObject(new HavenNummer("7"), 38, 38);
        
        Haven haven8 = new Haven(8);
        addObject(haven8, 47, 37);
        haven8.setImage("../images/HavenRechts.png");
        addObject(new HavenNummer("8"), 47, 38);
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
            for(int x = 0; x < 2; x++){
                addObject(new controleHaven(), x, y);

            }
        }
        
           
           for (int y = 33; y < 43; y++){
            for(int x = 12; x < 14; x++){
                addObject(new controleHaven(), x, y);

            }
        }
       
          
        for (int y = 33; y < 43; y++){
            for(int x = 24; x < 26; x++){
               addObject(new controleHaven(), x, y);

            }
        }
           
        
        for (int y = 33; y < 43; y++){
            for(int x = 36; x < 38; x++){
                addObject(new controleHaven(), x, y);

            }
        }
        
        
        for (int y = 33; y < 43; y++){
            for(int x = 48; x < 51; x++){
                addObject(new controleHaven(), x, y);

            }
        }
        
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
 
