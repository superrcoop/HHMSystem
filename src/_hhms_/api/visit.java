package _hhms_.api;

/**
 * A class representing appointment menu in the Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class visit {
    private String patientId;
    private Double patientBP;
    private Double weight;
    private Double height;
    private Double temp;
    private String doc;
    private String comments;
    private String operation;
    private String medicalCon;
    private String Prescription;

    /**
     * Initialises a patient visit in the Medical system
     * @param patientBP
     * @param weight
     * @param height
     * @param temp
     * @param doc
     * @param medicalCon
     * @param operation
     */
    public visit(String patientId, Double patientBP, Double weight, Double height, Double temp, String doc,
                       String medicalCon, String operation){
        this.patientBP=patientBP;
        this.weight=weight;
        this.height=height;
        this.temp=temp;
        this.doc=doc;
        this.comments=comments;
        this.patientId=patientId;
        this.medicalCon=medicalCon;
        this.operation=operation;
    }

    /**
     * Initialises a visit with basic details in the Medical System
     * @param patientId
     * @param doc
     * @param medicalCon
     * @param operation
     */
    public visit(String patientId, String doc,
                 String medicalCon, String operation){
        this.patientId=patientId;
        this.operation=operation;
        this.medicalCon=medicalCon;
        this.doc=doc;
    }

    /**
     * Sets a patient prescription
     */
    public void setPrescription(){
        //...
    }

    /**
     *Get prescription details
     * @param Prescription
     */
    public void getPrescription(prescription Prescription){
        this.Prescription=Prescription.toString();
    }

    /**
     * Sets a patient Bloodpressure
     */
    public void setPatientBP(){
        //...
    }

    /**
     * Sets a patient weight
     */
    public void setWeight(){
        //...
    }

    /**
     * Sets a patient height
     */
    public void setHeight(){
        //...
    }

    /**
     * Sets a patient temp
     */
    public void setTemp(){
        //...
    }

    /**
     * Get doctor
     * @return doctor
     */
    public String getDoc(){
        return doc;
    }

    /**
     * Set patient Doctor
     */
    public void setDoc(String doc){
        this.doc=doc;
    }

    /**
     * Get a patient operation
     */
    public String getOperation(){
        return operation;
    }

    /**
     * Add operation to visit
     * @param operation
     */
    public void addOperation(String operation){
        //...
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
            //convert all variables to String
        return patientId+"\t\t"+patientBP+"\t\t"+weight+"\t\t"+height+"\t\t"+temp+"\t\t"+doc+"\t\t"+medicalCon+"\t\t"+operation;
    }
}
