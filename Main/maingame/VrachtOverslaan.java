import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color; 
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
    int scheepsVracht = 0;
    int scheepsVrachtTegenstander = 0;
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
               
                
                if(y <= 12  || y >= 30){
                    addObject(new Dijk(), x, y);
                }
                
                else if(y == 21){
                    addObject(new Border(), x, y);
                }
               
            }
        }
        
        for(int y = 0; y < 42; y++){
            for(int x = 0; x < 50; x++){
               
                if((y == 3 || y == 39) && x  % 2 == 0){
                    addObject(new Spoor(), x, y);
                }
            }
        }
        
    }
   
    ScoreLabel VrachtOverslaanScore = new ScoreLabel();
    public static HighscoreVrachtOverslaan Highscore = new HighscoreVrachtOverslaan();
    void objects(){
        addObject(new Boot_vrachtoverslaan(),24, 16);
        addObject(new Boot_vrachtoverslaan(),24, 26);
        addObject(new Trein_vrachtoverslaan_tegenstander(), 30, 3);
        addObject(new Trein_vrachtoverslaan(), 30, 39);  
        
        //zet containers neer
        String[][] randomContainers = getRandomContainers(3, 15);
        //Vector startEigenContainers = new Vector(10, 24);
        //Vector startComputerContainers = new Vector(10, 14);
        for(int y = 0; y <= 2; y++)
        {
            for(int x = 0; x <= 14; x++)
            {
                //maak containers tegenstander
                if(randomContainers[x][y] == "container1")
                {
                    addObject(new Container1_tegenstander(), 10 + (2 * x), 18 - (2 * y));
                    scheepsVrachtTegenstander++;
                }
                else if(randomContainers[x][y] == "container2")
                {
                    addObject(new Container2_tegenstander(), 10 + (2 * x) + 1, 18 - (2 * y));
                    scheepsVrachtTegenstander++;
                }
                else if(randomContainers[x][y] == "container3")
                {
                    addObject(new Container3_tegenstander(), 10 + (2 * x) + 2, 18 - (2 * y));
                    scheepsVrachtTegenstander++;
                }
                
                //maak eigen containers
                if(randomContainers[x][y] == "container1")
                {
                    addObject(new Container1(), 10 + (2 * x), 24 + (2 * y));
                    scheepsVracht++;
                }
                else if(randomContainers[x][y] == "container2")
                {
                    addObject(new Container2(), 10 + (2 * x) + 1, 24 + (2 * y));
                    scheepsVracht++;
                }
                else if(randomContainers[x][y] == "container3")
                {
                    addObject(new Container3(), 10 + (2 * x) + 2, 24 + (2 * y));
                    scheepsVracht++;
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
        addObject(new BalansBalk(), 46, 26);
        addObject(new AanwijsBalk(), 46, 26);
        
        addObject(new KraanBasis(), 29, 8);
        addObject(new KraanBasis(), 29, 34);
        
        KraanGrijper_tegenstander tegenstander = new KraanGrijper_tegenstander();
        addObject(tegenstander, 22, 18);
        addObject(new kraanGrijper(), 22, 24);
        addObject(new KraanXding_tegenstander(), 22, 10);
        addObject(new kraanXding(), 22, 32);
        
        
        
        taskbar();
        addObject(VrachtOverslaanScore, 12, 0);
        //addObject(Highscore,16,0);
        
        //geef de tegenstander de locaties van de containers mee
        tegenstander.acceptContainerMap(randomContainers);
    }
    
    public String[][] getRandomContainers(int y, int x)
    {          
        //vul array met random containers
        String[][] array = new String[x][y];
        
        for(int a = 0; a < y; a++)
        {
            for(int b = 0; b < x; b++)
            {
                //check eerst welke containers er nog passen
                int maxRandom = 3;
                //nog 3 vakjes over
                if(b == x - 3)
                {
                    maxRandom = 3;
                }
                //nog 2 vakjes over
                else if(b == x - 2)
                {
                    maxRandom = 2;
                }
                //nog 1 vakje over
                else if(b == x - 1)
                {
                    maxRandom = 1;
                }
                //vul random containers in
                int random = Greenfoot.getRandomNumber(maxRandom);
                if(random == 0)
                {
                    array[b][a] = "container1";
                }
                else if(random == 1)
                {
                    array[b][a] = "container2";
                    array[b+1][a] = "empty";
                    b++;
                }
                else if(random == 2)
                {
                    array[b][a] = "container3";
                    array[b+1][a] = "empty";
                    array[b+2][a] = "empty";
                    b += 2;
                }
               
            }
        }
        
        return array;
    }
    
    public int getScheepsVracht(){
        return scheepsVracht;
    }
    
    public void setScheepsVracht(int scheepsVracht){
        this.scheepsVracht = scheepsVracht;
    }
    
    public void sendScore(){
        String score = VrachtOverslaanScore.getScore();
        /*Highscores highscore = new Highscores();
        highscore.setScore(score);*/
        if(Highscore.getMinuten() < VrachtOverslaanScore.getMinuten()){
            Highscore.setScore(score);
        }
        
        else if(Highscore.getMinuten() == VrachtOverslaanScore.getMinuten() && Highscore.getSeconden() < VrachtOverslaanScore.getSeconden()){
            Highscore.setScore(score);
        }
        
    }
}

