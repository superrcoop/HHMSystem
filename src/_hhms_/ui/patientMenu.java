package _hhms_.ui;

import _hhms_.api.HHMS;
import _hhms_.api.patient;
import java.io.*;
import java.util.Scanner;


/**
 * A class representing patient Menu in the Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class patientMenu {

    /**
     * Initialises a patient Menu
     * @param scan
     * @throws IOException
     */
    public patientMenu(Scanner scan) throws IOException {
        //Runtime.getRuntime().exec("clear"); //clear screen
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
        switch (opt2) {
            case 1:
                System.out.print("Pleased enter the first name of the patient: ");
                String fname = scan.next();
                System.out.print("Pleased enter the last name of the patient: ");
                String lname = scan.next();
                System.out.print("Please enter the date of birth of the patient [dd-mm-yyyy]: ");
                String dob = scan.next();
                System.out.print("Please enter the address of the patient: ");
                String address = scan.next();
                System.out.print("Please enter the phone number of the patient [000-000-0000] : ");
                String phn = scan.next();
                System.out.print("Please enter the job of the patient: ");
                String job = scan.next();
                System.out.print("Please enter the next of kin's name: ");
                String name_kin = scan.next();
                System.out.print("Please enter the next of kin's phone number [000-000-0000] : ");
                String phn_kin = scan.next();
                System.out.println(" Do you wish to save? y or n");
                if (scan.next().equalsIgnoreCase("y")) {
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
                int patientRec = 1;
                String sCurrentLine;
                try {
                    br = new BufferedReader(new FileReader("/home/superrcoop/Documents/patients.txt")); //Search for file
                    while ((sCurrentLine = br.readLine()) != null) {       //read from file
                        System.out.println(patientRec + " " + sCurrentLine); //Output patient info
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
                new HHMS(scan);
                break;
            default:
                System.out.println("Please select a valid choice.\n");
                new patientMenu(scan);
        }

    }
}
