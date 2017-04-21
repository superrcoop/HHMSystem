package _hhms_.api;

/**
 * A class representing a patient contained in the Hope Health Medical Solution.
 * @author GROUP5
 * @version 0.2.1
 */
public class bill {

    private double bill;
    /**
     * Initialises a new bill
     * @param Operation
     */
    public bill(operation Operation){
        // ...
    }

    /**
     * Calculate medical bill
     * @return bill
     */
    public void calclateBill(){
        //implement me
    }

    /**
     * Overrides the toString method to return a string containing the bill details.
     * Used to populate the appointments contained in the Hope Health medical Solutions.
     * @return bill details
     */
    @Override
    public String toString(){
        // convert double to string
        return "";
    }
}
