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
public class Students extends Details{
    
    private String city;
    
    private String qualification;
    
    /**
     * This is a constructor for the class of the Students 
     * This is a parameterized constructor from which one is going to be the parameter for the
     * parent class constructor
     * @param gender Parameter for super class
     * @param qualification String showing the qualification of the student
     */
    public Students(String gender, String qualification)
    {
        super(gender);
        this.qualification=qualification;
    }

    /**
     * This is a getter for the city in which the student resides
     * @return String containing the name of the city
     */
    public String getCity() {
        return city;
    }

    /**
     * This is a getter for the qualification of the student
     * @return String containing the qualification of the student
     */
    public String getQualification() {
        return qualification;
    }
    
    /**
     * This is a setter for the city of the student where he resides
     * @param city String inputted by the student
     * @return Boolean telling whether the string is a valid City name or not
     */
    public boolean setCity(String city)
    {
        boolean flag=false;
        int size=city.length();
        for(int i=0;i<size;i++)
        {
            if((city.charAt(i)>='A' && city.charAt(i)<='Z')||(city.charAt(i)>='a' && city.charAt(i)<='z')||(city.charAt(i)==' '))
            {
                flag=true;
            }
            else
            {
                return false;
            }
        }
        this.city=city;
        return flag;
    }
    
//    for file handling
    public void setQualification(String qu)
    {
        this.qualification=qu;
    }

    
}
