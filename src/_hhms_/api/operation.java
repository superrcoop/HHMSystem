package _hhms_.api;

/**
 * A class representing Operations in the Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class operation {

    private double price;
    private String fname;
    private String lname;
    private String operation;
    private String date;
    private String bill;

    public final static double checkup=3000.00;
    public final static double op1=3000.00;
    public final static double op2=3000.00;
    public final static double op3=3000.00;
    public final static double op4=3000.00;
    public final static double op5=3000.00;
    public final static double op6=3000.00;
    public final static double op7=3000.00;

    /**
     * Initialises a new operation for a patient in the
     * @param fname
     * @param lname
     * @param operation
     * @param date
     */
    public operation(String fname,String lname,String operation,String date){
        this.fname=fname;
        this.lname=lname;
        this.operation=operation;
        this.date=date;
    }

    /**
     * Gets a the operations for a patient
     * @return operation
     */
    public String getOperation(){ return operation;}

    /**
     * Sets the operation Status for a patient
     */
    public void setOperation(){
        //...
    }

    /**
     * Gets all operation
     * @return all operations
     */
    public void getAllOperations(){
        //...
    }

}

