package _HHMSystem_;

import java.time.*;

/**
 * A class representing a patient contained in the Hope Health Medical Solution.
 * @author GROUP5
 * @version 0.2.1
 */
public class patient {

    private String fname;
    private String lname;
    private int age;
    private String dateOB;
    private String addr;
    private String phnum;
    private String job;
    private String nexKName;
    private String nexxPhnum;
    private String medicalCon;
    private String bill;
    private String doc;
    private String comments;
    private String appointment;


    /**
     * Initialises a patient with ALL personal details
     * @param fname
     * @param lname
     * @param addr
     * @param dateOB
     * @param age
     * @param job
     * @param nexKName
     * @param nexxPhnum
     * @param phnum
     */
    public patient(String fname, String lname, String dateOB, String age, String addr,
                   String phnum, String job, String nexKName, String nexxPhnum){
        this.fname=fname;
        this.lname=lname;
        this.dateOB=dateOB;
        this.age=age;
        this.addr=addr;
        this.phnum=phnum;
        this.job=job;
        this.nexKName=nexKName;
        this.nexxPhnum=nexxPhnum;
    }

    /**
    * Initialises a patient with basic personal details
    * @param fname
    * @param lname
    */
    public patient(String fname, String lname){
        this.fname=fname;
        this.lname=lname;

    }


    /**
     * Gets the persons age.
     * @return age.
     */
    public int getAge(){

        String[] parts = dateOB.split("-");
        int part1 = Integer.parseInt(parts[0]); // Day
        int part2 = Integer.parseInt(parts[1]); // Month eg.JANUARY
        int part3 = Integer.parseInt(parts[2]); // Year
        LocalDate today = LocalDate.now(); // Today's Date
        LocalDate birthday = LocalDate.of(part3, part2, part1);
        if (age != Period.between(birthday, today).getYears()){
            return False;
        }
        return age;
    }

    /**
     * Gets the first name of a patient.
     * @return The first name of a patient.
     */
    public String getFirstName() {
        return fname;
    }

    /**
     * Gets the last name of a patient.
     * @return The last name of a patient.
     */
    public String getLastName() {
        return lname;
    }

    /**
     * Gets the comments of a patient.
     * @return The comments of a patient.
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the comments of a patient.
     * @param comments The comments of a patient.
     */
    public void setComments(String comments) {
        this.comments = comments;
    }


    /**
     * Gets the phone number of a patient.
     * @return The phone number of a patient.
     */
    public String getPhoneNumber() {
        return phnum;
    }

    /**
     * Gets the billing of a patient.
     * @return The billing of a patient.
     */
    public double getBilling() {
        return bill;
    }

    /**
     * Gets the doctor of a patient.
     * @return The doctor of a patient.
     */
    public String getDoctor() {
        return doc;
    }

    /**
     * Gets the appointments of a patient.
     * @return The appointments of a patient.
     */
    public String getAppointments() {
        return appointment;
    }

    /**
     * Sets the appointments of a patient.
     * @param appointments The appointments of a patient.
     */
    public void setAppointments(String appointments) {
        this.appointment = appointments;
    }

    /**
     * Overrides the toString method to return a string containing the first and last name of a patient.
     * Used to populate the list of patients contained in the Hope Health medical Solutions.
     * @return A string containing the patient data
     */
    @Override
    public String toString(){
        return fname + " " + lname + "     " + dateOB + "    " + getAge()+"    " +phnum + "    "+addr+"    "+ nexKName +" "+ nexxPhnum;
    }
}