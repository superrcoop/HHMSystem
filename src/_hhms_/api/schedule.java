package _hhms_.api;

/**
 * A class representing a schedule in the system.
 * @author GROUP5
 * @version 0.2.1
 */
public class schedule {

    private String status;
    private String date;
    private String time;
    private String fname;
    private String lname;
    private String title;

    /**
     * Initialises a new schedule in the management system database
     */
    public schedule(String title){
        this.title=title;
    }

    /**
     * An instance of schedule will accepts the day's appointments and
     * write to a file
     */
    public void createSchedule(){
        //...
    }

    /**
     * Add patient to schedule
     */
    public void addPatient(String fname,String lname,String date,String time,String status){
        this.fname=fname;
        this.lname=lname;
        this.date=date;
        this.time=time;
        this.status=status;

        //...
    }

    /**
     * removes a patient from the scedule
     */
    public void removePatient(String fname,String lname){
        //...
    }

    /**
     * Update patient status
     */
    public void updateStatus(String fname,String lname,String status){
        //...
    }

    /**
     * Overrides the toString method to return a string containing the payment details.
     * Used to populate the schedule contained in the Hope Health medical Solutions.
     * @return scedule details
     */
    @Override
    public String toString(){
        return "";
    }
}
