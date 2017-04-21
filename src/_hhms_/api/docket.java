package _hhms_.api;
import _hhms_.api.patient;
import _hhms_.api.visit;

/**
 * A class representing a patient docket in the Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class docket {

    public ArrayList visitlog;
    public patient Patient;
    

    /**
     * Initialises a docket for a patient in the Medical System
     * @param Patient
     * @param Visit
     */
    public docket(patient Patient){
        this.Patient=Patient;
        ArrayList<Visit> visitlog = new ArrayList<Visit> ();
    }

    /**
     * Gets a patient visit from a docket
     * @return visit
     */
    
    public void(Visit v){
        visitlog.add(v);
    }

    /**
     * Get a patient from the docket;
     * @return patient
     */
    public patient getPatientdetials(){
        return Patient.toString();
    }
    
   public String toString(){
        for (Visit obj:visitlog){
             System.out.println(obj);
        }
   }
}
