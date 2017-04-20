package _hhms_.api;
import _hhms_.api.patient;
import _hhms_.api.visit;

/**
 * A class representing a patient docket in the Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class docket {

    public visit Visit;
    public patient Patient;

    /**
     * Initialises a docket for a patient in the Medical System
     * @param Patient
     * @param Visit
     */
    public docket(patient Patient,visit Visit){
        this.Patient=Patient;
        this.Visit=Visit;
    }

    /**
     * Gets a patient visit from a docket
     * @return visit
     */
    public visit getVisit(){
        return Visit;
    }

    /**
     * Get a patient from the docket;
     * @return patient
     */
    public patient getPatient(){
        return Patient;
    }

    /**
     * Creates a docket in the database
     */
    public createDocket(){
        //implement me
    }

    /**
     * Delete a docket from the database
     */
    public deleteDocket(){
        //implement me
    }

    /**
     * Update docket in the database
     */
    public updateDocket(){
        //implement me
    }

}
