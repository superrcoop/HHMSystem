package _hhms_.api;

/**
 * A class representing a payment in the  Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class payment {
    private double price;
    private String fname;
    private String lname;
    private String operation;
    private String date;
    private String bill;

    /**
     * Initialises a new pament
     * @param fname
     * @param lname
     * @param operation
     * @param date
     * @param price
     */
    public payment(Operation operation){

    }

    /**
     * Get the name of the person making the payment
     * @return name
     */

    public String getName(){
        return fname + " " +lname;
    }

    /**
     * Gets the amount of money being paid
     * @return price
     */
    public double getPrice(){
        return price;
    }

    /**
     * Sets the price of a payment
     * @param price
     */
    public void setPrice(double price){
        this.price=price;
    }

    /**
     * Gets the date of the payment
     * @return date
     */
    public String getDate(){
        return date;
    }

    /**
     * Overrides the toString method to return a string containing the payment details.
     * Used to populate the payments contained in the Hope Health medical Solutions.
     * @return payment details
     */
    @Override
    public String toString(){
        return getName() + " " + date + " " + price ;
     }
}
