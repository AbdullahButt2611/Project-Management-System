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
 *This is the driver class or main class of the application
 * @author Abdullah Butt
 * @author 2020-CS-63
 */
public class Driver {
    private static Driver instance;
    
    private List<Project> pro;
    
    private List<Advisor> ad;
    
    private List<Members> mem;
    
    /**
     * This is the constructor of the Driver class but its is private for the implementation of the Singleton method
     */
    private Driver()
    {
        pro=new ArrayList<Project>();
        ad=new ArrayList<Advisor>();
        mem=new ArrayList<Members>();
    }

    /**
     * This is a getter for the project List
     * @return List of projects
     */
    public List<Project> getPro() {
        return pro;
    }

    /**
     * This is a getter for the advisor List
     * @return List of advisor
     */
    public List<Advisor> getAd() {
        return ad;
    }

    /**
     * This is a getter for the member's List
     * @return List of members
     */
    public List<Members> getMem() {
        return mem;
    }
    
    /**
     * Method to implement the Singleton method
     * @return 
     */
    public static Driver getInstance()
    {
        if(instance==null)
            instance=new Driver();
        
        return instance;
    }
    
    /**
     * This method will simply add the advisor details in the list
     * @param ad Object of the class indicating the data
     */
    public void addAd(Advisor ad)
    {
        Driver.getInstance().ad.add(ad);
    }
    
    /**
     * This method will simply add the members details in the list
     * @param m Object of the class indicating the data
     */
    public void addMem(Members m)
    {
        Driver.getInstance().mem.add(m);
    }
    
    /**
     * This method will simply add the projects in the list
     * @param p 
     */
    public void addPro(Project p)
    {
        Driver.getInstance().pro.add(p);
    }
    
    /**
     * This is a method to save data of advisors in file
     */
    public void saveAdData()
    {
        try
        {
            FileWriter fw=new FileWriter("Advisors");
            BufferedWriter br=new BufferedWriter(fw);
            br.write("name , contact , cnic, email , gender, status , id \n");
            for(int i =0;i<this.ad.size();i++)
            {
                br.write(ad.get(i).getName()+","+ad.get(i).getContact()+","+ad.get(i).getCNIC()+","+ad.get(i).getEmail()+","+ad.get(i).getGender()+","+ad.get(i).getStatus()+","+ad.get(i).getID()+"\n");
            }
            br.flush();
            br.close();
            fw.close();
            
        }
        catch(Exception ex)
        {
            System.out.println("Null identified");
        }
                
    }
    
    /**
     * This is a method for reading the data from the file for Advisor class
     */
    public void readAdData()
    {
        try
        {
            FileReader fr=new FileReader("Advisors");
            BufferedReader br=new BufferedReader(fr);
            String line=br.readLine();
            line=br.readLine();
            while(line!=null)
            {
                Advisor a=new Advisor("","","");
                String toks[]=line.split(",");
                a.setName(toks[0]);
                a.setContact(toks[1]);
                a.setCnic(toks[2]);
                a.setEmail(toks[3]);
                a.setGender(toks[4]);
                a.setStatus(toks[5]);
                a.setId(toks[6]);
                line=br.readLine();
            }
            
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Null identified");
        }
    }
    
    /**
     * This is a method that will write data of group members into file
     */
    public void saveMemData()
    {
        try
        {
            FileWriter fw=new FileWriter("Members");
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("ID/Name,Contact,CNIC,Email,Gender,City,Qualification/ \n");
            for(int i=0;i<mem.size();i++)
            {
                bw.write(mem.get(i).getID()+"/");
                for(int j=0;j<Driver.getInstance().mem.get(i).getStu().size();j++)
                {
                    bw.write(mem.get(i).getStu().get(j).getName()+","+mem.get(i).getStu().get(j).getContact()+","+mem.get(i).getStu().get(j).getCNIC()+","+mem.get(i).getStu().get(j).getEmail()+","+mem.get(i).getStu().get(j).getGender()+","+mem.get(i).getStu().get(j).getCity()+","+mem.get(i).getStu().get(j).getQualification()+"/");
                }
                bw.write("\n");
                    
            }
            bw.flush();
            bw.close();
            fw.close();
        }
        catch(Exception ex)
        {
            System.out.println("Null identified");
        }
    }
    
    public void readMemData()
    {
        try
        {
            FileReader fr=new FileReader("Members");
            BufferedReader br=new BufferedReader(fr);
            String line=br.readLine();
            line=br.readLine();
//            System.out.println("1 read");
            while(line!=null)
            {
//                System.out.println("2 read");
                String toks[]=line.split("/");
//                System.out.println(toks.length);
                Students st=new Students("","");
                Members.getInstance().setID(toks[0]);
                for(int i=1;i<((toks.length));i++)
                {
//                    System.out.println("3 read");
                    String str=toks[i];
                    String token[]=str.split(",");
                    st.setName(token[0]);
                    st.setContact(token[1]);
                    st.setCnic(token[2]);
                    st.setEmail(token[3]);
                    st.setGender(token[4]);
                    st.setCity(token[5]);
                    st.setQualification(token[6]);
                    Members.getInstance().getStu().add(st);
                    
                }
                Driver.getInstance().getMem().add(Members.getInstance());
                line=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Null identified");
        }
    }
    
    /**
     * This is a method for writing data into the file of "Projects"
     */
    public void saveProData()
    {
        try
        {
            FileWriter fw=new FileWriter("Projects");
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("ID * Title * Type * Description \n");
            for(int i=0;i<this.pro.size();i++)
            {
                bw.write(pro.get(i).getId()+"*"+pro.get(i).getTitle()+"*"+pro.get(i).getType()+"*"+pro.get(i).getDescription()+"\n");
            }
            bw.flush();
            bw.close();
            fw.close();
        }
        catch(Exception ex)
        {
            System.out.println("Null identified");
        }
        
    }
    
    /**
     * This is a method for reading data from file of "Projects".
     */
    public void readProData()
    {
        try
        {
            FileReader fr=new FileReader("Projects");
            BufferedReader br=new BufferedReader(fr);
            String line=br.readLine();
            line=br.readLine();
            while(line!=null)
            {
                Project p=new Project();
                String toks[]=line.split("*");
                p.setId(toks[0]);
                p.setTitle(toks[1]);
                p.setType(toks[2]);
                p.setDescription(toks[3]);
                Driver.getInstance().addPro(p);
                line=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Null identified");
        }
    }
    
    /**
     * This method will help in deleting the project completely
     * @param id String unique id which will help us in searching the project
     * @return Boolean Telling whether the project has been deleted or not
     */
    public boolean delProjects(String id)
    {
        boolean flag=false;
        for(int i=0;i<pro.size();i++)
        {
            if(id.equals(Driver.getInstance().pro.get(i).getId()))
            {
                Driver.getInstance().pro.remove(i);
                return true;
            }
            else
            {
                flag=false;
            }
        }
        return flag;
    }
    
    /**
     * This method will help us in deleting the group member
     * @param id String to compare that which group's member needs to be deleted
     * @param index index of the person in the list whose data is to be removed 
     * @return Boolean telling whether the data has been removed or not
     */
    public boolean delMembers(String id,int index)
    {
        boolean flag=false;
        for(int i=0;i<mem.size();i++)
        {
            if(Driver.getInstance().mem.get(i).getID().equals(id))
            {
                Driver.getInstance().mem.get(i).getStu().remove(index);
                return true;
            }
            else
            {
                flag=false;
            }
        }
        return flag;
    }
    
    /**
     * This method will help us deleting the project's data
     * @param id unique id that has to be matched
     * @param name String name that has to be matched
     * @return Boolean showing whether the data has been deleted or not
     */
    public boolean delAdvisor(String id,String name)
    {
        boolean flag=false;
        for(int i=0;i<ad.size();i++)
        {
            if(ad.get(i).getName().equals(name) && ad.get(i).getID().equals(id))
            {
                Driver.getInstance().ad.remove(i);
                return true;
            }
            else
            {
                flag=false;
            }
        }
        return flag;
    }
    
    public static void main(String[] args)
    {
       /* Driver.getInstance().readAdData();
        System.out.println("No 1");
        Driver.getInstance().readProData();
        System.out.println("No 2");
        Driver.getInstance().readMemData();
        System.out.println("No 3");
        HeadData.getInstance().loadData();
        System.out.println("No 4");*/
        MainLogin main=new MainLogin(1);
        main.setVisible(true);
    }
    
}
