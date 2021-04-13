/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 * This is class for the details that are going to be the same 
 * Which means they are going to be the parent class
 * @author Abdullah Butt
 * @author 2020-CS-63
 */
public class Details {
    
    protected String name;
    
    protected String contact;
    
    protected String CNIC;
    
    protected String email;
    
    protected String gender;
    
    /**
     * This is a constructor for the Details class which is going to be the parent class in this 
     * application and its a parameterized constructor
     * @param gender  String input chosen by the user through radio buttons 
     */
    public Details(String gender)
    {
        this.gender=gender;
    }

    /**
     * This is getter for the name
     * @return String which will be a name
     */
    public String getName() {
        return name;
    }

    /**
     * This is getter for the contact
     * @return String which will be a phone number
     */
    public String getContact() {
        return contact;
    }

    /**
     * This is getter for the CNIC
     * @return String which will be a CNIC
     */
    public String getCNIC() {
        return CNIC;
    }

    /**
     * This is getter for the email
     * @return String which will be a email
     */
    public String getEmail() {
        return email;
    }

    /**
     * This is getter for the gender
     * @return String which will be a gender
     */
    public String getGender() {
        return gender;
    }
    
    /**
     * This is a setter for the name of the person.
     * It will input the name of the person and then validate it if the  name
     * is valid only then it sets its value
     * @param name String inputted by the user
     * @return Boolean which shows whether the name is valid or not
     */
    public boolean setName(String name)
    {
        boolean flag=false;
        int size=name.length();
        for(int i=0;i<size;i++)
        {
            if((name.charAt(i)>='A' && name.charAt(i)<='Z')||(name.charAt(i)>='a' && name.charAt(i)<='z')||(name.charAt(i)>=' '))
            {
                flag=true;
            }
            else
            {
                return false;
            }
        }
        this.name=name;
        return flag;
    }
    
    /**
     * This is a setter for the contact number of the person .
     * It first validate the number inputted by the person that it contains only
     * digits and after validation it sets the value
     * @param contact String input from the user containing the digits
     * @return Boolean which shows whether the contact is valid or not
     */
    public boolean setContact(String contact)
    {
        boolean flag=false;
        int size=contact.length();
        if(size!=11)
            return false;
        for(int i=0;i<size;i++)
        {
            if(contact.charAt(i)>='0' && contact.charAt(i)<='9')
            {
                flag=true;
            }
            else
            {
                return false;
            }
        }
        this.contact=contact;
        return flag;
    }
    
    /**
     * This is a setter for the CNICof the person
     * It will first validate that the cnic is completely digit based and after the vlaidatio
     * it will set the value of the attributed to the inputted string
     * @param cnic This will be the String inputted from the user.
     * @return Boolean which shows whether the input is valid or not
     */
    public boolean setCnic(String cnic)
    {
        boolean flag=false;
        int size=cnic.length();
        if(size!=13)
        {
            return false;
        }
        for(int i=0;i<size;i++)
        {
            if(cnic.charAt(i)<='0' && cnic.charAt(i)<='9')
            {
                flag=true;
            }
            else
            {
                return false;
            }
        }
        this.CNIC=cnic;
        return flag;
    }
          
    /**
     * This is a setter for the Email of the person.
     * It will first validate it the sets the prime value to its attribute
     * @param email String inputted from the user
     * @return Boolean telling its valid or not
     */
    public boolean setEmail(String email)
    {
        String remain="";
        int size=email.length();
        boolean flag=false;
        int i=0;
        while(i<size && email.charAt(i)!='@')
        {
            if((email.charAt(i)>='A' && email.charAt(i)<='Z')||(email.charAt(i)>='a' && email.charAt(i)<='z')||(email.charAt(i)>='0' && email.charAt(i)<='9'))
            {
                flag=true;
                i++;
            }
            else
            {
                return false;
            }
        }
        if(i<size-1)
            i++;
        while(i<size) 
        {
            remain+=email.charAt(i);
        }
        if(remain=="student.uet.edu.pk")
        {
            flag=true;
        }
        else if(remain=="gmail.com")
        {
            flag=true;
        }
        else
        {
            return false;
        }
        this.email=email;
        return flag;
    }
    
    public String toString()
    {
        String str="";
        str+=this.CNIC+","+this.contact+","+this.email+","+this.gender+","+this.name+"\n";
       return str;
    }
    
//    only for file handling
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    
    
}
