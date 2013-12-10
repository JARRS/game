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
        for(int y = 0; y < 40; y++){
            for(int x = 0; x < 50; x++){
                if(y == 1 || y == 3 || y == 39 || y == 37){
                    addObject(new Spoor(), x, y);
                }
                
                if(y <= 10  || y >= 30){
                    addObject(new Dijk(), x, y);
                }
                
            }
        }
        
        
    }
   
    
    void objects(){
        /*addObject(new Boot_vrachtoverslaan(),10, 5);
        addObject(new Boot_vrachtoverslaan(),10, 8);
        
        for(int y = 5; y <= 8; y++){
            for(int x = 7; x <= 13; x++){
            if(y == 5){
                addObject(new Krat_vrachtoverslaan_tegenstander(), x, y);
            }
            
            if(y == 8){
                addObject(new Krat_vrachtoverslaan(), x, y);
            }
        }
        }
        
        addObject(new KraanBasis(), 13, 3);
        addObject(new KraanBasis(), 13, 10);
        addObject(new Trein_vrachtoverslaan(), 8, 1);
        addObject(new Trein_vrachtoverslaan(), 8, 12);
        addObject(new KraanGrijper_tegenstander(), 10, 5);
        addObject(new kraanGrijper(), 10, 8);
        addObject(new KraanXding_tegenstander(), 10, 3);
        addObject(new kraanXding(), 10, 10);*/
    }
}

