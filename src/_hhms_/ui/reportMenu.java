package _hhms_.ui;

import _hhms_.api.HHMS;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 * A class representing report Menu in the Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class reportMenu {

    /**
     * Initialises a new reportMenu
     * @param scan
     * @throws IOException
     */
    public reportMenu(Scanner scan) throws IOException {
        //Runtime.getRuntime().exec("clear");
        System.out.println("==============================================================");
        System.out.println("========================= Report System ======================");
        System.out.println("==============================================================\n\n");
        System.out.println(
                "Select an option: \n" +
                        "  1) Generate Patient reports\n" +
                        "  2) Generating Financial reports\n" +
                        "  0) Back to Login \n"
        );
        System.out.print("Enter Option: ");
        int opt4 = scan.nextInt();
        switch (opt4) {
            case 1:
                System.out.println("==========================PATIENT VISIT REPORT=====================\n ");
                System.out.println(" Name         BP  W  H  Tmp  Doctor  Concern   Diagnosis \n " +
                                   "--------------------------------------------------------------------");
                BufferedReader br = null;
                int patientRec=1;
                String sCurrentLine;
                try {
                    br = new BufferedReader(new FileReader("/home/superrcoop/Documents/visits.txt"));
                    while ((sCurrentLine = br.readLine()) != null) {
                        System.out.println(patientRec+" "+sCurrentLine);
                        patientRec++;
                    }
                    new reportMenu(scan);
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
                new HHMS();
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
            new reportMenu(scan);

        }else if (scan.nextInt()==2){
            new HHMS();
        }

    }
}
