/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map extends MapItems 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Map
     */
    public Map(int n)
    {
        if(n >= 0)
        {
            setImage("Sector" + n + ".png");
        }
        else
        {
            setImage("Uncharted.png");
        }
    }
}
