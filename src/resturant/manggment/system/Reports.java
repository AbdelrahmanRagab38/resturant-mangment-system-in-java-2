/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant.manggment.system;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Reports implements Serializable{
    
  
    private int ID ;
    private String description ;
    Exception exception = new Exception();

    //fileManger FManger = new fileManger();
     
    private final String reportFileName = "report.bin";
     
    public ArrayList<Reports> reportList = new ArrayList<>();
    

    public Reports()
    {
     
    }
    
     private boolean commit_to_file() {
		return fileManger.write(reportFileName,reportList);
	}
	
	private void load_from_file() {
		reportList=(ArrayList<Reports>) fileManger.read(reportFileName);
	}
    
    public Reports (int ID , String description)
    { 
        if(ID<0)
        {
        //   this.ID = exception.CheckPostive("ID");
            
        }
        else
        {
            this.ID=ID;
        }
        

        this.description=description;
    }
   
    public void setID (int id)
    {
        if(ID<0)
        {
         //   this.ID = exception.checkPositive("ID");
        }
        else
        {
            this.ID=ID;
        }

    }        
    public void setDescrition (String description )
    {
        this.description=description;
    }        
     
    public int getID ()
    {
        return ID;
    }        
     
    public String getdescription ()
    {        
        return description ; 
    }
     
    public boolean commitToFile() 
    {
        return fileManger.write(reportFileName,reportList );
    }

    public void loadFromFile() //byQr2 al-file kolo w yrg3o f ArrayList 
    {
        reportList = (ArrayList<Reports>) fileManger.read(reportFileName);
    }
     
     
    public boolean addReport ()
    {  
        loadFromFile();
        reportList.add(this);
        return  commitToFile();
                 
    }       
    public ArrayList<Reports> show_all_Reports() {
		load_from_file();
		return (reportList.isEmpty()?null:reportList);
	}
    
    
    public String listReport ()
    { 
        loadFromFile();
        String S = null;
        
        for (Reports x : reportList)
        {
            S=S+" "+x.toString();
               
        }
      
        return S;
    }        
    public  int searchReport (int ID)
    {
        loadFromFile();
        for(int i=0;i<reportList.size();i++)
        {
            if(reportList.get(i).getID()==ID)
            {
                return i;
            }    
        }
        return -1;
    }
    public boolean deleteReport (int id)
    {
        loadFromFile();
        int index = searchReport(id);
        if (index != -1)
        {
          reportList.remove(this);
          return commitToFile();       
        }
        return false;
    }        
    public boolean updateReport (int oldID , Reports r)
    {
        loadFromFile();
        int index=searchReport(oldID);
        if (searchReport(oldID)!=-1)
        {
         reportList.set(index, r);
         return commitToFile();
        }
        return false;
    }
    
    private int get_Report_index(int id) {
		for (int i=0;i<reportList.size();i++) {
			if(reportList.get(i).getID()==id) {
				return i;
			}
		}
		return -1;	
	}
    
    public String ToString()
    {
        return "\n id "+ ID + "\n description "+ description + "\n";     
    
    }       
}