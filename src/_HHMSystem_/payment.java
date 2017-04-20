package _HHMSystem_;

/**
 * A class representing a payment in the  Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class payment {
    private double price;
    private String fname;
    private String lname;
    private String operation;
    private String date;


    public payment(String fname,String lname,String operation,String date,double price){
        this.fname=fname;
        this.lname=lname;
        this.operation=operation;
        this.date=date;
        this.price=price;
    }

    public getName(){

    }

    public getPrice(){

    }

    public getDate(){

    }

    @Override
    public String toString(){

    }
}
