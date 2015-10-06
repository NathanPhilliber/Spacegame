import greenfoot.*;

/**
 * Write a description of class Particle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Particle extends SpaceObject
{
    /**
     * Act - do whatever the Particle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int straightness;
    private double radius;
    private int lifetime;
    private double speed;
    private int turnTimer = 0;

    public Particle(double startX, double startY, int straightness, double radius, int lifetime, double particleSpeed, int lifetimeRandom)
    {
        super(startX, startY);
        this.straightness = straightness;
        this.radius = radius;
        this.lifetime = lifetime + Greenfoot.getRandomNumber(lifetimeRandom);
        speed = particleSpeed;
        turn(Greenfoot.getRandomNumber(360));
    }

    public void particleLife()
    {
        if (lifetime <= 0)
        {   
            getWorld().removeObject(this);

        }
        lifetime--;
    }

    public void particleMovement()
    {
        spaceMove(speed);
        if (turnTimer%straightness == 0)
        {   
            turn(Greenfoot.getRandomNumber(360));
        }
        turnTimer++;
    }

    public void act() 
    {
        // Add your action code here.
        super.act();
        particleLife();
        particleMovement();
    }    
}
