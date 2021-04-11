/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author DEll
 */
public class Advisor extends Details{
    
    private String status;
    
    private String ID;
    
    /**
     * This is a constructor for the class of the Advisor. 
     * It is a parameterized constructor and it will also call the constructor for the 
     * parent class using super keyword
     * @param status String input chosen by the user using combo box
     * @param gender This is the parameter that is going to be passed as a parameters to the parent class constructor
     * @param ID String inputted by the user matching the Project ID
     */
    public Advisor(String status,String gender,String ID)
    {
        super(gender);
        this.status=status;
        this.ID=ID;
    }

    /**
     * This is a getter for the Status
     * @return String containing status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This is a getter for the ID
     * @return String containing ID
     */
    public String getID() {
        return ID;
    }
    
    
}
