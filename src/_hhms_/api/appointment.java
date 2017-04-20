package _hhms_.api;

/**
 * A class representing a appointment contained in the Hope Health Medical Solution.
 * @author GROUP5
 * @version 0.2.1
 */
public class appointment {

    private String appDate;
    private String appTime;
    private String doc;
    private String visitDate;
    private String visitTime;
    private Double BloodPr;
    private Double weight;
    private Double height;
    private Double temp;
    private String concern;
    private String diagnosis;
    private String drug;
    private String drugRefill;


    /**
     * Initialises an appointment
     * @param fname
     * @param lname
     * @param
     * @param
     * @param
     * @param
     * @param
     */
    public appointment(String fname, String lname, String appDate, String appTime, String doc){

        super(fname,lname);
        this.appDate=appDate;
        this.appTime=appTime;
        this.doc=doc;

    }


    public void setApp_Time (String newAppTime){
        appTime=newAppTime;
    }

    public void setApp_date(String newAppDate){
        appDate=newAppDate;
    }


    //Appointment info
    public String getApp_Info(){

        return fname+" "+lname+"       "+appDate+"       "+appTime+"         "+doc + getApp_Status();
    }

    //Calculate Appointment status
    public String getApp_Status(){
        String[] parts = appDate.split("-");
        int part1 = Integer.parseInt(parts[0]); // Day
        int part2 = Integer.parseInt(parts[1]); // Month eg.JANUARY
        int part3 = Integer.parseInt(parts[2]); // Year
        LocalDate today = LocalDate.now(); //today's date
        LocalDate app = LocalDate.of(part3, part2, part1); //appointment date

        if (Period.between(today,app).getDays()>0){
            return Period.between(today,app).getDays()+" days remaining";
        }
        else if (Period.between(today,app).getDays()==0) {
            return "Appointment is sheduled for today at "+appTime;
        }
        else{
            return " Appointment date has passed.";
        }

    }

    public void setPrescription(String drug,String drugRefill){
        this.drug=drug;
        this.drugRefill=drugRefill;
    }

        //Results after patient visit
    public String getApp_Results(){
        return fname+" "+lname+"          "+ BloodPr+"      "+ weight+"       "+height+"        "+temp+"         "+ doc+ "     "+ concern+"      "+ diagnosis ;
    }
}
