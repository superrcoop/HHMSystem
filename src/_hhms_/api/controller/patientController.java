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
    public getPatient(){
        return Patient;
    }

    /**
     * Gets a patient docket
     * @return docket
     */
    public getDocket(){
        //implement me
    }

    /**
     * Add patient to register
     *
     */
    public addToRegister(){
        //implement me
    }

    public scheduleAppointment(){

    }
    public cancelAppointment(){

    }
    public makePayment(){

    }

}
