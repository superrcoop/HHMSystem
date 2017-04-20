package _hhms_.ui;

import java.io.IOException;
import java.util.Scanner;

import _hhms_.api.HHMS;
import static _hhms_.api.HHMS.HHMS_header;

/**
 * A class representing login Menu in the Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class loginMenu{

    /**
     * Initialises a login menu for the Hope Health medical system
     * @param scan
     * @throws IOException
     */
    public loginMenu(Scanner scan) throws IOException{
        //clear screen
        HHMS_header();
        System.out.print("1-Receptionist Login \t 2-Manager Login \n" +
                "-------------------------------------------------------\nUser: ");
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        if (p==1){
            HHMS_header();
            System.out.println("\n\tUser: Receptionist \n" +
                    "--------------------------------------------------\n");
            new HHMS(scan);
        }else if(p==2){
            HHMS_header();
            System.out.println("\n\tUser: Manager\n"+
                    "---------------------------------------------------\n");
            new reportMenu(scan);
        }else{
            System.out.print("\nPlease select a valid user..\n");
            new loginMenu(scan);
        }
    }
}
