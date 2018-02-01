package ca.ualberta.cs.lonelytwitter;
import java.util.Date;
/**
* call the parent class and update variables
* indicating the new numbers
*update the image
*/

public class CurrentMood {
    private Date times;

    public CurrentMood() {
        super();
        times = new Date();
    }

    public Date getTimestamp() {
        return times;
    }

    public void setTimestamp(Date timestamp) {
        this.times = timestamp;
    }
}
