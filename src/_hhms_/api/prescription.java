package _hhms_.api;
import java.util.*;


/**
 * A class representing a prescription in the  Medical system.
 * @author GROUP5
 * @version 0.2.1
 */
public class prescription{

  private ArrayList prescriptionlist;
  private  String id;
  private String DRUG;

  /**
   * Initialises a new prescription issued in the system
   * @param Patient
   */
  public prescription(patient Patient){
  this.id=Patient.getpatientID();
  ArrayList<String> prescriptionlist = new ArrayList <String> ();
  }

  /**
   * Adds a drug to the list
   * @param Drug
   */
  public void addDrug(String Drug){
  prescriptionlist.add(Drug);
}


  /**
   * Overrides the toString method to return a string containing the payment details.
   * Used to populate the payments contained in the Hope Health medical Solutions.
   * @return payment details
   */
  @Override
  public String toString(){
      //arrayList to string
    return "";
  }

}
