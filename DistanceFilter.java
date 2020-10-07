
/**
 * Write a description of class DistanceFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DistanceFilter implements Filter
{
    // instance variables - replace the example below with your own
    private Location loc;
    private int      dis;
    private String name = "DistanceFilter";

    /**
     * Constructor for objects of class DistanceFilter
     */
    public DistanceFilter(Location dot, int distance)
    {
        loc = dot;
        dis = distance;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean satisfies(QuakeEntry qe) {
        return loc.distanceTo(qe.getLocation()) < dis;
    }
    
    public String getName() {
        return name;
    }
}
