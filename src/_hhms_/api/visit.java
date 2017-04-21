package _hhms_.api;

/**
 * A class representing appointment menu in the Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class visit {
    private String patientid;
    private Double patientBP;
    private Double weight;
    private Double height;
    private Double temp;
    private String doc;
    private String concern;
    private String diagnosis;
    private Prescription prescription;

    /**
     * Initialises a patient visit in the Medical system
     * @param fname
     * @param lname
     * @param patientBP
     * @param weight
     * @param height
     * @param temp
     * @param doc
     * @param concern
     * @param diagnosis
     */
    public visit(String patientid, Double patientBP, Double weight, Double height, Double temp, String doc,
                       String concern, String diagnosis,Prescription prescriptionid){
        this.patientBP=patientBP;
        this.weight=weight;
        this.height=height;
        this.temp=temp;
        this.doc=doc;
        this.concern=concern;
        this.diagnosis=diagnosis;
        this.prescription=prescription;
    }
    
    public String toString(){
        return patientid+" "+patientBP+" "+weight+" "+height+" "+temp+" "+doc" "+concern+" "+diagnosis+" "+prescription.toString();
    }  

}
