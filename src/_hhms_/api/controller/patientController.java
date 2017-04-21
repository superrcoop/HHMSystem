package _hhms_.api.controller;

import _hhms_.api.patient;

/**
 * A class representing patient controll in the Medical system.
 * @author GROUP5
 * @version 0.2.1
 */

public class patientController {

        private patient Patient;

    /**
     * Initialises patient controll in the Medical System
     * @param Patient
     */
    public patientController(patient Patient){
        this.Patient=Patient;
    }

    /**
     * Get a patient
     * @return patient
     */
    public patient getPatient(){
        return Patient;
    }

    /**
     * Gets a patient docket
     * @return docket
     */
    public void getDocket(){
        //...
    }

    /**
     * Add patient to register
     *
     */
    public void addToRegister(){
        //...
    }

    /**
     * Schedules an appointment for a patient
     */
    public void scheduleAppointment(){
        //...
    }

    /**
     * Cancel an appointment
     */
    public void cancelAppointment(){
        //...
    }

    /**
     * Initiates a new payment
     */
    public void makePayment(){
        //...
    }

}
