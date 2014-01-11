import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawner extends controleHavenObjecten
{
    //de kansen waarop er schepen kunnen spawnen
    public int spawnChance1 = 300;
    public int spawnChance2 = 300;
    public int spawnChance3 = 300;
    
    //de tijd die minimaal tussen de boten moet zitten
    public int tijdTussenBoot1 = 600;
    public int tijdTussenBoot2 = 600;
    public int tijdTussenBoot3 = 600;
    
    //de tijd die loopt vanaf dat er een schip wordt gespawnt
    public int tijdGeledenBoot1 = tijdTussenBoot1;
    public int tijdGeledenBoot2 = tijdTussenBoot2;
    public int tijdGeledenBoot3 = tijdTussenBoot3;
    
    public void act() 
    {
        //spawn boten
        if(Greenfoot.getRandomNumber(spawnChance1) == 1 && tijdGeledenBoot1 >= tijdTussenBoot1)
        {
            getWorld().addObject(new ControleBoot1(), 0, 0);
            tijdGeledenBoot1 = 0;
            spawnChance1 += 200;
        }
        
        if(Greenfoot.getRandomNumber(spawnChance2) == 1 && tijdGeledenBoot2 >= tijdTussenBoot2)
        {
            getWorld().addObject(new ControleBoot2(), 0, 0);
            tijdGeledenBoot2 = 0;
            spawnChance2 += 200;
        }
        
        if(Greenfoot.getRandomNumber(spawnChance3) == 1 && tijdGeledenBoot3 >= tijdTussenBoot3)
        {
            getWorld().addObject(new ControleBoot3(), 0, 0);
            tijdGeledenBoot3 = 0;
            spawnChance3 += 200;
        }
        
        //reset boot timers
        tijdGeledenBoot1++;
        tijdGeledenBoot2++;
        tijdGeledenBoot3++;
    }   
    
    public void setSpawnChance(int boot, int verschil)
    {
        if(boot == 1)
        {
            spawnChance1 += verschil;
        }
        else if(boot == 2)
        {
            spawnChance2 += verschil;
        }
        else if(boot == 3)
        {
            spawnChance3 += verschil;
        }
    }
    
    public int getSpawnChance(int boot)
    {
        int spawnChance;
        if(boot == 1)
        {
            spawnChance = spawnChance1;
        }
        else if(boot == 2)
        {
            spawnChance = spawnChance2;
        }
        else
        {
            spawnChance = spawnChance3;
        }
        return spawnChance;
    }
}
