import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreVrachtoverslaan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreVrachtoverslaan extends HighscoresObjecten
{
    /**
     * Act - do whatever the ScoreVrachtoverslaan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String vrachtOverslaanScore = "00:00";
    public void act() 
    {
       setScore(vrachtOverslaanScore);
    }    
    public ScoreVrachtoverslaan ()  
    {  
        GreenfootImage img = new GreenfootImage(500, 30);  
        img.setColor(java.awt.Color.white);  
        img.drawString ("Uw beste tijd in vracht overslaan: 00:00", 2, 15);  
        setImage(img);  
    }  
    
    public void setVrachtOverslaanScore(String vrachtOverslaanScore){
        this.vrachtOverslaanScore = vrachtOverslaanScore;
    
    }
    
   public void setScore(String vrachtOverslaanScore)  
   {  
    GreenfootImage img = getImage();  
    img.clear();  
    img.drawString ("Uw beste tijd in vracht overslaan: " + vrachtOverslaanScore, 2, 15);  
    }  
}
