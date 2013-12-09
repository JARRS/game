import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VrachtOverslaan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VrachtOverslaan extends Minigames
{

    /**
     * Constructor for objects of class VrachtOverslaan.
     * 
     */
    public VrachtOverslaan()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        
        fill();
        taskbar();
        objects();
    }
    
    void fill(){
        for(int y = 0; y < 14; y++){
            for(int x = 0; x < 20; x++){
                if(y == 1 || y == 13){
                    addObject(new Spoor1(), x, y);
                }
                
                else if(y == 0 || y == 12){
                    addObject(new Spoor2(), x, y);
                }
                
                else if(y < 5 || y > 8){
                    addObject(new Dijk(), x, y);
                }
                
            }
        }
        
        
    }
    
    void taskbar(){
        addObject(new Taskbar2(), 10, 0);
        addObject(new Afsluiten2(), 18, 0);
        addObject(new Hoofdmenu2(), 16, 0);
    }
    
    void objects(){
        addObject(new Boot_vrachtoverslaan(),10, 5);
        addObject(new Boot_vrachtoverslaan(),10, 8);
        
        for(int y = 5; y <= 8; y++){
            for(int x = 7; x <= 13; x++){
            if(y == 5 || y == 8){
                addObject(new Krat_vrachtoverslaan(), x, y);
            }
        }
        }
        
        addObject(new KraanBasis(), 10, 3);
        addObject(new KraanBasis(), 10, 10);
        addObject(new kraanGrijper(), 10, 5);
        addObject(new kraanGrijper(), 10, 8);
    }
}

