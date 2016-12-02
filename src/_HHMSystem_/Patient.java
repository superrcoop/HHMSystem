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


public class Patient{

    // Class variables
    String fname,lname;
    int age;
    String dateOB;
    String addr;
    String phnum;
    String job;
    String nexKName,nexxPhnum;



    // This is the constructor of the class
    public Patient(String fname,String lname,String dateOB,String addr,
                   String phnum,String job,String nexKName,String nexxPhnum){
        this.fname=fname;
        this.lname=lname;
        this.dateOB=dateOB;
        this.addr=addr;
        this.phnum=phnum;
        this.job=job;
        this.nexKName=nexKName;
        this.nexxPhnum=nexxPhnum;

    }

    public Patient(String fname,String lname){
        this.fname=fname;
        this.lname=lname;

    }

    public int getAge(){

        String[] parts = dateOB.split("-");
        int part1 = Integer.parseInt(parts[0]); // Day
        int part2 = Integer.parseInt(parts[1]); // Month eg.JANUARY
        int part3 = Integer.parseInt(parts[2]); // Year
        LocalDate today = LocalDate.now(); // Today's Date
        LocalDate birthday = LocalDate.of(part3, part2, part1);
        age = Period.between(birthday, today).getYears();
        return age;
    }

    public String toString(){
        return fname + " " + lname + "     " + dateOB + "    " + getAge()+"    " +phnum + "    "+addr+"    "+ nexKName +" "+ nexxPhnum;
    }
}