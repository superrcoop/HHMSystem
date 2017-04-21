package _hhms_.api;

import java.time.*;

/**
 * A class representing a patient contained in the Hope Health Medical Solution.
 * @author GROUP5
 * @version 0.2.1
 */
public class patient {

    
    private String id;
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
    private String comments;

    /**
     * Initialises a patient with ALL personal details
     * @param fname
     * @param lname
     * @param addr
     * @param dateOB
     * @param job
     * @param nexKName
     * @param nexxPhnum
     * @param phnum
     */
    public patient(String id, String fname, String lname, String dateOB, String addr,
                   String phnum, String job, String nexKName, String nexxPhnum){
        this.id=id;
        this.fname=fname;
        this.lname=lname;
        this.dateOB=dateOB;
        this.age=getAge();
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
        return age;
    }

    /**
     * Gets the patient ID.
     * @return patient id
     */
    public String getpatientID() {
        return id;
    }
    
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
     * Sets the phone number of a patient.
     */
    public void setPhoneNumber(String phnum){
        this.phnum=phnum;
    }

    /**
     * Gets patient medical condition
     * @return medical condition
      */
    public String getMedicalCondition(){
        return medicalCon;
    }

    /**
     * Set patent medical condition
     * @param condition
     */
    public void setMedicalCondition(String condition){
        this.medicalCon=condition;
    }

    /**
     * Overrides the toString method to return a string containing the first and last name of a patient.
     * Used to populate the list of patients contained in the Hope Health medical Solutions.
     * @return A string containing the patient data
     */
    @Override
    public String toString(){
        return id+"\t\t"+fname + " " + lname + "\t\t" + dateOB + "\t\t" + getAge()+"\t\t" +phnum +
                "\t\t"+addr+"\t\t"+ nexKName +"\t\t"+ nexxPhnum+"\t\t"+comments;
    }
}
