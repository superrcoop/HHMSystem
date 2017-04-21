package _hhms_.ui;

import _hhms_.api.HHMS;
import _hhms_.api.appointment;
import _hhms_.api.visit;

import java.io.*;
import java.util.Scanner;

/**
 * A class representing appointment menu in the Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class appointmentMenu {

    public appointmentMenu(Scanner scan) throws IOException {
        //Runtime.getRuntime().exec("clear");
        System.out.println("===============================================================");
        System.out.println("====================== Appointment System ====================");
        System.out.println("==============================================================\n\n");
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
                switch (opt5) {
                    case 1:
                        System.out.println("===============Appointments======================");
                        System.out.print("Please enter the first name of the patient: ");
                        String fname = scan.next();
                        System.out.print("Please enter the last name of the patient: ");
                        String lname = scan.next();
                        System.out.print("Please enter Appointment Date: ");
                        String appDate = scan.next();
                        System.out.print("Please enter Appointment Time: ");
                        String appTime = scan.next();
                        System.out.print("Please enter Doctor's name: ");
                        String doc = scan.next();
                        System.out.println("Do you wish to save patient appointment? y or n  ");
                        if (scan.next().equalsIgnoreCase("y")) { //string compare
                            appointment App = new appointment(fname, lname, appDate, appTime, doc);
                            try {
                                File file = new File("/home/superrcoop/Documents/appointments.txt");
                                if (!file.exists()) {
                                    file.createNewFile();
                                }
                                BufferedWriter output = new BufferedWriter(new FileWriter(file));
                                output.write(App.toString());
                                output.close();
                                System.out.println("success writing..\n");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } else {
                            new appointmentMenu(scan);
                        }

                        break;
                    case 2:
                        System.out.println("=================APPOINTMENT SEARCH===========================\n ");
                        System.out.println("   Name           Date        Time      Doctor      Status\n " +
                                           "---------------------------------------------------------------");
                        BufferedReader br = null;
                        int patientRec = 1;
                        String sCurrentLine2;
                        try {
                            br = new BufferedReader(new FileReader("/home/superrcoop/Documents/appointments.txt"));
                            while ((sCurrentLine2 = br.readLine()) != null) {
                                System.out.println(patientRec + " " + sCurrentLine2);
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
                        new appointmentMenu(scan);
                        break;

                    default:
                        System.out.println("Please select a valid choice.\n");
                        new patientMenu(scan);
                        break;

                }
                new appointmentMenu(scan);
                break;
            case 2:
                System.out.println("Select an option: \n" +
                        "  1) Add patient visit\n" +
                        "  2) View patient visits\n" +
                        "  0) Go back \n");
                System.out.print("Enter option: ");
                int opt6 = scan.nextInt();
                switch (opt6) {
                    case 1:
                        System.out.println("======================Visits========================");
                        System.out.print("Pleased enter the patient ID: ");
                        String id = scan.next();
                        System.out.print("Pleased enter the first name of the patient: ");
                        String fname = scan.next();
                        System.out.print("Pleased enter the last name of the patient: ");
                        String lname = scan.next();
                        System.out.print("Please enter Patient Blood Pressure: ");
                        Double BP = scan.nextDouble();
                        System.out.print("Please enter weight: ");
                        Double w = scan.nextDouble();
                        System.out.print("Please enter height: ");
                        Double h = scan.nextDouble();
                        System.out.print("Please enter temp: ");
                        Double t = scan.nextDouble();
                        System.out.print("Please enter doc: ");
                        String doc = scan.next();
                        System.out.print("Please enter concern: ");
                        String conc = scan.next();
                        System.out.print("Please enter diagnosis: ");
                        String diagn = scan.next();
                        System.out.println("Do you wish to save? y or n ");
                        if (scan.next().equalsIgnoreCase("y")) {
                            visit visit=new visit(id,BP,w,h,t,doc,conc,diagn);
                            try {
                                File file = new File("/home/superrcoop/Documents/visits.txt");
                                if (!file.exists()) {
                                    file.createNewFile();
                                }
                                BufferedWriter output = new BufferedWriter(new FileWriter(file));
                                output.write(visit.toString());
                                output.close();
                                System.out.println("\nsuccess writing..");
                                new patientMenu(scan);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                        break;

                    case 2:
                        System.out.println("===========================VISIT SEARCH============================================\n ");
                        System.out.print(" Name          BP   W(lbs)   H(ft)   Tmp(Degrees)  Doctor      Concern    Diagnosis\n " +
                                        "------------------------------------------------------------------------------------\n");
                        BufferedReader br = null;
                        int patientRec = 1;
                        String sCurrentLine;
                        try {
                            br = new BufferedReader(new FileReader("/home/superrcoop/Documents/visits.txt"));
                            while ((sCurrentLine = br.readLine()) != null) {
                                System.out.println(patientRec + " " + sCurrentLine);
                                patientRec++;
                            }
                            System.out.println("Do you want to edit patient visit? y or n ");
                            scan.next();
                            new patientMenu(scan);
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
                        new patientMenu(scan);
                        break;
                    default:
                        new patientMenu(scan);

                }
                break;
            case 0:
                new HHMS();
                break;
            default:
                System.out.println("Please select a valid choice.\n");
                new patientMenu(scan);
                break;

        }
    }
}
