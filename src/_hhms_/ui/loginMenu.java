package _hhms_.ui;

import java.io.IOException;
import java.util.Scanner;

import _hhms_.api.HHMS;
import _hhms_.api.user.manager;
import _hhms_.api.user.receptionist;
import _hhms_.api.user.user;

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
        //Runtime.getRuntime().exec("cls");
        HHMS_header();
        user usr=new user();
        receptionist recep=new receptionist();
        manager man=new manager();
        System.out.print("-------\n"+
                         "User:");
        String in=scan.nextLine();
        if (in.equalsIgnoreCase(recep.username)){
            System.out.println("Password:");
            in =scan.next();

            System.out.println("\n\tUser: Receptionist \n" +
                               "---------------------------\n");

        }else if(in.equalsIgnoreCase(man.username)){
            System.out.println("Password:");
            in =scan.next();
            HHMS_header();
            System.out.println("-------------------------" +
                               "User: Manager\n"+
                               "-------------------------\n");
            new reportMenu(scan);
        }else{
            System.out.print("\nPlease select a valid user..\n");
            new loginMenu(scan);
        }
    }
}
