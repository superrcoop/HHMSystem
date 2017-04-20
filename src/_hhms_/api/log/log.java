package _hhms_.api.log;

/**
 * A class representing a log in the Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class log {

    public Object object;
    /**
     * Logs activity in database
     * @param object
     */
    public log(Object object){
        //implement me
    }

    /**
     * Gets the date and time to be logged
     * @return date and time
     */
    public getDateTime(){
        //implement me
    }

    /**
     * Overrides the toString method to return a string containing the payment details.
     * Used to populate the payments contained in the Hope Health medical Solutions.
     * @return payment details
     */
    @Override
    public String toString(){
        return object.toString()
    }
}
