/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;
import java.util.*;
/**
 *This is the class that holds data related group members
 * @author Abdullah Butt
 * @author 2020-CS-63
 */
public class Members {
    
    private static Members instance;
    
    private List<Students> stu;
    
    private String ID;
    
    private String ProId;
    
    /**
     * This is a constructor for the class of Members
     * It is kept private in order to implement the Singleton method
     */
    private Members()
    {
        stu=new ArrayList<Students>();
    }
    
    /**
     * MEthod for the implementation of the singleton mode
     * @return Members which is the reference to this class
     */
    public static Members getInstance()
    {
        if(instance==null)
            instance=new Members();
        
        return instance;
    }
    
    /**
     * This is a setter in case of file handling
     * @param id String read from the file
     */
    public void setID(String id)
    {
        this.ID=id;
    }
    
    /**
     * This is a setter for the id based on the index of the list of the head member
     * @param index int which indicates the index in the list that the head resides
     */
    public void setID(int index)
    {
        List<Heads> hd=HeadData.getInstance().getHead();
        this.ID=hd.get(index).getID();
    }
    
    /**
     * This is a setter for the Project id that the students choose
     * @param id String inputted by students
     */
    public void setProId(String id)
    {
        this.ProId=id;
    }

    /**
     * This is a getter for the list of the students
     * @return List of students
     */
    public List<Students> getStu() {
        return stu;
    }

    /**
     * this is a getter for the ID of the Group which is actually inherited from the head member
     * @return String containing id
     */
    public String getID() {
        return ID;
    }

    /**
     * this is a getter for the ID of the Project chosen which is actually inputted from the head member
     * @return String containing the id of the project
     */
    public String getProId() {
        return ProId;
    }
    
}
