import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class serieb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class serieb extends Actor
{
   public int speed=1;
    /**
     * Act - do whatever the Santa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
         { 
        if (Greenfoot.isKeyDown("Up")){this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("Down")){this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("Left")){this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("Right")){this.setLocation(this.getX() + speed, this.getY());
        }
   }}
