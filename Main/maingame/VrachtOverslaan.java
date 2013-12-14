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
        for(int y = 0; y < 42; y++){
            for(int x = 0; x < 50; x++){
                if(y == 2 || y == 4 || y == 40 || y == 38){
                    addObject(new Spoor(), x, y);
                }
                
                else if(y <= 12  || y >= 30){
                    addObject(new Dijk(), x, y);
                }
                
                else if(y == 21){
                    addObject(new Border(), x, y);
                }
                
                
            }
        }
        
        
    }
   
    
    void objects(){
        addObject(new Boot_vrachtoverslaan(),24, 16);
        addObject(new Boot_vrachtoverslaan(),24, 26);
        addObject(new Trein_vrachtoverslaan(), 30, 3);
        addObject(new Trein_vrachtoverslaan(), 30, 39);
        
        //zet containers neer
        String[][] randomContainers = getRandomContainers(3, 15);
        //Vector startEigenContainers = new Vector(10, 24);
        //Vector startComputerContainers = new Vector(10, 14);
        for(int y = 0; y <= 2; y++)
        {
            for(int x = 0; x <= 14; x++)
            {
                //maak eigen containers
                if(randomContainers[x][y] == "container1")
                {
                    addObject(new Krat_vrachtoverslaan(), 10 + (2 * x), 24 + (2 * y));
                }
                else if(randomContainers[x][y] == "container2")
                {
                    addObject(new Dijk(), 10 + (2 * x), 24 + (2 * y));
                }
                else if(randomContainers[x][y] == "container3")
                {
                    addObject(new Border(), 10 + (2 * x), 24 + (2 * y));
                }
                else if(randomContainers[x][y] == "container4")
                {
                    addObject(new Spoor(), 10 + (2 * x), 24 + (2 * y));
                }
                
                //maak containers tegenstander
                if(randomContainers[x][y] == "container1")
                {
                    addObject(new Krat_vrachtoverslaan_tegenstander(), 10 + (2 * x), 18 - (2 * y));
                }
                else if(randomContainers[x][y] == "container2")
                {
                    addObject(new Dijk(), 10 + (2 * x), 18 - (2 * y));
                }
                else if(randomContainers[x][y] == "container3")
                {
                    addObject(new Border(), 10 + (2 * x), 18 - (2 * y));
                }
                else if(randomContainers[x][y] == "container4")
                {
                    addObject(new Spoor(), 10 + (2 * x), 18 - (2 * y));
                }
            }
        }
        
        /*
         * ROBINS STUKJE VOOR ALS JE HET NOG WILT TERUGZETTEN
        for(int y = 14; y <= 28; y+= 2){
            for(int x = 10; x <= 39; x+= 2){
            if(y >= 14 && y <= 18){
                addObject(new Krat_vrachtoverslaan_tegenstander(), x, y);
            }
            
            if(y >= 24 && y <= 28){
                addObject(new Krat_vrachtoverslaan(), x, y);
            }
        }
        }
        */
       
        addObject(new KraanBasis(), 29, 8);
        addObject(new KraanBasis(), 29, 34);
        addObject(new KraanGrijper_tegenstander(), 22, 18);
        addObject(new kraanGrijper(), 22, 24);
        addObject(new KraanXding_tegenstander(), 22, 10);
        addObject(new kraanXding(), 22, 32);
        taskbar();
    }
    
    public String[][] getRandomContainers(int y, int x)
    {          
        //vul array met random containers
        String[][] array = new String[x][y];
        
        for(int a = 0; a < y; a++)
        {
            for(int b = 0; b < x; b++)
            {
                String containerType = "";
                int random = Greenfoot.getRandomNumber(4);
                if(random == 0)
                {
                    containerType = "container1";
                }
                else if(random == 1)
                {
                    containerType = "container2";
                }
                else if(random == 2)
                {
                    containerType = "container3";
                }
                else if(random == 3)
                {
                    containerType = "container4";
                }
                array[b][a] = containerType;
            }
        }
        
        return array;
    }
   
}

