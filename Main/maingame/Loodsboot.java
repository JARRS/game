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
    
    public Loodsboot(double x, double y)
    {
        currentX = x;
        currentY = y;
    }
    
    public void act() 
    {
        sturen();
        setLocation((int)currentX, (int)currentY);
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
    
}
