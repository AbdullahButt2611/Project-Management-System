/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *This will contain the list of the header
 * @author Abdullah Butt
 * @author 2020-CS-63
 */
public class HeadData {
    
    private static HeadData instance;
    
    private List<Heads> head;
    
    /**
     * This is a constructor for the HEadData class that is going to initialize the array list
     */
    private HeadData()
    {
        head = new ArrayList<Heads>(); 
    }
    
    /**
     * This is method will only allow the declaration of the reference of this class only once 
     * @return instance that is actually the reference to the class
     */
    public static HeadData getInstance()
    {
        if(instance==null)
            instance=new HeadData();
        
        return instance;
    }
    
    /**
     * This method will add the Heads data in the list
     * @param h 
     */
    public void addHead(Heads h)
    {
        this.head.add(h);
    }
    
    /**
     * This is the method that is going to save all the data of the heads into file named "Heads"
     */
    public void saveData()
    {
        try
        {
            FileWriter fw=new FileWriter("Heads");
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("id * qualification * address * password * mark of module 1 * mark of module 2 * mark of module 3 \n");
            for(int i=0;i<head.size();i++)
            {
                bw.write(head.get(i).getID()+"*"+head.get(i).getQualification()+"*"+head.get(i).getAddress()+"*"+head.get(i).getPassword()+"*"+head.get(i).getMark1()+"*"+head.get(i).getMark2()+"*"+head.get(i).getMark3()+"\n");
               
            }
             bw.flush();
             bw.close();
             fw.close();
        }
        catch(Exception ex)
                {
                    System.out.println("Null Exception");
                }
    }
    
    /**
     * this is a method for reading data from the file of ""
     */
    public void loadData()
    {
        try
        {
            FileReader fr=new FileReader("Heads");
            BufferedReader br=new BufferedReader(fr);
            String line=br.readLine();
            line=br.readLine();
            while(line!=null)
            {
                Heads h=new Heads("","");
                String toks[]=line.split("*");
                h.setID(toks[0]);
                h.setQualification(toks[1]);
                h.setAddress(toks[2]);
                h.setPassword(toks[3]);
                h.setMarks1(toks[4]);
                h.setMarks2(toks[5]);
                h.setMarks3(toks[6]);
                HeadData.getInstance().addHead(h);
            }
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Null exception");
        }
    }

    public List<Heads> getHead() {
        return head;
    }
    
}
