import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawnertje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawnertje extends MenuObjecten
{
    /**
     * Act - do whatever the Spawnertje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int spawnTeller = Greenfoot.getRandomNumber(601);
    GreenfootImage leegSchip = new GreenfootImage("images/scheepje.png");
    GreenfootImage schip1 = new GreenfootImage("images/scheepje1.png");
    GreenfootImage schip2 = new GreenfootImage("images/scheepje2.png");
    GreenfootImage schip3 = new GreenfootImage("images/scheepje3.png");
    GreenfootImage[] imageArray = {leegSchip, schip1, schip2, schip3};
    public void act() 
    {
       spawnen();
    }    
    
    void spawnen(){
        spawnTeller++;
        if(spawnTeller == 600){
            int randomNummer = Greenfoot.getRandomNumber(3);
            Actor scheepje = new Scheepje();
            Scheepje scheepjeObject = (Scheepje) scheepje;
            getWorld().addObject(scheepje,getX(), getY());
            scheepjeObject.setPlaatje(imageArray[randomNummer], randomNummer);
            scheepje.turn(30);
            spawnTeller = 0;
        }
    }
}
