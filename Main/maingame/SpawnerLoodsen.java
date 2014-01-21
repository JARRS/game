import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpawnerLoodsen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpawnerLoodsen extends LoodsenEndlessRunnerObjecten
{
    /**
     * Act - do whatever the SpawnerLoodsen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int spawnTeller = 0;
    public void act() 
    {
       spawnen();
    }    
    
    private void spawnen(){
        spawnTeller++;
        if(spawnTeller % 30 == 0){
            if(getY() == 2 || getY() == 39){
                getWorld().addObject(new Kant(),getX()+1,getY());
            }
            
            int boeienKans = Greenfoot.getRandomNumber(300);
            if(boeienKans == 0 && (getY() >= 6 && getY() <= 35)){
                getWorld().addObject(new Boeien(),getX()+2,getY());
            }
            
            int wreckageKans = Greenfoot.getRandomNumber(300);
            if(wreckageKans == 0 && (getY() >= 6 && getY() <= 35)){
                getWorld().addObject(new Wreckage(),getX()+2,getY());
            }
            
        }
        if((spawnTeller% 150 == 0) && (getY() >= 9 && getY() <= 39) && getY()%10 == 9){
            int waterKans = Greenfoot.getRandomNumber(100);
            getWorld().addObject(new Water(),getX()+10,getY());
            if(waterKans == 0){
                getWorld().addObject(new Ondiepwater(),getX()+10,getY());
            }
            
            
        
        }
    }
}
