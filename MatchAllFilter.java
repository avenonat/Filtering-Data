import java.util.*;
/**
 * Write a description of class MatchAllFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MatchAllFilter implements Filter
{
    // instance variables - replace the example below with your own
    private ArrayList<Filter> filters;

    /**
     * Constructor for objects of class MatchAllFilter
     */
    public MatchAllFilter()
    {
        filters = new ArrayList<Filter>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addFilter(Filter next) {
        filters.add(next);
    }
    
    public boolean satisfies(QuakeEntry qe) {
        boolean answer;
        for (Filter temp : filters) {
            if (!temp.satisfies(qe)) {
                return false;
            }
        }
        return true;
    }
         
    public String getName(){
        StringBuilder s = new StringBuilder();
        for(Filter f: filters){
            s.append(f.getName()+ " ");
        }
        return s.toString();
    }
}
