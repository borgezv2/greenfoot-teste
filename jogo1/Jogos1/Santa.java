import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Santa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Santa extends Actor
{   
    private int sTimer = 0;
    public int speed=1;
    /**
     * Act - do whatever the Santa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
         { 
        if (Greenfoot.isKeyDown("w")){this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")){this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("a")){this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("d")){this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("f")){
         getWorld().addObject(new neypoder(), getX() + 10, getY() + 20);  
        }
    }
        
     public void setDirection(int direction)
        {
            if ((direction >=0) && (direction <= 3 )) {
                setRotation(direction * 90);
            }
        }}
   
    
