package _hhms_.api;
import _hhms_.api.patient;
import _hhms_.api.visit;

import java.util.ArrayList;

/**
 * A class representing a patient docket in the Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class docket {

    //public ArrayList visitlog;
    public patient Patient;

    /**
     * Initialises a docket for a patient in the Medical System
     * @param Patient
     */
    public docket(patient Patient){
        this.Patient=Patient;
    }

    /**
     * Gets a patient visit from a docket
     * @return visit
     */
    public void addVisit(visit v){
        //visitlog.add(v);
    }

    /**
     * Get a patient from the docket;
     * @return patient
     */
    public String getPatientdetials(){
        return Patient.toString();
    }

    /**
     * Print the contents of a a docket
     * @return
     */
    @Override
    public String toString(){
        return "";
   }
}
