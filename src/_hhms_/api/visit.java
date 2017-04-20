package _hhms_.api;

/**
 * A class representing appointment menu in the Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class visit {

    private String fname;
    private String lname;
    private Double patientBP;
    private Double weight;
    private Double height;
    private Double temp;
    private String doc;
    private String concern;
    private String diagnosis;

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
    public visit(String fname, String lname, Double patientBP, Double weight, Double height, Double temp, String doc,
                       String concern, String diagnosis){

        this.patientBP=patientBP;
        this.weight=weight;
        this.height=height;
        this.temp=temp;
        this.doc=doc;
        this.concern=concern;
        this.diagnosis=diagnosis;
    }


}
