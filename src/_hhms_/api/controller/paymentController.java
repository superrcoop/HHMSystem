package _hhms_.api.controller;

import _hhms_.api.patient;
import _hhms_.api.payment;

/**
 * A class representing payment control in the Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class paymentController {

    private double revenue;
    private double prices;
    private double bill;
    private payment pay;
    private patient Patient;


    /**
     * Initialises payment Control system
     */
    public paymentController(payment pay){
        this.pay=pay;
    }

    /**
     * Gets patient bill
     * @return bill
     */
    public void getDocket(){
        //...
    }

    /**
     * Gets a patient
     */
    public void getPatient(){
        //...
    }

    /**
     * Initiates a new payment
     */
    public void makePayment(){
        //...
    }

    /**
     * Checks patient balance
     * @return balance
     */
    public void checkBalance(){
        //...
    }

    /**
     * Gets a patient Operation from appointments
     * @Return operations
     */
    public void getOperation() {
        //...
    }

    /**
     * Retrieve patient bill
     * @return bill
     */
    public void getBill(){
        //...
    }

    /**
     * Gets price for operations
     * @return price
     */
    public void getPrices(){
        //...
    }

    /**
     * Calculate revenue from payments
     * @return revenue
     */
    public void calc_revenue(){
        //...
    }
}

