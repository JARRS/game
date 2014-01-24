import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scheepje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scheepje extends MenuObjecten
{
    /**
     * Act - do whatever the Scheepje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    int route = 0;
    int stappenTeller = 0;
    int actieTeller = 0;
    boolean retour = false;
    boolean gaan = false;
    boolean omhoog = false;
    GreenfootImage leegSchip = new GreenfootImage("images/scheepje.png");
    GreenfootImage schip1 = new GreenfootImage("images/scheepje1.png");
    GreenfootImage schip2 = new GreenfootImage("images/scheepje2.png");
    GreenfootImage schip3 = new GreenfootImage("images/scheepje3.png");
    GreenfootImage[] imageArray = {leegSchip, schip1, schip2, schip3};
    int currentImg = 0;
    public void act() 
    {
        if(actieTeller == 3){
            varen();
            actieTeller = 0;
        }
        else{
            actieTeller++;
        }
    }    

    public void varen(){
        if(getX() == 297 && getY() == 28 && route == 0){
            route = 4;
        }

        else if(getX() == 226 && getY() == 28 && route == 0){
            route = Greenfoot.getRandomNumber(3)+1;
        }

        if(route == 4){
            if(getX() < 423){
                if(stappenTeller == 1){
                    setLocation(getX()+1,getY()+1);
                    stappenTeller = 0;
                }
                else{
                    setLocation(getX()+1,getY());
                    stappenTeller++;
                }
            }
            else if(getX() >= 423 && getX() <= 424){
                setLocation(getX()+1,getY()-2);
                stappenTeller = 0;
            }
            else if(getX() <= 561){
                if(stappenTeller == 2){
                    setLocation(getX()+1,getY()+2);
                    stappenTeller = 0;
                }
                else{
                    setLocation(getX()+1,getY());
                    stappenTeller++;
                }
            }
            else if(getX() >= 561 && getX() <= 564){
                setLocation(getX()+1,getY()+4);
            }
            else if(getX() < 709){
                if(stappenTeller == 2){
                    setLocation(getX()+1,getY()+2);
                    stappenTeller = 0;
                }
                else{
                    setLocation(getX()+1,getY());
                    stappenTeller++;
                }
            }
            else if(getX() == 709){
                turn(25);
                setLocation(getX()+1,getY()+2);
                stappenTeller = 0;
            }
            else if(getX() < 729){
                setLocation(getX()+1,getY()+2);
            }
            else if(getX() == 729){
                turn(-20);
                setLocation(getX()+1,getY()+1);
            }
            else if(getX() < 799){
                if(stappenTeller == 1){
                    setLocation(getX()+1,getY()+1);
                    stappenTeller = 0;
                }
                else{
                    setLocation(getX()+1,getY());
                    stappenTeller++;
                }
            }
            else if(getX() == 799){
                getWorld().removeObject(this);
            }
        }

        if((route == 1 || route == 2 || route == 3) && retour == false){
            if (getX() < 353 && getY() < 91){
                if(stappenTeller == 1){
                    setLocation(getX()+1,getY()+1);
                    stappenTeller = 0;
                }
                else{
                    setLocation(getX()+1,getY());
                    stappenTeller++;
                }
            }
            else if(getX() == 352 && getY() == 91){
                turn(75);
                setLocation(getX()-1,getY()+1);
            }
            else if(getX() > 338 && getY() < 144){
                if(stappenTeller == 3){
                    setLocation(getX()-1,getY()+1);
                    stappenTeller = 0;
                }
                else{
                    setLocation(getX(),getY()+1);
                    stappenTeller++;
                }
            }
            else if(getX() == 338 && getY() == 144){
                if(route == 1 || route == 2){
                    turn(95);
                    setLocation(getX()-1,getY()-1);
                }
                else if(route == 3){
                    setLocation(getX(),getY()+1);
                    stappenTeller++;
                }
            }

            else if(route == 1 || route == 2){
                if(getX() > 293 && getY() > 132){
                    if(stappenTeller == 3){
                        setLocation(getX()-1,getY()-1);
                        stappenTeller = 0;
                    }
                    else{
                        setLocation(getX()-1,getY());
                        stappenTeller++;
                    }
                }
                else if(getX() == 293 && getY() == 132){
                    if(route == 2){
                        turn(-35);
                        setLocation(getX()-1,getY());
                        stappenTeller = 0;

                    }
                    else if(route == 1){
                        setLocation(getX()-1,getY());
                        stappenTeller++;
                    }
                }

                
                else if(route == 1){
                    if(getX() > 179 && getY() > 94){
                        if(stappenTeller == 2){
                            setLocation(getX()-1,getY()-1);
                            stappenTeller = 0;
                        }
                        else{
                            setLocation(getX()-1,getY());
                            stappenTeller++;
                        }
                    }
                    else if(getX() == 179 && getY() == 94){
                        retour = true;
                        stappenTeller = 0;
                    }
                }

                else if(route == 2){
                    if(getY() < 145 && getX() > 265){
                        setLocation(getX()-1,getY()+1);
                    }
                    else if(getY() == 145 && getX() == 165){
                        turn(5);
                        setLocation(getX()-1,getY());
                    }
                    else if(getX() > 225 && getY() < 154){
                        if(stappenTeller == 5){
                            setLocation(getX()-1,getY()+1);
                            stappenTeller = 0;
                        }
                        else{
                            setLocation(getX()-1,getY());
                            stappenTeller++;
                        }
                    }
                    else if(getX() == 225 && getY() == 154){
                        retour = true;
                        stappenTeller = 0;
                    }
                }
            }

            else if(route == 3){
                if(getX() > 319 && getY() < 220){
                    if(stappenTeller == 3){
                        setLocation(getX()-1,getY()+1);
                        stappenTeller = 0;
                    }
                    else{
                        setLocation(getX(),getY()+1);
                        stappenTeller++;
                    }
                }
                else if(getX() == 319 && getY() == 220){
                    turn(45);
                    setLocation(getX()-1,getY()+10);
                }
                else if(getX() > 274 && getY() < 241){
                    if(stappenTeller == 3){
                        setLocation(getX()-1,getY()+1);
                        stappenTeller = 0;
                    }
                    else {
                        setLocation(getX()-1,getY());
                        stappenTeller++;
                    }
                }
                else if(getX() == 274 && getY() == 241){
                    retour = true;
                    stappenTeller = 0;
                }

            }
        }

        if(retour == true){
            if(gaan == false){
                if(stappenTeller != 30){
                    stappenTeller++;
                }
                else{
                    if(currentImg == 0){
                        int randomNumber = Greenfoot.getRandomNumber(3)+1;
                        setImage(imageArray[randomNumber]);
                        
                    }
                    else{
                        setImage(imageArray[0]);
                    }
                    turn(180);
                    gaan = true;
                    stappenTeller = 0;
                }
            }
            else{
                if(route == 1 || route == 2 || route == 3){
                    if(getX() == 338 && getY() == 144){
                        stappenTeller = 0;
                        setRotation(285);
                        omhoog = true;
                        setLocation(getX(),getY()-1);
                    }

                    else if(getX() < 351 && getY() > 91 && omhoog == true){
                        if(stappenTeller == 3){
                            setLocation(getX()+1,getY()-1);
                            stappenTeller = 0;
                        }
                        else{
                            setLocation(getX(),getY()-1);
                            stappenTeller++;
                        }
                    }

                    else if(getX() == 351 && getY() == 91 && omhoog == true){
                        turn(-75);
                        setLocation(getX()+1,getY()-1);
                    }

                    else if(getX() > 228 && getY() > 28 && omhoog == true){
                        if(stappenTeller == 1){
                            setLocation(getX()-1,getY()-1);
                            stappenTeller = 0;
                        }
                        else{
                            setLocation(getX()-1,getY());
                            stappenTeller++;
                        }
                    }
                    else if(getX() == 228 && getY() == 28 && omhoog == true){
                        getWorld().removeObject(this);
                    }

                    else if(route == 1 || route == 2){
                        if(getX() == 293 && getY() == 132){
                            if(route == 2){
                                turn(35);
                                setLocation(getX()+1,getY());
                                stappenTeller = 0;
                            }
                            else if(route == 1){
                                setLocation(getX()+1,getY());
                                stappenTeller = 0;
                            }
                        }

                        else if(getX() < 338 && getY() < 144){
                            if(stappenTeller == 3){
                                setLocation(getX()+1,getY()+1);
                                stappenTeller = 0;
                            }
                            else{
                                setLocation(getX()+1,getY());
                                stappenTeller++;
                            }
                        }

                        else if(getX() == 338 && (getY() == 133 || getY() == 143)){
                            setLocation(338,144);
                        }

                        else if (route == 1){
                            if(getX() < 293 && getY() < 132){
                                if(stappenTeller == 2){
                                    setLocation(getX()+1,getY()+1);
                                    stappenTeller = 0;
                                }
                                else{
                                    setLocation(getX()+1,getY());
                                    stappenTeller++;
                                }
                            }
                        }

                        else if (route == 2){
                            if(getY() > 145 && getX() < 265){
                                if(stappenTeller == 5){
                                    setLocation(getX()+1,getY()-1);
                                    stappenTeller = 0;
                                }
                                else{
                                    setLocation(getX()+1,getY());
                                    stappenTeller++;
                                }
                            }
                            else if(getY() == 145 && getX() == 265){
                                turn(-5);
                                setLocation(getX()+1,getY());
                            }
                            else if(getX() < 293 && getY() > 132){
                                setLocation(getX()+1,getY()-1);
                            }
                            else if(getX() == 281 && getY() == 132){
                                setLocation(293,132);
                            }

                        }

                    }
                    else if(route == 3){
                    if(getX() < 322 && getY() > 229){
                    if(stappenTeller == 3){
                        setLocation(getX()+1,getY()-1);
                        stappenTeller = 0;
                    }
                    else {
                        setLocation(getX()+1,getY());
                        stappenTeller++;
                    }
                }
                else if(getX() == 322 && getY() == 229){
                    turn(-45);
                    setLocation(getX(),getY()-1);
                    stappenTeller = 0;
                }
                else if(getX() < 338 && getY() > 144){
                     if(stappenTeller == 3){
                        setLocation(getX()+1,getY()-1);
                        stappenTeller = 0;
                    }
                    else{
                        setLocation(getX(),getY()-1);
                        stappenTeller++;
                    }
                }
                else if(getX() == 338 && getY() == 164){
                    setLocation(338,144);
                }
                    }
                }

            }
        }

    }
    
    public void setPlaatje(GreenfootImage image, int number){
        setImage(image);
        currentImg = number;
    }
    
}
