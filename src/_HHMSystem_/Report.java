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

public class Report {
    // Class variables
    private String nameOfReport;
    private String dateOfReport;
    private int revenueCollected;


    // This is the constructor of the class
    public Report (String name, String date, int revenue)
    {
        nameOfReport = name;
        dateOfReport = date;
        revenueCollected = revenue;
    }

    public String getName()
    {
        return nameOfReport;
    }

    public String getDate ()
    {
        return dateOfReport;
    }

    public int getRevenue()
    {
        return revenueCollected;
    }

    public String toString(){
        return nameOfReport+ " " + dateOfReport+" " + revenueCollected ;
    }
}
