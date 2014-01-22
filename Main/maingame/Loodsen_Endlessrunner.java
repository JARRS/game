import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Loodsen_Endlessrunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loodsen_Endlessrunner extends World
{

    /**
     * Constructor for objects of class Loodsen_Endlessrunner.
     * 
     */
    public Loodsen_Endlessrunner()
    {    
        super(50,42,20,false);
        taskbar();
        fill();
        setPaintOrder(Afsluiten.class,Hoofdmenu.class,Taskbar2.class,HealthBar.class,Loodsboot.class,Vrachtschip.class,Kant.class,HealthBoost.class, Boeien.class, Wreckage.class, Ondiepwater.class, Water.class);
    }
    
    void taskbar(){
        addObject(new Taskbar2(), 24, 0);
        addObject(new Afsluiten(), 48, 0);
        addObject(new Hoofdmenu(), 44, 0);
    }
    
    private void fill(){
        for(int y = 0; y < 42; y++){
            for(int x = -1; x <= 59; x++){
                if((y == 2 || y == 39) && (x%2 == 0 || x == 50)){
                    addObject(new Kant(),x,y);
                }
                if(x == 49){
                    addObject(new SpawnerLoodsen(),x,y);
                }
                if((y >= 9 && y <= 39) && (y %10 == 9 && (x % 10 == 9 || x == -1))){
                    addObject(new Water(),x,y);
                }
            }
        }
        addObject(new Vrachtschip(5.0, 20.0), 5, 20);
        addObject(new Loodsboot(13.0,20.0), 13, 20);
        addObject(new HealthBar(), 45, 2);
    }
}
