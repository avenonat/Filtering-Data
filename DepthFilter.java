
/**
 * Write a description of class DepthFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DepthFilter implements Filter
{
    // instance variables - replace the example below with your own
    private double minDepth;
    private double maxDepth;
    private String name = "DepthFilter";

    /**
     * Constructor for objects of class DepthFilter
     */
    public DepthFilter(double min, double max)
    {
        minDepth = min;
        maxDepth = max;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean satisfies(QuakeEntry qe) {
        return (qe.getDepth() >= minDepth && qe.getDepth() <= maxDepth);
    }
    
    public String getName(){
        return name;
    }
}
