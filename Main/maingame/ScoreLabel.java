import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.text.DecimalFormat;

/**
 * Write a description of class ScoreLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ScoreLabel extends Actor  
{  
    int secondenGetal = 00;
    int minutenGetal = 00;
    int teller = 0;
    ScoreVrachtoverslaan deScore = (ScoreVrachtoverslaan) new ScoreVrachtoverslaan();
    String vrachtOverslaanScore = "";
    
    public void act() 
    {
       teller++;
       if(teller == 25){
           secondenGetal ++;
           if(secondenGetal == 60){
               minutenGetal++;
               secondenGetal = 0;
            }
           DecimalFormat formatter = new DecimalFormat("00");
           String seconden = formatter.format(secondenGetal);
           String minuten = formatter.format(minutenGetal);
           vrachtOverslaanScore = minuten + ":" + seconden;
           setScore(minuten, seconden);
           teller = 0;
        }
    }    
    
    public ScoreLabel ()  
    {  
        GreenfootImage img = new GreenfootImage(500, 30);  
        img.setColor(java.awt.Color.white);  
        img.drawString ("Tijd: 00:00", 2, 15);  
        setImage(img);  
    }  
    
   public void setScore(String minuten, String seconden)  
   {  
    GreenfootImage img = getImage();  
    img.clear();  
    img.drawString ("Tijd: " + minuten + ":" + seconden, 2, 15);  
    }  
    
   public void giveScore(String seconden, String minuten){
       deScore.setScore(vrachtOverslaanScore);
    }
}  
