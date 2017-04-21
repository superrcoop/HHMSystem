package _hhms_.api;

import _hhms_.ui.*;
import java.io.*;
import java.util.Scanner;

/**
 * Class representing UI of the Medical system
 * @author GROUP5
 * @version 0.2.1
 */
public class HHMS{

    /**
     * Initiates Medical system
     * @throws IOException
     */
    public HHMS() throws IOException {
        Scanner scan = new Scanner(System.in);
        new loginMenu(scan);

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
                new patientMenu(scan);
                break;
            case 2:
                HHMS_header();
                new appointmentMenu(scan);
                break;
            case 3:
                HHMS_header();
                new reportMenu(scan);
                break;
            case 0:
                HHMS_header();
                System.out.println("\n\t\t\tB   Y   E");
                System.exit(0);
                break;
            default:
                System.out.println("Please select a valid option.. \n\n");
                HHMS_header();
                new HHMS();
        }
    }

    public static void HHMS_header() {
        System.out.println("---------------------------------------------\n"+
                            "  Welcome to the Hope Health Medical System\n"+
                           "---------------------------------------------\n\n");
    }


    public static void main(String[] args) throws IOException {

        try{
            new HHMS();
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("\n\nBuild sucessfull..");
        }

    }

}
