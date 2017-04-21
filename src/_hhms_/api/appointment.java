package _hhms_.api;

import java.time.LocalDate;
import java.time.Period;

/**
 * A class representing a appointment contained in the Hope Health Medical Solution.
 * @author GROUP5
 * @version 0.2.1
 */
public class appointment {

    private String appDate;
    private String appTime;
    private String doc;
    private String patientId;
    private String operation;

    public String DOCTOR_1="Dave Brown";
    public String DOCTOR_2="Chalice Original";

    /**
     * Initialises an appointment
     * @param patientId
     * @param appDate;
     * @param appTime;
     * @param doc
     */
    public appointment(String patientId, String appDate,String operation, String appTime, String doc){
        this.patientId=patientId;
        this.operation=operation;
        this.appDate=appDate;
        this.appTime=appTime;
        this.doc=doc;
    }

    /**
     * reschedule appointment time
     * @param newAppTime
     */
    public void reschApp_Time (String newAppTime){
        this.appTime=newAppTime;
    }

    /**
     * reschedule appointment date
     * @param newAppDate
     */
    public void reschApp_date(String newAppDate){
        this.appDate=newAppDate;
    }

    /**
     * Gets patient operation
     * @return
     */
    public String getOperation(){
        return operation;
    }

    /**
     * Get appointment date
     * @return
     */
    public String getappDate(){
        return this.appDate;
    }

    /**
     * Get appointment Time
     * @return
     */
    public String getappTime(){
        return this.appTime;
    }

    /**
     * Calculate Appointment status
     * @return status
     */
    public String getApp_Status(){
        String[] parts = appDate.split("-");
        int part1 = Integer.parseInt(parts[0]); // Day
        int part2 = Integer.parseInt(parts[1]); // Month eg.JANUARY
        int part3 = Integer.parseInt(parts[2]); // Year
        LocalDate today = LocalDate.now(); //today's date
        LocalDate app = LocalDate.of(part3, part2, part1); //appointment date

        if (Period.between(today,app).getDays()>0){
            return Period.between(today,app).getDays()+" days remaining";
        }
        else if (Period.between(today,app).getDays()==0) {
            return "Appointment is sheduled for today at "+appTime;
        }
        else{
            return " Appointment date has passed.";
        }

    }
    /**
     * Overrides the toString method to return a string containing the appointment details.
     * Used to populate the appointments contained in the Hope Health medical Solutions.
     * @return appointment details
     */
    @Override
    public String toString(){
        return patientId+"\t\t"+appDate+"\t\t"+appTime+"\t\t"+ operation+"\t\t"+doc;
    }
}
