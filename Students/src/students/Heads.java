/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;
import java.util.Random;
/**
 *This is the class which hold data related to each head of the group.
 * This is also the child class of the Detail class
 * @author Abdullah Butt
 * @author 2020-CS-63
 */
public class Heads extends Details{
    
    private String ID;
    
    private String qualification;
    
    private String address;
    
    private String password;
    
    private int mark1;
    
    private int mark2;
    
    private int mark3;
    
    /**
     * This is a constructor for the Heads class .Also note that this is a parameterized constructor
     * So one of them is going to be passed as a reference parameter for the super class constructor call
     * @param gender The parameter that is going to be passed as a parameter to call other 
     * @param qualification this is String input chosen by the user from the combo box
     */
    public Heads(String gender,String qualification)
    {
        super(gender);
        this.qualification=qualification;
        this.setID("");
    }

    
    
    /**
     * This is a getter for the ID 
     * @return String which is going to be the ID of the person acting as head
     */
    public String getID() {
        return ID;
    }

    /**
     * This is a getter for the Qualification
     * @return String which is going to be the Qualification of the person acting as head
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * This is a getter for the Address
     * @return String which is going to be the Address of the person acting as head
     */
    public String getAddress() {
        return address;
    }

    /**
     * This is a getter for the Password
     * @return String which is going to be the Password entered by the person acting as head
     */
    public String getPassword() {
        return password;
    }

    /**
     * This is a getter for the marks of the module 1
     * @return int containing marks
     */
    public int getMark1() {
        return mark1;
    }

    /**
     * This is a getter for the marks of the module 2
     * @return int containing marks
     */
    public int getMark2() {
        return mark2;
    }

    /**
     * This is a getter for the marks of the module 3
     * @return int containing marks
     */
    public int getMark3() {
        return mark3;
    }
    
    /**
     * This will generate a unique ID for each sign up to this system which will then end up being 
     * The ID of the group members
     */
    public void setID(String id)
    {
        if(id.equals(""))
        {
            String str="GR-";
            Random rand=new Random();
            int i=rand.nextInt(1001);
            str+=i;
            this.ID=str;
        }
        else
        {
            this.ID=id;
        }
        
    }
    
    /**
     * This is a setter for the address of the person that is actually the group head
     * @param address String inputted by the Student 
     * @return Boolean showing whether the String is a valid address or not
     */
    public boolean setAddress(String address)
    {
        boolean flag=false;
        int size=address.length();
        for(int i=0;i<size;i++)
        {
            if((address.charAt(i)>='A' && address.charAt(i)<='Z')||(address.charAt(i)>='a' && address.charAt(i)<='z')||(address.charAt(i)>='0' && address.charAt(i)<='9')||(address.charAt(i)==' ')||(address.charAt(i)=='.')||(address.charAt(i)=='#')||(address.charAt(i)==',')||(address.charAt(i)==';')||(address.charAt(i)=='/'))
            {
                flag=true;
            }
            else
            {
                return false;
            }
        }
        this.address=address;
        return flag;
    }
    
    /**
     * This is a setter for the address of the person that is actually the group head
     * It should be only alphanumeric
     * @param password String inputted by the Student 
     * @return Boolean showing whether the String is a valid address or not
     */
    public boolean setPassword(String password)
    {
        boolean flag=false;
        int size=password.length();
        for(int i=0;i<size;i++)
        {
            if((password.charAt(i)>='A' && password.charAt(i)<='Z')||(password.charAt(i)>='a' && password.charAt(i)<='z')||(password.charAt(i)>='0' && password.charAt(i)<='9'))
            {
                flag=true;
            }
            else
            {
                return false;
            }
        }
        this.password=password;
        return flag;
    }
    
    /**
     * This is a setter for the marks of the first module that will be entered by the committee member 
     * after evaluating the project
     * @param marks String marks inputted by the user
     * @return Boolean telling whether marks are valid or not
     */
    public boolean setMarks1(String marks)
    {
        boolean flag=false;
        int size=marks.length();
        for(int i=0;i<size;i++)
        {
            if(marks.charAt(i)>='0' && marks.charAt(i)<='9')
            {
                flag=true;
            }
            else
            {
                return false;
            }
        }
        int mark=Integer.parseInt(marks);
        if(mark>0 && mark<=25)
        {
            flag=true;
        }
        else
        {
            return false;
        }
        this.mark1=mark;
        return flag;
    }
    
    /**
     * This is a setter for the marks of the second module that will be entered by the committee member 
     * after evaluating the project
     * @param marks String marks inputted by the user
     * @return Boolean showing whether the String is a valid address or not
     */
    public boolean setMarks2(String marks)
    {
        boolean flag=false;
        int size=marks.length();
        for(int i=0;i<size;i++)
        {
            if(marks.charAt(i)>='0' && marks.charAt(i)<='9')
            {
                flag=true;
            }
            else
            {
                return false;
            }
        }
        int mark=Integer.parseInt(marks);
        if(mark>0 && mark<=25)
        {
            flag=true;
        }
        else
        {
            return false;
        }
        this.mark2=mark;
        return flag;
    }
    
    /**
     * This is a setter for the marks of the third module that will be entered by the committee member 
     * after evaluating the project
     * @param marks String marks inputted by the user
     * @return Boolean showing whether the String is a valid address or not
     */
    public boolean setMarks3(String marks)
    {
        boolean flag=false;
        int size=marks.length();
        for(int i=0;i<size;i++)
        {
            if(marks.charAt(i)>='0' && marks.charAt(i)<='9')
            {
                flag=true;
            }
            else
            {
                return false;
            }
        }
        int mark=Integer.parseInt(marks);
        if(mark>0 && mark<=50)
        {
            flag=true;
        }
        else
        {
            return false;
        }
        this.mark3=mark;
        return flag;
    }
    
    /**
     * This is a method for calculating the total marks evaluated to the project out of 100
     * @return int returning total marks given to the project work
     */
    public int getTotal()
    {
        int total=this.mark1+this.mark2+this.mark3;
        return total;
    }
    
//    used only during file reading
    public void setQualification(String qual)
    {
        this.qualification=qual;
    }
}



    
