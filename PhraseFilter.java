
/**
 * Write a description of class PhraseFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhraseFilter implements Filter
{
    // instance variables - replace the example below with your own
    private String type;
    private String phrase;
    private String name = "PhraseFilter";
    /**
     * Constructor for objects of class PhraseFilter
     */
    public PhraseFilter(String str, String search)
    {
        type = str;
        phrase = search;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean satisfies(QuakeEntry qe) {
        if (type.equals("start")) {
            String firstWord = qe.getInfo().substring(0, qe.getInfo().indexOf(' '));
            return firstWord.equals(phrase);
        }
        else if (type.equals("end")) {
            String lastWord = qe.getInfo().substring(qe.getInfo().lastIndexOf(" ")+1);
            //System.out.println(lastWord);
            return (lastWord.equals(phrase));
        }
        else if (type.equals("any")) {
            return qe.getInfo().contains(phrase);
        }
        return false;
    }
    
    public String getName(){
        return name;
    }
}
