package ca.ualberta.cs.lonelytwitter;
/**
*call the patrent class indicate
*the variables and save the sad image
*/

public class Sad extends CurrentMood{
    private String text = "Sad";

    public Sad() {
        super();
    }

    public String  GetMood() {
        return text;
    }
}
