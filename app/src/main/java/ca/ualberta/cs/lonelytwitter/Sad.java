package ca.ualberta.cs.lonelytwitter;

public class Sad extends CurrentMood{
    private String text = "Sad";

    public Sad() {
        super();
    }

    public String  GetMood() {
        return text;
    }
}
