package _HHMSystem_;

/**
 * Created by superrcoop on 11/28/16.
 */

import java.util.*;
import java.io.*;
/*
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
 */

class HHMSys {
    Scanner scan = new Scanner(System.in);
    HHMSys() throws IOException {
        HHMS_header();
        login();

    }

    public static void HHMS_header() {
        System.out.print("\f");
        System.out.println("=============================================================================");
        System.out.println("======================== Hope Health Medical System =========================");
        System.out.println("===========================================================================\n");
    }

    public static void login() throws IOException {
        System.out.print("1-Receptionist Login \t 2-Manager Login \n" +
                        "-------------------------------------------------------\nUser: ");
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        if (p==1){
            HHMS_header();
            System.out.println("\n\tUser: Receptionist \n" +
                    "--------------------------------------------------\n");
            menu(scan);
        }else if(p==2){
            HHMS_header();
            System.out.println("\n\tUser: Manager\n"+
                    "---------------------------------------------------\n");
            reportMenu(scan);
        }else{
            System.out.print("\nPlease select a valid user..\n");
            login();
        }
    }

    public static void menu(Scanner scan) throws IOException {
        System.out.println("Select an option: \n" +
                        "  1) Patient Database\n" +
                        "  2) Appointment System\n" +
                        "  3) Report System \n" +
                        "  0) Exit\n ");
        System.out.print("Enter option: ");
        int opt = scan.nextInt();
        switch (opt) {
            case 1:
                HHMS_header();
                patientMenu(scan);
                break;
            case 2:
                HHMS_header();
                appointmentMenu(scan);
                break;
            case 3:
                HHMS_header();
                reportMenu(scan);
                break;
            case 0:
                HHMS_header();
                System.out.println("\n\t\t\tB   Y   E");
                System.exit(0);
                break;
            default:
                System.out.println("Please select a valid option.. \n");
                HHMS_header();
                menu(scan);
        }
    }
    public static void patientMenu(Scanner scan) throws IOException {
        Runtime.getRuntime().exec("clear");
        System.out.println("========================================================");
        System.out.println("=================== Patient Database ====================");
        System.out.println("=======================================================\n\n");
        System.out.println(
                "Select an option: \n" +
                        "  1) Add Patient\n" +
                        "  2) Search patient database\n" +
                        "  0) Main Menu \n"
        );
        System.out.print("Enter Option: ");
        int opt2 = scan.nextInt();
        switch (opt2)
        {
            case 1:
                System.out.print("Pleased enter the first name of the patient: ");
                String fname=scan.next();
                System.out.print("Pleased enter the last name of the patient: ");
                String lname=scan.next();
                System.out.print("Please enter the date of birth of the patient [dd-mm-yyyy]: ");
                String dob=scan.next();
                System.out.print("Please enter the address of the patient: ");
                String address =scan.next();
                System.out.print("Please enter the phone number of the patient [000-000-0000] : ");
                String phn=scan.next();
                System.out.print("Please enter the job of the patient: ");
                String job=scan.next();
                System.out.print("Please enter the next of kin's name: ");
                String name_kin=scan.next();
                System.out.print("Please enter the next of kin's phone number [000-000-0000] : ");
                String phn_kin=scan.next();
                System.out.println(" Do you wish to save? y or n");
                if (scan.next().equalsIgnoreCase("y")){
                    Patient newPatient = new Patient(fname, lname, dob, address, phn, job, name_kin, phn_kin);

                    try {
                        File file = new File("/home/superrcoop/Documents/patients.txt");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        BufferedWriter output = new BufferedWriter(new FileWriter(file));
                        output.write(newPatient.toString());
                        output.close();
                        System.out.println("\nsuccess writing..\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;

            case 2:
                System.out.println("========================================PATIENT SEARCH=====================================================\n ");
                System.out.println("   Name               D.O.B     Age    Phone number        Address               Emergency contact\n " +
                        "--------------------------------------------------------------------------------------------------------------");
                BufferedReader br = null;
                int patientRec=1;
                String sCurrentLine;
                try {
                    br = new BufferedReader(new FileReader("/home/superrcoop/Documents/patients.txt"));
                    while ((sCurrentLine = br.readLine()) != null) {
                        System.out.println(patientRec+" "+sCurrentLine);
                        patientRec++;
                    }
                    System.out.println("Do you want to edit patient data? y or n ");
                    scan.next();

                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (br != null) br.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                break;
            case 0:
                menu(scan);
                break;
            default:
                System.out.println("Please select a valid choice.\n");
                patientMenu(scan);
        }
        menu(scan);
    }
    public static void appointmentMenu(Scanner scan) throws IOException {
        Runtime.getRuntime().exec("clear");
        System.out.println("===============================================================");
        System.out.println("====================== Appointment System ====================");
        System.out.println("===========================================================\n\n");
        System.out.println(
                "Select an option: \n" +
                        "  1) Patient appointments\n" +
                        "  2) Patient Visits\n" +
                        "  0) Main Menu \n"
        );
        System.out.print("Enter Option: ");
        int opt3 = scan.nextInt();
        switch (opt3) {
            case 1:
                System.out.println("Select an option: \n" +
                        "  1) Add appointment\n" +
                        "  2) View appointments\n" +
                        "  0) Go back \n");
                System.out.print("Enter option: ");
                int opt5 = scan.nextInt();
                switch(opt5){
                    case 1:
                        System.out.println("============================Appointments==============================");
                        System.out.print("Please enter the first name of the patient: ");
                        String fname=scan.next();
                        System.out.print("Please enter the last name of the patient: ");
                        String lname=scan.next();
                        System.out.print("Please enter Appointment Date: ");
                        String appDate=scan.next();
                        System.out.print("Please enter Appointment Time: ");
                        String appTime=scan.next();
                        System.out.print("Please enter Doctor's name: ");
                        String doc=scan.next();
                        System.out.println("Do you wish to save patient appointment? y or n  ");
                        if (scan.next().equalsIgnoreCase("y")){
                            Appointment App = new Appointment(fname, lname, appDate,appTime,doc);
                            try {
                                File file = new File("/home/superrcoop/Documents/appointments.txt");
                                if (!file.exists()) {
                                    file.createNewFile();
                                }
                                BufferedWriter output = new BufferedWriter(new FileWriter(file));
                                output.write(App.getApp_Info());
                                output.close();
                                System.out.println("success writing..\n");
                            } catch ( IOException e ) {
                                e.printStackTrace();
                            }
                        }else{
                            appointmentMenu(scan);
                        }

                        break;
                    case 2:
                        System.out.println("==========================================APPOINTMENT SEARCH========================================\n ");
                        System.out.println("   Name                   Date          Time         Doctor            Status\n " +
                                "---------------------------------------------------------------------------------------------------");
                        BufferedReader br = null;
                        int patientRec=1;
                        String sCurrentLine2;
                        try {
                            br = new BufferedReader(new FileReader("/home/superrcoop/Documents/appointments.txt"));
                            while ((sCurrentLine2 = br.readLine()) != null) {
                                System.out.println(patientRec+" "+sCurrentLine2);
                                patientRec++;
                            }
                            System.out.println("Do you want to edit patient appointment? y or n    ");
                            scan.next();
                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                if (br != null) br.close();
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                        }
                        break;
                    case 0:
                        appointmentMenu(scan);
                        break;

                    default:
                        System.out.println("Please select a valid choice.\n");
                        patientMenu(scan);
                        break;

                }
                appointmentMenu(scan);
                break;
            case 2:
                System.out.println("Select an option: \n" +
                        "  1) Add patient visit\n" +
                        "  2) View patient visits\n" +
                        "  0) Go back \n");
                System.out.print("Enter option: ");
                int opt6 = scan.nextInt();
                switch(opt6){
                    case 1:
                        System.out.println("===============================Visits===============================");
                        System.out.print("Pleased enter the first name of the patient: ");
                        String fname=scan.next();
                        System.out.print("Pleased enter the last name of the patient: ");
                        String lname=scan.next();
                        System.out.print("Please enter Patient Blood Pressure: ");
                        Double BP=scan.nextDouble();
                        System.out.print("Please enter weight: ");
                        Double w=scan.nextDouble();
                        System.out.print("Please enter height: ");
                        Double h=scan.nextDouble();
                        System.out.print("Please enter temp: ");
                        Double t=scan.nextDouble();
                        System.out.print("Please enter doc: ");
                        String doc=scan.next();
                        System.out.print("Please enter concern: ");
                        String conc=scan.nextLine();
                        System.out.print("Please enter diagnosis: ");
                        String diagn=scan.nextLine();
                        System.out.println("Do you wish to save? y or n ");
                        if (scan.next().equalsIgnoreCase("y")){
                            Appointment visit = new Appointment(fname, lname,BP,w,h,t,doc,conc,diagn);
                            try {
                                File file = new File("/home/superrcoop/Documents/visits.txt");
                                if (!file.exists()) {
                                    file.createNewFile();
                                }
                                BufferedWriter output = new BufferedWriter(new FileWriter(file));
                                output.write(visit.getApp_Results());
                                output.close();
                                System.out.println("\nsuccess writing..");
                            } catch ( IOException e ) {
                                e.printStackTrace();
                            }

                        }
                        break;

                    case 2:
                        System.out.println("====================================================VISIT SEARCH==========================================================\n ");
                        System.out.print("   Name                BP     W(lbs)     H(ft)    Tmp(Degrees)      Doctor                 Concern                     Diagnosis\n " +
                                "-------------------------------------------------------------------------------------------------------------------------------\n");
                        BufferedReader br = null;
                        int patientRec=1;
                        String sCurrentLine;
                        try {
                            br = new BufferedReader(new FileReader("/home/superrcoop/Documents/visits.txt"));
                            while ((sCurrentLine = br.readLine()) != null) {
                                System.out.println(patientRec+" "+sCurrentLine);
                                patientRec++;
                            }
                            System.out.println("Do you want to edit patient visit? y or n ");
                            scan.next();
                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                if (br != null) br.close();
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                        }
                        break;
                    case 0:
                        patientMenu(scan);
                        break;
                    default:
                        patientMenu(scan);

                }
                break;
            case 0:
                menu(scan);
                break;
            default:
                System.out.println("Please select a valid choice.\n");
                patientMenu(scan);
                break;
        }
        menu(scan);
    }

    public static void reportMenu(Scanner scan) throws  IOException{
        Runtime.getRuntime().exec("clear");
        System.out.println("==============================================================");
        System.out.println("========================= Report System =======================");
        System.out.println("===============================================================\n\n");
        System.out.println(
                "Select an option: \n" +
                        "  1) Patient reports\n" +
                        "  2) Financial reports\n" +
                        "  0) Back to Login \n"
        );
        System.out.print("Enter Option: ");
        int opt4 = scan.nextInt();
        switch (opt4) {
            case 1:
                System.out.println("=====================================================PATIENT VISIT REPORT=======================================================\n ");
                System.out.println("   Name                     BP      W      H      Tmp     Doctor               Concern                   Diagnosis \n " +
                                "---------------------------------------------------------------------------------------------------------------------------------");
                BufferedReader br = null;
                int patientRec=1;
                String sCurrentLine;
                try {
                    br = new BufferedReader(new FileReader("/home/superrcoop/Documents/visits.txt"));
                    while ((sCurrentLine = br.readLine()) != null) {
                        System.out.println(patientRec+" "+sCurrentLine);
                        patientRec++;
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (br != null) br.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                break;
            case 2:
                System.out.print("\n\t\t\tThere are no financial reports\n\n");
                break;
            case 0:
                login();
                break;
            default:
                System.out.println("Please select a valid choice.\n");
                break;
        }
        System.out.print("Select: \n" +
                        "1. Go Back to menu\n" +
                        "2. Exit. \n" +
                        "Option: ");
        if (scan.nextInt()==1){
            reportMenu(scan);

        }else if (scan.nextInt()==2){
            login();
        }

    }


}
public class HHMS {
    public static void main(String[] args) throws IOException{
        new HHMSys();
    }

}