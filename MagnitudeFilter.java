
/**
 * Write a description of class MagnitudeFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagnitudeFilter implements Filter
{
    // instance variables - replace the example below with your own
    private double minMag;
    private double maxMag;
    private String name = "MagnitudeFilter";

    /**
     * Constructor for objects of class MagnitudeFilter
     */
    public MagnitudeFilter(double min, double max)
    {
        // initialise instance variables
        minMag = min;
        maxMag = max;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean satisfies(QuakeEntry qe) {
        return (qe.getMagnitude() >= minMag && qe.getMagnitude() <=maxMag);
    }
    
    public String getName(){
        return name;
    }

}
