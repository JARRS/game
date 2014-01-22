import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Loodsboot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loodsboot extends LoodsenEndlessRunnerObjecten
{
    /**
     * Act - do whatever the Loodsboot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    double currentX;
    double currentY;
    double vaarSnelheid = 0.2;
    static boolean  boost = false;
    int boostteller = 0;
    
    public Loodsboot(double x, double y)
    {
        currentX = x;
        currentY = y;
    }
    
    public void act() 
    {
        sturen();
        setLocation((int)currentX, (int)currentY);
        
        if(boost == true){
            boost();
        }
        else{
            vaarSnelheid = 0.2;
        }
    }    
    
    private void sturen(){
        if(Greenfoot.isKeyDown("down")){
            currentY += vaarSnelheid;
        }
        else if(Greenfoot.isKeyDown("up")){
            currentY -= vaarSnelheid;
        }
        else if(Greenfoot.isKeyDown("left")){
            currentX -= vaarSnelheid* 0.5;
        }
        else if(Greenfoot.isKeyDown("right")){
            currentX += vaarSnelheid* 0.5;
        }
    }
    
    public static void setSpeedboost(boolean sneller){
        boost = sneller;
    }
    
    public void boost(){
        boostteller++;
        vaarSnelheid = 0.4;
        Vrachtschip.setVaarSnelheid(0.4);
        if(boostteller == 300){
            boost = false;
            Vrachtschip.setVaarSnelheid(0.4);
        }
    }
    
}
