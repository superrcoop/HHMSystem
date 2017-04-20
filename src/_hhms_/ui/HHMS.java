package _hhms_.api;

import java.io.*;
import java.util.Scanner;

/**
 * Class representing UI of the Medical system
 * @author GROUP5
 * @version 0.2.1
 */
public class HHMSystem {
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
        Runtime.getRuntime().exec("clear"); //clear screen
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
                    patient newPatient = new patient(fname, lname, dob, address, phn, job, name_kin, phn_kin);//new patient object

                    try {
                        File file = new File("/home/superrcoop/Documents/patients.txt");//create new file object
                        if (!file.exists()) {
                            file.createNewFile();//create new file if files doesnt exist
                        }
                        BufferedWriter output = new BufferedWriter(new FileWriter(file));
                        output.write(newPatient.toString()); //write to existing file
                        output.close();//close bufferedwriter
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
                    br = new BufferedReader(new FileReader("/home/superrcoop/Documents/patients.txt")); //Search for file
                    while ((sCurrentLine = br.readLine()) != null) {       //read from file
                        System.out.println(patientRec+" "+sCurrentLine); //Output patient info
                        patientRec++;
                    }
                    System.out.println("Do you want to edit patient data? y or n ");
                    scan.next();

                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (br != null) br.close(); //close bufferedwriter
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
                        if (scan.next().equalsIgnoreCase("y")){ //string compare
                            appointment App = new appointment(fname, lname, appDate,appTime,doc);
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
                            appointment visit = new appointment(fname, lname,BP,w,h,t,doc,conc,diagn);
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

}

public class HHMS {
    public static void main(String[] args) throws IOException{
        new HHMSystem();
    }

}