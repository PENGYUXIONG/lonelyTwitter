package ca.ualberta.cs.lonelytwitter;
/**
 * call the parent class and
 *indicate variables call back to
 *update happy image
 */
public class Happy extends CurrentMood{
    private String text = "Happy";

    public Happy() {
        super();
    }

    public String Get_Mood() {
        return text;
    }
}
