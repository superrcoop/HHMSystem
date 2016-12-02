package _HHMSystem_;

/**
 * Created by superrcoop on 11/28/16.
 */

import java.io.*;
import java.time.*;
/*
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
*/

public class Appointment extends Patient {

    String appDate,appTime;
    String doc;
    String visitDate,visitTime;
    Double BloodPr,weight,height,temp;
    String concern,diagnosis;
    String drug,drugRefill;


    // This is the constructor of the class
    public Appointment(String fname,String lname,String appDate,String appTime,String doc){

        super(fname,lname);
        this.appDate=appDate;
        this.appTime=appTime;
        this.doc=doc;

    }

    public Appointment(String fname,String lname,Double patientBP,Double weight,Double height,Double temp,String doc,
                                  String concern,String diagnosis){

        super(fname,lname);
        this.BloodPr=patientBP;
        this.weight=weight;
        this.height=height;
        this.temp=temp;
        this.doc=doc;
        this.concern=concern;
        this.diagnosis=diagnosis;
    }

    public void setApp_Time (String newAppTime){
        appTime=newAppTime;
    }

    public void setApp_date(String newAppDate){
        appDate=newAppDate;
    }

    public String getApp_Info(){

        return fname+" "+lname+"       "+appDate+"       "+appTime+"         "+doc + getApp_Status();
    }

    public String getApp_Status(){
        String[] parts = appDate.split("-");
        int part1 = Integer.parseInt(parts[0]); // Day
        int part2 = Integer.parseInt(parts[1]); // Month eg.JANUARY
        int part3 = Integer.parseInt(parts[2]); // Year
        LocalDate today = LocalDate.now(); //today's date
        LocalDate app = LocalDate.of(part3, part2, part1); //appointment date

        if (Period.between(today,app).getDays()>0){
            return Period.between(today,app).getDays()+" days remaining";
        }
        else if (Period.between(today,app).getDays()==0) {
            return "Appointment is sheduled for today at "+appTime;
        }
        else{
            return " Appointment date has passed.";
        }

    }

    public void setPrescription(String drug,String drugRefill){
        this.drug=drug;
        this.drugRefill=drugRefill;
    }

    public String getApp_Results(){
        return fname+" "+lname+"          "+ BloodPr+"      "+ weight+"       "+height+"        "+temp+"         "+ doc+ "     "+ concern+"      "+ diagnosis ;
    }
}
