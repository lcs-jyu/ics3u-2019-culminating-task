import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * This is the class for the "main character" in the action.
 * 
 * @author R. Gordon
 * @version May 8, 2019
 */
public class Bubble extends Actor
{
    /**
     * Instance variables
     * 
     * These are available for use in any method below.
     */    
    // Horizontal speed (change in horizontal position, or delta X)
    private int deltaX = 4;

    // Vertical speed (change in vertical position, or delta Y)
    private int deltaY = 4;

    // Acceleration for falls
    private int acceleration = 2;

    // Track current theoretical position in wider "scrollable" world
    private int currentScrollableWorldXPosition;

    // Track whether game is over or not
    private boolean isGameOver;

    
    // For walking animation
    private GreenfootImage walkingRightImages[];
    private GreenfootImage walkingLeftImages[];
    private static final int WALK_ANIMATION_DELAY = 8;
    private static final int COUNT_OF_WALKING_IMAGES = 2;
    private int walkingFrames;
    
    
    
   

    /**
     * Constructor
     * 
     * This runs once when the Hero object is created.
     */
    Bubble(int startingX)
    {
        // Set where hero begins horizontally
        currentScrollableWorldXPosition = startingX;

        // Game on
        isGameOver = false;

        // Set image
        setImage("BubbleBobble_29.png");
        
        GreenfootImage image = getImage();  
        image.scale(40, 30);

       

    }

   
    }

    

