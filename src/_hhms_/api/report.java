package _hhms_;

/**
 * A class representing a report Gerneration in the medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class report {

    private String nameOfReport;
    private String dateOfReport;
    private int revenueCollected;


    /**
     *Initialises a new report
     * @param name
     * @param date
     */
    public report(String name, String date){
        this.nameOfReport = name;
        this.dateOfReport = date;
    }

    /**
     * Gets report name
     * @return name of report
     */
    public String getName()
    {
        return nameOfReport;
    }

    /**
     * Gets report date
     * @return date of report
     */
    public String getDate ()
    {
        return dateOfReport;
    }

    /**
     * Gets the revenue
     * @return revenue
     */
    public int getRevenue()
    {
        return revenueCollected;
    }

    /**
     * Creates a report and write to a file
     */
    public createReport(){
        //implement me
    }

    @Override
    public String toString(){
        return nameOfReport+ "      " + dateOfReport+"     " + revenueCollected ;
    }
}
