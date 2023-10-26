import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class campo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class campo extends World
{

    /**
     * Constructor for objects of class campo.
     * 
     */
    public campo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Santa santa = new Santa();
        addObject(santa,84,134);
        santa.setLocation(225,102);
        serieb serieb = new serieb();
        addObject(serieb,483,236);
        Counter counter = new Counter();
        addObject(counter,489,29);
        santa.setLocation(85,252);
        counter.setLocation(465,30);
    }
}
